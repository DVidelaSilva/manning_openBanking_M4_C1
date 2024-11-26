package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OverdraftFeeChargeCapInner1;
import io.manning.openbanking.models.OverdraftFeeChargeDetailInner1;
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
 * Overdraft fees and charges details
 */

@Schema(name = "OverdraftFeesCharges_inner_3", description = "Overdraft fees and charges details")
@JsonTypeName("OverdraftFeesCharges_inner_3")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OverdraftFeesChargesInner3 {

  
  private List<OverdraftFeeChargeCapInner1> overdraftFeeChargeCap = new ArrayList<>();

  
  private List<OverdraftFeeChargeDetailInner1> overdraftFeeChargeDetail = new ArrayList<>();

  public OverdraftFeesChargesInner3() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverdraftFeesChargesInner3(List<OverdraftFeeChargeDetailInner1> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  public OverdraftFeesChargesInner3 overdraftFeeChargeCap(List<OverdraftFeeChargeCapInner1> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OverdraftFeesChargesInner3 addOverdraftFeeChargeCapItem(OverdraftFeeChargeCapInner1 overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return overdraftFeeChargeCap
   */
  
  @Schema(name = "OverdraftFeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeeChargeCap")
  public List<OverdraftFeeChargeCapInner1> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OverdraftFeeChargeCapInner1> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OverdraftFeesChargesInner3 overdraftFeeChargeDetail(List<OverdraftFeeChargeDetailInner1> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OverdraftFeesChargesInner3 addOverdraftFeeChargeDetailItem(OverdraftFeeChargeDetailInner1 overdraftFeeChargeDetailItem) {
    if (this.overdraftFeeChargeDetail == null) {
      this.overdraftFeeChargeDetail = new ArrayList<>();
    }
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
   */
  @NotNull
  @Schema(name = "OverdraftFeeChargeDetail", description = "Details about the fees/charges", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OverdraftFeeChargeDetail")
  public List<OverdraftFeeChargeDetailInner1> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OverdraftFeeChargeDetailInner1> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftFeesChargesInner3 overdraftFeesChargesInner3 = (OverdraftFeesChargesInner3) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraftFeesChargesInner3.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraftFeesChargesInner3.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeesChargesInner3 {\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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

