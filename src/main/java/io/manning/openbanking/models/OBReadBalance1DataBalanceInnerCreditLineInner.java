package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBReadBalance1DataBalanceInnerCreditLineInnerAmount;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Set of elements used to provide details on the credit line.
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner_CreditLine_inner", description = "Set of elements used to provide details on the credit line.")
@JsonTypeName("OBReadBalance1_Data_Balance_inner_CreditLine_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadBalance1DataBalanceInnerCreditLineInner {

  private Boolean included;

  /**
   * Limit type, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalLimitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   */
  public enum TypeEnum {
    AVAILABLE("Available"),
    
    CREDIT("Credit"),
    
    EMERGENCY("Emergency"),
    
    PRE_AGREED("Pre-Agreed"),
    
    TEMPORARY("Temporary");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount;

  public OBReadBalance1DataBalanceInnerCreditLineInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadBalance1DataBalanceInnerCreditLineInner(Boolean included) {
    this.included = included;
  }

  public OBReadBalance1DataBalanceInnerCreditLineInner included(Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   * @return included
   */
  @NotNull
  @Schema(name = "Included", description = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Included")
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public OBReadBalance1DataBalanceInnerCreditLineInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Limit type, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalLimitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return type
   */
  
  @Schema(name = "Type", description = "Limit type, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalLimitType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OBReadBalance1DataBalanceInnerCreditLineInner amount(OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  
  @Schema(name = "Amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Amount")
  public OBReadBalance1DataBalanceInnerCreditLineInnerAmount getAmount() {
    return amount;
  }

  public void setAmount(OBReadBalance1DataBalanceInnerCreditLineInnerAmount amount) {
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
    OBReadBalance1DataBalanceInnerCreditLineInner obReadBalance1DataBalanceInnerCreditLineInner = (OBReadBalance1DataBalanceInnerCreditLineInner) o;
    return Objects.equals(this.included, obReadBalance1DataBalanceInnerCreditLineInner.included) &&
        Objects.equals(this.type, obReadBalance1DataBalanceInnerCreditLineInner.type) &&
        Objects.equals(this.amount, obReadBalance1DataBalanceInnerCreditLineInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, type, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalanceInnerCreditLineInner {\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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

