package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBFeeCategory1Code;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Other Fee/charge type which is not available in the standard code set
 */

@Schema(name = "OB_OtherFeeChargeDetailType", description = "Other Fee/charge type which is not available in the standard code set")
@JsonTypeName("OB_OtherFeeChargeDetailType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBOtherFeeChargeDetailType {

  private String code;

  private OBFeeCategory1Code feeCategory;

  private String name;

  private String description;

  public OBOtherFeeChargeDetailType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBOtherFeeChargeDetailType(OBFeeCategory1Code feeCategory, String name, String description) {
    this.feeCategory = feeCategory;
    this.name = name;
    this.description = description;
  }

  public OBOtherFeeChargeDetailType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
   */
  
  @Schema(name = "Code", description = "The four letter Mnemonic used within an XML file to identify a code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBOtherFeeChargeDetailType feeCategory(OBFeeCategory1Code feeCategory) {
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

  public OBOtherFeeChargeDetailType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
   */
  @NotNull
  @Schema(name = "Name", description = "Long name associated with the code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBOtherFeeChargeDetailType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
   */
  @NotNull
  @Schema(name = "Description", description = "Description to describe the purpose of the code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOtherFeeChargeDetailType obOtherFeeChargeDetailType = (OBOtherFeeChargeDetailType) o;
    return Objects.equals(this.code, obOtherFeeChargeDetailType.code) &&
        Objects.equals(this.feeCategory, obOtherFeeChargeDetailType.feeCategory) &&
        Objects.equals(this.name, obOtherFeeChargeDetailType.name) &&
        Objects.equals(this.description, obOtherFeeChargeDetailType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, feeCategory, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOtherFeeChargeDetailType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

