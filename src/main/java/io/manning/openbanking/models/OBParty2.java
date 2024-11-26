package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBInternalPartyType1Code;
import io.manning.openbanking.models.OBPartyRelationships1;
import io.manning.openbanking.models.OBPostalAddress7;
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
 * OBParty2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBParty2 {

  private String partyId;

  private String partyNumber;

  private OBInternalPartyType1Code partyType;

  private String name;

  private String fullLegalName;

  private String legalStructure;

  private String LEI;

  private Boolean beneficialOwnership;

  private String accountRole;

  private String emailAddress;

  private String phone;

  private String mobile;

  private OBPartyRelationships1 relationships;

  
  private List<OBPostalAddress7> address = new ArrayList<>();

  public OBParty2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBParty2(String partyId) {
    this.partyId = partyId;
  }

  public OBParty2 partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.
   * @return partyId
   */
  @NotNull
  @Schema(name = "PartyId", example = "PXSIF023", description = "A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PartyId")
  public String getPartyId() {
    return partyId;
  }

  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public OBParty2 partyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
    return this;
  }

  /**
   * Number assigned by an agent to identify its customer.
   * @return partyNumber
   */
  
  @Schema(name = "PartyNumber", example = "20202002", description = "Number assigned by an agent to identify its customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PartyNumber")
  public String getPartyNumber() {
    return partyNumber;
  }

  public void setPartyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
  }

  public OBParty2 partyType(OBInternalPartyType1Code partyType) {
    this.partyType = partyType;
    return this;
  }

  /**
   * Get partyType
   * @return partyType
   */
  
  @Schema(name = "PartyType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PartyType")
  public OBInternalPartyType1Code getPartyType() {
    return partyType;
  }

  public void setPartyType(OBInternalPartyType1Code partyType) {
    this.partyType = partyType;
  }

  public OBParty2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which a party is known and which is usually used to identify that party.
   * @return name
   */
  
  @Schema(name = "Name", example = "Mx Jane Smith", description = "Name by which a party is known and which is usually used to identify that party.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBParty2 fullLegalName(String fullLegalName) {
    this.fullLegalName = fullLegalName;
    return this;
  }

  /**
   * The full legal name of the party.
   * @return fullLegalName
   */
  
  @Schema(name = "FullLegalName", example = "Jane Smith", description = "The full legal name of the party.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FullLegalName")
  public String getFullLegalName() {
    return fullLegalName;
  }

  public void setFullLegalName(String fullLegalName) {
    this.fullLegalName = fullLegalName;
  }

  public OBParty2 legalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
    return this;
  }

  /**
   * Legal standing of the party. For a full list refer to `OBInternalLegalStructureType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return legalStructure
   */
  
  @Schema(name = "LegalStructure", example = "UK.OBIE.Individual", description = "Legal standing of the party. For a full list refer to `OBInternalLegalStructureType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LegalStructure")
  public String getLegalStructure() {
    return legalStructure;
  }

  public void setLegalStructure(String legalStructure) {
    this.legalStructure = legalStructure;
  }

  public OBParty2 LEI(String LEI) {
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

  public OBParty2 beneficialOwnership(Boolean beneficialOwnership) {
    this.beneficialOwnership = beneficialOwnership;
    return this;
  }

  /**
   * A flag to indicate a party's beneficial ownership of the related account
   * @return beneficialOwnership
   */
  
  @Schema(name = "BeneficialOwnership", description = "A flag to indicate a party's beneficial ownership of the related account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BeneficialOwnership")
  public Boolean getBeneficialOwnership() {
    return beneficialOwnership;
  }

  public void setBeneficialOwnership(Boolean beneficialOwnership) {
    this.beneficialOwnership = beneficialOwnership;
  }

  public OBParty2 accountRole(String accountRole) {
    this.accountRole = accountRole;
    return this;
  }

  /**
   * A party’s role with respect to the related account. For a full list refer to `OBInternalAccountRole1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return accountRole
   */
  
  @Schema(name = "AccountRole", description = "A party’s role with respect to the related account. For a full list refer to `OBInternalAccountRole1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccountRole")
  public String getAccountRole() {
    return accountRole;
  }

  public void setAccountRole(String accountRole) {
    this.accountRole = accountRole;
  }

  public OBParty2 emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Address for electronic mail (e-mail).
   * @return emailAddress
   */
  
  @Schema(name = "EmailAddress", example = "d.user@semiotec.co.jp", description = "Address for electronic mail (e-mail).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public OBParty2 phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Collection of information that identifies a phone number, as defined by telecom services.
   * @return phone
   */
  
  @Schema(name = "Phone", example = "+442079460000", description = "Collection of information that identifies a phone number, as defined by telecom services.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OBParty2 mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Collection of information that identifies a mobile phone number, as defined by telecom services.
   * @return mobile
   */
  
  @Schema(name = "Mobile", example = "+447700900000", description = "Collection of information that identifies a mobile phone number, as defined by telecom services.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mobile")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public OBParty2 relationships(OBPartyRelationships1 relationships) {
    this.relationships = relationships;
    return this;
  }

  /**
   * Get relationships
   * @return relationships
   */
  
  @Schema(name = "Relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Relationships")
  public OBPartyRelationships1 getRelationships() {
    return relationships;
  }

  public void setRelationships(OBPartyRelationships1 relationships) {
    this.relationships = relationships;
  }

  public OBParty2 address(List<OBPostalAddress7> address) {
    this.address = address;
    return this;
  }

  public OBParty2 addAddressItem(OBPostalAddress7 addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

  /**
   * Get address
   * @return address
   */
  
  @Schema(name = "Address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Address")
  public List<OBPostalAddress7> getAddress() {
    return address;
  }

  public void setAddress(List<OBPostalAddress7> address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBParty2 obParty2 = (OBParty2) o;
    return Objects.equals(this.partyId, obParty2.partyId) &&
        Objects.equals(this.partyNumber, obParty2.partyNumber) &&
        Objects.equals(this.partyType, obParty2.partyType) &&
        Objects.equals(this.name, obParty2.name) &&
        Objects.equals(this.fullLegalName, obParty2.fullLegalName) &&
        Objects.equals(this.legalStructure, obParty2.legalStructure) &&
        Objects.equals(this.LEI, obParty2.LEI) &&
        Objects.equals(this.beneficialOwnership, obParty2.beneficialOwnership) &&
        Objects.equals(this.accountRole, obParty2.accountRole) &&
        Objects.equals(this.emailAddress, obParty2.emailAddress) &&
        Objects.equals(this.phone, obParty2.phone) &&
        Objects.equals(this.mobile, obParty2.mobile) &&
        Objects.equals(this.relationships, obParty2.relationships) &&
        Objects.equals(this.address, obParty2.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyId, partyNumber, partyType, name, fullLegalName, legalStructure, LEI, beneficialOwnership, accountRole, emailAddress, phone, mobile, relationships, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBParty2 {\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    partyNumber: ").append(toIndentedString(partyNumber)).append("\n");
    sb.append("    partyType: ").append(toIndentedString(partyType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fullLegalName: ").append(toIndentedString(fullLegalName)).append("\n");
    sb.append("    legalStructure: ").append(toIndentedString(legalStructure)).append("\n");
    sb.append("    LEI: ").append(toIndentedString(LEI)).append("\n");
    sb.append("    beneficialOwnership: ").append(toIndentedString(beneficialOwnership)).append("\n");
    sb.append("    accountRole: ").append(toIndentedString(accountRole)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

