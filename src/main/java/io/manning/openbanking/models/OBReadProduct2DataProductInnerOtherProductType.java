package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeCreditInterest;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeLoanInterest;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOverdraft;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeProductDetails;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeRepayment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * This field provides extension to the ProductType enumeration. If ProductType - \&quot;Other\&quot; is chosen, this field must be populated with name, and description for ASPSP specific product type.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType", description = "This field provides extension to the ProductType enumeration. If ProductType - \"Other\" is chosen, this field must be populated with name, and description for ASPSP specific product type.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductType {

  private String name;

  private String description;

  private OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails;

  private OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest;

  private OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft;

  private OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest;

  private OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment;

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges = new ArrayList<>();

  
  private Map<String, Object> supplementaryData = new HashMap<>();

  public OBReadProduct2DataProductInnerOtherProductType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductType(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public OBReadProduct2DataProductInnerOtherProductType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of \"Other\" product type.
   * @return name
   */
  @NotNull
  @Schema(name = "Name", example = "e-Wallet", description = "Name of \"Other\" product type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadProduct2DataProductInnerOtherProductType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of \"Other\" product type
   * @return description
   */
  @NotNull
  @Schema(name = "Description", example = "Virtual wallet", description = "Description of \"Other\" product type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBReadProduct2DataProductInnerOtherProductType productDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * @return productDetails
   */
  
  @Schema(name = "ProductDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductDetails")
  public OBReadProduct2DataProductInnerOtherProductTypeProductDetails getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(OBReadProduct2DataProductInnerOtherProductTypeProductDetails productDetails) {
    this.productDetails = productDetails;
  }

  public OBReadProduct2DataProductInnerOtherProductType creditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * @return creditInterest
   */
  
  @Schema(name = "CreditInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditInterest")
  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterest getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(OBReadProduct2DataProductInnerOtherProductTypeCreditInterest creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBReadProduct2DataProductInnerOtherProductType overdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * @return overdraft
   */
  
  @Schema(name = "Overdraft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Overdraft")
  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraft) {
    this.overdraft = overdraft;
  }

  public OBReadProduct2DataProductInnerOtherProductType loanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
    this.loanInterest = loanInterest;
    return this;
  }

  /**
   * Get loanInterest
   * @return loanInterest
   */
  
  @Schema(name = "LoanInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LoanInterest")
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest getLoanInterest() {
    return loanInterest;
  }

  public void setLoanInterest(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterest) {
    this.loanInterest = loanInterest;
  }

  public OBReadProduct2DataProductInnerOtherProductType repayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
    this.repayment = repayment;
    return this;
  }

  /**
   * Get repayment
   * @return repayment
   */
  
  @Schema(name = "Repayment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Repayment")
  public OBReadProduct2DataProductInnerOtherProductTypeRepayment getRepayment() {
    return repayment;
  }

  public void setRepayment(OBReadProduct2DataProductInnerOtherProductTypeRepayment repayment) {
    this.repayment = repayment;
  }

  public OBReadProduct2DataProductInnerOtherProductType otherFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductType addOtherFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner otherFeesChargesItem) {
    if (this.otherFeesCharges == null) {
      this.otherFeesCharges = new ArrayList<>();
    }
    this.otherFeesCharges.add(otherFeesChargesItem);
    return this;
  }

  /**
   * Get otherFeesCharges
   * @return otherFeesCharges
   */
  
  @Schema(name = "OtherFeesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeesCharges")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  public OBReadProduct2DataProductInnerOtherProductType supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductType putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
   */
  
  @Schema(name = "SupplementaryData", description = "Additional information that can not be captured in the structured fields and/or any other specific block.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupplementaryData")
  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductType obReadProduct2DataProductInnerOtherProductType = (OBReadProduct2DataProductInnerOtherProductType) o;
    return Objects.equals(this.name, obReadProduct2DataProductInnerOtherProductType.name) &&
        Objects.equals(this.description, obReadProduct2DataProductInnerOtherProductType.description) &&
        Objects.equals(this.productDetails, obReadProduct2DataProductInnerOtherProductType.productDetails) &&
        Objects.equals(this.creditInterest, obReadProduct2DataProductInnerOtherProductType.creditInterest) &&
        Objects.equals(this.overdraft, obReadProduct2DataProductInnerOtherProductType.overdraft) &&
        Objects.equals(this.loanInterest, obReadProduct2DataProductInnerOtherProductType.loanInterest) &&
        Objects.equals(this.repayment, obReadProduct2DataProductInnerOtherProductType.repayment) &&
        Objects.equals(this.otherFeesCharges, obReadProduct2DataProductInnerOtherProductType.otherFeesCharges) &&
        Objects.equals(this.supplementaryData, obReadProduct2DataProductInnerOtherProductType.supplementaryData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, productDetails, creditInterest, overdraft, loanInterest, repayment, otherFeesCharges, supplementaryData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    loanInterest: ").append(toIndentedString(loanInterest)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

