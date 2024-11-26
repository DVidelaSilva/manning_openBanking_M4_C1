package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBInternalStatementType1Code;
import io.manning.openbanking.models.OBReadBalance1DataTotalValue;
import io.manning.openbanking.models.OBStatement2StatementAmountInner;
import io.manning.openbanking.models.OBStatement2StatementBenefitInner;
import io.manning.openbanking.models.OBStatement2StatementDateTimeInner;
import io.manning.openbanking.models.OBStatement2StatementFeeInner;
import io.manning.openbanking.models.OBStatement2StatementInterestInner;
import io.manning.openbanking.models.OBStatement2StatementRateInner;
import io.manning.openbanking.models.OBStatement2StatementValueInner;
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
 * Provides further details on a statement resource.
 */

@Schema(name = "OBStatement2", description = "Provides further details on a statement resource.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBStatement2 {

  private String accountId;

  private String statementId;

  private String statementReference;

  private OBInternalStatementType1Code type;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDateTime;

  
  private List<String> statementDescription = new ArrayList<>();

  
  private List<OBStatement2StatementBenefitInner> statementBenefit = new ArrayList<>();

  
  private List<OBStatement2StatementFeeInner> statementFee = new ArrayList<>();

  
  private List<OBStatement2StatementInterestInner> statementInterest = new ArrayList<>();

  
  private List<OBStatement2StatementAmountInner> statementAmount = new ArrayList<>();

  
  private List<OBStatement2StatementDateTimeInner> statementDateTime = new ArrayList<>();

  
  private List<OBStatement2StatementRateInner> statementRate = new ArrayList<>();

  
  private List<OBStatement2StatementValueInner> statementValue = new ArrayList<>();

  private OBReadBalance1DataTotalValue totalValue;

  public OBStatement2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2(String accountId, OBInternalStatementType1Code type, OffsetDateTime startDateTime, OffsetDateTime endDateTime, OffsetDateTime creationDateTime) {
    this.accountId = accountId;
    this.type = type;
    this.startDateTime = startDateTime;
    this.endDateTime = endDateTime;
    this.creationDateTime = creationDateTime;
  }

  public OBStatement2 accountId(String accountId) {
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

  public OBStatement2 statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
   * @return statementId
   */
  
  @Schema(name = "StatementId", example = "8sfhke-sifhkeuf-97813", description = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementId")
  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement2 statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  /**
   * Unique reference for the statement. This reference may be optionally populated if available.
   * @return statementReference
   */
  
  @Schema(name = "StatementReference", example = "002", description = "Unique reference for the statement. This reference may be optionally populated if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementReference")
  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement2 type(OBInternalStatementType1Code type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public OBInternalStatementType1Code getType() {
    return type;
  }

  public void setType(OBInternalStatementType1Code type) {
    this.type = type;
  }

  public OBStatement2 startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
   */
  @NotNull
  @Schema(name = "StartDateTime", example = "2017-07-12T00:00Z", description = "Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("StartDateTime")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement2 endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
   */
  @NotNull
  @Schema(name = "EndDateTime", example = "2017-07-12T00:00Z", description = "Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EndDateTime")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement2 creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
   */
  @NotNull
  @Schema(name = "CreationDateTime", example = "2024-05-29T00:00Z", description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreationDateTime")
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement2 statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement2 addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

  /**
   * Get statementDescription
   * @return statementDescription
   */
  
  @Schema(name = "StatementDescription", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementDescription")
  public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement2 statementBenefit(List<OBStatement2StatementBenefitInner> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement2 addStatementBenefitItem(OBStatement2StatementBenefitInner statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

  /**
   * Get statementBenefit
   * @return statementBenefit
   */
  
  @Schema(name = "StatementBenefit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementBenefit")
  public List<OBStatement2StatementBenefitInner> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatement2StatementBenefitInner> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement2 statementFee(List<OBStatement2StatementFeeInner> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement2 addStatementFeeItem(OBStatement2StatementFeeInner statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

  /**
   * Get statementFee
   * @return statementFee
   */
  
  @Schema(name = "StatementFee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementFee")
  public List<OBStatement2StatementFeeInner> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatement2StatementFeeInner> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement2 statementInterest(List<OBStatement2StatementInterestInner> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement2 addStatementInterestItem(OBStatement2StatementInterestInner statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

  /**
   * Get statementInterest
   * @return statementInterest
   */
  
  @Schema(name = "StatementInterest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementInterest")
  public List<OBStatement2StatementInterestInner> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatement2StatementInterestInner> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement2 statementAmount(List<OBStatement2StatementAmountInner> statementAmount) {
    this.statementAmount = statementAmount;
    return this;
  }

  public OBStatement2 addStatementAmountItem(OBStatement2StatementAmountInner statementAmountItem) {
    if (this.statementAmount == null) {
      this.statementAmount = new ArrayList<>();
    }
    this.statementAmount.add(statementAmountItem);
    return this;
  }

  /**
   * Get statementAmount
   * @return statementAmount
   */
  
  @Schema(name = "StatementAmount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementAmount")
  public List<OBStatement2StatementAmountInner> getStatementAmount() {
    return statementAmount;
  }

  public void setStatementAmount(List<OBStatement2StatementAmountInner> statementAmount) {
    this.statementAmount = statementAmount;
  }

  public OBStatement2 statementDateTime(List<OBStatement2StatementDateTimeInner> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement2 addStatementDateTimeItem(OBStatement2StatementDateTimeInner statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

  /**
   * Get statementDateTime
   * @return statementDateTime
   */
  
  @Schema(name = "StatementDateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementDateTime")
  public List<OBStatement2StatementDateTimeInner> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatement2StatementDateTimeInner> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement2 statementRate(List<OBStatement2StatementRateInner> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement2 addStatementRateItem(OBStatement2StatementRateInner statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

  /**
   * Get statementRate
   * @return statementRate
   */
  
  @Schema(name = "StatementRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementRate")
  public List<OBStatement2StatementRateInner> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatement2StatementRateInner> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement2 statementValue(List<OBStatement2StatementValueInner> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement2 addStatementValueItem(OBStatement2StatementValueInner statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

  /**
   * Get statementValue
   * @return statementValue
   */
  
  @Schema(name = "StatementValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatementValue")
  public List<OBStatement2StatementValueInner> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatement2StatementValueInner> statementValue) {
    this.statementValue = statementValue;
  }

  public OBStatement2 totalValue(OBReadBalance1DataTotalValue totalValue) {
    this.totalValue = totalValue;
    return this;
  }

  /**
   * Get totalValue
   * @return totalValue
   */
  
  @Schema(name = "TotalValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalValue")
  public OBReadBalance1DataTotalValue getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(OBReadBalance1DataTotalValue totalValue) {
    this.totalValue = totalValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2 obStatement2 = (OBStatement2) o;
    return Objects.equals(this.accountId, obStatement2.accountId) &&
        Objects.equals(this.statementId, obStatement2.statementId) &&
        Objects.equals(this.statementReference, obStatement2.statementReference) &&
        Objects.equals(this.type, obStatement2.type) &&
        Objects.equals(this.startDateTime, obStatement2.startDateTime) &&
        Objects.equals(this.endDateTime, obStatement2.endDateTime) &&
        Objects.equals(this.creationDateTime, obStatement2.creationDateTime) &&
        Objects.equals(this.statementDescription, obStatement2.statementDescription) &&
        Objects.equals(this.statementBenefit, obStatement2.statementBenefit) &&
        Objects.equals(this.statementFee, obStatement2.statementFee) &&
        Objects.equals(this.statementInterest, obStatement2.statementInterest) &&
        Objects.equals(this.statementAmount, obStatement2.statementAmount) &&
        Objects.equals(this.statementDateTime, obStatement2.statementDateTime) &&
        Objects.equals(this.statementRate, obStatement2.statementRate) &&
        Objects.equals(this.statementValue, obStatement2.statementValue) &&
        Objects.equals(this.totalValue, obStatement2.totalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementAmount, statementDateTime, statementRate, statementValue, totalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementAmount: ").append(toIndentedString(statementAmount)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
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

