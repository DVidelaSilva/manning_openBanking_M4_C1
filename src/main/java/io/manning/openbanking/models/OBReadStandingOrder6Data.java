package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBStandingOrder6;
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
 * OBReadStandingOrder6Data
 */

@JsonTypeName("OBReadStandingOrder6_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadStandingOrder6Data {

  
  private List<OBStandingOrder6> standingOrder = new ArrayList<>();

  public OBReadStandingOrder6Data standingOrder(List<OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder6Data addStandingOrderItem(OBStandingOrder6 standingOrderItem) {
    if (this.standingOrder == null) {
      this.standingOrder = new ArrayList<>();
    }
    this.standingOrder.add(standingOrderItem);
    return this;
  }

  /**
   * Get standingOrder
   * @return standingOrder
   */
  
  @Schema(name = "StandingOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StandingOrder")
  public List<OBStandingOrder6> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStandingOrder6Data obReadStandingOrder6Data = (OBReadStandingOrder6Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder6Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder6Data {\n");
    sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
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

