package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBFeeCategory1Code;
import io.manning.openbanking.models.OBFeeFrequency1Code2;
import io.manning.openbanking.models.OBFeeFrequency1Code3;
import io.manning.openbanking.models.OBFeeType1Code;
import io.manning.openbanking.models.OBInterestRateType1Code1;
import io.manning.openbanking.models.OBOtherCodeType10;
import io.manning.openbanking.models.OBOtherCodeType16;
import io.manning.openbanking.models.OBOtherCodeType17;
import io.manning.openbanking.models.OBOtherCodeType18;
import io.manning.openbanking.models.OBOtherFeeChargeDetailType;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner;
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
 * Other fees/charges details
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner_FeeChargeDetail_inner", description = "Other fees/charges details")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner_FeeChargeDetail_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner {

  private OBFeeCategory1Code feeCategory;

  private OBFeeType1Code feeType;

  private Boolean negotiableIndicator;

  private String feeAmount;

  private String feeRate;

  private OBInterestRateType1Code1 feeRateType;

  private OBFeeFrequency1Code2 applicationFrequency;

  private OBFeeFrequency1Code3 calculationFrequency;

  
  private List<String> notes = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap = new ArrayList<>();

  private OBOtherCodeType10 otherFeeCategoryType;

  private OBOtherFeeChargeDetailType otherFeeType;

  private OBOtherCodeType18 otherFeeRateType;

  private OBOtherCodeType16 otherApplicationFrequency;

  private OBOtherCodeType17 otherCalculationFrequency;

  private OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange feeApplicableRange;

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner(OBFeeCategory1Code feeCategory, OBFeeType1Code feeType, OBFeeFrequency1Code2 applicationFrequency) {
    this.feeCategory = feeCategory;
    this.feeType = feeType;
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
    return this;
  }

  /**
   * Get feeCategory
   * @return feeCategory
   */
  @NotNull
  @Schema(name = "FeeCategory", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeCategory")
  public OBFeeCategory1Code getFeeCategory() {
    return feeCategory;
  }

  public void setFeeCategory(OBFeeCategory1Code feeCategory) {
    this.feeCategory = feeCategory;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Get feeType
   * @return feeType
   */
  @NotNull
  @Schema(name = "FeeType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeType")
  public OBFeeType1Code getFeeType() {
    return feeType;
  }

  public void setFeeType(OBFeeType1Code feeType) {
    this.feeType = feeType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner negotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
    return this;
  }

  /**
   * Fee/charge which is usually negotiable rather than a fixed amount
   * @return negotiableIndicator
   */
  
  @Schema(name = "NegotiableIndicator", description = "Fee/charge which is usually negotiable rather than a fixed amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NegotiableIndicator")
  public Boolean getNegotiableIndicator() {
    return negotiableIndicator;
  }

  public void setNegotiableIndicator(Boolean negotiableIndicator) {
    this.negotiableIndicator = negotiableIndicator;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
   */
  
  @Schema(name = "FeeAmount", description = "Fee Amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeAmount")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
   */
  
  @Schema(name = "FeeRate", description = "Rate charged for Fee/Charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRate")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeRateType(OBInterestRateType1Code1 feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Get feeRateType
   * @return feeRateType
   */
  
  @Schema(name = "FeeRateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRateType")
  public OBInterestRateType1Code1 getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(OBInterestRateType1Code1 feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner applicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * Get applicationFrequency
   * @return applicationFrequency
   */
  @NotNull
  @Schema(name = "ApplicationFrequency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ApplicationFrequency")
  public OBFeeFrequency1Code2 getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(OBFeeFrequency1Code2 applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner calculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * Get calculationFrequency
   * @return calculationFrequency
   */
  
  @Schema(name = "CalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationFrequency")
  public OBFeeFrequency1Code3 getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(OBFeeFrequency1Code3 calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  
  @Schema(name = "Notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner addFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

  /**
   * Get feeChargeCap
   * @return feeChargeCap
   */
  
  @Schema(name = "FeeChargeCap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeChargeCap")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> getFeeChargeCap() {
    return feeChargeCap;
  }

  public void setFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner otherFeeCategoryType(OBOtherCodeType10 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
    return this;
  }

  /**
   * Get otherFeeCategoryType
   * @return otherFeeCategoryType
   */
  
  @Schema(name = "OtherFeeCategoryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeCategoryType")
  public OBOtherCodeType10 getOtherFeeCategoryType() {
    return otherFeeCategoryType;
  }

  public void setOtherFeeCategoryType(OBOtherCodeType10 otherFeeCategoryType) {
    this.otherFeeCategoryType = otherFeeCategoryType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner otherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
   */
  
  @Schema(name = "OtherFeeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeType")
  public OBOtherFeeChargeDetailType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OBOtherFeeChargeDetailType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner otherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
   */
  
  @Schema(name = "OtherFeeRateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeRateType")
  public OBOtherCodeType18 getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OBOtherCodeType18 otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner otherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
   */
  
  @Schema(name = "OtherApplicationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherApplicationFrequency")
  public OBOtherCodeType16 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType16 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner otherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
   */
  
  @Schema(name = "OtherCalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherCalculationFrequency")
  public OBOtherCodeType17 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType17 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeApplicableRange(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
    return this;
  }

  /**
   * Get feeApplicableRange
   * @return feeApplicableRange
   */
  
  @Schema(name = "FeeApplicableRange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeApplicableRange")
  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange getFeeApplicableRange() {
    return feeApplicableRange;
  }

  public void setFeeApplicableRange(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange feeApplicableRange) {
    this.feeApplicableRange = feeApplicableRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner = (OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner) o;
    return Objects.equals(this.feeCategory, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.feeCategory) &&
        Objects.equals(this.feeType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.feeType) &&
        Objects.equals(this.negotiableIndicator, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.negotiableIndicator) &&
        Objects.equals(this.feeAmount, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.feeAmount) &&
        Objects.equals(this.feeRate, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.feeRate) &&
        Objects.equals(this.feeRateType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.feeRateType) &&
        Objects.equals(this.applicationFrequency, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.calculationFrequency) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.notes) &&
        Objects.equals(this.feeChargeCap, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.feeChargeCap) &&
        Objects.equals(this.otherFeeCategoryType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.otherFeeCategoryType) &&
        Objects.equals(this.otherFeeType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.otherCalculationFrequency) &&
        Objects.equals(this.feeApplicableRange, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.feeApplicableRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeCategory, feeType, negotiableIndicator, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, feeChargeCap, otherFeeCategoryType, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, feeApplicableRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner {\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
    sb.append("    otherFeeCategoryType: ").append(toIndentedString(otherFeeCategoryType)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    feeApplicableRange: ").append(toIndentedString(feeApplicableRange)).append("\n");
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

