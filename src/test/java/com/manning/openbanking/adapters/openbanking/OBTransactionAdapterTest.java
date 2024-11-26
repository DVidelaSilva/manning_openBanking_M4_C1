package com.manning.openbanking.adapters.openbanking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount9;
import io.manning.openbanking.models.OBCreditDebitCode1;
import io.manning.openbanking.models.OBMerchantDetails1;
import io.manning.openbanking.models.OBTransaction6;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class OBTransactionAdapterTest {

    @Autowired
    private OBTransactionAdapter TransactionAdapter = new OBTransactionAdapter();


//     @Test
//    public void testNullMerchant() {
//         var ob = new OBTransaction6();
//         ob.setAccountId(("123456789"));
//         ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
//         ob.setAmount(amount());
//         var tran = TransactionAdapter.adapt(ob);
//         assertEquals(null, tran.getMerchantName());
//     }


//     @Test
//     public void testMerchant() {
//         var ob = new OBTransaction6();
//         ob.setAccountId(("123456789"));
//         ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
//         ob.setAmount(amount());
//         ob.setMerchantDetails(merchantDetails());
//         var tran = TransactionAdapter.adapt(ob);
//         assertEquals("acme", tran.getMerchantName());
//     }

//     @Test
//     public void testInvbalidAmount() {
//         var ob = new OBTransaction6();
//         ob.setAccountId(("123456789"));
//         ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
//         ob.setAmount(invalidAmount());
//         var tran = TransactionAdapter.adapt(ob);
//         assertEquals(0.0d, tran.getAmount());
//     }


//     @Test
//     public void testAmount() {
//         var ob = new OBTransaction6();
//         ob.setAccountId(("123456789"));
//         ob.setCreditDebitIndicator(OBCreditDebitCode1.DEBIT);
//         ob.setAmount(amount());
//         var tran = TransactionAdapter.adapt(ob);
//         assertEquals(100.0d, tran.getAmount());
//     }




    private OBActiveOrHistoricCurrencyAndAmount9 amount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setAmount("100.00");
        amount.setCurrency("USD");
        return amount;
    }


    private OBActiveOrHistoricCurrencyAndAmount9 invalidAmount() {
        var amount = new OBActiveOrHistoricCurrencyAndAmount9();
        amount.setCurrency("100.00");
        amount.setAmount("error");
        return amount;
    }

    private OBMerchantDetails1 merchantDetails() {
        var merchant = new OBMerchantDetails1();
        merchant.setMerchantName("acme");
        merchant.setMerchantCategoryCode("25");
        return merchant;
    }







}