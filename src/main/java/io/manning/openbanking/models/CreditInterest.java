package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.TierBandSetInner;
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
 * Details about the interest that may be payable to the BCA account holders
 */

@Schema(name = "CreditInterest", description = "Details about the interest that may be payable to the BCA account holders")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class CreditInterest {

  
  private List<TierBandSetInner> tierBandSet = new ArrayList<>();

  public CreditInterest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreditInterest(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  public CreditInterest tierBandSet(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest addTierBandSetItem(TierBandSetInner tierBandSetItem) {
    if (this.tierBandSet == null) {
      this.tierBandSet = new ArrayList<>();
    }
    this.tierBandSet.add(tierBandSetItem);
    return this;
  }

  /**
   * The group of tiers or bands for which credit interest can be applied.
   * @return tierBandSet
   */
  @NotNull
  @Schema(name = "TierBandSet", description = "The group of tiers or bands for which credit interest can be applied.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TierBandSet")
  public List<TierBandSetInner> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<TierBandSetInner> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest creditInterest = (CreditInterest) o;
    return Objects.equals(this.tierBandSet, creditInterest.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest {\n");
    sb.append("    tierBandSet: ").append(toIndentedString(tierBandSet)).append("\n");
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

