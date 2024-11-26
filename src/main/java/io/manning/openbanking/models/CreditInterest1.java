package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.TierBandSetInner1;
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
 * Details about the interest that may be payable to the PCA account holders
 */

@Schema(name = "CreditInterest_1", description = "Details about the interest that may be payable to the PCA account holders")
@JsonTypeName("CreditInterest_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class CreditInterest1 {

  
  private List<TierBandSetInner1> tierBandSet = new ArrayList<>();

  public CreditInterest1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreditInterest1(List<TierBandSetInner1> tierBandSet) {
    this.tierBandSet = tierBandSet;
  }

  public CreditInterest1 tierBandSet(List<TierBandSetInner1> tierBandSet) {
    this.tierBandSet = tierBandSet;
    return this;
  }

  public CreditInterest1 addTierBandSetItem(TierBandSetInner1 tierBandSetItem) {
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
  public List<TierBandSetInner1> getTierBandSet() {
    return tierBandSet;
  }

  public void setTierBandSet(List<TierBandSetInner1> tierBandSet) {
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
    CreditInterest1 creditInterest1 = (CreditInterest1) o;
    return Objects.equals(this.tierBandSet, creditInterest1.tierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest1 {\n");
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

