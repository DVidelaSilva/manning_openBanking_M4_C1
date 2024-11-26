package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount1;
import io.manning.openbanking.models.OBBranchAndFinancialInstitutionIdentification51;
import io.manning.openbanking.models.OBCashAccount51;
import io.manning.openbanking.models.OBInternalScheduleType1Code;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBScheduledPayment3Detail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBScheduledPayment3Detail {

  private String accountId;

  private String scheduledPaymentId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledPaymentDateTime;

  private OBInternalScheduleType1Code scheduledType;

  private String reference;

  private String debtorReference;

  private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount;

  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent;

  private OBCashAccount51 creditorAccount;

  public OBScheduledPayment3Detail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBScheduledPayment3Detail(String accountId, OffsetDateTime scheduledPaymentDateTime, OBInternalScheduleType1Code scheduledType, OBActiveOrHistoricCurrencyAndAmount1 instructedAmount, OBCashAccount51 creditorAccount) {
    this.accountId = accountId;
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    this.scheduledType = scheduledType;
    this.instructedAmount = instructedAmount;
    this.creditorAccount = creditorAccount;
  }

  public OBScheduledPayment3Detail accountId(String accountId) {
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

  public OBScheduledPayment3Detail scheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
   * @return scheduledPaymentId
   */
  
  @Schema(name = "ScheduledPaymentId", example = "SP03", description = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ScheduledPaymentId")
  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }

  public void setScheduledPaymentId(String scheduledPaymentId) {
    this.scheduledPaymentId = scheduledPaymentId;
  }

  public OBScheduledPayment3Detail scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

  /**
   * The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return scheduledPaymentDateTime
   */
  @NotNull
  @Schema(name = "ScheduledPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the scheduled payment will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ScheduledPaymentDateTime")
  public OffsetDateTime getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }

  public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }

  public OBScheduledPayment3Detail scheduledType(OBInternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
    return this;
  }

  /**
   * Get scheduledType
   * @return scheduledType
   */
  @NotNull
  @Schema(name = "ScheduledType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ScheduledType")
  public OBInternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }

  public void setScheduledType(OBInternalScheduleType1Code scheduledType) {
    this.scheduledType = scheduledType;
  }

  public OBScheduledPayment3Detail reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
   */
  
  @Schema(name = "Reference", example = "Towbar Club", description = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reference")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBScheduledPayment3Detail debtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
    return this;
  }

  /**
   * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
   * @return debtorReference
   */
  
  @Schema(name = "DebtorReference", example = "REF51561806", description = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DebtorReference")
  public String getDebtorReference() {
    return debtorReference;
  }

  public void setDebtorReference(String debtorReference) {
    this.debtorReference = debtorReference;
  }

  public OBScheduledPayment3Detail instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
   */
  @NotNull
  @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstructedAmount")
  public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  public OBScheduledPayment3Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * @return creditorAgent
   */
  
  @Schema(name = "CreditorAgent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditorAgent")
  public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBScheduledPayment3Detail creditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
   */
  @NotNull
  @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreditorAccount")
  public OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBScheduledPayment3Detail obScheduledPayment3Detail = (OBScheduledPayment3Detail) o;
    return Objects.equals(this.accountId, obScheduledPayment3Detail.accountId) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment3Detail.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3Detail.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledType, obScheduledPayment3Detail.scheduledType) &&
        Objects.equals(this.reference, obScheduledPayment3Detail.reference) &&
        Objects.equals(this.debtorReference, obScheduledPayment3Detail.debtorReference) &&
        Objects.equals(this.instructedAmount, obScheduledPayment3Detail.instructedAmount) &&
        Objects.equals(this.creditorAgent, obScheduledPayment3Detail.creditorAgent) &&
        Objects.equals(this.creditorAccount, obScheduledPayment3Detail.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount, creditorAgent, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment3Detail {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

