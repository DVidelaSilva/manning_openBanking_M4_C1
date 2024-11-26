package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.ExternalCategoryPurpose1Code;
import io.manning.openbanking.models.OBExternalMandateClassification1Code;
import io.manning.openbanking.models.OBFrequency6;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Provides further details of the mandate signed between the creditor and the debtor.
 */

@Schema(name = "OBMandateRelatedInformation1", description = "Provides further details of the mandate signed between the creditor and the debtor.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBMandateRelatedInformation1 {

  private String mandateIdentification;

  private OBExternalMandateClassification1Code classification;

  private ExternalCategoryPurpose1Code categoryPurposeCode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime firstPaymentDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime recurringPaymentDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime finalPaymentDateTime;

  private OBFrequency6 frequency;

  private String reason;

  public OBMandateRelatedInformation1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBMandateRelatedInformation1(OBFrequency6 frequency) {
    this.frequency = frequency;
  }

  public OBMandateRelatedInformation1 mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

  /**
   * Unique identification, as assigned by the creditor, to unambiguously identify the mandate.
   * @return mandateIdentification
   */
  
  @Schema(name = "MandateIdentification", example = "Golfers", description = "Unique identification, as assigned by the creditor, to unambiguously identify the mandate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MandateIdentification")
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public OBMandateRelatedInformation1 classification(OBExternalMandateClassification1Code classification) {
    this.classification = classification;
    return this;
  }

  /**
   * Get classification
   * @return classification
   */
  
  @Schema(name = "Classification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Classification")
  public OBExternalMandateClassification1Code getClassification() {
    return classification;
  }

  public void setClassification(OBExternalMandateClassification1Code classification) {
    this.classification = classification;
  }

  public OBMandateRelatedInformation1 categoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
    this.categoryPurposeCode = categoryPurposeCode;
    return this;
  }

  /**
   * Get categoryPurposeCode
   * @return categoryPurposeCode
   */
  
  @Schema(name = "CategoryPurposeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CategoryPurposeCode")
  public ExternalCategoryPurpose1Code getCategoryPurposeCode() {
    return categoryPurposeCode;
  }

  public void setCategoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
    this.categoryPurposeCode = categoryPurposeCode;
  }

  public OBMandateRelatedInformation1 firstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first payment for a recurrent credit transfer will be made.
   * @return firstPaymentDateTime
   */
  
  @Schema(name = "FirstPaymentDateTime", example = "2024-04-25T12:46:49.425Z", description = "The date on which the first payment for a recurrent credit transfer will be made.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FirstPaymentDateTime")
  public OffsetDateTime getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(OffsetDateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public OBMandateRelatedInformation1 recurringPaymentDateTime(OffsetDateTime recurringPaymentDateTime) {
    this.recurringPaymentDateTime = recurringPaymentDateTime;
    return this;
  }

  /**
   * The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return recurringPaymentDateTime
   */
  
  @Schema(name = "RecurringPaymentDateTime", example = "2024-04-25T12:46:49.425Z", description = "The date on which the first recurring payment for a Standing Order schedule will be made.  Usage: This must be populated only if the first recurring date is different to the first payment date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RecurringPaymentDateTime")
  public OffsetDateTime getRecurringPaymentDateTime() {
    return recurringPaymentDateTime;
  }

  public void setRecurringPaymentDateTime(OffsetDateTime recurringPaymentDateTime) {
    this.recurringPaymentDateTime = recurringPaymentDateTime;
  }

  public OBMandateRelatedInformation1 finalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

  /**
   * The date on which the final payment for a recurrent credit transfer will be made.
   * @return finalPaymentDateTime
   */
  
  @Schema(name = "FinalPaymentDateTime", example = "2024-04-25T12:46:49.425Z", description = "The date on which the final payment for a recurrent credit transfer will be made.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FinalPaymentDateTime")
  public OffsetDateTime getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(OffsetDateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public OBMandateRelatedInformation1 frequency(OBFrequency6 frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @NotNull
  @Schema(name = "Frequency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Frequency")
  public OBFrequency6 getFrequency() {
    return frequency;
  }

  public void setFrequency(OBFrequency6 frequency) {
    this.frequency = frequency;
  }

  public OBMandateRelatedInformation1 reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the setup of the credit transfer mandate.
   * @return reason
   */
  
  @Schema(name = "Reason", example = "To pay monthly memebership", description = "Reason for the setup of the credit transfer mandate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBMandateRelatedInformation1 obMandateRelatedInformation1 = (OBMandateRelatedInformation1) o;
    return Objects.equals(this.mandateIdentification, obMandateRelatedInformation1.mandateIdentification) &&
        Objects.equals(this.classification, obMandateRelatedInformation1.classification) &&
        Objects.equals(this.categoryPurposeCode, obMandateRelatedInformation1.categoryPurposeCode) &&
        Objects.equals(this.firstPaymentDateTime, obMandateRelatedInformation1.firstPaymentDateTime) &&
        Objects.equals(this.recurringPaymentDateTime, obMandateRelatedInformation1.recurringPaymentDateTime) &&
        Objects.equals(this.finalPaymentDateTime, obMandateRelatedInformation1.finalPaymentDateTime) &&
        Objects.equals(this.frequency, obMandateRelatedInformation1.frequency) &&
        Objects.equals(this.reason, obMandateRelatedInformation1.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateIdentification, classification, categoryPurposeCode, firstPaymentDateTime, recurringPaymentDateTime, finalPaymentDateTime, frequency, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBMandateRelatedInformation1 {\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    categoryPurposeCode: ").append(toIndentedString(categoryPurposeCode)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    recurringPaymentDateTime: ").append(toIndentedString(recurringPaymentDateTime)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

