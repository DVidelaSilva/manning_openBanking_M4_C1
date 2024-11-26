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
 * Set of elements used to provide details of a generic number value related to the statement resource.
 */

@Schema(name = "OBStatement2_StatementValue_inner", description = "Set of elements used to provide details of a generic number value related to the statement resource.")
@JsonTypeName("OBStatement2_StatementValue_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBStatement2StatementValueInner {

  private String value;

  private String type;

  public OBStatement2StatementValueInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBStatement2StatementValueInner(String value, String type) {
    this.value = value;
    this.type = type;
  }

  public OBStatement2StatementValueInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value associated with the statement value type.
   * @return value
   */
  @NotNull
  @Schema(name = "Value", description = "Value associated with the statement value type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public OBStatement2StatementValueInner type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Statement value type, in a coded form. For a full list of values see `OBInternalStatementValueType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return type
   */
  @NotNull
  @Schema(name = "Type", example = "UK.OBIE.Credit", description = "Statement value type, in a coded form. For a full list of values see `OBInternalStatementValueType1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
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
    OBStatement2StatementValueInner obStatement2StatementValueInner = (OBStatement2StatementValueInner) o;
    return Objects.equals(this.value, obStatement2StatementValueInner.value) &&
        Objects.equals(this.type, obStatement2StatementValueInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementValueInner {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

