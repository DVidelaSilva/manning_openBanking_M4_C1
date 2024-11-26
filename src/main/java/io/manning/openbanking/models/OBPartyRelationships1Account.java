package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Relationship to the Account resource.
 */

@Schema(name = "OBPartyRelationships1_Account", description = "Relationship to the Account resource.")
@JsonTypeName("OBPartyRelationships1_Account")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBPartyRelationships1Account {

  private URI related;

  private String id;

  public OBPartyRelationships1Account() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBPartyRelationships1Account(URI related, String id) {
    this.related = related;
    this.id = id;
  }

  public OBPartyRelationships1Account related(URI related) {
    this.related = related;
    return this;
  }

  /**
   * Absolute URI to the related resource.
   * @return related
   */
  @NotNull
  @Schema(name = "Related", example = "https://api.alphabank.com/open-banking/v4.0/aisp/accounts/89019", description = "Absolute URI to the related resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Related")
  public URI getRelated() {
    return related;
  }

  public void setRelated(URI related) {
    this.related = related;
  }

  public OBPartyRelationships1Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identification as assigned by the ASPSP to uniquely identify the related resource.
   * @return id
   */
  @NotNull
  @Schema(name = "Id", example = "89019", description = "Unique identification as assigned by the ASPSP to uniquely identify the related resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPartyRelationships1Account obPartyRelationships1Account = (OBPartyRelationships1Account) o;
    return Objects.equals(this.related, obPartyRelationships1Account.related) &&
        Objects.equals(this.id, obPartyRelationships1Account.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(related, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPartyRelationships1Account {\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

