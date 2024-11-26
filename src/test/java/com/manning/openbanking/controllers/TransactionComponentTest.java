package com.manning.openbanking.controllers;

import com.manning.openbanking.OpenbankingApplication;
import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.repositories.InMemoryMerchantDetailsRepository;
import com.manning.openbanking.Apis.RESTTransactionsAPIClient;
import com.manning.openbanking.repositories.TransactionApiClient;
import com.manning.openbanking.repositories.TransactionRepository;
import com.manning.openbanking.services.TransactionService;
import com.manning.openbanking.controllers.TransactionalController;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

import java.util.Arrays;

import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount9;
import io.manning.openbanking.models.OBCreditDebitCode1;
import io.manning.openbanking.models.OBMerchantDetails1;
import io.manning.openbanking.models.OBReadDataTransaction6;
import io.manning.openbanking.models.OBReadTransaction6;
import io.manning.openbanking.models.OBTransaction6;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import com.fasterxml.jackson.databind.ObjectMapper;



import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;


@SpringBootTest(classes = {OpenbankingApplication.class}, webEnvironment = RANDOM_PORT)
public class TransactionComponentTest {
@LocalServerPort
    private int port;

    @MockBean
    private TransactionRepository transactionRepository;

    private MockWebServer server = new MockWebServer();
    private TransactionApiClient apiClient = new RESTTransactionsAPIClient(WebClient.create(server.url("/").toString()));
    private TransactionService transactionService = new TransactionService(apiClient, new InMemoryMerchantDetailsRepository(), transactionRepository);

    // @Test
    // @WithMockUser(username = "nbcrocker", password = "abc", roles = "read")
    // public void testApplicationEndToEnd() throws Exception {
    //     var json = new ObjectMapper().writeValueAsString(transaction());
    //     server.enqueue(
    //             new MockResponse()
    //                     .setResponseCode(200)
    //                     .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
    //                     .setBody(json));

    //     var t = Arrays.stream(
    //             given()
    //                     .config(noSecurity())
    //                     .standaloneSetup(new TransactionalController(transactionService))
    //                     .when()
    //                     .get(String.format("http://localhost:%s/api/v1/transactions/1234567", port))
    //                     .then()
    //                     .extract()
    //                     .body()
    //                     .as(Transaction[].class))
    //             .findAny()
    //             .orElseThrow();

    //     assertEquals(100.0d, t.getAmount());
    // }

    // private OBReadTransaction6 transaction() {
    //     var t = new OBReadTransaction6();
    //     t.setData(new OBReadDataTransaction6());
    //     t.getData().addTransactionItem(transactions());
    //     return t;
    // }

    // private OBTransaction6 transactions() {
    //     var t = new OBTransaction6();
    //     t.setAccountId("1234567");
    //     t.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
    //     t.setAmount(amount());
    //     t.setMerchantDetails(merchantDetails());
    //     return t;
    // }

    // private OBActiveOrHistoricCurrencyAndAmount9 amount() {
    //     var amount = new OBActiveOrHistoricCurrencyAndAmount9();
    //     amount.setAmount("100.00");
    //     amount.setCurrency("USD");
    //     return amount;
    // }

    // private OBMerchantDetails1 merchantDetails() {
    //     var m = new OBMerchantDetails1();
    //     m.setMerchantName("acme");
    //     m.setMerchantCategoryCode("25");
    //     return m;
    // }

    // private RestAssuredMockMvcConfig noSecurity() {
    //     return config().mockMvcConfig(mockMvcConfig()
    //             .dontAutomaticallyApplySpringSecurityMockMvcConfigurer());
    // }

}
