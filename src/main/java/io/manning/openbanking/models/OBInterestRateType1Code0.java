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
 * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum OBInterestRateType1Code0 {
  
  INBB("INBB"),
  
  INFR("INFR"),
  
  INGR("INGR"),
  
  INLR("INLR"),
  
  INNE("INNE"),
  
  INOT("INOT");

  private String value;

  OBInterestRateType1Code0(String value) {
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
  public static OBInterestRateType1Code0 fromValue(String value) {
    for (OBInterestRateType1Code0 b : OBInterestRateType1Code0.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

