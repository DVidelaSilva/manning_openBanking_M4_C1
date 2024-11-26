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
 * Specifies the sub type of account (product family group) <br /> For a full list of enumeration values refer to `OBExternalCashAccountType1Code` *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum OBExternalAccountSubType1Code {
  
  CACC("CACC"),
  
  CARD("CARD"),
  
  CASH("CASH"),
  
  CHAR("CHAR"),
  
  CISH("CISH"),
  
  COMM("COMM"),
  
  CPAC("CPAC"),
  
  LLSV("LLSV"),
  
  LOAN("LOAN"),
  
  MGLD("MGLD"),
  
  MOMA("MOMA"),
  
  NREX("NREX"),
  
  ODFT("ODFT"),
  
  ONDP("ONDP"),
  
  OTHR("OTHR"),
  
  SACC("SACC"),
  
  SLRY("SLRY"),
  
  SVGS("SVGS"),
  
  TAXE("TAXE"),
  
  TRAN("TRAN"),
  
  TRAS("TRAS"),
  
  VACC("VACC"),
  
  NFCA("NFCA"),
  
  MORT("MORT"),
  
  WALT("WALT");

  private String value;

  OBExternalAccountSubType1Code(String value) {
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
  public static OBExternalAccountSubType1Code fromValue(String value) {
    for (OBExternalAccountSubType1Code b : OBExternalAccountSubType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

