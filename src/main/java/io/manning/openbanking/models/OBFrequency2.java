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
 * For a full list of enumeration values refer to `OBFrequency2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum OBFrequency2 {
  
  YEAR("YEAR"),
  
  DAIL("DAIL"),
  
  INDA("INDA"),
  
  MNTH("MNTH"),
  
  QURT("QURT"),
  
  MIAN("MIAN"),
  
  TEND("TEND"),
  
  MOVE("MOVE"),
  
  WEEK("WEEK");

  private String value;

  OBFrequency2(String value) {
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
  public static OBFrequency2 fromValue(String value) {
    for (OBFrequency2 b : OBFrequency2.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

