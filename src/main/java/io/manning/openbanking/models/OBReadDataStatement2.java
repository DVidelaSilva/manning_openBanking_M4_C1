package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.OBStatement2;
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
 * OBReadDataStatement2
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadDataStatement2 {

  
  private List<OBStatement2> statement = new ArrayList<>();

  public OBReadDataStatement2 statement(List<OBStatement2> statement) {
    this.statement = statement;
    return this;
  }

  public OBReadDataStatement2 addStatementItem(OBStatement2 statementItem) {
    if (this.statement == null) {
      this.statement = new ArrayList<>();
    }
    this.statement.add(statementItem);
    return this;
  }

  /**
   * Get statement
   * @return statement
   */
  
  @Schema(name = "Statement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Statement")
  public List<OBStatement2> getStatement() {
    return statement;
  }

  public void setStatement(List<OBStatement2> statement) {
    this.statement = statement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadDataStatement2 obReadDataStatement2 = (OBReadDataStatement2) o;
    return Objects.equals(this.statement, obReadDataStatement2.statement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadDataStatement2 {\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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

