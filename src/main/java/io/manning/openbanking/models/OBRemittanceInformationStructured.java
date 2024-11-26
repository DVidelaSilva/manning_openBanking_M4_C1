package io.manning.openbanking.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.manning.openbanking.models.OBReferredDocumentInformation;
import io.manning.openbanking.models.OBRemittanceInformationStructuredCreditorReferenceInformation;
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
 * OBRemittanceInformationStructured
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-20T16:37:37.728783-03:00[America/Santiago]", comments = "Generator version: 7.10.0")
public class OBRemittanceInformationStructured {

  
  private List<OBReferredDocumentInformation> referredDocumentInformation = new ArrayList<>();

  private Integer referredDocumentAmount;

  private OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation;

  private String invoicer;

  private String invoicee;

  private String taxRemittance;

  
  private List<String> additionalRemittanceInformation = new ArrayList<>();

  public OBRemittanceInformationStructured referredDocumentInformation(List<OBReferredDocumentInformation> referredDocumentInformation) {
    this.referredDocumentInformation = referredDocumentInformation;
    return this;
  }

  public OBRemittanceInformationStructured addReferredDocumentInformationItem(OBReferredDocumentInformation referredDocumentInformationItem) {
    if (this.referredDocumentInformation == null) {
      this.referredDocumentInformation = new ArrayList<>();
    }
    this.referredDocumentInformation.add(referredDocumentInformationItem);
    return this;
  }

  /**
   * Get referredDocumentInformation
   * @return referredDocumentInformation
   */
  
  @Schema(name = "ReferredDocumentInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReferredDocumentInformation")
  public List<OBReferredDocumentInformation> getReferredDocumentInformation() {
    return referredDocumentInformation;
  }

  public void setReferredDocumentInformation(List<OBReferredDocumentInformation> referredDocumentInformation) {
    this.referredDocumentInformation = referredDocumentInformation;
  }

  public OBRemittanceInformationStructured referredDocumentAmount(Integer referredDocumentAmount) {
    this.referredDocumentAmount = referredDocumentAmount;
    return this;
  }

  /**
   * Provides details on the amounts of the referred document.
   * @return referredDocumentAmount
   */
  
  @Schema(name = "ReferredDocumentAmount", description = "Provides details on the amounts of the referred document.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReferredDocumentAmount")
  public Integer getReferredDocumentAmount() {
    return referredDocumentAmount;
  }

  public void setReferredDocumentAmount(Integer referredDocumentAmount) {
    this.referredDocumentAmount = referredDocumentAmount;
  }

  public OBRemittanceInformationStructured creditorReferenceInformation(OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
    this.creditorReferenceInformation = creditorReferenceInformation;
    return this;
  }

  /**
   * Get creditorReferenceInformation
   * @return creditorReferenceInformation
   */
  
  @Schema(name = "CreditorReferenceInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditorReferenceInformation")
  public OBRemittanceInformationStructuredCreditorReferenceInformation getCreditorReferenceInformation() {
    return creditorReferenceInformation;
  }

  public void setCreditorReferenceInformation(OBRemittanceInformationStructuredCreditorReferenceInformation creditorReferenceInformation) {
    this.creditorReferenceInformation = creditorReferenceInformation;
  }

  public OBRemittanceInformationStructured invoicer(String invoicer) {
    this.invoicer = invoicer;
    return this;
  }

  /**
   * Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor
   * @return invoicer
   */
  
  @Schema(name = "Invoicer", example = "80200112344562", description = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Invoicer")
  public String getInvoicer() {
    return invoicer;
  }

  public void setInvoicer(String invoicer) {
    this.invoicer = invoicer;
  }

  public OBRemittanceInformationStructured invoicee(String invoicee) {
    this.invoicee = invoicee;
    return this;
  }

  /**
   * dentification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.
   * @return invoicee
   */
  
  @Schema(name = "Invoicee", example = "80200112344562", description = "dentification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Invoicee")
  public String getInvoicee() {
    return invoicee;
  }

  public void setInvoicee(String invoicee) {
    this.invoicee = invoicee;
  }

  public OBRemittanceInformationStructured taxRemittance(String taxRemittance) {
    this.taxRemittance = taxRemittance;
    return this;
  }

  /**
   * Provides remittance information about a payment made for tax-related purposes.
   * @return taxRemittance
   */
  
  @Schema(name = "TaxRemittance", description = "Provides remittance information about a payment made for tax-related purposes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TaxRemittance")
  public String getTaxRemittance() {
    return taxRemittance;
  }

  public void setTaxRemittance(String taxRemittance) {
    this.taxRemittance = taxRemittance;
  }

  public OBRemittanceInformationStructured additionalRemittanceInformation(List<String> additionalRemittanceInformation) {
    this.additionalRemittanceInformation = additionalRemittanceInformation;
    return this;
  }

  public OBRemittanceInformationStructured addAdditionalRemittanceInformationItem(String additionalRemittanceInformationItem) {
    if (this.additionalRemittanceInformation == null) {
      this.additionalRemittanceInformation = new ArrayList<>();
    }
    this.additionalRemittanceInformation.add(additionalRemittanceInformationItem);
    return this;
  }

  /**
   * Additional information, in free text form, to complement the structured remittance information.
   * @return additionalRemittanceInformation
   */
  
  @Schema(name = "AdditionalRemittanceInformation", description = "Additional information, in free text form, to complement the structured remittance information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AdditionalRemittanceInformation")
  public List<String> getAdditionalRemittanceInformation() {
    return additionalRemittanceInformation;
  }

  public void setAdditionalRemittanceInformation(List<String> additionalRemittanceInformation) {
    this.additionalRemittanceInformation = additionalRemittanceInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBRemittanceInformationStructured obRemittanceInformationStructured = (OBRemittanceInformationStructured) o;
    return Objects.equals(this.referredDocumentInformation, obRemittanceInformationStructured.referredDocumentInformation) &&
        Objects.equals(this.referredDocumentAmount, obRemittanceInformationStructured.referredDocumentAmount) &&
        Objects.equals(this.creditorReferenceInformation, obRemittanceInformationStructured.creditorReferenceInformation) &&
        Objects.equals(this.invoicer, obRemittanceInformationStructured.invoicer) &&
        Objects.equals(this.invoicee, obRemittanceInformationStructured.invoicee) &&
        Objects.equals(this.taxRemittance, obRemittanceInformationStructured.taxRemittance) &&
        Objects.equals(this.additionalRemittanceInformation, obRemittanceInformationStructured.additionalRemittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredDocumentInformation, referredDocumentAmount, creditorReferenceInformation, invoicer, invoicee, taxRemittance, additionalRemittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBRemittanceInformationStructured {\n");
    sb.append("    referredDocumentInformation: ").append(toIndentedString(referredDocumentInformation)).append("\n");
    sb.append("    referredDocumentAmount: ").append(toIndentedString(referredDocumentAmount)).append("\n");
    sb.append("    creditorReferenceInformation: ").append(toIndentedString(creditorReferenceInformation)).append("\n");
    sb.append("    invoicer: ").append(toIndentedString(invoicer)).append("\n");
    sb.append("    invoicee: ").append(toIndentedString(invoicee)).append("\n");
    sb.append("    taxRemittance: ").append(toIndentedString(taxRemittance)).append("\n");
    sb.append("    additionalRemittanceInformation: ").append(toIndentedString(additionalRemittanceInformation)).append("\n");
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

