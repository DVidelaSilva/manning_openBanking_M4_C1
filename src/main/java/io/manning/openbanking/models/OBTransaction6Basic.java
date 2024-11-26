package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.ExternalCategoryPurpose1Code;
import io.manning.openbanking.models.ExternalEntryStatus1Code;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount10;
import io.manning.openbanking.models.OBActiveOrHistoricCurrencyAndAmount9;
import io.manning.openbanking.models.OBBankTransactionCodeStructure1;
import io.manning.openbanking.models.OBCreditDebitCode1;
import io.manning.openbanking.models.OBCurrencyExchange5;
import io.manning.openbanking.models.OBExtendedProprietaryBankTransactionCode;
import io.manning.openbanking.models.OBExternalPurpose1Code;
import io.manning.openbanking.models.OBInternalTransactionMutability1Code;
import io.manning.openbanking.models.OBTransactionCardInstrument1;
import io.manning.openbanking.models.ProprietaryBankTransactionCodeStructure1;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Provides further details on an entry in the report.
 */

@Schema(name = "OBTransaction6Basic", description = "Provides further details on an entry in the report.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBTransaction6Basic {

  private String accountId;

  private String transactionId;

  private String transactionReference;

  
  private List<String> statementReference = new ArrayList<>();

  private OBCreditDebitCode1 creditDebitIndicator;

  private ExternalEntryStatus1Code status;

  private OBInternalTransactionMutability1Code transactionMutability;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime bookingDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime valueDateTime;

  private String addressLine;

  private OBActiveOrHistoricCurrencyAndAmount9 amount;

  private OBActiveOrHistoricCurrencyAndAmount10 chargeAmount;

  private OBCurrencyExchange5 currencyExchange;

  private OBBankTransactionCodeStructure1 bankTransactionCode;

  private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode;

  
  private List<OBExtendedProprietaryBankTransactionCode> extendedProprietaryBankTransactionCodes = new ArrayList<>();

  private OBTransactionCardInstrument1 cardInstrument;

  
  private Map<String, Object> supplementaryData = new HashMap<>();

  private ExternalCategoryPurpose1Code categoryPurposeCode;

  private OBExternalPurpose1Code paymentPurposeCode;

  public OBTransaction6Basic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBTransaction6Basic(String accountId, OBCreditDebitCode1 creditDebitIndicator, ExternalEntryStatus1Code status, OffsetDateTime bookingDateTime, OBActiveOrHistoricCurrencyAndAmount9 amount) {
    this.accountId = accountId;
    this.creditDebitIndicator = creditDebitIndicator;
    this.status = status;
    this.bookingDateTime = bookingDateTime;
    this.amount = amount;
  }

  public OBTransaction6Basic accountId(String accountId) {
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

  public OBTransaction6Basic transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   * @return transactionId
   */
  
  @Schema(name = "TransactionId", description = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TransactionId")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public OBTransaction6Basic transactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
    return this;
  }

  /**
   * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
   * @return transactionReference
   */
  
  @Schema(name = "TransactionReference", description = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TransactionReference")
  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }

  public OBTransaction6Basic statementReference(List<String> statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  public OBTransaction6Basic addStatementReferenceItem(String statementReferenceItem) {
    if (this.statementReference == null) {
      this.statementReference = new ArrayList<>();
    }
    this.statementReference.add(statementReferenceItem);
    return this;
  }

  /**
   * Get statementReference
   * @return statementReference
   */
  
  @Schema(name = "StatementReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementReference")
  public List<String> getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(List<String> statementReference) {
    this.statementReference = statementReference;
  }

  public OBTransaction6Basic creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

  /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
   */
  @NotNull
  @Schema(name = "CreditDebitIndicator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreditDebitIndicator")
  public OBCreditDebitCode1 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }

  public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  public OBTransaction6Basic status(ExternalEntryStatus1Code status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public ExternalEntryStatus1Code getStatus() {
    return status;
  }

  public void setStatus(ExternalEntryStatus1Code status) {
    this.status = status;
  }

  public OBTransaction6Basic transactionMutability(OBInternalTransactionMutability1Code transactionMutability) {
    this.transactionMutability = transactionMutability;
    return this;
  }

  /**
   * Get transactionMutability
   * @return transactionMutability
   */
  
  @Schema(name = "TransactionMutability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TransactionMutability")
  public OBInternalTransactionMutability1Code getTransactionMutability() {
    return transactionMutability;
  }

  public void setTransactionMutability(OBInternalTransactionMutability1Code transactionMutability) {
    this.transactionMutability = transactionMutability;
  }

  public OBTransaction6Basic bookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
    return this;
  }

  /**
   * Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return bookingDateTime
   */
  @NotNull
  @Schema(name = "BookingDateTime", description = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("BookingDateTime")
  public OffsetDateTime getBookingDateTime() {
    return bookingDateTime;
  }

  public void setBookingDateTime(OffsetDateTime bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  public OBTransaction6Basic valueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return valueDateTime
   */
  
  @Schema(name = "ValueDateTime", description = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry. Usage: If transaction entry status is pending and value date is present, then the value date refers to an expected/requested value date. For transaction entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the number of availability days. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ValueDateTime")
  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public OBTransaction6Basic addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.
   * @return addressLine
   */
  
  @Schema(name = "AddressLine", description = "Information that locates and identifies a specific address for a transaction entry, that is presented in free format text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AddressLine")
  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public OBTransaction6Basic amount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @NotNull
  @Schema(name = "Amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Amount")
  public OBActiveOrHistoricCurrencyAndAmount9 getAmount() {
    return amount;
  }

  public void setAmount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
    this.amount = amount;
  }

  public OBTransaction6Basic chargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Get chargeAmount
   * @return chargeAmount
   */
  
  @Schema(name = "ChargeAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChargeAmount")
  public OBActiveOrHistoricCurrencyAndAmount10 getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public OBTransaction6Basic currencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

  /**
   * Get currencyExchange
   * @return currencyExchange
   */
  
  @Schema(name = "CurrencyExchange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CurrencyExchange")
  public OBCurrencyExchange5 getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public OBTransaction6Basic bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  /**
   * Get bankTransactionCode
   * @return bankTransactionCode
   */
  
  @Schema(name = "BankTransactionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankTransactionCode")
  public OBBankTransactionCodeStructure1 getBankTransactionCode() {
    return bankTransactionCode;
  }

  public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  public OBTransaction6Basic proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  /**
   * Get proprietaryBankTransactionCode
   * @return proprietaryBankTransactionCode
   */
  
  @Schema(name = "ProprietaryBankTransactionCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProprietaryBankTransactionCode")
  public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }

  public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  public OBTransaction6Basic extendedProprietaryBankTransactionCodes(List<OBExtendedProprietaryBankTransactionCode> extendedProprietaryBankTransactionCodes) {
    this.extendedProprietaryBankTransactionCodes = extendedProprietaryBankTransactionCodes;
    return this;
  }

  public OBTransaction6Basic addExtendedProprietaryBankTransactionCodesItem(OBExtendedProprietaryBankTransactionCode extendedProprietaryBankTransactionCodesItem) {
    if (this.extendedProprietaryBankTransactionCodes == null) {
      this.extendedProprietaryBankTransactionCodes = new ArrayList<>();
    }
    this.extendedProprietaryBankTransactionCodes.add(extendedProprietaryBankTransactionCodesItem);
    return this;
  }

  /**
   * Get extendedProprietaryBankTransactionCodes
   * @return extendedProprietaryBankTransactionCodes
   */
  
  @Schema(name = "ExtendedProprietaryBankTransactionCodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExtendedProprietaryBankTransactionCodes")
  public List<OBExtendedProprietaryBankTransactionCode> getExtendedProprietaryBankTransactionCodes() {
    return extendedProprietaryBankTransactionCodes;
  }

  public void setExtendedProprietaryBankTransactionCodes(List<OBExtendedProprietaryBankTransactionCode> extendedProprietaryBankTransactionCodes) {
    this.extendedProprietaryBankTransactionCodes = extendedProprietaryBankTransactionCodes;
  }

  public OBTransaction6Basic cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
    return this;
  }

  /**
   * Get cardInstrument
   * @return cardInstrument
   */
  
  @Schema(name = "CardInstrument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CardInstrument")
  public OBTransactionCardInstrument1 getCardInstrument() {
    return cardInstrument;
  }

  public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
    this.cardInstrument = cardInstrument;
  }

  public OBTransaction6Basic supplementaryData(Map<String, Object> supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBTransaction6Basic putSupplementaryDataItem(String key, Object supplementaryDataItem) {
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

  public OBTransaction6Basic categoryPurposeCode(ExternalCategoryPurpose1Code categoryPurposeCode) {
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

  public OBTransaction6Basic paymentPurposeCode(OBExternalPurpose1Code paymentPurposeCode) {
    this.paymentPurposeCode = paymentPurposeCode;
    return this;
  }

  /**
   * Get paymentPurposeCode
   * @return paymentPurposeCode
   */
  
  @Schema(name = "PaymentPurposeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentPurposeCode")
  public OBExternalPurpose1Code getPaymentPurposeCode() {
    return paymentPurposeCode;
  }

  public void setPaymentPurposeCode(OBExternalPurpose1Code paymentPurposeCode) {
    this.paymentPurposeCode = paymentPurposeCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBTransaction6Basic obTransaction6Basic = (OBTransaction6Basic) o;
    return Objects.equals(this.accountId, obTransaction6Basic.accountId) &&
        Objects.equals(this.transactionId, obTransaction6Basic.transactionId) &&
        Objects.equals(this.transactionReference, obTransaction6Basic.transactionReference) &&
        Objects.equals(this.statementReference, obTransaction6Basic.statementReference) &&
        Objects.equals(this.creditDebitIndicator, obTransaction6Basic.creditDebitIndicator) &&
        Objects.equals(this.status, obTransaction6Basic.status) &&
        Objects.equals(this.transactionMutability, obTransaction6Basic.transactionMutability) &&
        Objects.equals(this.bookingDateTime, obTransaction6Basic.bookingDateTime) &&
        Objects.equals(this.valueDateTime, obTransaction6Basic.valueDateTime) &&
        Objects.equals(this.addressLine, obTransaction6Basic.addressLine) &&
        Objects.equals(this.amount, obTransaction6Basic.amount) &&
        Objects.equals(this.chargeAmount, obTransaction6Basic.chargeAmount) &&
        Objects.equals(this.currencyExchange, obTransaction6Basic.currencyExchange) &&
        Objects.equals(this.bankTransactionCode, obTransaction6Basic.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, obTransaction6Basic.proprietaryBankTransactionCode) &&
        Objects.equals(this.extendedProprietaryBankTransactionCodes, obTransaction6Basic.extendedProprietaryBankTransactionCodes) &&
        Objects.equals(this.cardInstrument, obTransaction6Basic.cardInstrument) &&
        Objects.equals(this.supplementaryData, obTransaction6Basic.supplementaryData) &&
        Objects.equals(this.categoryPurposeCode, obTransaction6Basic.categoryPurposeCode) &&
        Objects.equals(this.paymentPurposeCode, obTransaction6Basic.paymentPurposeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, transactionMutability, bookingDateTime, valueDateTime, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, extendedProprietaryBankTransactionCodes, cardInstrument, supplementaryData, categoryPurposeCode, paymentPurposeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBTransaction6Basic {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionMutability: ").append(toIndentedString(transactionMutability)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    extendedProprietaryBankTransactionCodes: ").append(toIndentedString(extendedProprietaryBankTransactionCodes)).append("\n");
    sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    categoryPurposeCode: ").append(toIndentedString(categoryPurposeCode)).append("\n");
    sb.append("    paymentPurposeCode: ").append(toIndentedString(paymentPurposeCode)).append("\n");
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

