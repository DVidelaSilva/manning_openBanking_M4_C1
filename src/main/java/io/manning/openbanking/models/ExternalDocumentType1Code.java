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
 * Specifies the document type as published in an external document type code list. For more information see `ExternalDocumentType1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum ExternalDocumentType1Code {
  
  CINV("CINV"),
  
  CNFA("CNFA"),
  
  CONT("CONT"),
  
  CREN("CREN"),
  
  DEBN("DEBN"),
  
  DISP("DISP"),
  
  DNFA("DNFA"),
  
  HIRI("HIRI"),
  
  INVS("INVS"),
  
  MSIN("MSIN"),
  
  PROF("PROF"),
  
  PUOR("PUOR"),
  
  QUOT("QUOT"),
  
  SBIN("SBIN"),
  
  SPRR("SPRR"),
  
  TISH("TISH");

  private String value;

  ExternalDocumentType1Code(String value) {
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
  public static ExternalDocumentType1Code fromValue(String value) {
    for (ExternalDocumentType1Code b : ExternalDocumentType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

