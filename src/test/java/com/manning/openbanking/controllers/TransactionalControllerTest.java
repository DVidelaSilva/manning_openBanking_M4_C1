package com.manning.openbanking.controllers;

import com.manning.openbanking.OpenbankingApplication;
import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.services.TransactionService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.notNullValue;



@AutoConfigureMockMvc
@SpringBootTest(classes = {OpenbankingApplication.class})
public class TransactionalControllerTest {

    private static final String CLIENT_ID = "open-banking";
    private static final String CLIENT_SECRET = "CgOUvolsYPk7hHFDy4CH6EVX8NMJZLbH";

    @MockBean
    private TransactionService transactionService;

    @Test
    public void testUnauthenticatedTransactions() throws Exception {
        doReturn(List.of(new Transaction())).when(transactionService).findAllByAccountNumber(anyInt());

        mockMvc.perform(
                get("/api/v1/transactions/1234567"))
                .andExpect(status().is3xxRedirection());
    }

    @Test
    public void testAuthenticatedTransactions() throws Exception {
        String accessToken = obtainAccessToken("davs", "davs");

        mockMvc.perform(get("/api/transactions/123456789")
                .header("Authorization", "Bearer " + accessToken)
                .accept("application/json;charset=UTF-8"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(status().is2xxSuccessful());
    }

    private String obtainAccessToken(String username, String password) throws Exception {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "password");
        params.add("client_id", CLIENT_ID);
        params.add("client_secret", CLIENT_SECRET);
        params.add("username", username);
        params.add("password", password);

        var webClient = WebClient.create("http://localhost:8181");
        var resultString = webClient.post()
                .uri("/realms/open-banking-realm/protocol/openid-connect/token")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .body(BodyInserters.fromFormData(params))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        JacksonJsonParser jsonParser = new JacksonJsonParser();
        return jsonParser.parseMap(resultString).get("access_token").toString();
    }

    @Autowired
    private MockMvc mockMvc;
}