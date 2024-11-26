package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Optional component providing the equivalent of Amount in local currency. Default is Local Currency (LCUR) if not specified
 */

@Schema(name = "OBReadBalance1_Data_Balance_inner_LocalAmount", description = "Optional component providing the equivalent of Amount in local currency. Default is Local Currency (LCUR) if not specified")
@JsonTypeName("OBReadBalance1_Data_Balance_inner_LocalAmount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadBalance1DataBalanceInnerLocalAmount {

  private String amount;

  private String currency;

  /**
   * Balance sub type, in a coded form. Default if not specified is LCUR of the account
   */
  public enum SubTypeEnum {
    BCUR("BCUR"),
    
    LCUR("LCUR");

    private String value;

    SubTypeEnum(String value) {
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
    public static SubTypeEnum fromValue(String value) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SubTypeEnum subType = SubTypeEnum.LCUR;

  public OBReadBalance1DataBalanceInnerLocalAmount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadBalance1DataBalanceInnerLocalAmount(String amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public OBReadBalance1DataBalanceInnerLocalAmount amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return amount
   */
  @NotNull
  @Schema(name = "Amount", example = "1209.06", description = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Amount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBReadBalance1DataBalanceInnerLocalAmount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
   * @return currency
   */
  @NotNull
  @Schema(name = "Currency", example = "GBP", description = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBReadBalance1DataBalanceInnerLocalAmount subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }

  /**
   * Balance sub type, in a coded form. Default if not specified is LCUR of the account
   * @return subType
   */
  
  @Schema(name = "SubType", description = "Balance sub type, in a coded form. Default if not specified is LCUR of the account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubType")
  public SubTypeEnum getSubType() {
    return subType;
  }

  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1DataBalanceInnerLocalAmount obReadBalance1DataBalanceInnerLocalAmount = (OBReadBalance1DataBalanceInnerLocalAmount) o;
    return Objects.equals(this.amount, obReadBalance1DataBalanceInnerLocalAmount.amount) &&
        Objects.equals(this.currency, obReadBalance1DataBalanceInnerLocalAmount.currency) &&
        Objects.equals(this.subType, obReadBalance1DataBalanceInnerLocalAmount.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalanceInnerLocalAmount {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

