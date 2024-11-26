package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.Links;
import io.manning.openbanking.models.Meta;
import io.manning.openbanking.models.OBReadDataStatement2;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReadStatement2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadStatement2 {

  private OBReadDataStatement2 data;

  private Links links;

  private Meta meta;

  public OBReadStatement2() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadStatement2(OBReadDataStatement2 data) {
    this.data = data;
  }

  public OBReadStatement2 data(OBReadDataStatement2 data) {
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
  public OBReadDataStatement2 getData() {
    return data;
  }

  public void setData(OBReadDataStatement2 data) {
    this.data = data;
  }

  public OBReadStatement2 links(Links links) {
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

  public OBReadStatement2 meta(Meta meta) {
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
    OBReadStatement2 obReadStatement2 = (OBReadStatement2) o;
    return Objects.equals(this.data, obReadStatement2.data) &&
        Objects.equals(this.links, obReadStatement2.links) &&
        Objects.equals(this.meta, obReadStatement2.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStatement2 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

