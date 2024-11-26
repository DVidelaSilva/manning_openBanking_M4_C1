package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.FeeChargeCapInner1;
import io.manning.openbanking.models.FeeChargeDetailInner1;
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
 * Contains details of fees and charges which are not associated with either borrowing or features/benefits
 */

@Schema(name = "OtherFeesCharges", description = "Contains details of fees and charges which are not associated with either borrowing or features/benefits")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OtherFeesCharges {

  
  private List<FeeChargeDetailInner1> feeChargeDetail = new ArrayList<>();

  
  private List<FeeChargeCapInner1> feeChargeCap = new ArrayList<>();

  public OtherFeesCharges() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OtherFeesCharges(List<FeeChargeDetailInner1> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OtherFeesCharges feeChargeDetail(List<FeeChargeDetailInner1> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OtherFeesCharges addFeeChargeDetailItem(FeeChargeDetailInner1 feeChargeDetailItem) {
    if (this.feeChargeDetail == null) {
      this.feeChargeDetail = new ArrayList<>();
    }
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Other fees/charges details
   * @return feeChargeDetail
   */
  @NotNull
  @Schema(name = "FeeChargeDetail", description = "Other fees/charges details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeChargeDetail")
  public List<FeeChargeDetailInner1> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<FeeChargeDetailInner1> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OtherFeesCharges feeChargeCap(List<FeeChargeCapInner1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OtherFeesCharges addFeeChargeCapItem(FeeChargeCapInner1 feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return feeChargeCap
   */
  
  @Schema(name = "FeeChargeCap", description = "Details about any caps (maximum charges) that apply to a particular fee/charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeChargeCap")
  public List<FeeChargeCapInner1> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<FeeChargeCapInner1> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherFeesCharges otherFeesCharges = (OtherFeesCharges) o;
    return Objects.equals(this.feeChargeDetail, otherFeesCharges.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, otherFeesCharges.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeesCharges {\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

