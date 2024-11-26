package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.OBTransaction6;
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
 * OBReadDataTransaction6
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadDataTransaction6 {

  
  private List<OBTransaction6> transaction = new ArrayList<>();

  public OBReadDataTransaction6 transaction(List<OBTransaction6> transaction) {
    this.transaction = transaction;
    return this;
  }

  public OBReadDataTransaction6 addTransactionItem(OBTransaction6 transactionItem) {
    if (this.transaction == null) {
      this.transaction = new ArrayList<>();
    }
    this.transaction.add(transactionItem);
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   */
  
  @Schema(name = "Transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Transaction")
  public List<OBTransaction6> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<OBTransaction6> transaction) {
    this.transaction = transaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDataTransaction6 obReadDataTransaction6 = (OBReadDataTransaction6) o;
    return Objects.equals(this.transaction, obReadDataTransaction6.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDataTransaction6 {\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

