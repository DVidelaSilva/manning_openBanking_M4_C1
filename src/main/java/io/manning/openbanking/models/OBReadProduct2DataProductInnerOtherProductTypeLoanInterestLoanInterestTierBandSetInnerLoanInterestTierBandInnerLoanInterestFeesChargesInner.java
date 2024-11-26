package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner;
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
 * Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner_LoanInterestTierBand_inner_LoanInterestFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either LoanRepayment or features/benefits")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner_LoanInterestTierBand_inner_LoanInterestFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner {

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner addLoanInterestFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner loanInterestFeeChargeDetailItem) {
    if (this.loanInterestFeeChargeDetail == null) {
      this.loanInterestFeeChargeDetail = new ArrayList<>();
    }
    this.loanInterestFeeChargeDetail.add(loanInterestFeeChargeDetailItem);
    return this;
  }

  /**
   * Get loanInterestFeeChargeDetail
   * @return loanInterestFeeChargeDetail
   */
  @NotNull
  @Schema(name = "LoanInterestFeeChargeDetail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LoanInterestFeeChargeDetail")
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> getLoanInterestFeeChargeDetail() {
    return loanInterestFeeChargeDetail;
  }

  public void setLoanInterestFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner> loanInterestFeeChargeDetail) {
    this.loanInterestFeeChargeDetail = loanInterestFeeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner addLoanInterestFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner loanInterestFeeChargeCapItem) {
    if (this.loanInterestFeeChargeCap == null) {
      this.loanInterestFeeChargeCap = new ArrayList<>();
    }
    this.loanInterestFeeChargeCap.add(loanInterestFeeChargeCapItem);
    return this;
  }

  /**
   * Get loanInterestFeeChargeCap
   * @return loanInterestFeeChargeCap
   */
  
  @Schema(name = "LoanInterestFeeChargeCap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LoanInterestFeeChargeCap")
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> getLoanInterestFeeChargeCap() {
    return loanInterestFeeChargeCap;
  }

  public void setLoanInterestFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner> loanInterestFeeChargeCap) {
    this.loanInterestFeeChargeCap = loanInterestFeeChargeCap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner) o;
    return Objects.equals(this.loanInterestFeeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.loanInterestFeeChargeDetail) &&
        Objects.equals(this.loanInterestFeeChargeCap, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.loanInterestFeeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanInterestFeeChargeDetail, loanInterestFeeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner {\n");
    sb.append("    loanInterestFeeChargeDetail: ").append(toIndentedString(loanInterestFeeChargeDetail)).append("\n");
    sb.append("    loanInterestFeeChargeCap: ").append(toIndentedString(loanInterestFeeChargeCap)).append("\n");
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

