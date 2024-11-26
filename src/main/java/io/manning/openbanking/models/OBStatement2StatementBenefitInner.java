package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount5;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Set of elements used to provide details of a benefit or reward amount for the statement resource.
 */

@Schema(name = "OBStatement2_StatementBenefit_inner", description = "Set of elements used to provide details of a benefit or reward amount for the statement resource.")
@JsonTypeName("OBStatement2_StatementBenefit_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBStatement2StatementBenefitInner {

  private String type;

  private OBActiveOrHistoricCurrencyAndAmount5 amount;

  public OBStatement2StatementBenefitInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2StatementBenefitInner(String type, OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.type = type;
    this.amount = amount;
  }

  public OBStatement2StatementBenefitInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Benefit type, in a coded form. For a full list of values see `OBInternalStatementBenefitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return type
   */
  @NotNull
  @Schema(name = "Type", example = "UK.OBIE.Cashback", description = "Benefit type, in a coded form. For a full list of values see `OBInternalStatementBenefitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementBenefitInner amount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @NotNull
  @Schema(name = "Amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Amount")
  public OBActiveOrHistoricCurrencyAndAmount5 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount5 amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementBenefitInner obStatement2StatementBenefitInner = (OBStatement2StatementBenefitInner) o;
    return Objects.equals(this.type, obStatement2StatementBenefitInner.type) &&
        Objects.equals(this.amount, obStatement2StatementBenefitInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementBenefitInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

