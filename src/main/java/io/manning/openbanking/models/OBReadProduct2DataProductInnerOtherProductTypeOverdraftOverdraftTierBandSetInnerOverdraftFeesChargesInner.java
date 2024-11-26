package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner;
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

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner_OverdraftFeesCharges_inner", description = "Overdraft fees and charges details")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner_OverdraftFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner {

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner> overdraftFeeChargeCap = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner> overdraftFeeChargeDetail = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner overdraftFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner addOverdraftFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
   */
  
  @Schema(name = "OverdraftFeeChargeCap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeeChargeCap")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner overdraftFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner addOverdraftFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner overdraftFeeChargeDetailItem) {
    if (this.overdraftFeeChargeDetail == null) {
      this.overdraftFeeChargeDetail = new ArrayList<>();
    }
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Get overdraftFeeChargeDetail
   * @return overdraftFeeChargeDetail
   */
  @NotNull
  @Schema(name = "OverdraftFeeChargeDetail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OverdraftFeeChargeDetail")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner> overdraftFeeChargeDetail) {
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
    OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner = (OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner) o;
    return Objects.equals(this.overdraftFeeChargeCap, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner {\n");
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

