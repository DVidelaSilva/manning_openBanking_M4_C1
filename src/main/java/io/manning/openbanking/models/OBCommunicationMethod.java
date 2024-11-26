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
 * For a full list of enumeration values see `OBExternalCommunicationMethod2Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets) 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum OBCommunicationMethod {
  
  EMAL("EMAL"),
  
  FAXI("FAXI"),
  
  FILE("FILE"),
  
  ONLI("ONLI"),
  
  POST("POST");

  private String value;

  OBCommunicationMethod(String value) {
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
  public static OBCommunicationMethod fromValue(String value) {
    for (OBCommunicationMethod b : OBCommunicationMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

