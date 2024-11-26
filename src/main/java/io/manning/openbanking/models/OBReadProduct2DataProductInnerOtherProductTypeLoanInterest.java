package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner;
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
 * Details about the interest that may be payable to the SME Loan holders
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest", description = "Details about the interest that may be payable to the SME Loan holders")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_LoanInterest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {

  
  private List<String> notes = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterestTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestTierBandSetItem) {
    if (this.loanInterestTierBandSet == null) {
      this.loanInterestTierBandSet = new ArrayList<>();
    }
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

  /**
   * Get loanInterestTierBandSet
   * @return loanInterestTierBandSet
   */
  @NotNull
  @Schema(name = "LoanInterestTierBandSet", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LoanInterestTierBandSet")
  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }

  public void setLoanInterestTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterest obReadProduct2DataProductInnerOtherProductTypeLoanInterest = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterest) o;
    return Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.notes) &&
        Objects.equals(this.loanInterestTierBandSet, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.loanInterestTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, loanInterestTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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

