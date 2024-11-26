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
 * Combined sum of all Amounts in the accounts base currency
 */

@Schema(name = "OBReadBalance1_Data_TotalValue", description = "Combined sum of all Amounts in the accounts base currency")
@JsonTypeName("OBReadBalance1_Data_TotalValue")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadBalance1DataTotalValue {

  private String amount;

  private String currency;

  public OBReadBalance1DataTotalValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadBalance1DataTotalValue(String amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public OBReadBalance1DataTotalValue amount(String amount) {
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

  public OBReadBalance1DataTotalValue currency(String currency) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1DataTotalValue obReadBalance1DataTotalValue = (OBReadBalance1DataTotalValue) o;
    return Objects.equals(this.amount, obReadBalance1DataTotalValue.amount) &&
        Objects.equals(this.currency, obReadBalance1DataTotalValue.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataTotalValue {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

