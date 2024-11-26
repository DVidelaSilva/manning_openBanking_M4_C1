package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OverdraftFeesChargesInner3;
import io.manning.openbanking.models.OverdraftTierBandInner1;
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
 * Tier band set details
 */

@Schema(name = "OverdraftTierBandSet_inner_1", description = "Tier band set details")
@JsonTypeName("OverdraftTierBandSet_inner_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OverdraftTierBandSetInner1 {

  /**
   * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
   */
  public enum TierBandMethodEnum {
    TIERED("Tiered"),
    
    WHOLE("Whole"),
    
    BANDED("Banded");

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

  /**
   * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
   */
  public enum OverdraftTypeEnum {
    COMMITTED("Committed"),
    
    ON_DEMAND("OnDemand"),
    
    OTHER("Other");

    private String value;

    OverdraftTypeEnum(String value) {
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
    public static OverdraftTypeEnum fromValue(String value) {
      for (OverdraftTypeEnum b : OverdraftTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OverdraftTypeEnum overdraftType;

  private String identification;

  private Boolean authorisedIndicator;

  private String bufferAmount;

  
  private List<String> notes = new ArrayList<>();

  
  private List<OverdraftTierBandInner1> overdraftTierBand = new ArrayList<>();

  
  private List<OverdraftFeesChargesInner3> overdraftFeesCharges = new ArrayList<>();

  public OverdraftTierBandSetInner1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OverdraftTierBandSetInner1(TierBandMethodEnum tierBandMethod, List<OverdraftTierBandInner1> overdraftTierBand) {
    this.tierBandMethod = tierBandMethod;
    this.overdraftTierBand = overdraftTierBand;
  }

  public OverdraftTierBandSetInner1 tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
   * @return tierBandMethod
   */
  @NotNull
  @Schema(name = "TierBandMethod", description = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBandMethod")
  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OverdraftTierBandSetInner1 overdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
    return this;
  }

  /**
   * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
   * @return overdraftType
   */
  
  @Schema(name = "OverdraftType", description = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftType")
  public OverdraftTypeEnum getOverdraftType() {
    return overdraftType;
  }

  public void setOverdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
  }

  public OverdraftTierBandSetInner1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft product.
   * @return identification
   */
  
  @Schema(name = "Identification", description = "Unique and unambiguous identification of a  Tier Band for a overdraft product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OverdraftTierBandSetInner1 authorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
    return this;
  }

  /**
   * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
   * @return authorisedIndicator
   */
  
  @Schema(name = "AuthorisedIndicator", description = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AuthorisedIndicator")
  public Boolean getAuthorisedIndicator() {
    return authorisedIndicator;
  }

  public void setAuthorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
  }

  public OverdraftTierBandSetInner1 bufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
    return this;
  }

  /**
   * When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.
   * @return bufferAmount
   */
  
  @Schema(name = "BufferAmount", description = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BufferAmount")
  public String getBufferAmount() {
    return bufferAmount;
  }

  public void setBufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
  }

  public OverdraftTierBandSetInner1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftTierBandSetInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the overdraft Tier Band Set details
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Optional additional notes to supplement the overdraft Tier Band Set details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OverdraftTierBandSetInner1 overdraftTierBand(List<OverdraftTierBandInner1> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
    return this;
  }

  public OverdraftTierBandSetInner1 addOverdraftTierBandItem(OverdraftTierBandInner1 overdraftTierBandItem) {
    if (this.overdraftTierBand == null) {
      this.overdraftTierBand = new ArrayList<>();
    }
    this.overdraftTierBand.add(overdraftTierBandItem);
    return this;
  }

  /**
   * Provides overdraft details for a specific tier or band
   * @return overdraftTierBand
   */
  @NotNull
  @Schema(name = "OverdraftTierBand", description = "Provides overdraft details for a specific tier or band", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OverdraftTierBand")
  public List<OverdraftTierBandInner1> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<OverdraftTierBandInner1> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
  }

  public OverdraftTierBandSetInner1 overdraftFeesCharges(List<OverdraftFeesChargesInner3> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OverdraftTierBandSetInner1 addOverdraftFeesChargesItem(OverdraftFeesChargesInner3 overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Overdraft fees and charges details
   * @return overdraftFeesCharges
   */
  
  @Schema(name = "OverdraftFeesCharges", description = "Overdraft fees and charges details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OverdraftFeesCharges")
  public List<OverdraftFeesChargesInner3> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OverdraftFeesChargesInner3> overdraftFeesCharges) {
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
    OverdraftTierBandSetInner1 overdraftTierBandSetInner1 = (OverdraftTierBandSetInner1) o;
    return Objects.equals(this.tierBandMethod, overdraftTierBandSetInner1.tierBandMethod) &&
        Objects.equals(this.overdraftType, overdraftTierBandSetInner1.overdraftType) &&
        Objects.equals(this.identification, overdraftTierBandSetInner1.identification) &&
        Objects.equals(this.authorisedIndicator, overdraftTierBandSetInner1.authorisedIndicator) &&
        Objects.equals(this.bufferAmount, overdraftTierBandSetInner1.bufferAmount) &&
        Objects.equals(this.notes, overdraftTierBandSetInner1.notes) &&
        Objects.equals(this.overdraftTierBand, overdraftTierBandSetInner1.overdraftTierBand) &&
        Objects.equals(this.overdraftFeesCharges, overdraftTierBandSetInner1.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, overdraftType, identification, authorisedIndicator, bufferAmount, notes, overdraftTierBand, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftTierBandSetInner1 {\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    overdraftType: ").append(toIndentedString(overdraftType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
    sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBand: ").append(toIndentedString(overdraftTierBand)).append("\n");
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

