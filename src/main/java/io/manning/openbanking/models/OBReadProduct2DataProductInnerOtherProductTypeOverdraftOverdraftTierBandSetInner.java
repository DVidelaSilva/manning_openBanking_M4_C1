package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner;
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

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner", description = "Tier band set details")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft_OverdraftTierBandSet_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner {

  /**
   * The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.
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

  /**
   * An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.
   */
  public enum OverdraftTypeEnum {
    OVCO("OVCO"),
    
    OVOD("OVOD"),
    
    OVOT("OVOT");

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

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner> overdraftTierBand = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner> overdraftFeesCharges = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner(TierBandMethodEnum tierBandMethod, List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner> overdraftTierBand) {
    this.tierBandMethod = tierBandMethod;
    this.overdraftTierBand = overdraftTierBand;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner tierBandMethod(TierBandMethodEnum tierBandMethod) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner overdraftType(OverdraftTypeEnum overdraftType) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner identification(String identification) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner authorisedIndicator(Boolean authorisedIndicator) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner bufferAmount(String bufferAmount) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner overdraftTierBand(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner addOverdraftTierBandItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner overdraftTierBandItem) {
    if (this.overdraftTierBand == null) {
      this.overdraftTierBand = new ArrayList<>();
    }
    this.overdraftTierBand.add(overdraftTierBandItem);
    return this;
  }

  /**
   * Get overdraftTierBand
   * @return overdraftTierBand
   */
  @NotNull
  @Schema(name = "OverdraftTierBand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OverdraftTierBand")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner overdraftFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner addOverdraftFeesChargesItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner overdraftFeesChargesItem) {
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
  public List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner> overdraftFeesCharges) {
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
    OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner = (OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner) o;
    return Objects.equals(this.tierBandMethod, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.tierBandMethod) &&
        Objects.equals(this.overdraftType, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.overdraftType) &&
        Objects.equals(this.identification, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.identification) &&
        Objects.equals(this.authorisedIndicator, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.authorisedIndicator) &&
        Objects.equals(this.bufferAmount, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.bufferAmount) &&
        Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.notes) &&
        Objects.equals(this.overdraftTierBand, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.overdraftTierBand) &&
        Objects.equals(this.overdraftFeesCharges, obReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, overdraftType, identification, authorisedIndicator, bufferAmount, notes, overdraftTierBand, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner {\n");
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

