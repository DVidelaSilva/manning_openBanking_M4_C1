package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.OBReadConsent1Data;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReadConsent1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadConsent1 {

  private OBReadConsent1Data data;

  private Object risk;

  public OBReadConsent1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadConsent1(OBReadConsent1Data data, Object risk) {
    this.data = data;
    this.risk = risk;
  }

  public OBReadConsent1 data(OBReadConsent1Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull
  @Schema(name = "Data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Data")
  public OBReadConsent1Data getData() {
    return data;
  }

  public void setData(OBReadConsent1Data data) {
    this.data = data;
  }

  public OBReadConsent1 risk(Object risk) {
    this.risk = risk;
    return this;
  }

  /**
   * The Risk section is sent by the initiating party to the ASPSP. <br /> It is used to specify additional details for risk scoring for Account Info.
   * @return risk
   */
  @NotNull
  @Schema(name = "Risk", description = "The Risk section is sent by the initiating party to the ASPSP. <br /> It is used to specify additional details for risk scoring for Account Info.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Risk")
  public Object getRisk() {
    return risk;
  }

  public void setRisk(Object risk) {
    this.risk = risk;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsent1 obReadConsent1 = (OBReadConsent1) o;
    return Objects.equals(this.data, obReadConsent1.data) &&
        Objects.equals(this.risk, obReadConsent1.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsent1 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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

