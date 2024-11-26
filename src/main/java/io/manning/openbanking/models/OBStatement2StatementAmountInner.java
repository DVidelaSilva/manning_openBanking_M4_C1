package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBCreditDebitCode0;
import io.manning.openbanking.models.OBStatement2StatementAmountInnerAmount;
import io.manning.openbanking.models.OBStatement2StatementAmountInnerLocalAmount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Set of elements used to provide details of a generic amount for the statement resource.
 */

@Schema(name = "OBStatement2_StatementAmount_inner", description = "Set of elements used to provide details of a generic amount for the statement resource.")
@JsonTypeName("OBStatement2_StatementAmount_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBStatement2StatementAmountInner {

  private OBCreditDebitCode0 creditDebitIndicator;

  private String type;

  private OBStatement2StatementAmountInnerAmount amount;

  private OBStatement2StatementAmountInnerLocalAmount localAmount;

  public OBStatement2StatementAmountInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2StatementAmountInner(OBCreditDebitCode0 creditDebitIndicator, String type, OBStatement2StatementAmountInnerAmount amount) {
    this.creditDebitIndicator = creditDebitIndicator;
    this.type = type;
    this.amount = amount;
  }

  public OBStatement2StatementAmountInner creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
   */
  @NotNull
  @Schema(name = "CreditDebitIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreditDebitIndicator")
  public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBStatement2StatementAmountInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Amount type, in a coded form.
   * @return type
   */
  @NotNull
  @Schema(name = "Type", example = "UK.OBIE.CreditLimit", description = "Amount type, in a coded form.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OBStatement2StatementAmountInner amount(OBStatement2StatementAmountInnerAmount amount) {
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
  public OBStatement2StatementAmountInnerAmount getAmount() {
    return amount;
  }

  public void setAmount(OBStatement2StatementAmountInnerAmount amount) {
    this.amount = amount;
  }

  public OBStatement2StatementAmountInner localAmount(OBStatement2StatementAmountInnerLocalAmount localAmount) {
    this.localAmount = localAmount;
    return this;
  }

  /**
   * Get localAmount
   * @return localAmount
   */
  
  @Schema(name = "LocalAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalAmount")
  public OBStatement2StatementAmountInnerLocalAmount getLocalAmount() {
    return localAmount;
  }

  public void setLocalAmount(OBStatement2StatementAmountInnerLocalAmount localAmount) {
    this.localAmount = localAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2StatementAmountInner obStatement2StatementAmountInner = (OBStatement2StatementAmountInner) o;
    return Objects.equals(this.creditDebitIndicator, obStatement2StatementAmountInner.creditDebitIndicator) &&
        Objects.equals(this.type, obStatement2StatementAmountInner.type) &&
        Objects.equals(this.amount, obStatement2StatementAmountInner.amount) &&
        Objects.equals(this.localAmount, obStatement2StatementAmountInner.localAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditDebitIndicator, type, amount, localAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementAmountInner {\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    localAmount: ").append(toIndentedString(localAmount)).append("\n");
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

