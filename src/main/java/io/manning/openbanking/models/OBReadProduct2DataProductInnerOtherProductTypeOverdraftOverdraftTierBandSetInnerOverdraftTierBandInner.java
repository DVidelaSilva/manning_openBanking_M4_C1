package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner;
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
 * Provides overdraft details for a specific tier or band
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner_OverdraftTierBand_inner", description = "Provides overdraft details for a specific tier or band")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner_OverdraftTierBand_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner {

  private String identification;

  private String tierValueMin;

  private String tierValueMax;

  private String EAR;

  private Integer agreementLengthMin;

  private Integer agreementLengthMax;

  /**
   * Specifies the period of a fixed length overdraft agreement
   */
  public enum AgreementPeriodEnum {
    PACT("PACT"),
    
    PDAY("PDAY"),
    
    PHYR("PHYR"),
    
    PMTH("PMTH"),
    
    PQTR("PQTR"),
    
    PWEK("PWEK"),
    
    PYER("PYER");

    private String value;

    AgreementPeriodEnum(String value) {
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
    public static AgreementPeriodEnum fromValue(String value) {
      for (AgreementPeriodEnum b : AgreementPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AgreementPeriodEnum agreementPeriod;

  /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is  2k and the interest tiers are:- 0- 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the  Whole  of the account balance,  and in the 2nd that it is  Tiered .
   */
  public enum OverdraftInterestChargingCoverageEnum {
    INBA("INBA"),
    
    INTI("INTI"),
    
    INWH("INWH");

    private String value;

    OverdraftInterestChargingCoverageEnum(String value) {
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
    public static OverdraftInterestChargingCoverageEnum fromValue(String value) {
      for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage;

  private Boolean bankGuaranteedIndicator;

  
  private List<String> notes = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> overdraftFeesCharges = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a overdraft.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner tierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
    return this;
  }

  /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
   */
  @NotNull
  @Schema(name = "TierValueMin", description = "Minimum value of Overdraft Tier/Band", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierValueMin")
  public String getTierValueMin() {
    return tierValueMin;
  }

  public void setTierValueMin(String tierValueMin) {
    this.tierValueMin = tierValueMin;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner tierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
    return this;
  }

  /**
   * Maximum value of Overdraft Tier/Band
   * @return tierValueMax
   */
  
  @Schema(name = "TierValueMax", description = "Maximum value of Overdraft Tier/Band", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TierValueMax")
  public String getTierValueMax() {
    return tierValueMax;
  }

  public void setTierValueMax(String tierValueMax) {
    this.tierValueMax = tierValueMax;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner EAR(String EAR) {
    this.EAR = EAR;
    return this;
  }

  /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
   * @return EAR
   */
  
  @Schema(name = "EAR", description = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EAR")
  public String getEAR() {
    return EAR;
  }

  public void setEAR(String EAR) {
    this.EAR = EAR;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner agreementLengthMin(Integer agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
    return this;
  }

  /**
   * Specifies the minimum length of a band for a fixed overdraft agreement
   * @return agreementLengthMin
   */
  
  @Schema(name = "AgreementLengthMin", description = "Specifies the minimum length of a band for a fixed overdraft agreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AgreementLengthMin")
  public Integer getAgreementLengthMin() {
    return agreementLengthMin;
  }

  public void setAgreementLengthMin(Integer agreementLengthMin) {
    this.agreementLengthMin = agreementLengthMin;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner agreementLengthMax(Integer agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
    return this;
  }

  /**
   * Specifies the maximum length of a band for a fixed overdraft agreement
   * @return agreementLengthMax
   */
  
  @Schema(name = "AgreementLengthMax", description = "Specifies the maximum length of a band for a fixed overdraft agreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AgreementLengthMax")
  public Integer getAgreementLengthMax() {
    return agreementLengthMax;
  }

  public void setAgreementLengthMax(Integer agreementLengthMax) {
    this.agreementLengthMax = agreementLengthMax;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner agreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
    return this;
  }

  /**
   * Specifies the period of a fixed length overdraft agreement
   * @return agreementPeriod
   */
  
  @Schema(name = "AgreementPeriod", description = "Specifies the period of a fixed length overdraft agreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AgreementPeriod")
  public AgreementPeriodEnum getAgreementPeriod() {
    return agreementPeriod;
  }

  public void setAgreementPeriod(AgreementPeriodEnum agreementPeriod) {
    this.agreementPeriod = agreementPeriod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

  /**
   * Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is  2k and the interest tiers are:- 0- 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the  Whole  of the account balance,  and in the 2nd that it is  Tiered .
   * @return overdraftInterestChargingCoverage
   */
  
  @Schema(name = "OverdraftInterestChargingCoverage", description = "Refers to which interest rate is applied when interests are tiered. For example, if an overdraft balance is  2k and the interest tiers are:- 0- 500 0.1%, 500-1000 0.2%, 1000-10000 0.5%, then the applicable interest rate could either be 0.5% of the entire balance (since the account balance sits in the top interest tier) or (0.1%*500)+(0.2%*500)+(0.5%*1000). In the 1st situation, we say the interest is applied to the  Whole  of the account balance,  and in the 2nd that it is  Tiered .", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftInterestChargingCoverage")
  public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
    return overdraftInterestChargingCoverage;
  }

  public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

  /**
   * Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.
   * @return bankGuaranteedIndicator
   */
  
  @Schema(name = "BankGuaranteedIndicator", description = "Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it s part of a government scheme, or whether the rate may vary dependent on the applicant s circumstances.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BankGuaranteedIndicator")
  public Boolean getBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }

  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner overdraftFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner addOverdraftFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Get overdraftFeesCharges
   * @return overdraftFeesCharges
   */
  
  @Schema(name = "OverdraftFeesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeesCharges")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner = (OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner) o;
    return Objects.equals(this.identification, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.identification) &&
        Objects.equals(this.tierValueMin, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.tierValueMin) &&
        Objects.equals(this.tierValueMax, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.tierValueMax) &&
        Objects.equals(this.EAR, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.EAR) &&
        Objects.equals(this.agreementLengthMin, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.agreementLengthMin) &&
        Objects.equals(this.agreementLengthMax, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.agreementLengthMax) &&
        Objects.equals(this.agreementPeriod, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.agreementPeriod) &&
        Objects.equals(this.overdraftInterestChargingCoverage, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.overdraftInterestChargingCoverage) &&
        Objects.equals(this.bankGuaranteedIndicator, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.bankGuaranteedIndicator) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.notes) &&
        Objects.equals(this.overdraftFeesCharges, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMin, tierValueMax, EAR, agreementLengthMin, agreementLengthMax, agreementPeriod, overdraftInterestChargingCoverage, bankGuaranteedIndicator, notes, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
    sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
    sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
    sb.append("    agreementLengthMin: ").append(toIndentedString(agreementLengthMin)).append("\n");
    sb.append("    agreementLengthMax: ").append(toIndentedString(agreementLengthMax)).append("\n");
    sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
    sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
    sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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

