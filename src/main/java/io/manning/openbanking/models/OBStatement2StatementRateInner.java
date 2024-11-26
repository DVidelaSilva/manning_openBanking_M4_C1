package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Set of elements used to provide details of a generic rate related to the statement resource.
 */

@Schema(name = "OBStatement2_StatementRate_inner", description = "Set of elements used to provide details of a generic rate related to the statement resource.")
@JsonTypeName("OBStatement2_StatementRate_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBStatement2StatementRateInner {

  private String rate;

  private String type;

  public OBStatement2StatementRateInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2StatementRateInner(String rate, String type) {
    this.rate = rate;
    this.type = type;
  }

  public OBStatement2StatementRateInner rate(String rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate associated with the statement rate type.
   * @return rate
   */
  @NotNull
  @Schema(name = "Rate", example = "0.224", description = "Rate associated with the statement rate type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Rate")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public OBStatement2StatementRateInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Statement rate type, in a coded form. For a full list of values see `OBInternalStatementRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return type
   */
  @NotNull
  @Schema(name = "Type", example = "UK.OBIE.AnnualCash", description = "Statement rate type, in a coded form. For a full list of values see `OBInternalStatementRateType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementRateInner obStatement2StatementRateInner = (OBStatement2StatementRateInner) o;
    return Objects.equals(this.rate, obStatement2StatementRateInner.rate) &&
        Objects.equals(this.type, obStatement2StatementRateInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementRateInner {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

