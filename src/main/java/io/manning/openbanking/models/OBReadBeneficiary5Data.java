package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBBeneficiary5;
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
 * OBReadBeneficiary5Data
 */

@JsonTypeName("OBReadBeneficiary5_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadBeneficiary5Data {

  
  private List<OBBeneficiary5> beneficiary = new ArrayList<>();

  public OBReadBeneficiary5Data beneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  public OBReadBeneficiary5Data addBeneficiaryItem(OBBeneficiary5 beneficiaryItem) {
    if (this.beneficiary == null) {
      this.beneficiary = new ArrayList<>();
    }
    this.beneficiary.add(beneficiaryItem);
    return this;
  }

  /**
   * Get beneficiary
   * @return beneficiary
   */
  
  @Schema(name = "Beneficiary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Beneficiary")
  public List<OBBeneficiary5> getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(List<OBBeneficiary5> beneficiary) {
    this.beneficiary = beneficiary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadBeneficiary5Data obReadBeneficiary5Data = (OBReadBeneficiary5Data) o;
    return Objects.equals(this.beneficiary, obReadBeneficiary5Data.beneficiary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBeneficiary5Data {\n");
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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

