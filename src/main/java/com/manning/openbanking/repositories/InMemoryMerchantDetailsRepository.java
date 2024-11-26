package com.manning.openbanking.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryMerchantDetailsRepository implements MerchantDetailsRepository {
    @Override
    public Optional<String> findMerchantLogo(String merchantName) {
        if (merchantName == null) {
            return Optional.empty();
        }

        return Optional.of(merchantName + ".png");
    }
}

