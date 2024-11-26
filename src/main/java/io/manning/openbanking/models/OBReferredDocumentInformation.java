package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.ExternalDocumentType1Code;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReferredDocumentInformation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReferredDocumentInformation {

  private ExternalDocumentType1Code code;

  private String issuer;

  private String number;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime relatedDate;

  
  private List<String> lineDetails = new ArrayList<>();

  public OBReferredDocumentInformation code(ExternalDocumentType1Code code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public ExternalDocumentType1Code getCode() {
    return code;
  }

  public void setCode(ExternalDocumentType1Code code) {
    this.code = code;
  }

  public OBReferredDocumentInformation issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * dentification of the issuer of the reference document type.
   * @return issuer
   */
  
  @Schema(name = "Issuer", description = "dentification of the issuer of the reference document type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Issuer")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }

  public OBReferredDocumentInformation number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Identification of the type specified for the referred document line.
   * @return number
   */
  
  @Schema(name = "Number", description = "Identification of the type specified for the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Number")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public OBReferredDocumentInformation relatedDate(OffsetDateTime relatedDate) {
    this.relatedDate = relatedDate;
    return this;
  }

  /**
   * Date associated with the referred document line.
   * @return relatedDate
   */
  
  @Schema(name = "RelatedDate", description = "Date associated with the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RelatedDate")
  public OffsetDateTime getRelatedDate() {
    return relatedDate;
  }

  public void setRelatedDate(OffsetDateTime relatedDate) {
    this.relatedDate = relatedDate;
  }

  public OBReferredDocumentInformation lineDetails(List<String> lineDetails) {
    this.lineDetails = lineDetails;
    return this;
  }

  public OBReferredDocumentInformation addLineDetailsItem(String lineDetailsItem) {
    if (this.lineDetails == null) {
      this.lineDetails = new ArrayList<>();
    }
    this.lineDetails.add(lineDetailsItem);
    return this;
  }

  /**
   * Set of elements used to provide the content of the referred document line.
   * @return lineDetails
   */
  
  @Schema(name = "LineDetails", description = "Set of elements used to provide the content of the referred document line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LineDetails")
  public List<String> getLineDetails() {
    return lineDetails;
  }

  public void setLineDetails(List<String> lineDetails) {
    this.lineDetails = lineDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReferredDocumentInformation obReferredDocumentInformation = (OBReferredDocumentInformation) o;
    return Objects.equals(this.code, obReferredDocumentInformation.code) &&
        Objects.equals(this.issuer, obReferredDocumentInformation.issuer) &&
        Objects.equals(this.number, obReferredDocumentInformation.number) &&
        Objects.equals(this.relatedDate, obReferredDocumentInformation.relatedDate) &&
        Objects.equals(this.lineDetails, obReferredDocumentInformation.lineDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer, number, relatedDate, lineDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReferredDocumentInformation {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    relatedDate: ").append(toIndentedString(relatedDate)).append("\n");
    sb.append("    lineDetails: ").append(toIndentedString(lineDetails)).append("\n");
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

