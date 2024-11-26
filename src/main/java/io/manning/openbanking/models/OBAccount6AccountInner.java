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
 * Provides the details to identify an account.
 */

@Schema(name = "OBAccount6_Account_inner", description = "Provides the details to identify an account.")
@JsonTypeName("OBAccount6_Account_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBAccount6AccountInner {

  private String schemeName;

  private String identification;

  private String name;

  private String LEI;

  private String secondaryIdentification;

  public OBAccount6AccountInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBAccount6AccountInner(String schemeName, String identification) {
    this.schemeName = schemeName;
    this.identification = identification;
  }

  public OBAccount6AccountInner schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return schemeName
   */
  @NotNull
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBAccount6AccountInner identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification assigned by an institution to identify an account. This identification is known by the account owner.
   * @return identification
   */
  @NotNull
  @Schema(name = "Identification", example = "80200112344562", description = "Identification assigned by an institution to identify an account. This identification is known by the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBAccount6AccountInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.
   * @return name
   */
  
  @Schema(name = "Name", example = "Jane Smith", description = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBAccount6AccountInner LEI(String LEI) {
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

  public OBAccount6AccountInner secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
   * @return secondaryIdentification
   */
  
  @Schema(name = "SecondaryIdentification", example = "87562298675897", description = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecondaryIdentification")
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount6AccountInner obAccount6AccountInner = (OBAccount6AccountInner) o;
    return Objects.equals(this.schemeName, obAccount6AccountInner.schemeName) &&
        Objects.equals(this.identification, obAccount6AccountInner.identification) &&
        Objects.equals(this.name, obAccount6AccountInner.name) &&
        Objects.equals(this.LEI, obAccount6AccountInner.LEI) &&
        Objects.equals(this.secondaryIdentification, obAccount6AccountInner.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, LEI, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6AccountInner {\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

