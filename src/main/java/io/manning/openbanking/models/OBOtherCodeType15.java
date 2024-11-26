package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Other fee rate type which is not in the standard rate type list
 */

@Schema(name = "OB_OtherCodeType1_5", description = "Other fee rate type which is not in the standard rate type list")
@JsonTypeName("OB_OtherCodeType1_5")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBOtherCodeType15 {

  private String code;

  private String name;

  private String description;

  public OBOtherCodeType15() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBOtherCodeType15(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public OBOtherCodeType15 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
   */
  
  @Schema(name = "Code", description = "The four letter Mnemonic used within an XML file to identify a code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBOtherCodeType15 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * @return name
   */
  @NotNull
  @Schema(name = "Name", description = "Long name associated with the code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBOtherCodeType15 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * @return description
   */
  @NotNull
  @Schema(name = "Description", description = "Description to describe the purpose of the code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOtherCodeType15 obOtherCodeType15 = (OBOtherCodeType15) o;
    return Objects.equals(this.code, obOtherCodeType15.code) &&
        Objects.equals(this.name, obOtherCodeType15.name) &&
        Objects.equals(this.description, obOtherCodeType15.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOtherCodeType15 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

