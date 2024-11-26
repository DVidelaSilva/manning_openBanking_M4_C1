package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBInterestFixedVariableType1Code;
import io.manning.openbanking.models.OBOtherCodeType11;
import io.manning.openbanking.models.OBOtherCodeType12;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType;
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

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner_TierBand_inner", description = "Tier Band Details")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_CreditInterest_TierBandSet_inner_TierBand_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner {

  private String identification;

  private String tierValueMinimum;

  private String tierValueMaximum;

  /**
   * How often is credit interest calculated for the account.
   */
  public enum CalculationFrequencyEnum {
    FQAT("FQAT"),
    
    FQDY("FQDY"),
    
    FQHY("FQHY"),
    
    FQMY("FQMY"),
    
    FQOT("FQOT"),
    
    FQQY("FQQY"),
    
    FQSD("FQSD"),
    
    FQWY("FQWY"),
    
    FQYY("FQYY");

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
   * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.
   */
  public enum ApplicationFrequencyEnum {
    FQAT("FQAT"),
    
    FQDY("FQDY"),
    
    FQHY("FQHY"),
    
    FQMY("FQMY"),
    
    FQOT("FQOT"),
    
    FQQY("FQQY"),
    
    FQSD("FQSD"),
    
    FQWY("FQWY"),
    
    FQYY("FQYY");

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
    INBA("INBA"),
    
    INTI("INTI"),
    
    INWH("INWH");

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

  private OBInterestFixedVariableType1Code fixedVariableInterestRateType;

  private String AER;

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.
   */
  public enum BankInterestRateTypeEnum {
    INBB("INBB"),
    
    INFR("INFR"),
    
    INGR("INGR"),
    
    INLR("INLR"),
    
    INNE("INNE"),
    
    INOT("INOT");

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

  private OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType otherBankInterestType;

  private OBOtherCodeType11 otherApplicationFrequency;

  private OBOtherCodeType12 otherCalculationFrequency;

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner(String tierValueMinimum, ApplicationFrequencyEnum applicationFrequency, OBInterestFixedVariableType1Code fixedVariableInterestRateType, String AER) {
    this.tierValueMinimum = tierValueMinimum;
    this.applicationFrequency = applicationFrequency;
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    this.AER = AER;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for the Product.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for the Product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner tierValueMinimum(String tierValueMinimum) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner tierValueMaximum(String tierValueMaximum) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
    return this;
  }

  /**
   * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.
   * @return applicationFrequency
   */
  @NotNull
  @Schema(name = "ApplicationFrequency", description = "How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ApplicationFrequency")
  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }

  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    this.applicationFrequency = applicationFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    return this;
  }

  /**
   * Get fixedVariableInterestRateType
   * @return fixedVariableInterestRateType
   */
  @NotNull
  @Schema(name = "FixedVariableInterestRateType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FixedVariableInterestRateType")
  public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
    return fixedVariableInterestRateType;
  }

  public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
    this.fixedVariableInterestRateType = fixedVariableInterestRateType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner AER(String AER) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
    return this;
  }

  /**
   * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.
   * @return bankInterestRateType
   */
  
  @Schema(name = "BankInterestRateType", description = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankInterestRateType")
  public BankInterestRateTypeEnum getBankInterestRateType() {
    return bankInterestRateType;
  }

  public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
    this.bankInterestRateType = bankInterestRateType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner bankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
    return this;
  }

  /**
   * Bank Interest for the product
   * @return bankInterestRate
   */
  
  @Schema(name = "BankInterestRate", description = "Bank Interest for the product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankInterestRate")
  public String getBankInterestRate() {
    return bankInterestRate;
  }

  public void setBankInterestRate(String bankInterestRate) {
    this.bankInterestRate = bankInterestRate;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
   */
  
  @Schema(name = "Notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner otherBankInterestType(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
    return this;
  }

  /**
   * Get otherBankInterestType
   * @return otherBankInterestType
   */
  
  @Schema(name = "OtherBankInterestType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherBankInterestType")
  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType getOtherBankInterestType() {
    return otherBankInterestType;
  }

  public void setOtherBankInterestType(OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType otherBankInterestType) {
    this.otherBankInterestType = otherBankInterestType;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

  /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
   */
  
  @Schema(name = "OtherApplicationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherApplicationFrequency")
  public OBOtherCodeType11 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }

  public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
    this.otherApplicationFrequency = otherApplicationFrequency;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

  /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
   */
  
  @Schema(name = "OtherCalculationFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherCalculationFrequency")
  public OBOtherCodeType12 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }

  public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
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
    OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner = (OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner) o;
    return Objects.equals(this.identification, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.identification) &&
        Objects.equals(this.tierValueMinimum, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.tierValueMinimum) &&
        Objects.equals(this.tierValueMaximum, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.tierValueMaximum) &&
        Objects.equals(this.calculationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.calculationFrequency) &&
        Objects.equals(this.applicationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.applicationFrequency) &&
        Objects.equals(this.depositInterestAppliedCoverage, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.depositInterestAppliedCoverage) &&
        Objects.equals(this.fixedVariableInterestRateType, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.fixedVariableInterestRateType) &&
        Objects.equals(this.AER, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.AER) &&
        Objects.equals(this.bankInterestRateType, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.bankInterestRateType) &&
        Objects.equals(this.bankInterestRate, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.bankInterestRate) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.notes) &&
        Objects.equals(this.otherBankInterestType, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.otherBankInterestType) &&
        Objects.equals(this.otherApplicationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, obReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.otherCalculationFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner {\n");
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

