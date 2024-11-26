package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBAccount6AccountInner;
import io.manning.openbanking.models.OBBranchAndFinancialInstitutionIdentification50;
import io.manning.openbanking.models.OBExternalAccountSubType1Code;
import io.manning.openbanking.models.OBInternalAccountStatus1Code;
import io.manning.openbanking.models.OBInternalAccountType1Code;
import io.manning.openbanking.models.StatementFrequencyAndFormatInner;
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
 * Unambiguous identification of the account to which credit and debit entries are made.
 */

@Schema(name = "OBAccount6Detail", description = "Unambiguous identification of the account to which credit and debit entries are made.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBAccount6Detail {

  private String accountId;

  private OBInternalAccountStatus1Code status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime statusUpdateDateTime;

  private String currency;

  private OBInternalAccountType1Code accountCategory;

  private OBExternalAccountSubType1Code accountTypeCode;

  private String description;

  private String nickname;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime openingDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime maturityDate;

  private String switchStatus;

  
  private List<OBAccount6AccountInner> account = new ArrayList<>();

  
  private List<StatementFrequencyAndFormatInner> statementFrequencyAndFormat = new ArrayList<>();

  private OBBranchAndFinancialInstitutionIdentification50 servicer;

  public OBAccount6Detail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBAccount6Detail(String accountId, List<OBAccount6AccountInner> account) {
    this.accountId = accountId;
    this.account = account;
  }

  public OBAccount6Detail accountId(String accountId) {
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

  public OBAccount6Detail status(OBInternalAccountStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public OBInternalAccountStatus1Code getStatus() {
    return status;
  }

  public void setStatus(OBInternalAccountStatus1Code status) {
    this.status = status;
  }

  public OBAccount6Detail statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
   */
  
  @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusUpdateDateTime")
  public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBAccount6Detail currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   * @return currency
   */
  
  @Schema(name = "Currency", description = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public OBAccount6Detail accountCategory(OBInternalAccountType1Code accountCategory) {
    this.accountCategory = accountCategory;
    return this;
  }

  /**
   * Get accountCategory
   * @return accountCategory
   */
  
  @Schema(name = "AccountCategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccountCategory")
  public OBInternalAccountType1Code getAccountCategory() {
    return accountCategory;
  }

  public void setAccountCategory(OBInternalAccountType1Code accountCategory) {
    this.accountCategory = accountCategory;
  }

  public OBAccount6Detail accountTypeCode(OBExternalAccountSubType1Code accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

  /**
   * Get accountTypeCode
   * @return accountTypeCode
   */
  
  @Schema(name = "AccountTypeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccountTypeCode")
  public OBExternalAccountSubType1Code getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(OBExternalAccountSubType1Code accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public OBAccount6Detail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies the description of the account type.
   * @return description
   */
  
  @Schema(name = "Description", description = "Specifies the description of the account type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OBAccount6Detail nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

  /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   * @return nickname
   */
  
  @Schema(name = "Nickname", description = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Nickname")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public OBAccount6Detail openingDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Date on which the account and related basic services are effectively operational for the account owner. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return openingDate
   */
  
  @Schema(name = "OpeningDate", description = "Date on which the account and related basic services are effectively operational for the account owner. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpeningDate")
  public OffsetDateTime getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
  }

  public OBAccount6Detail maturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

  /**
   * Maturity date of the account. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return maturityDate
   */
  
  @Schema(name = "MaturityDate", description = "Maturity date of the account. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaturityDate")
  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }

  public void setMaturityDate(OffsetDateTime maturityDate) {
    this.maturityDate = maturityDate;
  }

  public OBAccount6Detail switchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
    return this;
  }

  /**
   * Specifies the switch status for the account, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalSwitchStatusCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return switchStatus
   */
  
  @Schema(name = "SwitchStatus", description = "Specifies the switch status for the account, in a coded form. <br /> For a full list of enumeration values refer to `OBInternalSwitchStatusCode` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SwitchStatus")
  public String getSwitchStatus() {
    return switchStatus;
  }

  public void setSwitchStatus(String switchStatus) {
    this.switchStatus = switchStatus;
  }

  public OBAccount6Detail account(List<OBAccount6AccountInner> account) {
    this.account = account;
    return this;
  }

  public OBAccount6Detail addAccountItem(OBAccount6AccountInner accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
   */
  @NotNull
  @Schema(name = "Account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Account")
  public List<OBAccount6AccountInner> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount6AccountInner> account) {
    this.account = account;
  }

  public OBAccount6Detail statementFrequencyAndFormat(List<StatementFrequencyAndFormatInner> statementFrequencyAndFormat) {
    this.statementFrequencyAndFormat = statementFrequencyAndFormat;
    return this;
  }

  public OBAccount6Detail addStatementFrequencyAndFormatItem(StatementFrequencyAndFormatInner statementFrequencyAndFormatItem) {
    if (this.statementFrequencyAndFormat == null) {
      this.statementFrequencyAndFormat = new ArrayList<>();
    }
    this.statementFrequencyAndFormat.add(statementFrequencyAndFormatItem);
    return this;
  }

  /**
   * Get statementFrequencyAndFormat
   * @return statementFrequencyAndFormat
   */
  
  @Schema(name = "StatementFrequencyAndFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementFrequencyAndFormat")
  public List<StatementFrequencyAndFormatInner> getStatementFrequencyAndFormat() {
    return statementFrequencyAndFormat;
  }

  public void setStatementFrequencyAndFormat(List<StatementFrequencyAndFormatInner> statementFrequencyAndFormat) {
    this.statementFrequencyAndFormat = statementFrequencyAndFormat;
  }

  public OBAccount6Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
    return this;
  }

  /**
   * Get servicer
   * @return servicer
   */
  
  @Schema(name = "Servicer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Servicer")
  public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }

  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    this.servicer = servicer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBAccount6Detail obAccount6Detail = (OBAccount6Detail) o;
    return Objects.equals(this.accountId, obAccount6Detail.accountId) &&
        Objects.equals(this.status, obAccount6Detail.status) &&
        Objects.equals(this.statusUpdateDateTime, obAccount6Detail.statusUpdateDateTime) &&
        Objects.equals(this.currency, obAccount6Detail.currency) &&
        Objects.equals(this.accountCategory, obAccount6Detail.accountCategory) &&
        Objects.equals(this.accountTypeCode, obAccount6Detail.accountTypeCode) &&
        Objects.equals(this.description, obAccount6Detail.description) &&
        Objects.equals(this.nickname, obAccount6Detail.nickname) &&
        Objects.equals(this.openingDate, obAccount6Detail.openingDate) &&
        Objects.equals(this.maturityDate, obAccount6Detail.maturityDate) &&
        Objects.equals(this.switchStatus, obAccount6Detail.switchStatus) &&
        Objects.equals(this.account, obAccount6Detail.account) &&
        Objects.equals(this.statementFrequencyAndFormat, obAccount6Detail.statementFrequencyAndFormat) &&
        Objects.equals(this.servicer, obAccount6Detail.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountCategory, accountTypeCode, description, nickname, openingDate, maturityDate, switchStatus, account, statementFrequencyAndFormat, servicer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6Detail {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountCategory: ").append(toIndentedString(accountCategory)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    statementFrequencyAndFormat: ").append(toIndentedString(statementFrequencyAndFormat)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

