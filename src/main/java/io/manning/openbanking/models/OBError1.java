package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBError1
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBError1 {

  private String errorCode;

  private String message;

  private String path;

  private String url;

  public OBError1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBError1(String errorCode) {
    this.errorCode = errorCode;
  }

  public OBError1 errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Low level textual error code, for all enum values see `ExternalReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return errorCode
   */
  @NotNull
  @Schema(name = "ErrorCode", example = "AC17", description = "Low level textual error code, for all enum values see `ExternalReason1Code` [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ErrorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public OBError1 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBL doesn't standardise this field
   * @return message
   */
  
  @Schema(name = "Message", description = "A description of the error that occurred. e.g., 'A mandatory field isn't supplied' or 'RequestedExecutionDateTime must be in future' OBL doesn't standardise this field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OBError1 path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency
   * @return path
   */
  
  @Schema(name = "Path", description = "Recommended but optional reference to the JSON Path of the field with error, e.g., Data.Initiation.InstructedAmount.Currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public OBError1 url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to help remediate the problem, or provide more information, or to API Reference, or help etc
   * @return url
   */
  
  @Schema(name = "Url", description = "URL to help remediate the problem, or provide more information, or to API Reference, or help etc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBError1 obError1 = (OBError1) o;
    return Objects.equals(this.errorCode, obError1.errorCode) &&
        Objects.equals(this.message, obError1.message) &&
        Objects.equals(this.path, obError1.path) &&
        Objects.equals(this.url, obError1.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, path, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBError1 {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

