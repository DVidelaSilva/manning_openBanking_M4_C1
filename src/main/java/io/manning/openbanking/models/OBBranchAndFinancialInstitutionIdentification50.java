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
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.
 */

@Schema(name = "OBBranchAndFinancialInstitutionIdentification5_0", description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.")
@JsonTypeName("OBBranchAndFinancialInstitutionIdentification5_0")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBBranchAndFinancialInstitutionIdentification50 {

  private String schemeName;

  private String identification;

  private String name;

  public OBBranchAndFinancialInstitutionIdentification50() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBBranchAndFinancialInstitutionIdentification50(String schemeName, String identification) {
    this.schemeName = schemeName;
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification50 schemeName(String schemeName) {
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

  public OBBranchAndFinancialInstitutionIdentification50 identification(String identification) {
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

  public OBBranchAndFinancialInstitutionIdentification50 name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBranchAndFinancialInstitutionIdentification50 obBranchAndFinancialInstitutionIdentification50 = (OBBranchAndFinancialInstitutionIdentification50) o;
    return Objects.equals(this.schemeName, obBranchAndFinancialInstitutionIdentification50.schemeName) &&
        Objects.equals(this.identification, obBranchAndFinancialInstitutionIdentification50.identification) &&
        Objects.equals(this.name, obBranchAndFinancialInstitutionIdentification50.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification50 {\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

