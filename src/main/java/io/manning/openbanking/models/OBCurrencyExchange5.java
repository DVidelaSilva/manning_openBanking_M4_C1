package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.OBCurrencyExchange5InstructedAmount;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Set of elements used to provide details on the currency exchange.
 */

@Schema(name = "OBCurrencyExchange5", description = "Set of elements used to provide details on the currency exchange.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBCurrencyExchange5 {

  private String sourceCurrency;

  private String targetCurrency;

  private String unitCurrency;

  private BigDecimal exchangeRate;

  private String contractIdentification;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime quotationDate;

  private OBCurrencyExchange5InstructedAmount instructedAmount;

  public OBCurrencyExchange5() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBCurrencyExchange5(String sourceCurrency, BigDecimal exchangeRate) {
    this.sourceCurrency = sourceCurrency;
    this.exchangeRate = exchangeRate;
  }

  public OBCurrencyExchange5 sourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
    return this;
  }

  /**
   * Currency from which an amount is to be converted in a currency conversion.
   * @return sourceCurrency
   */
  @NotNull
  @Schema(name = "SourceCurrency", description = "Currency from which an amount is to be converted in a currency conversion.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SourceCurrency")
  public String getSourceCurrency() {
    return sourceCurrency;
  }

  public void setSourceCurrency(String sourceCurrency) {
    this.sourceCurrency = sourceCurrency;
  }

  public OBCurrencyExchange5 targetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
    return this;
  }

  /**
   * Currency into which an amount is to be converted in a currency conversion.
   * @return targetCurrency
   */
  
  @Schema(name = "TargetCurrency", description = "Currency into which an amount is to be converted in a currency conversion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TargetCurrency")
  public String getTargetCurrency() {
    return targetCurrency;
  }

  public void setTargetCurrency(String targetCurrency) {
    this.targetCurrency = targetCurrency;
  }

  public OBCurrencyExchange5 unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

  /**
   * Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
   * @return unitCurrency
   */
  
  @Schema(name = "UnitCurrency", description = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UnitCurrency")
  public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }

  public OBCurrencyExchange5 exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).
   * @return exchangeRate
   */
  @NotNull
  @Schema(name = "ExchangeRate", description = "Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency. Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ExchangeRate")
  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public OBCurrencyExchange5 contractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
    return this;
  }

  /**
   * Unique identification to unambiguously identify the foreign exchange contract.
   * @return contractIdentification
   */
  
  @Schema(name = "ContractIdentification", description = "Unique identification to unambiguously identify the foreign exchange contract.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContractIdentification")
  public String getContractIdentification() {
    return contractIdentification;
  }

  public void setContractIdentification(String contractIdentification) {
    this.contractIdentification = contractIdentification;
  }

  public OBCurrencyExchange5 quotationDate(OffsetDateTime quotationDate) {
    this.quotationDate = quotationDate;
    return this;
  }

  /**
   * Date and time at which an exchange rate is quoted. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return quotationDate
   */
  
  @Schema(name = "QuotationDate", description = "Date and time at which an exchange rate is quoted. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("QuotationDate")
  public OffsetDateTime getQuotationDate() {
    return quotationDate;
  }

  public void setQuotationDate(OffsetDateTime quotationDate) {
    this.quotationDate = quotationDate;
  }

  public OBCurrencyExchange5 instructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  /**
   * Get instructedAmount
   * @return instructedAmount
   */
  
  @Schema(name = "InstructedAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InstructedAmount")
  public OBCurrencyExchange5InstructedAmount getInstructedAmount() {
    return instructedAmount;
  }

  public void setInstructedAmount(OBCurrencyExchange5InstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCurrencyExchange5 obCurrencyExchange5 = (OBCurrencyExchange5) o;
    return Objects.equals(this.sourceCurrency, obCurrencyExchange5.sourceCurrency) &&
        Objects.equals(this.targetCurrency, obCurrencyExchange5.targetCurrency) &&
        Objects.equals(this.unitCurrency, obCurrencyExchange5.unitCurrency) &&
        Objects.equals(this.exchangeRate, obCurrencyExchange5.exchangeRate) &&
        Objects.equals(this.contractIdentification, obCurrencyExchange5.contractIdentification) &&
        Objects.equals(this.quotationDate, obCurrencyExchange5.quotationDate) &&
        Objects.equals(this.instructedAmount, obCurrencyExchange5.instructedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCurrency, targetCurrency, unitCurrency, exchangeRate, contractIdentification, quotationDate, instructedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCurrencyExchange5 {\n");
    sb.append("    sourceCurrency: ").append(toIndentedString(sourceCurrency)).append("\n");
    sb.append("    targetCurrency: ").append(toIndentedString(targetCurrency)).append("\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    contractIdentification: ").append(toIndentedString(contractIdentification)).append("\n");
    sb.append("    quotationDate: ").append(toIndentedString(quotationDate)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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

