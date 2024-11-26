package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.manning.openbanking.models.OBStatusReason;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OBReadConsentResponse1Data
 */

@JsonTypeName("OBReadConsentResponse1_Data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBReadConsentResponse1Data {

  private String consentId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creationDateTime;

  /**
   * Specifies the status of consent resource in code form.
   */
  public enum StatusEnum {
    AWAU("AWAU"),
    
    RJCT("RJCT"),
    
    AUTH("AUTH"),
    
    EXPD("EXPD"),
    
    CANC("CANC");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  
  private List<OBStatusReason> statusReason = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime statusUpdateDateTime;

  /**
   * Specifies the Open Banking account access data types. <br /> This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP. <br /> For a full list of enumeration values refer to `OBInternalPermissions1Code` in *OB_Internal_CodeSet* [here](https://github.com/OpenBankingUK/External_internal_CodeSets)
   */
  public enum PermissionsEnum {
    READ_ACCOUNTS_BASIC("ReadAccountsBasic"),
    
    READ_ACCOUNTS_DETAIL("ReadAccountsDetail"),
    
    READ_BALANCES("ReadBalances"),
    
    READ_BENEFICIARIES_BASIC("ReadBeneficiariesBasic"),
    
    READ_BENEFICIARIES_DETAIL("ReadBeneficiariesDetail"),
    
    READ_DIRECT_DEBITS("ReadDirectDebits"),
    
    READ_OFFERS("ReadOffers"),
    
    READ_PAN("ReadPAN"),
    
    READ_PARTY("ReadParty"),
    
    READ_PARTY_PSU("ReadPartyPSU"),
    
    READ_PRODUCTS("ReadProducts"),
    
    READ_SCHEDULED_PAYMENTS_BASIC("ReadScheduledPaymentsBasic"),
    
    READ_SCHEDULED_PAYMENTS_DETAIL("ReadScheduledPaymentsDetail"),
    
    READ_STANDING_ORDERS_BASIC("ReadStandingOrdersBasic"),
    
    READ_STANDING_ORDERS_DETAIL("ReadStandingOrdersDetail"),
    
    READ_STATEMENTS_BASIC("ReadStatementsBasic"),
    
    READ_STATEMENTS_DETAIL("ReadStatementsDetail"),
    
    READ_TRANSACTIONS_BASIC("ReadTransactionsBasic"),
    
    READ_TRANSACTIONS_CREDITS("ReadTransactionsCredits"),
    
    READ_TRANSACTIONS_DEBITS("ReadTransactionsDebits"),
    
    READ_TRANSACTIONS_DETAIL("ReadTransactionsDetail");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  
  private List<PermissionsEnum> permissions = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionFromDateTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime transactionToDateTime;

  public OBReadConsentResponse1Data() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OBReadConsentResponse1Data(String consentId, OffsetDateTime creationDateTime, StatusEnum status, OffsetDateTime statusUpdateDateTime, List<PermissionsEnum> permissions) {
    this.consentId = consentId;
    this.creationDateTime = creationDateTime;
    this.status = status;
    this.statusUpdateDateTime = statusUpdateDateTime;
    this.permissions = permissions;
  }

  public OBReadConsentResponse1Data consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Unique identification as assigned to identify the account access consent resource.
   * @return consentId
   */
  @NotNull
  @Schema(name = "ConsentId", description = "Unique identification as assigned to identify the account access consent resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ConsentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public OBReadConsentResponse1Data creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
   */
  @NotNull
  @Schema(name = "CreationDateTime", example = "2024-05-29T00:00Z", description = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreationDateTime")
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBReadConsentResponse1Data status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Specifies the status of consent resource in code form.
   * @return status
   */
  @NotNull
  @Schema(name = "Status", description = "Specifies the status of consent resource in code form.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OBReadConsentResponse1Data statusReason(List<OBStatusReason> statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  public OBReadConsentResponse1Data addStatusReasonItem(OBStatusReason statusReasonItem) {
    if (this.statusReason == null) {
      this.statusReason = new ArrayList<>();
    }
    this.statusReason.add(statusReasonItem);
    return this;
  }

  /**
   * Specifies the status reason.
   * @return statusReason
   */
  
  @Schema(name = "StatusReason", description = "Specifies the status reason.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StatusReason")
  public List<OBStatusReason> getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(List<OBStatusReason> statusReason) {
    this.statusReason = statusReason;
  }

  public OBReadConsentResponse1Data statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

  /**
   * Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
   */
  @NotNull
  @Schema(name = "StatusUpdateDateTime", description = "Date and time at which the resource status was updated. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("StatusUpdateDateTime")
  public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }

  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    this.statusUpdateDateTime = statusUpdateDateTime;
  }

  public OBReadConsentResponse1Data permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public OBReadConsentResponse1Data addPermissionsItem(PermissionsEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @NotNull
  @Schema(name = "Permissions", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Permissions")
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public OBReadConsentResponse1Data expirationDateTime(OffsetDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
    return this;
  }

  /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return expirationDateTime
   */
  
  @Schema(name = "ExpirationDateTime", description = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExpirationDateTime")
  public OffsetDateTime getExpirationDateTime() {
    return expirationDateTime;
  }

  public void setExpirationDateTime(OffsetDateTime expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  public OBReadConsentResponse1Data transactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
    return this;
  }

  /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionFromDateTime
   */
  
  @Schema(name = "TransactionFromDateTime", description = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TransactionFromDateTime")
  public OffsetDateTime getTransactionFromDateTime() {
    return transactionFromDateTime;
  }

  public void setTransactionFromDateTime(OffsetDateTime transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
  }

  public OBReadConsentResponse1Data transactionToDateTime(OffsetDateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
    return this;
  }

  /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return transactionToDateTime
   */
  
  @Schema(name = "TransactionToDateTime", description = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TransactionToDateTime")
  public OffsetDateTime getTransactionToDateTime() {
    return transactionToDateTime;
  }

  public void setTransactionToDateTime(OffsetDateTime transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadConsentResponse1Data obReadConsentResponse1Data = (OBReadConsentResponse1Data) o;
    return Objects.equals(this.consentId, obReadConsentResponse1Data.consentId) &&
        Objects.equals(this.creationDateTime, obReadConsentResponse1Data.creationDateTime) &&
        Objects.equals(this.status, obReadConsentResponse1Data.status) &&
        Objects.equals(this.statusReason, obReadConsentResponse1Data.statusReason) &&
        Objects.equals(this.statusUpdateDateTime, obReadConsentResponse1Data.statusUpdateDateTime) &&
        Objects.equals(this.permissions, obReadConsentResponse1Data.permissions) &&
        Objects.equals(this.expirationDateTime, obReadConsentResponse1Data.expirationDateTime) &&
        Objects.equals(this.transactionFromDateTime, obReadConsentResponse1Data.transactionFromDateTime) &&
        Objects.equals(this.transactionToDateTime, obReadConsentResponse1Data.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, creationDateTime, status, statusReason, statusUpdateDateTime, permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadConsentResponse1Data {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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

