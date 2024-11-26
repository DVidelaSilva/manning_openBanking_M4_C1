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
 * Other interest rate types which are not available in the standard code list
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner_TierBand_inner_OtherBankInterestType", description = "Other interest rate types which are not available in the standard code list")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner_TierBand_inner_OtherBankInterestType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType {

  private String code;

  private String name;

  private String description;

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType code(String code) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType name(String name) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType description(String description) {
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
    OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType) o;
    return Objects.equals(this.code, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType.code) &&
        Objects.equals(this.name, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType.name) &&
        Objects.equals(this.description, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

