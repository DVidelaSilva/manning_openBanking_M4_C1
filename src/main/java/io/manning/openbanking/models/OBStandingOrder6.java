package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.ExternalMandateStatus1Code;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount11;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount2;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount3;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount4;
import io.manning.openbanking.models.OBBranchAndFinancialInstitutionIdentification51;
import io.manning.openbanking.models.OBCashAccount51;
import io.manning.openbanking.models.OBMandateRelatedInformation1;
import io.manning.openbanking.models.OBRemittanceInformation2;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBStandingOrder6
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBStandingOrder6 {

  private String accountId;

  private String standingOrderId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime nextPaymentDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastPaymentDateTime;

  private ExternalMandateStatus1Code standingOrderStatusCode;

  private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount;

  private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount;

  private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount;

  private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount;

  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent;

  private OBCashAccount51 creditorAccount;

  
  private Map<String, Object> supplementaryData = new HashMap<>();

  private OBMandateRelatedInformation1 mandateRelatedInformation;

  private OBRemittanceInformation2 remittanceInformation;

  public OBStandingOrder6() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStandingOrder6(String accountId) {
    this.accountId = accountId;
  }

  public OBStandingOrder6 accountId(String accountId) {
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

  public OBStandingOrder6 standingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
   * @return standingOrderId
   */
  
  @Schema(name = "StandingOrderId", example = "Ben5", description = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StandingOrderId")
  public String getStandingOrderId() {
    return standingOrderId;
  }

  public void setStandingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public OBStandingOrder6 nextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
    return this;
  }

  /**
   * The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return nextPaymentDateTime
   */
  
  @Schema(name = "NextPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the next payment for a Standing Order schedule will be made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NextPaymentDateTime")
  public OffsetDateTime getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  public void setNextPaymentDateTime(OffsetDateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public OBStandingOrder6 lastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
    return this;
  }

  /**
   * The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return lastPaymentDateTime
   */
  
  @Schema(name = "LastPaymentDateTime", example = "2017-07-12T00:00Z", description = "The date on which the last (most recent) payment for a Standing Order schedule was made. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastPaymentDateTime")
  public OffsetDateTime getLastPaymentDateTime() {
    return lastPaymentDateTime;
  }

  public void setLastPaymentDateTime(OffsetDateTime lastPaymentDateTime) {
    this.lastPaymentDateTime = lastPaymentDateTime;
  }

  public OBStandingOrder6 standingOrderStatusCode(ExternalMandateStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
    return this;
  }

  /**
   * Get standingOrderStatusCode
   * @return standingOrderStatusCode
   */
  
  @Schema(name = "StandingOrderStatusCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StandingOrderStatusCode")
  public ExternalMandateStatus1Code getStandingOrderStatusCode() {
    return standingOrderStatusCode;
  }

  public void setStandingOrderStatusCode(ExternalMandateStatus1Code standingOrderStatusCode) {
    this.standingOrderStatusCode = standingOrderStatusCode;
  }

  public OBStandingOrder6 firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

  /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
   */
  
  @Schema(name = "FirstPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FirstPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public OBStandingOrder6 nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

  /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
   */
  
  @Schema(name = "NextPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NextPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public OBStandingOrder6 lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

  /**
   * Get lastPaymentAmount
   * @return lastPaymentAmount
   */
  
  @Schema(name = "LastPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  public void setLastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public OBStandingOrder6 finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

  /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
   */
  
  @Schema(name = "FinalPaymentAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FinalPaymentAmount")
  public OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public OBStandingOrder6 creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
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

  public OBStandingOrder6 creditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * @return creditorAccount
   */
  
  @Schema(name = "CreditorAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditorAccount")
  public OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount51 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public OBStandingOrder6 supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBStandingOrder6 putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
   */
  
  @Schema(name = "SupplementaryData", description = "Additional information that can not be captured in the structured fields and/or any other specific block.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupplementaryData")
  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBStandingOrder6 mandateRelatedInformation(OBMandateRelatedInformation1 mandateRelatedInformation) {
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

  public OBStandingOrder6 remittanceInformation(OBRemittanceInformation2 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
    return this;
  }

  /**
   * Get remittanceInformation
   * @return remittanceInformation
   */
  
  @Schema(name = "RemittanceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemittanceInformation")
  public OBRemittanceInformation2 getRemittanceInformation() {
    return remittanceInformation;
  }

  public void setRemittanceInformation(OBRemittanceInformation2 remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStandingOrder6 obStandingOrder6 = (OBStandingOrder6) o;
    return Objects.equals(this.accountId, obStandingOrder6.accountId) &&
        Objects.equals(this.standingOrderId, obStandingOrder6.standingOrderId) &&
        Objects.equals(this.nextPaymentDateTime, obStandingOrder6.nextPaymentDateTime) &&
        Objects.equals(this.lastPaymentDateTime, obStandingOrder6.lastPaymentDateTime) &&
        Objects.equals(this.standingOrderStatusCode, obStandingOrder6.standingOrderStatusCode) &&
        Objects.equals(this.firstPaymentAmount, obStandingOrder6.firstPaymentAmount) &&
        Objects.equals(this.nextPaymentAmount, obStandingOrder6.nextPaymentAmount) &&
        Objects.equals(this.lastPaymentAmount, obStandingOrder6.lastPaymentAmount) &&
        Objects.equals(this.finalPaymentAmount, obStandingOrder6.finalPaymentAmount) &&
        Objects.equals(this.creditorAgent, obStandingOrder6.creditorAgent) &&
        Objects.equals(this.creditorAccount, obStandingOrder6.creditorAccount) &&
        Objects.equals(this.supplementaryData, obStandingOrder6.supplementaryData) &&
        Objects.equals(this.mandateRelatedInformation, obStandingOrder6.mandateRelatedInformation) &&
        Objects.equals(this.remittanceInformation, obStandingOrder6.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, standingOrderId, nextPaymentDateTime, lastPaymentDateTime, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, creditorAgent, creditorAccount, supplementaryData, mandateRelatedInformation, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStandingOrder6 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
    sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    mandateRelatedInformation: ").append(toIndentedString(mandateRelatedInformation)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

