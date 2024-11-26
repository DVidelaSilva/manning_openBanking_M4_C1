package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OtherApplicationFrequency;
import io.manning.openbanking.models.OtherBankInterestType;
import io.manning.openbanking.models.OtherCalculationFrequency;
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
 * Tier Band Details
 */

@Schema(name = "TierBand_inner", description = "Tier Band Details")
@JsonTypeName("TierBand_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class TierBandInner {

  private String identification;

  private String tierValueMinimum;

  private String tierValueMaximum;

  /**
   * How often is credit interest calculated for the account.
   */
  public enum CalculationFrequencyEnum {
    DAILY("Daily"),
    
    HALF_YEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    PER_STATEMENT_DATE("PerStatementDate"),
    
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

  /**
   * How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.
   */
  public enum ApplicationFrequencyEnum {
    DAILY("Daily"),
    
    HALF_YEARLY("HalfYearly"),
    
    MONTHLY("Monthly"),
    
    OTHER("Other"),
    
    QUARTERLY("Quarterly"),
    
    PER_STATEMENT_DATE("PerStatementDate"),
    
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
   * Amount on which Interest applied.
   */
  public enum DepositInterestAppliedCoverageEnum {
    BANDED("Banded"),
    
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private String value;

    DepositInterestAppliedCoverageEnum(String value) {
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
    public static DepositInterestAppliedCoverageEnum fromValue(String value) {
      for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage;

  /**
   * Type of interest rate, Fixed or Variable
   */
  public enum FixedVariableInterestRateTypeEnum {
    FIXED("Fixed"),
    
    VARIABLE("Variable");

    private String value;

    FixedVariableInterestRateTypeEnum(String value) {
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
    public static FixedVariableInterestRateTypeEnum fromValue(String value) {
      for (FixedVariableInterestRateTypeEnum b : FixedVariableInterestRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private FixedVariableInterestRateTypeEnum fixedVariableInterestRateType;

  private String AER;

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
   */
  public enum BankInterestRateTypeEnum {
    GROSS("Gross"),
    
    OTHER("Other");

    private String value;

    BankInterestRateTypeEnum(String value) {
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
    public static BankInterestRateTypeEnum fromValue(String value) {
      for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private BankInterestRateTypeEnum bankInterestRateType;

  private String bankInterestRate;

  
  private List<String> notes = new ArrayList<>();

  private OtherBankInterestType otherBankInterestType;

  private OtherApplicationFrequency otherApplicationFrequency;

  private OtherCalculationFrequency otherCalculationFrequency;

  public TierBandInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TierBandInner(String tierValueMinimum, ApplicationFrequencyEnum applicationFrequency, FixedVariableInterestRateTypeEnum fixedVariableInterestRateType, String AER) {
    this.tierValueMinimum = tierValueMinimum;
    this.applicationFrequency = applicationFrequency;
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    this.AER = AER;
  }

  public TierBandInner identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a BCA.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a BCA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public TierBandInner tierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
    return this;
  }

  /**
   * Minimum deposit value for which the credit interest tier applies.
   * @return tierValueMinimum
   */
  @NotNull
  @Schema(name = "TierValueMinimum", description = "Minimum deposit value for which the credit interest tier applies.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierValueMinimum")
  public String getTierValueMinimum() {
    return tierValueMinimum;
  }

  public void setTierValueMinimum(String tierValueMinimum) {
    this.tierValueMinimum = tierValueMinimum;
  }

  public TierBandInner tierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
    return this;
  }

  /**
   * Maximum deposit value for which the credit interest tier applies.
   * @return tierValueMaximum
   */
  
  @Schema(name = "TierValueMaximum", description = "Maximum deposit value for which the credit interest tier applies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TierValueMaximum")
  public String getTierValueMaximum() {
    return tierValueMaximum;
  }

  public void setTierValueMaximum(String tierValueMaximum) {
    this.tierValueMaximum = tierValueMaximum;
  }

  public TierBandInner calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
    return this;
  }

  /**
   * How often is credit interest calculated for the account.
   * @return calculationFrequency
   */
  
  @Schema(name = "CalculationFrequency", description = "How often is credit interest calculated for the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CalculationFrequency")
  public CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }

  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    this.calculationFrequency = calculationFrequency;
  }

  public TierBandInner applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.
   * @return applicationFrequency
   */
  @NotNull
  @Schema(name = "ApplicationFrequency", description = "How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's BCA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ApplicationFrequency")
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public TierBandInner depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    return this;
  }

  /**
   * Amount on which Interest applied.
   * @return depositInterestAppliedCoverage
   */
  
  @Schema(name = "DepositInterestAppliedCoverage", description = "Amount on which Interest applied.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DepositInterestAppliedCoverage")
  public DepositInterestAppliedCoverageEnum getDepositInterestAppliedCoverage() {
    return depositInterestAppliedCoverage;
  }

  public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
    this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
  }

  public TierBandInner fixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    return this;
  }

  /**
   * Type of interest rate, Fixed or Variable
   * @return fixedVariableInterestRateType
   */
  @NotNull
  @Schema(name = "FixedVariableInterestRateType", description = "Type of interest rate, Fixed or Variable", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FixedVariableInterestRateType")
  public FixedVariableInterestRateTypeEnum getFixedVariableInterestRateType() {
    return fixedVariableInterestRateType;
  }

  public void setFixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
  }

  public TierBandInner AER(String AER) {
    this.AER = AER;
    return this;
  }

  /**
   * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
   * @return AER
   */
  @NotNull
  @Schema(name = "AER", description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AER")
  public String getAER() {
    return AER;
  }

  public void setAER(String AER) {
    this.AER = AER;
  }

  public TierBandInner bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
    return this;
  }

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.
   * @return bankInterestRateType
   */
  
  @Schema(name = "BankInterestRateType", description = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankInterestRateType")
  public BankInterestRateTypeEnum getBankInterestRateType() {
    return bankInterestRateType;
  }

  public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
  }

  public TierBandInner bankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
    return this;
  }

  /**
   * Bank Interest for the BCA product
   * @return bankInterestRate
   */
  
  @Schema(name = "BankInterestRate", description = "Bank Interest for the BCA product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankInterestRate")
  public String getBankInterestRate() {
    return bankInterestRate;
  }

  public void setBankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
  }

  public TierBandInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public TierBandInner addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band details
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Optional additional notes to supplement the Tier Band details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public TierBandInner otherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
    return this;
  }

  /**
   * Get otherBankInterestType
   * @return otherBankInterestType
   */
  
  @Schema(name = "OtherBankInterestType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherBankInterestType")
  public OtherBankInterestType getOtherBankInterestType() {
    return otherBankInterestType;
  }

  public void setOtherBankInterestType(OtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
  }

  public TierBandInner otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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

  public TierBandInner otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TierBandInner tierBandInner = (TierBandInner) o;
    return Objects.equals(this.identification, tierBandInner.identification) &&
        Objects.equals(this.tierValueMinimum, tierBandInner.tierValueMinimum) &&
        Objects.equals(this.tierValueMaximum, tierBandInner.tierValueMaximum) &&
        Objects.equals(this.calculationFrequency, tierBandInner.calculationFrequency) &&
        Objects.equals(this.applicationFrequency, tierBandInner.applicationFrequency) &&
        Objects.equals(this.depositInterestAppliedCoverage, tierBandInner.depositInterestAppliedCoverage) &&
        Objects.equals(this.fixedVariableInterestRateType, tierBandInner.fixedVariableInterestRateType) &&
        Objects.equals(this.AER, tierBandInner.AER) &&
        Objects.equals(this.bankInterestRateType, tierBandInner.bankInterestRateType) &&
        Objects.equals(this.bankInterestRate, tierBandInner.bankInterestRate) &&
        Objects.equals(this.notes, tierBandInner.notes) &&
        Objects.equals(this.otherBankInterestType, tierBandInner.otherBankInterestType) &&
        Objects.equals(this.otherApplicationFrequency, tierBandInner.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, tierBandInner.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TierBandInner {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
    sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
    sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
    sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
    sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
    sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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

