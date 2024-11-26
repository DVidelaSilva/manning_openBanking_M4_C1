package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBAccount6;
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
 * OBReadAccount6Data
 */

@JsonTypeName("OBReadAccount6_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadAccount6Data {

  
  private List<OBAccount6> account = new ArrayList<>();

  public OBReadAccount6Data account(List<OBAccount6> account) {
    this.account = account;
    return this;
  }

  public OBReadAccount6Data addAccountItem(OBAccount6 accountItem) {
    if (this.account == null) {
      this.account = new ArrayList<>();
    }
    this.account.add(accountItem);
    return this;
  }

  /**
   * Get account
   * @return account
   */
  
  @Schema(name = "Account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Account")
  public List<OBAccount6> getAccount() {
    return account;
  }

  public void setAccount(List<OBAccount6> account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadAccount6Data obReadAccount6Data = (OBReadAccount6Data) o;
    return Objects.equals(this.account, obReadAccount6Data.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadAccount6Data {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

