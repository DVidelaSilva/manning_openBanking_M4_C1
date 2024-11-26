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
 * Individual Definitions:  ADHO - Adhoc   YEAR - Annual DAIL - Daily INDA - Intra Day MNTH - Monthly QURT - Quarterly WEEK - Weekly 
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum OBFrequencyPeriodType {
  
  ADHO("ADHO"),
  
  YEAR("YEAR"),
  
  DAIL("DAIL"),
  
  INDA("INDA"),
  
  MNTH("MNTH"),
  
  QURT("QURT"),
  
  MIAN("MIAN"),
  
  WEEK("WEEK");

  private String value;

  OBFrequencyPeriodType(String value) {
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
  public static OBFrequencyPeriodType fromValue(String value) {
    for (OBFrequencyPeriodType b : OBFrequencyPeriodType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

