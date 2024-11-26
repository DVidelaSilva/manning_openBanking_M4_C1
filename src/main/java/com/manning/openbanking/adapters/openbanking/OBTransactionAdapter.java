package com.manning.openbanking.adapters.openbanking;

import java.util.Date;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.manning.openbanking.entities.Transaction;
import io.manning.openbanking.models.OBTransaction6;

@Component
public class OBTransactionAdapter {

    // Adaptar OBTransaction6 -> Transaction
    public Transaction adapt(OBTransaction6 transaction6){
        return transactionFunction.apply(transaction6);
    }


    // Mapeo OBTransaction6 -> Transaction
    private final Function<OBTransaction6, Transaction> transactionFunction = obTransaction6 -> {
        var t = new Transaction();

        //Asignar el numero de cuenta
        t.setAccountNumber(Integer.valueOf(obTransaction6.getAccountId()));

        // Calculo del monto = cantidad X tipo de cambio
        var amount = tryAndApply(obTransaction6, o -> Double.valueOf(o.getAmount().getAmount()));
        var fx = tryAndApply(obTransaction6, o -> o.getCurrencyExchange().getExchangeRate().doubleValue());
        t.setAmount(amount.orElse(0.0) * fx.orElse(1.0));

        //Asignar moneda
        tryAndApply(obTransaction6, o -> obTransaction6.getCurrencyExchange().getUnitCurrency())
            .ifPresent(t::setCurrency);
        
        // Asigna el tipo (credit/debit)
        tryAndApply(obTransaction6, o -> obTransaction6.getCreditDebitIndicator().toString())
            .ifPresent(t::setType);

        // Asignar el nombre del comercio
        tryAndApply(obTransaction6, o -> obTransaction6.getMerchantDetails().getMerchantName())
            .ifPresent(t::setMerchantName);

        //Asignar la fecha
        tryAndApply(obTransaction6, o -> new Date(obTransaction6.getValueDateTime().toLocalDate().toEpochDay()))
            .ifPresent(t::setDate);

        return t;
    };


    private <T> Optional<T> tryAndApply(OBTransaction6 transaction6, Function<OBTransaction6, T> func) {
        try {
            return Optional.of(func.apply(transaction6));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

}