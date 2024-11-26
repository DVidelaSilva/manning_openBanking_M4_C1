package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OtherApplicationFrequency;
import io.manning.openbanking.models.OtherCalculationFrequency;
import io.manning.openbanking.models.OtherFeeRateType;
import io.manning.openbanking.models.OtherFeeType;
import io.manning.openbanking.models.OverdraftFeeChargeCap;
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
 * Details about the fees/charges
 */

@Schema(name = "OverdraftFeeChargeDetail_inner_1", description = "Details about the fees/charges")
@JsonTypeName("OverdraftFeeChargeDetail_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OverdraftFeeChargeDetailInner1 {

  /**
   * Overdraft fee type
   */
  public enum FeeTypeEnum {
    ARRANGED_OVERDRAFT("ArrangedOverdraft"),
    
    EMERGENCY_BORROWING("EmergencyBorrowing"),
    
    BORROWING_ITEM("BorrowingItem"),
    
    OVERDRAFT_RENEWAL("OverdraftRenewal"),
    
    ANNUAL_REVIEW("AnnualReview"),
    
    OVERDRAFT_SETUP("OverdraftSetup"),
    
    SURCHARGE("Surcharge"),
    
    TEMP_OVERDRAFT("TempOverdraft"),
    
    UNAUTHORISED_BORROWING("UnauthorisedBorrowing"),
    
    UNAUTHORISED_PAID_TRANS("UnauthorisedPaidTrans"),
    
    OTHER("Other"),
    
    UNAUTHORISED_UNPAID_TRANS("UnauthorisedUnpaidTrans");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeTypeEnum fromValue(String value) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FeeTypeEnum feeType;

  private Boolean overdraftControlIndicator;

  private String incrementalBorrowingAmount;

  private String feeAmount;

  private String feeRate;

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   */
  public enum FeeRateTypeEnum {
    LINKED_BASE_RATE("LinkedBaseRate"),
    
    GROSS("Gross"),
    
    NET("Net"),
    
    OTHER("Other");

    private String value;

    FeeRateTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeeRateTypeEnum fromValue(String value) {
      for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FeeRateTypeEnum feeRateType;

  /**
   * Frequency at which the overdraft charge is applied to the account
   */
  public enum ApplicationFrequencyEnum {
    ACCOUNT_CLOSING("AccountClosing"),
    
    ACCOUNT_OPENING("AccountOpening"),
    
    ACADEMIC_TERM("AcademicTerm"),
    
    CHARGING_PERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PER_ITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ON_ACCOUNT_ANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
    PER_HOUR("PerHour"),
    
    PER_OCCURRENCE("PerOccurrence"),
    
    PER_SHEET("PerSheet"),
    
    PER_TRANSACTION("PerTransaction"),
    
    PER_TRANSACTION_AMOUNT("PerTransactionAmount"),
    
    PER_TRANSACTION_PERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIX_MONTHLY("SixMonthly"),
    
    STATEMENT_MONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    ApplicationFrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApplicationFrequencyEnum fromValue(String value) {
      for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ApplicationFrequencyEnum applicationFrequency;

  /**
   * How often is the overdraft fee/charge calculated for the account.
   */
  public enum CalculationFrequencyEnum {
    ACCOUNT_CLOSING("AccountClosing"),
    
    ACCOUNT_OPENING("AccountOpening"),
    
    ACADEMIC_TERM("AcademicTerm"),
    
    CHARGING_PERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PER_ITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ON_ACCOUNT_ANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
    PER_HOUR("PerHour"),
    
    PER_OCCURRENCE("PerOccurrence"),
    
    PER_SHEET("PerSheet"),
    
    PER_TRANSACTION("PerTransaction"),
    
    PER_TRANSACTION_AMOUNT("PerTransactionAmount"),
    
    PER_TRANSACTION_PERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIX_MONTHLY("SixMonthly"),
    
    STATEMENT_MONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    CalculationFrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CalculationFrequencyEnum fromValue(String value) {
      for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CalculationFrequencyEnum calculationFrequency;

  
  private List<String> notes = new ArrayList<>();

  private OtherFeeType otherFeeType;

  private OtherFeeRateType otherFeeRateType;

  private OtherApplicationFrequency otherApplicationFrequency;

  private OtherCalculationFrequency otherCalculationFrequency;

  private OverdraftFeeChargeCap overdraftFeeChargeCap;

  public OverdraftFeeChargeDetailInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverdraftFeeChargeDetailInner1(FeeTypeEnum feeType, ApplicationFrequencyEnum applicationFrequency) {
    this.feeType = feeType;
    this.applicationFrequency = applicationFrequency;
  }

  public OverdraftFeeChargeDetailInner1 feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

  /**
   * Overdraft fee type
   * @return feeType
   */
  @NotNull
  @Schema(name = "FeeType", description = "Overdraft fee type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FeeType")
  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public OverdraftFeeChargeDetailInner1 overdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

  /**
   * Specifies for the overdraft control feature/benefit
   * @return overdraftControlIndicator
   */
  
  @Schema(name = "OverdraftControlIndicator", description = "Specifies for the overdraft control feature/benefit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftControlIndicator")
  public Boolean getOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }

  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    this.overdraftControlIndicator = overdraftControlIndicator;
  }

  public OverdraftFeeChargeDetailInner1 incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

  /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
   * @return incrementalBorrowingAmount
   */
  
  @Schema(name = "IncrementalBorrowingAmount", description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IncrementalBorrowingAmount")
  public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }

  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }

  public OverdraftFeeChargeDetailInner1 feeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
    return this;
  }

  /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
   */
  
  @Schema(name = "FeeAmount", description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeAmount")
  public String getFeeAmount() {
    return feeAmount;
  }

  public void setFeeAmount(String feeAmount) {
    this.feeAmount = feeAmount;
  }

  public OverdraftFeeChargeDetailInner1 feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

  /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
   */
  
  @Schema(name = "FeeRate", description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRate")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public OverdraftFeeChargeDetailInner1 feeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
    return this;
  }

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
   */
  
  @Schema(name = "FeeRateType", description = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FeeRateType")
  public FeeRateTypeEnum getFeeRateType() {
    return feeRateType;
  }

  public void setFeeRateType(FeeRateTypeEnum feeRateType) {
    this.feeRateType = feeRateType;
  }

  public OverdraftFeeChargeDetailInner1 applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * Frequency at which the overdraft charge is applied to the account
   * @return applicationFrequency
   */
  @NotNull
  @Schema(name = "ApplicationFrequency", description = "Frequency at which the overdraft charge is applied to the account", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ApplicationFrequency")
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OverdraftFeeChargeDetailInner1 calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How often is the overdraft fee/charge calculated for the account.
   * @return calculationFrequency
   */
  
  @Schema(name = "CalculationFrequency", description = "How often is the overdraft fee/charge calculated for the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationFrequency")
  public CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public OverdraftFeeChargeDetailInner1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftFeeChargeDetailInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Free text for capturing any other info related to Overdraft Fees Charge Details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OverdraftFeeChargeDetailInner1 otherFeeType(OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
    return this;
  }

  /**
   * Get otherFeeType
   * @return otherFeeType
   */
  
  @Schema(name = "OtherFeeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeType")
  public OtherFeeType getOtherFeeType() {
    return otherFeeType;
  }

  public void setOtherFeeType(OtherFeeType otherFeeType) {
    this.otherFeeType = otherFeeType;
  }

  public OverdraftFeeChargeDetailInner1 otherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

  /**
   * Get otherFeeRateType
   * @return otherFeeRateType
   */
  
  @Schema(name = "OtherFeeRateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherFeeRateType")
  public OtherFeeRateType getOtherFeeRateType() {
    return otherFeeRateType;
  }

  public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
    this.otherFeeRateType = otherFeeRateType;
  }

  public OverdraftFeeChargeDetailInner1 otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
   */
  
  @Schema(name = "OtherApplicationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherApplicationFrequency")
  public OtherApplicationFrequency getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OverdraftFeeChargeDetailInner1 otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
   */
  
  @Schema(name = "OtherCalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherCalculationFrequency")
  public OtherCalculationFrequency getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
  }

  public OverdraftFeeChargeDetailInner1 overdraftFeeChargeCap(OverdraftFeeChargeCap overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
   */
  
  @Schema(name = "OverdraftFeeChargeCap", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeeChargeCap")
  public OverdraftFeeChargeCap getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(OverdraftFeeChargeCap overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftFeeChargeDetailInner1 overdraftFeeChargeDetailInner1 = (OverdraftFeeChargeDetailInner1) o;
    return Objects.equals(this.feeType, overdraftFeeChargeDetailInner1.feeType) &&
        Objects.equals(this.overdraftControlIndicator, overdraftFeeChargeDetailInner1.overdraftControlIndicator) &&
        Objects.equals(this.incrementalBorrowingAmount, overdraftFeeChargeDetailInner1.incrementalBorrowingAmount) &&
        Objects.equals(this.feeAmount, overdraftFeeChargeDetailInner1.feeAmount) &&
        Objects.equals(this.feeRate, overdraftFeeChargeDetailInner1.feeRate) &&
        Objects.equals(this.feeRateType, overdraftFeeChargeDetailInner1.feeRateType) &&
        Objects.equals(this.applicationFrequency, overdraftFeeChargeDetailInner1.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, overdraftFeeChargeDetailInner1.calculationFrequency) &&
        Objects.equals(this.notes, overdraftFeeChargeDetailInner1.notes) &&
        Objects.equals(this.otherFeeType, overdraftFeeChargeDetailInner1.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, overdraftFeeChargeDetailInner1.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, overdraftFeeChargeDetailInner1.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, overdraftFeeChargeDetailInner1.otherCalculationFrequency) &&
        Objects.equals(this.overdraftFeeChargeCap, overdraftFeeChargeDetailInner1.overdraftFeeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, overdraftFeeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeeChargeDetailInner1 {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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

