package com.manning.openbanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.manning.openbanking.dtos.TransactionDto;
import com.manning.openbanking.entities.Transaction;
import com.manning.openbanking.services.TransactionService;


@RestController
@RequestMapping("/api/transactions/")
public class TransactionalController {

    @Autowired
    public TransactionService transactionService;

    public TransactionalController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    // private TransactionDto map(Transaction transaction){
    //     return TransactionDto.apply(transaction);
    // }


    @GetMapping("/{accountNumber}")
    public List<Transaction> findAllByAccountNumber(@PathVariable("accountNumber") Integer accountNumber)
        throws Exception {
            return transactionService.findAllByAccountNumber(accountNumber);
        }


}
