package com.manning.openbanking.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.manning.openbanking.entities.Transaction;

@Repository
public interface TransactionApiClient {
    List<Transaction> findAllByAccountNumber(Integer accounNumber) throws Exception;
}


