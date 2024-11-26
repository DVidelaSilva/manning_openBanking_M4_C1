package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBAddressType2Code;
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
 * Information that locates and identifies a specific address, as defined by postal services.
 */

@Schema(name = "OBPostalAddress7", description = "Information that locates and identifies a specific address, as defined by postal services.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBPostalAddress7 {

  private OBAddressType2Code addressType;

  private String department;

  private String subDepartment;

  private String streetName;

  private String buildingNumber;

  private String buildingName;

  private String floor;

  private String unitNumber;

  private String room;

  private String postBox;

  private String townLocationName;

  private String districtName;

  private String careOf;

  private String postCode;

  private String townName;

  private String countrySubDivision;

  private String country;

  
  private List<String> addressLine = new ArrayList<>();

  public OBPostalAddress7 addressType(OBAddressType2Code addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * Get addressType
   * @return addressType
   */
  
  @Schema(name = "AddressType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddressType")
  public OBAddressType2Code getAddressType() {
    return addressType;
  }

  public void setAddressType(OBAddressType2Code addressType) {
    this.addressType = addressType;
  }

  public OBPostalAddress7 department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Identification of a division of a large organisation or building.
   * @return department
   */
  
  @Schema(name = "Department", example = "Finance", description = "Identification of a division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Department")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public OBPostalAddress7 subDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
    return this;
  }

  /**
   * Identification of a sub-division of a large organisation or building.
   * @return subDepartment
   */
  
  @Schema(name = "SubDepartment", example = "Payroll", description = "Identification of a sub-division of a large organisation or building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubDepartment")
  public String getSubDepartment() {
    return subDepartment;
  }

  public void setSubDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
  }

  public OBPostalAddress7 streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of a street or thoroughfare.
   * @return streetName
   */
  
  @Schema(name = "StreetName", example = "Bank Street", description = "Name of a street or thoroughfare.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StreetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public OBPostalAddress7 buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Number that identifies the position of a building on a street.
   * @return buildingNumber
   */
  
  @Schema(name = "BuildingNumber", example = "11", description = "Number that identifies the position of a building on a street.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildingNumber")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public OBPostalAddress7 buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Name of a referenced building.
   * @return buildingName
   */
  
  @Schema(name = "BuildingName", description = "Name of a referenced building.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildingName")
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public OBPostalAddress7 floor(String floor) {
    this.floor = floor;
    return this;
  }

  /**
   * Number that identifies the level within a building
   * @return floor
   */
  
  @Schema(name = "Floor", example = "11", description = "Number that identifies the level within a building", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Floor")
  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public OBPostalAddress7 unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

  /**
   * Number that identifies the unit of a specific address .
   * @return unitNumber
   */
  
  @Schema(name = "UnitNumber", example = "A88", description = "Number that identifies the unit of a specific address .", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UnitNumber")
  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public OBPostalAddress7 room(String room) {
    this.room = room;
    return this;
  }

  /**
   * Information that locates and identifies a room to form part of an address
   * @return room
   */
  
  @Schema(name = "Room", example = "Basement 03", description = "Information that locates and identifies a room to form part of an address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Room")
  public String getRoom() {
    return room;
  }

  public void setRoom(String room) {
    this.room = room;
  }

  public OBPostalAddress7 postBox(String postBox) {
    this.postBox = postBox;
    return this;
  }

  /**
   * Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.
   * @return postBox
   */
  
  @Schema(name = "PostBox", example = "PO Box 123456", description = "Information that locates and identifies a box in a post office assigned to a person or organization, where letters for them are kept until called for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostBox")
  public String getPostBox() {
    return postBox;
  }

  public void setPostBox(String postBox) {
    this.postBox = postBox;
  }

  public OBPostalAddress7 townLocationName(String townLocationName) {
    this.townLocationName = townLocationName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townLocationName
   */
  
  @Schema(name = "TownLocationName", example = "London", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TownLocationName")
  public String getTownLocationName() {
    return townLocationName;
  }

  public void setTownLocationName(String townLocationName) {
    this.townLocationName = townLocationName;
  }

  public OBPostalAddress7 districtName(String districtName) {
    this.districtName = districtName;
    return this;
  }

  /**
   * Number that of the regional area, known as a district, which forms part of an address
   * @return districtName
   */
  
  @Schema(name = "DistrictName", example = "Greater London", description = "Number that of the regional area, known as a district, which forms part of an address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DistrictName")
  public String getDistrictName() {
    return districtName;
  }

  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }

  public OBPostalAddress7 careOf(String careOf) {
    this.careOf = careOf;
    return this;
  }

  /**
   * The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.
   * @return careOf
   */
  
  @Schema(name = "CareOf", example = "Jane Smith", description = "The 'care of' address is used whenever sending mail to a person or organisation who does not actually live or work at the address. They will receive the mail for the individual.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CareOf")
  public String getCareOf() {
    return careOf;
  }

  public void setCareOf(String careOf) {
    this.careOf = careOf;
  }

  public OBPostalAddress7 postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.
   * @return postCode
   */
  
  @Schema(name = "PostCode", example = "EC2N 4AG", description = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public OBPostalAddress7 townName(String townName) {
    this.townName = townName;
    return this;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   * @return townName
   */
  
  @Schema(name = "TownName", example = "London", description = "Name of a built-up area, with defined boundaries, and a local government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TownName")
  public String getTownName() {
    return townName;
  }

  public void setTownName(String townName) {
    this.townName = townName;
  }

  public OBPostalAddress7 countrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
    return this;
  }

  /**
   * Identifies a subdivision of a country such as state, region, county.
   * @return countrySubDivision
   */
  
  @Schema(name = "CountrySubDivision", description = "Identifies a subdivision of a country such as state, region, county.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CountrySubDivision")
  public String getCountrySubDivision() {
    return countrySubDivision;
  }

  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  public OBPostalAddress7 country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Nation with its own government.
   * @return country
   */
  
  @Schema(name = "Country", description = "Nation with its own government.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public OBPostalAddress7 addressLine(List<String> addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  public OBPostalAddress7 addAddressLineItem(String addressLineItem) {
    if (this.addressLine == null) {
      this.addressLine = new ArrayList<>();
    }
    this.addressLine.add(addressLineItem);
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
   */
  
  @Schema(name = "AddressLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddressLine")
  public List<String> getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPostalAddress7 obPostalAddress7 = (OBPostalAddress7) o;
    return Objects.equals(this.addressType, obPostalAddress7.addressType) &&
        Objects.equals(this.department, obPostalAddress7.department) &&
        Objects.equals(this.subDepartment, obPostalAddress7.subDepartment) &&
        Objects.equals(this.streetName, obPostalAddress7.streetName) &&
        Objects.equals(this.buildingNumber, obPostalAddress7.buildingNumber) &&
        Objects.equals(this.buildingName, obPostalAddress7.buildingName) &&
        Objects.equals(this.floor, obPostalAddress7.floor) &&
        Objects.equals(this.unitNumber, obPostalAddress7.unitNumber) &&
        Objects.equals(this.room, obPostalAddress7.room) &&
        Objects.equals(this.postBox, obPostalAddress7.postBox) &&
        Objects.equals(this.townLocationName, obPostalAddress7.townLocationName) &&
        Objects.equals(this.districtName, obPostalAddress7.districtName) &&
        Objects.equals(this.careOf, obPostalAddress7.careOf) &&
        Objects.equals(this.postCode, obPostalAddress7.postCode) &&
        Objects.equals(this.townName, obPostalAddress7.townName) &&
        Objects.equals(this.countrySubDivision, obPostalAddress7.countrySubDivision) &&
        Objects.equals(this.country, obPostalAddress7.country) &&
        Objects.equals(this.addressLine, obPostalAddress7.addressLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressType, department, subDepartment, streetName, buildingNumber, buildingName, floor, unitNumber, room, postBox, townLocationName, districtName, careOf, postCode, townName, countrySubDivision, country, addressLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPostalAddress7 {\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    room: ").append(toIndentedString(room)).append("\n");
    sb.append("    postBox: ").append(toIndentedString(postBox)).append("\n");
    sb.append("    townLocationName: ").append(toIndentedString(townLocationName)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    careOf: ").append(toIndentedString(careOf)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
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

