package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.ExternalMandateStatus1Code;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount0;
import io.manning.openbanking.models.OBMandateRelatedInformation1;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Account to or from which a cash entry is made.
 */

@Schema(name = "OBReadDirectDebit2_Data_DirectDebit_inner", description = "Account to or from which a cash entry is made.")
@JsonTypeName("OBReadDirectDebit2_Data_DirectDebit_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadDirectDebit2DataDirectDebitInner {

  private String accountId;

  private String directDebitId;

  private ExternalMandateStatus1Code directDebitStatusCode;

  private OBMandateRelatedInformation1 mandateRelatedInformation;

  private String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime previousPaymentDateTime;

  private OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount;

  public OBReadDirectDebit2DataDirectDebitInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadDirectDebit2DataDirectDebitInner(String accountId, String name) {
    this.accountId = accountId;
    this.name = name;
  }

  public OBReadDirectDebit2DataDirectDebitInner accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
   */
  @NotNull
  @Schema(name = "AccountId", example = "22289", description = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadDirectDebit2DataDirectDebitInner directDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   * @return directDebitId
   */
  
  @Schema(name = "DirectDebitId", description = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DirectDebitId")
  public String getDirectDebitId() {
    return directDebitId;
  }

  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public OBReadDirectDebit2DataDirectDebitInner directDebitStatusCode(ExternalMandateStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

  /**
   * Get directDebitStatusCode
   * @return directDebitStatusCode
   */
  
  @Schema(name = "DirectDebitStatusCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DirectDebitStatusCode")
  public ExternalMandateStatus1Code getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }

  public void setDirectDebitStatusCode(ExternalMandateStatus1Code directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public OBReadDirectDebit2DataDirectDebitInner mandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
    return this;
  }

  /**
   * Get mandateRelatedInformation
   * @return mandateRelatedInformation
   */
  
  @Schema(name = "MandateRelatedInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MandateRelatedInformation")
  public OBMandateRelatedInformation1 getMandateRelatedInformation() {
    return mandateRelatedInformation;
  }

  public void setMandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
    this.mandateRelatedInformation = mandateRelatedInformation;
  }

  public OBReadDirectDebit2DataDirectDebitInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of Service User.
   * @return name
   */
  @NotNull
  @Schema(name = "Name", description = "Name of Service User.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBReadDirectDebit2DataDirectDebitInner previousPaymentDateTime(OffsetDateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }

  /**
   * Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return previousPaymentDateTime
   */
  
  @Schema(name = "PreviousPaymentDateTime", description = "Date of most recent direct debit collection. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreviousPaymentDateTime")
  public OffsetDateTime getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(OffsetDateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public OBReadDirectDebit2DataDirectDebitInner previousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

  /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
   */
  
  @Schema(name = "PreviousPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreviousPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount0 getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }

  public void setPreviousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDirectDebit2DataDirectDebitInner obReadDirectDebit2DataDirectDebitInner = (OBReadDirectDebit2DataDirectDebitInner) o;
    return Objects.equals(this.accountId, obReadDirectDebit2DataDirectDebitInner.accountId) &&
        Objects.equals(this.directDebitId, obReadDirectDebit2DataDirectDebitInner.directDebitId) &&
        Objects.equals(this.directDebitStatusCode, obReadDirectDebit2DataDirectDebitInner.directDebitStatusCode) &&
        Objects.equals(this.mandateRelatedInformation, obReadDirectDebit2DataDirectDebitInner.mandateRelatedInformation) &&
        Objects.equals(this.name, obReadDirectDebit2DataDirectDebitInner.name) &&
        Objects.equals(this.previousPaymentDateTime, obReadDirectDebit2DataDirectDebitInner.previousPaymentDateTime) &&
        Objects.equals(this.previousPaymentAmount, obReadDirectDebit2DataDirectDebitInner.previousPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, directDebitStatusCode, mandateRelatedInformation, name, previousPaymentDateTime, previousPaymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDirectDebit2DataDirectDebitInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
    sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
    sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
    sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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

