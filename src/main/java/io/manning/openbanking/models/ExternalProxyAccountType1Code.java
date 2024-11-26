package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the external proxy account type code, as published in the proxy account type external code set.<br /> For more information and a full list of values see `ExternalProxyAccountType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum ExternalProxyAccountType1Code {
  
  TELE("TELE"),
  
  EMAL("EMAL"),
  
  DNAM("DNAM"),
  
  CINC("CINC"),
  
  COTX("COTX"),
  
  COID("COID"),
  
  CUST("CUST"),
  
  DRLC("DRLC"),
  
  EIDN("EIDN"),
  
  EWAL("EWAL"),
  
  PVTX("PVTX"),
  
  LEIC("LEIC"),
  
  MBNO("MBNO"),
  
  NIDN("NIDN"),
  
  CCPT("CCPT"),
  
  SHID("SHID"),
  
  SOSE("SOSE"),
  
  TOKN("TOKN"),
  
  UBIL("UBIL"),
  
  VIPN("VIPN"),
  
  BIID("BIID");

  private String value;

  ExternalProxyAccountType1Code(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExternalProxyAccountType1Code fromValue(String value) {
    for (ExternalProxyAccountType1Code b : ExternalProxyAccountType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

