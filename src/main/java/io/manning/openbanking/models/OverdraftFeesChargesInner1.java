package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OverdraftFeeChargeCapInner;
import io.manning.openbanking.models.OverdraftFeeChargeDetailInner;
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

@Schema(name = "OverdraftFeesCharges_inner_1", description = "Overdraft fees and charges details")
@JsonTypeName("OverdraftFeesCharges_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OverdraftFeesChargesInner1 {

  
  private List<OverdraftFeeChargeCapInner> overdraftFeeChargeCap = new ArrayList<>();

  
  private List<OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail = new ArrayList<>();

  public OverdraftFeesChargesInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverdraftFeesChargesInner1(List<OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  public OverdraftFeesChargesInner1 overdraftFeeChargeCap(List<OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OverdraftFeesChargesInner1 addOverdraftFeeChargeCapItem(OverdraftFeeChargeCapInner overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
   * @return overdraftFeeChargeCap
   */
  
  @Schema(name = "OverdraftFeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeeChargeCap")
  public List<OverdraftFeeChargeCapInner> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OverdraftFeesChargesInner1 overdraftFeeChargeDetail(List<OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OverdraftFeesChargesInner1 addOverdraftFeeChargeDetailItem(OverdraftFeeChargeDetailInner overdraftFeeChargeDetailItem) {
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
  public List<OverdraftFeeChargeDetailInner> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
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
    OverdraftFeesChargesInner1 overdraftFeesChargesInner1 = (OverdraftFeesChargesInner1) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraftFeesChargesInner1.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraftFeesChargesInner1.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeesChargesInner1 {\n");
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

