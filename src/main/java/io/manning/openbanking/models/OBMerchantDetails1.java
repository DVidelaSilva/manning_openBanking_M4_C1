package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details of the merchant involved in the transaction.
 */

@Schema(name = "OBMerchantDetails1", description = "Details of the merchant involved in the transaction.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBMerchantDetails1 {

  private String merchantName;

  private String merchantCategoryCode;

  public OBMerchantDetails1 merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Name by which the merchant is known.
   * @return merchantName
   */
  
  @Schema(name = "MerchantName", description = "Name by which the merchant is known.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MerchantName")
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public OBMerchantDetails1 merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
   * @return merchantCategoryCode
   */
  
  @Schema(name = "MerchantCategoryCode", description = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MerchantCategoryCode")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBMerchantDetails1 obMerchantDetails1 = (OBMerchantDetails1) o;
    return Objects.equals(this.merchantName, obMerchantDetails1.merchantName) &&
        Objects.equals(this.merchantCategoryCode, obMerchantDetails1.merchantCategoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantCategoryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBMerchantDetails1 {\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
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

