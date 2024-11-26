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
 * Enumeration of codes that outlines the type of purpose behind a transaction, payment or risk.  For all enum values see `ExternalCategoryPurpose1Code` in *ISO_External_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public enum ExternalCategoryPurpose1Code {
  
  BONU("BONU"),
  
  CASH("CASH"),
  
  CBLK("CBLK"),
  
  CCRD("CCRD"),
  
  CGWV("CGWV"),
  
  CIPC("CIPC"),
  
  CONC("CONC"),
  
  CORT("CORT"),
  
  DCRD("DCRD"),
  
  DIVI("DIVI"),
  
  DVPM("DVPM"),
  
  EPAY("EPAY"),
  
  FCDT("FCDT"),
  
  FCIN("FCIN"),
  
  FCOL("FCOL"),
  
  GOVT("GOVT"),
  
  GP2_P("GP2P"),
  
  HEDG("HEDG"),
  
  ICCP("ICCP"),
  
  IDCP("IDCP"),
  
  INTC("INTC"),
  
  INTE("INTE"),
  
  LBOX("LBOX"),
  
  LOAN("LOAN"),
  
  MP2_B("MP2B"),
  
  MP2_P("MP2P"),
  
  OTHR("OTHR"),
  
  PENS("PENS"),
  
  RPRE("RPRE"),
  
  RRCT("RRCT"),
  
  RVPM("RVPM"),
  
  SALA("SALA"),
  
  SECU("SECU"),
  
  SSBE("SSBE"),
  
  SUPP("SUPP"),
  
  SWEP("SWEP"),
  
  TAXS("TAXS"),
  
  TOPG("TOPG"),
  
  TRAD("TRAD"),
  
  TREA("TREA"),
  
  VATX("VATX"),
  
  VOST("VOST"),
  
  WHLD("WHLD"),
  
  ZABA("ZABA");

  private String value;

  ExternalCategoryPurpose1Code(String value) {
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
  public static ExternalCategoryPurpose1Code fromValue(String value) {
    for (ExternalCategoryPurpose1Code b : ExternalCategoryPurpose1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

