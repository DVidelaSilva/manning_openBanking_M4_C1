package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.OBRemittanceInformationStructured;
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
 * Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts&#39; receivable system
 */

@Schema(name = "OBRemittanceInformation2", description = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBRemittanceInformation2 {

  
  private List<OBRemittanceInformationStructured> structured = new ArrayList<>();

  
  private List<String> unstructured = new ArrayList<>();

  public OBRemittanceInformation2 structured(List<OBRemittanceInformationStructured> structured) {
    this.structured = structured;
    return this;
  }

  public OBRemittanceInformation2 addStructuredItem(OBRemittanceInformationStructured structuredItem) {
    if (this.structured == null) {
      this.structured = new ArrayList<>();
    }
    this.structured.add(structuredItem);
    return this;
  }

  /**
   * Get structured
   * @return structured
   */
  
  @Schema(name = "Structured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Structured")
  public List<OBRemittanceInformationStructured> getStructured() {
    return structured;
  }

  public void setStructured(List<OBRemittanceInformationStructured> structured) {
    this.structured = structured;
  }

  public OBRemittanceInformation2 unstructured(List<String> unstructured) {
    this.unstructured = unstructured;
    return this;
  }

  public OBRemittanceInformation2 addUnstructuredItem(String unstructuredItem) {
    if (this.unstructured == null) {
      this.unstructured = new ArrayList<>();
    }
    this.unstructured.add(unstructuredItem);
    return this;
  }

  /**
   * Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.
   * @return unstructured
   */
  
  @Schema(name = "Unstructured", description = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in an unstructured form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Unstructured")
  public List<String> getUnstructured() {
    return unstructured;
  }

  public void setUnstructured(List<String> unstructured) {
    this.unstructured = unstructured;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBRemittanceInformation2 obRemittanceInformation2 = (OBRemittanceInformation2) o;
    return Objects.equals(this.structured, obRemittanceInformation2.structured) &&
        Objects.equals(this.unstructured, obRemittanceInformation2.unstructured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structured, unstructured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRemittanceInformation2 {\n");
    sb.append("    structured: ").append(toIndentedString(structured)).append("\n");
    sb.append("    unstructured: ").append(toIndentedString(unstructured)).append("\n");
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

