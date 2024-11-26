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
 * Fee/Charge Type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum OBFeeType1Code {
  
  FEPF("FEPF"),
  
  FTOT("FTOT"),
  
  FYAF("FYAF"),
  
  FYAM("FYAM"),
  
  FYAQ("FYAQ"),
  
  FYCP("FYCP"),
  
  FYDB("FYDB"),
  
  FYMI("FYMI"),
  
  FYXX("FYXX");

  private String value;

  OBFeeType1Code(String value) {
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
  public static OBFeeType1Code fromValue(String value) {
    for (OBFeeType1Code b : OBFeeType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

