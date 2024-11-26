package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner;
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
 * Borrowing details
 */

@Schema(name = "OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft", description = "Borrowing details")
@JsonTypeName("OBReadProduct2_Data_Product_inner_OtherProductType_Overdraft")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadProduct2DataProductInnerOtherProductTypeOverdraft {

  
  private List<String> notes = new ArrayList<>();

  
  private List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft addNotesItem(String notesItem) {
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

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft overdraftTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOverdraft addOverdraftTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner overdraftTierBandSetItem) {
    if (this.overdraftTierBandSet == null) {
      this.overdraftTierBandSet = new ArrayList<>();
    }
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }

  /**
   * Get overdraftTierBandSet
   * @return overdraftTierBandSet
   */
  @NotNull
  @Schema(name = "OverdraftTierBandSet", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OverdraftTierBandSet")
  public List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProductInnerOtherProductTypeOverdraft obReadProduct2DataProductInnerOtherProductTypeOverdraft = (OBReadProduct2DataProductInnerOtherProductTypeOverdraft) o;
    return Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeOverdraft.notes) &&
        Objects.equals(this.overdraftTierBandSet, obReadProduct2DataProductInnerOtherProductTypeOverdraft.overdraftTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, overdraftTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOverdraft {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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

