package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBPostalAddress7;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.
 */

@Schema(name = "OBBranchAndFinancialInstitutionIdentification5_1", description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
@JsonTypeName("OBBranchAndFinancialInstitutionIdentification5_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBBranchAndFinancialInstitutionIdentification51 {

  private String schemeName;

  private String identification;

  private String name;

  private OBPostalAddress7 postalAddress;

  private String LEI;

  public OBBranchAndFinancialInstitutionIdentification51() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBBranchAndFinancialInstitutionIdentification51(String schemeName, String identification) {
    this.schemeName = schemeName;
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification51 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list.<br/> For a full list of enumeration values refer to `OBInternalFinancialInstitutionIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return schemeName
   */
  @NotNull
  @Schema(name = "SchemeName", example = "UK.OBIE.BICFI", description = "Name of the identification scheme, in a coded form as published in an external list.<br/> For a full list of enumeration values refer to `OBInternalFinancialInstitutionIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBBranchAndFinancialInstitutionIdentification51 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of the servicing institution.
   * @return identification
   */
  @NotNull
  @Schema(name = "Identification", example = "80200112344562", description = "Unique and unambiguous identification of the servicing institution.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification51 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which an agent is known and which is usually used to identify that agent.
   * @return name
   */
  
  @Schema(name = "Name", example = "Agent Name", description = "Name by which an agent is known and which is usually used to identify that agent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBBranchAndFinancialInstitutionIdentification51 postalAddress(OBPostalAddress7 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
   */
  
  @Schema(name = "PostalAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostalAddress")
  public OBPostalAddress7 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress7 postalAddress) {
    this.postalAddress = postalAddress;
  }

  public OBBranchAndFinancialInstitutionIdentification51 LEI(String LEI) {
    this.LEI = LEI;
    return this;
  }

  /**
   * Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".
   * @return LEI
   */
  
  @Schema(name = "LEI", example = "IZ9Q00LZEVUKWCQY6X15", description = "Legal entity identification as an alternate identification for a party. Legal Entity Identifier is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LEI")
  public String getLEI() {
    return LEI;
  }

  public void setLEI(String LEI) {
    this.LEI = LEI;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBranchAndFinancialInstitutionIdentification51 obBranchAndFinancialInstitutionIdentification51 = (OBBranchAndFinancialInstitutionIdentification51) o;
    return Objects.equals(this.schemeName, obBranchAndFinancialInstitutionIdentification51.schemeName) &&
        Objects.equals(this.identification, obBranchAndFinancialInstitutionIdentification51.identification) &&
        Objects.equals(this.name, obBranchAndFinancialInstitutionIdentification51.name) &&
        Objects.equals(this.postalAddress, obBranchAndFinancialInstitutionIdentification51.postalAddress) &&
        Objects.equals(this.LEI, obBranchAndFinancialInstitutionIdentification51.LEI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, postalAddress, LEI);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification51 {\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
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

