package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBReadBalance1DataBalanceInner;
import io.manning.openbanking.models.OBReadBalance1DataTotalValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReadBalance1Data
 */

@JsonTypeName("OBReadBalance1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadBalance1Data {

  
  private List<OBReadBalance1DataBalanceInner> balance = new ArrayList<>();

  private OBReadBalance1DataTotalValue totalValue;

  public OBReadBalance1Data() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadBalance1Data(List<OBReadBalance1DataBalanceInner> balance) {
    this.balance = balance;
  }

  public OBReadBalance1Data balance(List<OBReadBalance1DataBalanceInner> balance) {
    this.balance = balance;
    return this;
  }

  public OBReadBalance1Data addBalanceItem(OBReadBalance1DataBalanceInner balanceItem) {
    if (this.balance == null) {
      this.balance = new ArrayList<>();
    }
    this.balance.add(balanceItem);
    return this;
  }

  /**
   * Get balance
   * @return balance
   */
  @NotNull
  @Schema(name = "Balance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Balance")
  public List<OBReadBalance1DataBalanceInner> getBalance() {
    return balance;
  }

  public void setBalance(List<OBReadBalance1DataBalanceInner> balance) {
    this.balance = balance;
  }

  public OBReadBalance1Data totalValue(OBReadBalance1DataTotalValue totalValue) {
    this.totalValue = totalValue;
    return this;
  }

  /**
   * Get totalValue
   * @return totalValue
   */
  
  @Schema(name = "TotalValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalValue")
  public OBReadBalance1DataTotalValue getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(OBReadBalance1DataTotalValue totalValue) {
    this.totalValue = totalValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBalance1Data obReadBalance1Data = (OBReadBalance1Data) o;
    return Objects.equals(this.balance, obReadBalance1Data.balance) &&
        Objects.equals(this.totalValue, obReadBalance1Data.totalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, totalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1Data {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
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

