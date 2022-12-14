/*
 * Open Education API
 * OpenAPI (fka Swagger) specification for the Open Education API.  <figure>  <a target=\"_blank\" href=\"OOAPIv5_model.png\">   <img src=\"OOAPIv5_model.png\" alt=\"OOAPI information model that feeds OOAPI specification\" width=\"70%\" class=\"img-responsive\">   </a>   <figcaption> OOAPI information model that feeds OOAPI specification (click to enlage)</figcaption> </figure>  The model provides an overview of how the objects on which the API is specified are related. The overarching concept educations is not found in the in the end points of the API. The smaller concepts of programOffering, courseOffering and conceptOffering are all found in the offering endpoint. The different types of association can all be found in the association endpoint.  The original file for this model can be found <a target=\"_blank\" href=\"OOAPIv5_model_v0.4.drawio\">here</a>  The program relations object is not found as a separate endpoint but relations between programs can be found within the program endpoint by expanding that endpoint.  Information about earlier meetings and presentations can be found <a target=\"_blank\" href=\"https://github.com/open-education-api/notulen\">here</a>  Information on the EDU-API model that was also used for this api is shown <a target=\"_blank\" href=\"eduapi.png\">here</a>
 *
 * The version of the OpenAPI document: 5.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package nl.vorsen.ooapi.v5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ProgramOfferingAllOf
 */
@JsonPropertyOrder({
        ProgramOfferingAllOf.JSON_PROPERTY_START_DATE,
        ProgramOfferingAllOf.JSON_PROPERTY_END_DATE,
        ProgramOfferingAllOf.JSON_PROPERTY_ENROLL_START_DATE,
        ProgramOfferingAllOf.JSON_PROPERTY_ENROLL_END_DATE,
        ProgramOfferingAllOf.JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START,
        ProgramOfferingAllOf.JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END,
        ProgramOfferingAllOf.JSON_PROPERTY_ADDRESSES,
        ProgramOfferingAllOf.JSON_PROPERTY_PRICE_INFORMATION,
        ProgramOfferingAllOf.JSON_PROPERTY_PROGRAM,
        ProgramOfferingAllOf.JSON_PROPERTY_ORGANIZATION,
        ProgramOfferingAllOf.JSON_PROPERTY_ACADEMIC_SESSION
})
@JsonTypeName("ProgramOffering_allOf")

public class ProgramOfferingAllOf {
    public static final String JSON_PROPERTY_START_DATE = "startDate";
    public static final String JSON_PROPERTY_END_DATE = "endDate";
    public static final String JSON_PROPERTY_ENROLL_START_DATE = "enrollStartDate";
    public static final String JSON_PROPERTY_ENROLL_END_DATE = "enrollEndDate";
    public static final String JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START = "flexibleEntryPeriodStart";
    public static final String JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END = "flexibleEntryPeriodEnd";
    public static final String JSON_PROPERTY_ADDRESSES = "addresses";
    public static final String JSON_PROPERTY_PRICE_INFORMATION = "priceInformation";
    public static final String JSON_PROPERTY_PROGRAM = "program";
    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    public static final String JSON_PROPERTY_ACADEMIC_SESSION = "academicSession";
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate enrollStartDate;
    private LocalDate enrollEndDate;
    private LocalDate flexibleEntryPeriodStart;
    private LocalDate flexibleEntryPeriodEnd;
    private List<Address> addresses = null;
    private List<Cost> priceInformation = null;
    private String program;
    private String organization;
    private String academicSession;

    public ProgramOfferingAllOf() {
    }

    public ProgramOfferingAllOf startDate(LocalDate startDate) {

        this.startDate = startDate;
        return this;
    }

    /**
     * The moment on which this offering starts, RFC3339 (full-date)
     * @return startDate
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public LocalDate getStartDate() {
        return startDate;
    }

    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public ProgramOfferingAllOf endDate(LocalDate endDate) {

        this.endDate = endDate;
        return this;
    }

    /**
     * The moment on which this offering ends, RFC3339 (full-date)
     * @return endDate
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public LocalDate getEndDate() {
        return endDate;
    }

    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ProgramOfferingAllOf enrollStartDate(LocalDate enrollStartDate) {

        this.enrollStartDate = enrollStartDate;
        return this;
    }

    /**
     * The first day on which a student can enroll for this program.
     * @return enrollStartDate
     **/

    @JsonProperty(JSON_PROPERTY_ENROLL_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getEnrollStartDate() {
        return enrollStartDate;
    }

    @JsonProperty(JSON_PROPERTY_ENROLL_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnrollStartDate(LocalDate enrollStartDate) {
        this.enrollStartDate = enrollStartDate;
    }

    public ProgramOfferingAllOf enrollEndDate(LocalDate enrollEndDate) {

        this.enrollEndDate = enrollEndDate;
        return this;
    }

    /**
     * The last day on which a student can enroll for this program.
     * @return enrollEndDate
     **/

    @JsonProperty(JSON_PROPERTY_ENROLL_END_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getEnrollEndDate() {
        return enrollEndDate;
    }

    @JsonProperty(JSON_PROPERTY_ENROLL_END_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnrollEndDate(LocalDate enrollEndDate) {
        this.enrollEndDate = enrollEndDate;
    }

    public ProgramOfferingAllOf flexibleEntryPeriodStart(LocalDate flexibleEntryPeriodStart) {

        this.flexibleEntryPeriodStart = flexibleEntryPeriodStart;
        return this;
    }

    /**
     * If this is a program wherein participants can start at various moments, without missing anything, use this attribute in combination with &#x60;flexibleEntryPeriodEnd&#x60;.
     * @return flexibleEntryPeriodStart
     **/

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getFlexibleEntryPeriodStart() {
        return flexibleEntryPeriodStart;
    }

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFlexibleEntryPeriodStart(LocalDate flexibleEntryPeriodStart) {
        this.flexibleEntryPeriodStart = flexibleEntryPeriodStart;
    }

    public ProgramOfferingAllOf flexibleEntryPeriodEnd(LocalDate flexibleEntryPeriodEnd) {

        this.flexibleEntryPeriodEnd = flexibleEntryPeriodEnd;
        return this;
    }

    /**
     * If this is a program wherein participants can start at various moments, without missing anything, use this attribute in combination with &#x60;flexibleEntryPeriodStart&#x60;.
     * @return flexibleEntryPeriodEnd
     **/

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getFlexibleEntryPeriodEnd() {
        return flexibleEntryPeriodEnd;
    }

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFlexibleEntryPeriodEnd(LocalDate flexibleEntryPeriodEnd) {
        this.flexibleEntryPeriodEnd = flexibleEntryPeriodEnd;
    }

    public ProgramOfferingAllOf addresses(List<Address> addresses) {

        this.addresses = addresses;
        return this;
    }

    public ProgramOfferingAllOf addAddressesItem(Address addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
     * Addresses for this offering
     * @return addresses
     **/

    @JsonProperty(JSON_PROPERTY_ADDRESSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public ProgramOfferingAllOf priceInformation(List<Cost> priceInformation) {

        this.priceInformation = priceInformation;
        return this;
    }

    public ProgramOfferingAllOf addPriceInformationItem(Cost priceInformationItem) {
        if (this.priceInformation == null) {
            this.priceInformation = new ArrayList<>();
        }
        this.priceInformation.add(priceInformationItem);
        return this;
    }

    /**
     * Price information for this offering.
     * @return priceInformation
     **/

    @JsonProperty(JSON_PROPERTY_PRICE_INFORMATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<Cost> getPriceInformation() {
        return priceInformation;
    }

    @JsonProperty(JSON_PROPERTY_PRICE_INFORMATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPriceInformation(List<Cost> priceInformation) {
        this.priceInformation = priceInformation;
    }

    public ProgramOfferingAllOf program(String program) {

        this.program = program;
        return this;
    }

    /**
     * The Program that is offered in this programoffering. [&#x60;expandable&#x60;](#tag/program_model) By default only the &#x60;programId&#x60; (a string) is returned. If the client requested an expansion of &#x60;program&#x60; the full program object should be returned.
     * @return program
     **/

    @JsonProperty(JSON_PROPERTY_PROGRAM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProgram() {
        return program;
    }

    @JsonProperty(JSON_PROPERTY_PROGRAM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProgram(String program) {
        this.program = program;
    }

    public ProgramOfferingAllOf organization(String organization) {

        this.organization = organization;
        return this;
    }

    /**
     * The organization that manages this programeoffering. [&#x60;expandable&#x60;](#tag/organization_model) By default only the &#x60;organizationId&#x60; (a string) is returned. If the client requested an expansion of &#x60;organization&#x60; the full organization object should be returned.
     * @return organization
     **/

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOrganization() {
        return organization;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public ProgramOfferingAllOf academicSession(String academicSession) {

        this.academicSession = academicSession;
        return this;
    }

    /**
     * The academicsession during which this programoffering takes place. [&#x60;expandable&#x60;](#tag/academic_session_model) By default only the &#x60;academicSessionId&#x60; (a string) is returned. If the client requested an expansion of &#x60;academicSession&#x60; the full academicsession object should be returned.
     * @return academicSession
     **/

    @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getAcademicSession() {
        return academicSession;
    }

    @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAcademicSession(String academicSession) {
        this.academicSession = academicSession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgramOfferingAllOf programOfferingAllOf = (ProgramOfferingAllOf) o;
        return Objects.equals(this.startDate, programOfferingAllOf.startDate) &&
                Objects.equals(this.endDate, programOfferingAllOf.endDate) &&
                Objects.equals(this.enrollStartDate, programOfferingAllOf.enrollStartDate) &&
                Objects.equals(this.enrollEndDate, programOfferingAllOf.enrollEndDate) &&
                Objects.equals(this.flexibleEntryPeriodStart, programOfferingAllOf.flexibleEntryPeriodStart) &&
                Objects.equals(this.flexibleEntryPeriodEnd, programOfferingAllOf.flexibleEntryPeriodEnd) &&
                Objects.equals(this.addresses, programOfferingAllOf.addresses) &&
                Objects.equals(this.priceInformation, programOfferingAllOf.priceInformation) &&
                Objects.equals(this.program, programOfferingAllOf.program) &&
                Objects.equals(this.organization, programOfferingAllOf.organization) &&
                Objects.equals(this.academicSession, programOfferingAllOf.academicSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, enrollStartDate, enrollEndDate, flexibleEntryPeriodStart, flexibleEntryPeriodEnd, addresses, priceInformation,
                program, organization, academicSession);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgramOfferingAllOf {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    enrollStartDate: ").append(toIndentedString(enrollStartDate)).append("\n");
        sb.append("    enrollEndDate: ").append(toIndentedString(enrollEndDate)).append("\n");
        sb.append("    flexibleEntryPeriodStart: ").append(toIndentedString(flexibleEntryPeriodStart)).append("\n");
        sb.append("    flexibleEntryPeriodEnd: ").append(toIndentedString(flexibleEntryPeriodEnd)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    priceInformation: ").append(toIndentedString(priceInformation)).append("\n");
        sb.append("    program: ").append(toIndentedString(program)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    academicSession: ").append(toIndentedString(academicSession)).append("\n");
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

