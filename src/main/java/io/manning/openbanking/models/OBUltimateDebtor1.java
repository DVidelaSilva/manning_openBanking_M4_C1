package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.OBPostalAddress7;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ultimate party that owes an amount of money to the (ultimate) creditor.
 */

@Schema(name = "OBUltimateDebtor1", description = "Ultimate party that owes an amount of money to the (ultimate) creditor.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBUltimateDebtor1 {

  private String name;

  private String identification;

  private String LEI;

  private String schemeName;

  private OBPostalAddress7 postalAddress;

  public OBUltimateDebtor1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return name
   */
  
  @Schema(name = "Name", description = "Name by which a party is known and which is usually used to identify that party.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBUltimateDebtor1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification assigned by an institution.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Identification assigned by an institution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBUltimateDebtor1 LEI(String LEI) {
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

  public OBUltimateDebtor1 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return schemeName
   */
  
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBUltimateDebtor1 postalAddress(OBPostalAddress7 postalAddress) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBUltimateDebtor1 obUltimateDebtor1 = (OBUltimateDebtor1) o;
    return Objects.equals(this.name, obUltimateDebtor1.name) &&
        Objects.equals(this.identification, obUltimateDebtor1.identification) &&
        Objects.equals(this.LEI, obUltimateDebtor1.LEI) &&
        Objects.equals(this.schemeName, obUltimateDebtor1.schemeName) &&
        Objects.equals(this.postalAddress, obUltimateDebtor1.postalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, identification, LEI, schemeName, postalAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBUltimateDebtor1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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

