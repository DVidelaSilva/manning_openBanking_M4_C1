package com.manning.openbanking.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.List;

import com.manning.openbanking.OpenbankingApplication;
import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.repositories.MerchantDetailsRepository;
import com.manning.openbanking.repositories.TransactionApiClient;



@SpringBootTest(classes = {OpenbankingApplication.class})
public class TransactionServiceTest {

    @Mock
    private TransactionApiClient transactionApiClient;

    @Mock
    private MerchantDetailsRepository merchantDetailsRepository;

    @InjectMocks
    private TransactionService transactionService;



    @DisplayName("test TransactionService with mock TransactionApiClient")
    @Test
    public void testTransactionCount() throws Exception {
        when(transactionApiClient.findAllByAccountNumber(any()))
                .thenReturn(List.of(new Transaction()));

        assertEquals(1, transactionService.findAllByAccountNumber(123456789).size());
    }
}
