package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OverdraftTierBandSetInner1;
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
 * Details about Overdraft rates, fees &amp; charges
 */

@Schema(name = "Overdraft_1", description = "Details about Overdraft rates, fees & charges")
@JsonTypeName("Overdraft_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class Overdraft1 {

  
  private List<String> notes = new ArrayList<>();

  
  private List<OverdraftTierBandSetInner1> overdraftTierBandSet = new ArrayList<>();

  public Overdraft1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Overdraft1(List<OverdraftTierBandSetInner1> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
  }

  public Overdraft1 notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public Overdraft1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Associated Notes about the overdraft rates
   * @return notes
   */
  
  @Schema(name = "Notes", description = "Associated Notes about the overdraft rates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notes")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public Overdraft1 overdraftTierBandSet(List<OverdraftTierBandSetInner1> overdraftTierBandSet) {
    this.overdraftTierBandSet = overdraftTierBandSet;
    return this;
  }

  public Overdraft1 addOverdraftTierBandSetItem(OverdraftTierBandSetInner1 overdraftTierBandSetItem) {
    if (this.overdraftTierBandSet == null) {
      this.overdraftTierBandSet = new ArrayList<>();
    }
    this.overdraftTierBandSet.add(overdraftTierBandSetItem);
    return this;
  }

  /**
   * Tier band set details
   * @return overdraftTierBandSet
   */
  @NotNull
  @Schema(name = "OverdraftTierBandSet", description = "Tier band set details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OverdraftTierBandSet")
  public List<OverdraftTierBandSetInner1> getOverdraftTierBandSet() {
    return overdraftTierBandSet;
  }

  public void setOverdraftTierBandSet(List<OverdraftTierBandSetInner1> overdraftTierBandSet) {
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
    Overdraft1 overdraft1 = (Overdraft1) o;
    return Objects.equals(this.notes, overdraft1.notes) &&
        Objects.equals(this.overdraftTierBandSet, overdraft1.overdraftTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, overdraftTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Overdraft1 {\n");
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

