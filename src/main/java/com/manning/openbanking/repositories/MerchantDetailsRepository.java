package com.manning.openbanking.repositories;

import java.util.Optional;


public interface MerchantDetailsRepository {

    Optional<String> findMerchantLogo(String merchantName);

}

