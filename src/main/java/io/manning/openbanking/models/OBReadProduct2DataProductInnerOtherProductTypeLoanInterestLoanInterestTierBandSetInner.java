package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBInterestCalculationMethod1Code;
import io.manning.openbanking.models.OBOtherCodeType10;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner;
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
 * The group of tiers or bands for which debit interest can be applied.
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner", description = "The group of tiers or bands for which debit interest can be applied.")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest_LoanInterestTierBandSet_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner {

  /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
   */
  public enum TierBandMethodEnum {
    INBA("INBA"),
    
    INTI("INTI"),
    
    INWH("INWH");

    private String value;

    TierBandMethodEnum(String value) {
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
    public static TierBandMethodEnum fromValue(String value) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TierBandMethodEnum tierBandMethod;

  private String identification;

  private OBInterestCalculationMethod1Code calculationMethod;

  
  private List<String> notes = new ArrayList<>();

  private OBOtherCodeType10 otherCalculationMethod;

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> loanInterestFeesCharges = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner(TierBandMethodEnum tierBandMethod, OBInterestCalculationMethod1Code calculationMethod, List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand) {
    this.tierBandMethod = tierBandMethod;
    this.calculationMethod = calculationMethod;
    this.loanInterestTierBand = loanInterestTierBand;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance
   * @return tierBandMethod
   */
  @NotNull
  @Schema(name = "TierBandMethod", description = "The methodology of how credit interest is charged. It can be:- 1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance. 3. Whole The same interest rate is applied irrespective of the SME Loan balance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBandMethod")
  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Loan interest tierbandset identification. Used by  loan providers for internal use purpose.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Loan interest tierbandset identification. Used by  loan providers for internal use purpose.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner calculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Get calculationMethod
   * @return calculationMethod
   */
  @NotNull
  @Schema(name = "CalculationMethod", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CalculationMethod")
  public OBInterestCalculationMethod1Code getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(OBInterestCalculationMethod1Code calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner otherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
    return this;
  }

  /**
   * Get otherCalculationMethod
   * @return otherCalculationMethod
   */
  
  @Schema(name = "OtherCalculationMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OtherCalculationMethod")
  public OBOtherCodeType10 getOtherCalculationMethod() {
    return otherCalculationMethod;
  }

  public void setOtherCalculationMethod(OBOtherCodeType10 otherCalculationMethod) {
    this.otherCalculationMethod = otherCalculationMethod;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestTierBand(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner addLoanInterestTierBandItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner loanInterestTierBandItem) {
    if (this.loanInterestTierBand == null) {
      this.loanInterestTierBand = new ArrayList<>();
    }
    this.loanInterestTierBand.add(loanInterestTierBandItem);
    return this;
  }

  /**
   * Get loanInterestTierBand
   * @return loanInterestTierBand
   */
  @NotNull
  @Schema(name = "LoanInterestTierBand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LoanInterestTierBand")
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> getLoanInterestTierBand() {
    return loanInterestTierBand;
  }

  public void setLoanInterestTierBand(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner> loanInterestTierBand) {
    this.loanInterestTierBand = loanInterestTierBand;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner addLoanInterestFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner loanInterestFeesChargesItem) {
    if (this.loanInterestFeesCharges == null) {
      this.loanInterestFeesCharges = new ArrayList<>();
    }
    this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
    return this;
  }

  /**
   * Get loanInterestFeesCharges
   * @return loanInterestFeesCharges
   */
  
  @Schema(name = "LoanInterestFeesCharges", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LoanInterestFeesCharges")
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> getLoanInterestFeesCharges() {
    return loanInterestFeesCharges;
  }

  public void setLoanInterestFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner> loanInterestFeesCharges) {
    this.loanInterestFeesCharges = loanInterestFeesCharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner) o;
    return Objects.equals(this.tierBandMethod, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.tierBandMethod) &&
        Objects.equals(this.identification, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.identification) &&
        Objects.equals(this.calculationMethod, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.calculationMethod) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.notes) &&
        Objects.equals(this.otherCalculationMethod, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.otherCalculationMethod) &&
        Objects.equals(this.loanInterestTierBand, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.loanInterestTierBand) &&
        Objects.equals(this.loanInterestFeesCharges, obReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.loanInterestFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, identification, calculationMethod, notes, otherCalculationMethod, loanInterestTierBand, loanInterestFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner {\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherCalculationMethod: ").append(toIndentedString(otherCalculationMethod)).append("\n");
    sb.append("    loanInterestTierBand: ").append(toIndentedString(loanInterestTierBand)).append("\n");
    sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
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

