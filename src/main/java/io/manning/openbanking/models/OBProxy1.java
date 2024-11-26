package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.ExternalProxyAccountType1Code;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Specifies an alternate assumed name for the identification of the account.
 */

@Schema(name = "OBProxy1", description = "Specifies an alternate assumed name for the identification of the account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBProxy1 {

  private String identification;

  private ExternalProxyAccountType1Code code;

  private String type;

  public OBProxy1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBProxy1(String identification, ExternalProxyAccountType1Code code) {
    this.identification = identification;
    this.code = code;
  }

  public OBProxy1 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification used to indicate the account identification under another specified name.
   * @return identification
   */
  @NotNull
  @Schema(name = "Identification", example = "2360549017905188", description = "Identification used to indicate the account identification under another specified name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBProxy1 code(ExternalProxyAccountType1Code code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @NotNull
  @Schema(name = "Code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Code")
  public ExternalProxyAccountType1Code getCode() {
    return code;
  }

  public void setCode(ExternalProxyAccountType1Code code) {
    this.code = code;
  }

  public OBProxy1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the proxy identification.
   * @return type
   */
  
  @Schema(name = "Type", description = "Type of the proxy identification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBProxy1 obProxy1 = (OBProxy1) o;
    return Objects.equals(this.identification, obProxy1.identification) &&
        Objects.equals(this.code, obProxy1.code) &&
        Objects.equals(this.type, obProxy1.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, code, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBProxy1 {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

