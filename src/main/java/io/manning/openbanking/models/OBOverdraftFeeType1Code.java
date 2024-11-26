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
 * Overdraft fee type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum OBOverdraftFeeType1Code {
  
  FBAO("FBAO"),
  
  FBAR("FBAR"),
  
  FBEB("FBEB"),
  
  FBIT("FBIT"),
  
  FBOR("FBOR"),
  
  FBOS("FBOS"),
  
  FBSC("FBSC"),
  
  FBTO("FBTO"),
  
  FBUB("FBUB"),
  
  FBUT("FBUT"),
  
  FTOT("FTOT"),
  
  FTUT("FTUT");

  private String value;

  OBOverdraftFeeType1Code(String value) {
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
  public static OBOverdraftFeeType1Code fromValue(String value) {
    for (OBOverdraftFeeType1Code b : OBOverdraftFeeType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

