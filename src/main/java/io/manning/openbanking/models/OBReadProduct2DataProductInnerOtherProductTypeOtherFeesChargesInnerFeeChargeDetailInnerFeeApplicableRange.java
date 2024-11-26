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
 * Range or amounts or rates for which the fee/charge applies
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner_FeeChargeDetail_inner_FeeApplicableRange", description = "Range or amounts or rates for which the fee/charge applies")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner_FeeChargeDetail_inner_FeeApplicableRange")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange {

  private String minimumAmount;

  private String maximumAmount;

  private String minimumRate;

  private String maximumRate;

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange minimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
    return this;
  }

  /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
   * @return minimumAmount
   */
  
  @Schema(name = "MinimumAmount", description = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinimumAmount")
  public String getMinimumAmount() {
    return minimumAmount;
  }

  public void setMinimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange maximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

  /**
   * Maximum Amount on which fee is applicable (where it is expressed as an amount)
   * @return maximumAmount
   */
  
  @Schema(name = "MaximumAmount", description = "Maximum Amount on which fee is applicable (where it is expressed as an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaximumAmount")
  public String getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange minimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
    return this;
  }

  /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return minimumRate
   */
  
  @Schema(name = "MinimumRate", description = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinimumRate")
  public String getMinimumRate() {
    return minimumRate;
  }

  public void setMinimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange maximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
    return this;
  }

  /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return maximumRate
   */
  
  @Schema(name = "MaximumRate", description = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaximumRate")
  public String getMaximumRate() {
    return maximumRate;
  }

  public void setMaximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange = (OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange) o;
    return Objects.equals(this.minimumAmount, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange.minimumAmount) &&
        Objects.equals(this.maximumAmount, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange.maximumAmount) &&
        Objects.equals(this.minimumRate, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange.minimumRate) &&
        Objects.equals(this.maximumRate, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange.maximumRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumAmount, maximumAmount, minimumRate, maximumRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange {\n");
    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
    sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
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

