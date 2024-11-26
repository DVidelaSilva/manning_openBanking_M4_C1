package com.manning.openbanking.services;

import java.util.List;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.stereotype.Service;

import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.repositories.MerchantDetailsRepository;
import com.manning.openbanking.repositories.TransactionApiClient;
import com.manning.openbanking.repositories.TransactionRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TransactionService {

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;
    private final TransactionRepository transactionRepository;
    
    public TransactionService(
        final TransactionApiClient transactionApiClient,
        final MerchantDetailsRepository merchantDetailsRepository,
        final TransactionRepository transactionRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
        this.transactionRepository = transactionRepository;
}


    //@PostFilter(value = "hasAuthority(filterObject.accountNumber)")
    @CircuitBreaker(name = "transactionService", fallbackMethod = "findAllByAccountNumber")
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) throws Exception{
        var transactions = transactionApiClient.findAllByAccountNumber(accountNumber);
        transactions.forEach(transaction -> {
            merchantDetailsRepository
                .findMerchantLogo(transaction.getMerchantName())
                .ifPresent(logo -> transaction.setMerchantLogo(logo)
                );
        });
        return transactions;
    }


    private List<Transaction> findAllByAccountNumber(Integer accountNumber, Throwable throwable){
        log.info("Obtener Transacciones desde la BD");
        return transactionRepository.findAllByAccountNumber(accountNumber);
    }

}
