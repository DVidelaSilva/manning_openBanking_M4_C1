package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType;
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
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner", description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_OtherFeesCharges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner {

  /**
   * TariffType which defines the fee and charges.
   */
  public enum TariffTypeEnum {
    TTEL("TTEL"),
    
    TTMX("TTMX"),
    
    TTOT("TTOT");

    private String value;

    TariffTypeEnum(String value) {
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
    public static TariffTypeEnum fromValue(String value) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TariffTypeEnum tariffType;

  private String tariffName;

  private OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType;

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner tariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
    return this;
  }

  /**
   * TariffType which defines the fee and charges.
   * @return tariffType
   */
  
  @Schema(name = "TariffType", description = "TariffType which defines the fee and charges.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TariffType")
  public TariffTypeEnum getTariffType() {
    return tariffType;
  }

  public void setTariffType(TariffTypeEnum tariffType) {
    this.tariffType = tariffType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner tariffName(String tariffName) {
    this.tariffName = tariffName;
    return this;
  }

  /**
   * Name of the tariff
   * @return tariffName
   */
  
  @Schema(name = "TariffName", description = "Name of the tariff", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TariffName")
  public String getTariffName() {
    return tariffName;
  }

  public void setTariffName(String tariffName) {
    this.tariffName = tariffName;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner otherTariffType(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
    return this;
  }

  /**
   * Get otherTariffType
   * @return otherTariffType
   */
  
  @Schema(name = "OtherTariffType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherTariffType")
  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType getOtherTariffType() {
    return otherTariffType;
  }

  public void setOtherTariffType(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType) {
    this.otherTariffType = otherTariffType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner feeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner addFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeChargeDetailItem) {
    if (this.feeChargeDetail == null) {
      this.feeChargeDetail = new ArrayList<>();
    }
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

  /**
   * Get feeChargeDetail
   * @return feeChargeDetail
   */
  @NotNull
  @Schema(name = "FeeChargeDetail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeChargeDetail")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> getFeeChargeDetail() {
    return feeChargeDetail;
  }

  public void setFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail) {
    this.feeChargeDetail = feeChargeDetail;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner feeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap) {
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner addFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner feeChargeCapItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner = (OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner) o;
    return Objects.equals(this.tariffType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.tariffType) &&
        Objects.equals(this.tariffName, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.tariffName) &&
        Objects.equals(this.otherTariffType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.feeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner {\n");
    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
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

