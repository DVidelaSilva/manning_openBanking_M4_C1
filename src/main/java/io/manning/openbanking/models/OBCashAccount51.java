package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.manning.openbanking.models.OBProxy1;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Provides the details to identify the beneficiary account.
 */

@Schema(name = "OBCashAccount5_1", description = "Provides the details to identify the beneficiary account.")
@JsonTypeName("OBCashAccount5_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBCashAccount51 {

  private String schemeName;

  private String identification;

  private String name;

  private String secondaryIdentification;

  private OBProxy1 proxy;

  public OBCashAccount51() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBCashAccount51(String schemeName, String identification) {
    this.schemeName = schemeName;
    this.identification = identification;
  }

  public OBCashAccount51 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)
   * @return schemeName
   */
  @NotNull
  @Schema(name = "SchemeName", description = "Name of the identification scheme, in a coded form as published in an external list. <br /> For a full list of enumeration values refer to `OBInternalAccountIdentification4Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_Internal_CodeSets)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SchemeName")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccount51 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Beneficiary account identification.
   * @return identification
   */
  @NotNull
  @Schema(name = "Identification", description = "Beneficiary account identification.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccount51 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.
   * @return name
   */
  
  @Schema(name = "Name", example = "Jane Smith", description = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccount51 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
   * @return secondaryIdentification
   */
  
  @Schema(name = "SecondaryIdentification", example = "87562298675897", description = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SecondaryIdentification")
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }

  public OBCashAccount51 proxy(OBProxy1 proxy) {
    this.proxy = proxy;
    return this;
  }

  /**
   * Get proxy
   * @return proxy
   */
  
  @Schema(name = "Proxy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Proxy")
  public OBProxy1 getProxy() {
    return proxy;
  }

  public void setProxy(OBProxy1 proxy) {
    this.proxy = proxy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashAccount51 obCashAccount51 = (OBCashAccount51) o;
    return Objects.equals(this.schemeName, obCashAccount51.schemeName) &&
        Objects.equals(this.identification, obCashAccount51.identification) &&
        Objects.equals(this.name, obCashAccount51.name) &&
        Objects.equals(this.secondaryIdentification, obCashAccount51.secondaryIdentification) &&
        Objects.equals(this.proxy, obCashAccount51.proxy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification, proxy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashAccount51 {\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
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

