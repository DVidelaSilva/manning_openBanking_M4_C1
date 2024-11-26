package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.Links;
import io.manning.openbanking.models.Meta;
import io.manning.openbanking.models.OBReadConsentResponse1Data;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReadConsentResponse1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadConsentResponse1 {

  private OBReadConsentResponse1Data data;

  private Object risk;

  private Links links;

  private Meta meta;

  public OBReadConsentResponse1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadConsentResponse1(OBReadConsentResponse1Data data, Object risk) {
    this.data = data;
    this.risk = risk;
  }

  public OBReadConsentResponse1 data(OBReadConsentResponse1Data data) {
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
  public OBReadConsentResponse1Data getData() {
    return data;
  }

  public void setData(OBReadConsentResponse1Data data) {
    this.data = data;
  }

  public OBReadConsentResponse1 risk(Object risk) {
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

  public OBReadConsentResponse1 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  
  @Schema(name = "Links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadConsentResponse1 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  
  @Schema(name = "Meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Meta")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsentResponse1 obReadConsentResponse1 = (OBReadConsentResponse1) o;
    return Objects.equals(this.data, obReadConsentResponse1.data) &&
        Objects.equals(this.risk, obReadConsentResponse1.risk) &&
        Objects.equals(this.links, obReadConsentResponse1.links) &&
        Objects.equals(this.meta, obReadConsentResponse1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

