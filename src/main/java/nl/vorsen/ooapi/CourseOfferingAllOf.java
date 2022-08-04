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


package nl.vorsen.ooapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CourseOfferingAllOf
 */
@JsonPropertyOrder({
  CourseOfferingAllOf.JSON_PROPERTY_START_DATE,
  CourseOfferingAllOf.JSON_PROPERTY_END_DATE,
  CourseOfferingAllOf.JSON_PROPERTY_ENROLL_START_DATE,
  CourseOfferingAllOf.JSON_PROPERTY_ENROLL_END_DATE,
  CourseOfferingAllOf.JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START,
  CourseOfferingAllOf.JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END,
  CourseOfferingAllOf.JSON_PROPERTY_ADDRESSES,
  CourseOfferingAllOf.JSON_PROPERTY_PRICE_INFORMATION,
  CourseOfferingAllOf.JSON_PROPERTY_COURSE,
  CourseOfferingAllOf.JSON_PROPERTY_PROGRAM_OFFERING,
  CourseOfferingAllOf.JSON_PROPERTY_ORGANIZATION,
  CourseOfferingAllOf.JSON_PROPERTY_ACADEMIC_SESSION
})
@JsonTypeName("CourseOffering_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T11:38:05.422668+02:00[Europe/Amsterdam]")
public class CourseOfferingAllOf {
  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private LocalDate endDate;

  public static final String JSON_PROPERTY_ENROLL_START_DATE = "enrollStartDate";
  private LocalDate enrollStartDate;

  public static final String JSON_PROPERTY_ENROLL_END_DATE = "enrollEndDate";
  private LocalDate enrollEndDate;

  public static final String JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START = "flexibleEntryPeriodStart";
  private LocalDate flexibleEntryPeriodStart;

  public static final String JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END = "flexibleEntryPeriodEnd";
  private LocalDate flexibleEntryPeriodEnd;

  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<Address> addresses = null;

  public static final String JSON_PROPERTY_PRICE_INFORMATION = "priceInformation";
  private List<Cost> priceInformation = null;

  public static final String JSON_PROPERTY_COURSE = "course";
  private String course;

  public static final String JSON_PROPERTY_PROGRAM_OFFERING = "programOffering";
  private String programOffering;

  public static final String JSON_PROPERTY_ORGANIZATION = "organization";
  private String organization;

  public static final String JSON_PROPERTY_ACADEMIC_SESSION = "academicSession";
  private String academicSession;

  public CourseOfferingAllOf() { 
  }

  public CourseOfferingAllOf startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The moment on which this offering starts, RFC3339 (full-date)
   * @return startDate
  **/
  @NotNull
  @ApiModelProperty(example = "Wed Aug 21 02:00:00 CEST 2019", required = true, value = "The moment on which this offering starts, RFC3339 (full-date)")
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


  public CourseOfferingAllOf endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The moment on which this offering ends, RFC3339 (full-date)
   * @return endDate
  **/
  @NotNull
  @ApiModelProperty(example = "Wed Oct 23 02:00:00 CEST 2019", required = true, value = "The moment on which this offering ends, RFC3339 (full-date)")
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


  public CourseOfferingAllOf enrollStartDate(LocalDate enrollStartDate) {
    
    this.enrollStartDate = enrollStartDate;
    return this;
  }

   /**
   * The first day on which a student can enroll for this course.
   * @return enrollStartDate
  **/
 
  @ApiModelProperty(example = "Wed May 01 02:00:00 CEST 2019", value = "The first day on which a student can enroll for this course.")
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


  public CourseOfferingAllOf enrollEndDate(LocalDate enrollEndDate) {
    
    this.enrollEndDate = enrollEndDate;
    return this;
  }

   /**
   * The last day on which a student can enroll for this course.
   * @return enrollEndDate
  **/
 
  @ApiModelProperty(example = "Thu Aug 01 02:00:00 CEST 2019", value = "The last day on which a student can enroll for this course.")
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


  public CourseOfferingAllOf flexibleEntryPeriodStart(LocalDate flexibleEntryPeriodStart) {
    
    this.flexibleEntryPeriodStart = flexibleEntryPeriodStart;
    return this;
  }

   /**
   * If this is a course wherein participants can start at various moments, without missing anything, use this attribute in combination with &#x60;flexibleEntryPeriodEnd&#x60;.
   * @return flexibleEntryPeriodStart
  **/
 
  @ApiModelProperty(value = "If this is a course wherein participants can start at various moments, without missing anything, use this attribute in combination with `flexibleEntryPeriodEnd`.")
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


  public CourseOfferingAllOf flexibleEntryPeriodEnd(LocalDate flexibleEntryPeriodEnd) {
    
    this.flexibleEntryPeriodEnd = flexibleEntryPeriodEnd;
    return this;
  }

   /**
   * If this is a course wherein participants can start at various moments, without missing anything, use this attribute in combination with &#x60;flexibleEntryPeriodStart&#x60;.
   * @return flexibleEntryPeriodEnd
  **/
 
  @ApiModelProperty(value = "If this is a course wherein participants can start at various moments, without missing anything, use this attribute in combination with `flexibleEntryPeriodStart`.")
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


  public CourseOfferingAllOf addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CourseOfferingAllOf addAddressesItem(Address addressesItem) {
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
 
  @ApiModelProperty(value = "Addresses for this offering")
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


  public CourseOfferingAllOf priceInformation(List<Cost> priceInformation) {
    
    this.priceInformation = priceInformation;
    return this;
  }

  public CourseOfferingAllOf addPriceInformationItem(Cost priceInformationItem) {
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
 
  @ApiModelProperty(value = "Price information for this offering.")
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


  public CourseOfferingAllOf course(String course) {
    
    this.course = course;
    return this;
  }

   /**
   * The course that is offered in this courseoffering. [&#x60;expandable&#x60;](#tag/course_model) By default only the &#x60;courseId&#x60; (a string) is returned. If the client requested an expansion of &#x60;course&#x60; the full course object should be returned. 
   * @return course
  **/
 
  @ApiModelProperty(value = "The course that is offered in this courseoffering. [`expandable`](#tag/course_model) By default only the `courseId` (a string) is returned. If the client requested an expansion of `course` the full course object should be returned. ")
  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCourse() {
    return course;
  }


  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourse(String course) {
    this.course = course;
  }


  public CourseOfferingAllOf programOffering(String programOffering) {
    
    this.programOffering = programOffering;
    return this;
  }

   /**
   * The programoffering where this courseoffering is related to. [&#x60;expandable&#x60;](#tag/program_offering_model) By default only the &#x60;programOfferingId&#x60; (a string) is returned. If the client requested an expansion of &#x60;programOffering&#x60; the full programOffering object should be returned. 
   * @return programOffering
  **/
 
  @ApiModelProperty(value = "The programoffering where this courseoffering is related to. [`expandable`](#tag/program_offering_model) By default only the `programOfferingId` (a string) is returned. If the client requested an expansion of `programOffering` the full programOffering object should be returned. ")
  @JsonProperty(JSON_PROPERTY_PROGRAM_OFFERING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProgramOffering() {
    return programOffering;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAM_OFFERING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgramOffering(String programOffering) {
    this.programOffering = programOffering;
  }


  public CourseOfferingAllOf organization(String organization) {
    
    this.organization = organization;
    return this;
  }

   /**
   * The organization that manages this courseoffering. [&#x60;expandable&#x60;](#tag/organization_model) By default only the &#x60;organizationId&#x60; (a string) is returned. If the client requested an expansion of &#x60;organization&#x60; the full organization object should be returned. 
   * @return organization
  **/
 
  @ApiModelProperty(value = "The organization that manages this courseoffering. [`expandable`](#tag/organization_model) By default only the `organizationId` (a string) is returned. If the client requested an expansion of `organization` the full organization object should be returned. ")
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


  public CourseOfferingAllOf academicSession(String academicSession) {
    
    this.academicSession = academicSession;
    return this;
  }

   /**
   * The academicsession during which this courseoffering takes place. [&#x60;expandable&#x60;](#tag/academic_session_model) By default only the &#x60;academicSessionId&#x60; (a string) is returned. If the client requested an expansion of &#x60;academicSession&#x60; the full academicsession object should be returned. 
   * @return academicSession
  **/
 
  @ApiModelProperty(value = "The academicsession during which this courseoffering takes place. [`expandable`](#tag/academic_session_model) By default only the `academicSessionId` (a string) is returned. If the client requested an expansion of `academicSession` the full academicsession object should be returned. ")
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
    CourseOfferingAllOf courseOfferingAllOf = (CourseOfferingAllOf) o;
    return Objects.equals(this.startDate, courseOfferingAllOf.startDate) &&
        Objects.equals(this.endDate, courseOfferingAllOf.endDate) &&
        Objects.equals(this.enrollStartDate, courseOfferingAllOf.enrollStartDate) &&
        Objects.equals(this.enrollEndDate, courseOfferingAllOf.enrollEndDate) &&
        Objects.equals(this.flexibleEntryPeriodStart, courseOfferingAllOf.flexibleEntryPeriodStart) &&
        Objects.equals(this.flexibleEntryPeriodEnd, courseOfferingAllOf.flexibleEntryPeriodEnd) &&
        Objects.equals(this.addresses, courseOfferingAllOf.addresses) &&
        Objects.equals(this.priceInformation, courseOfferingAllOf.priceInformation) &&
        Objects.equals(this.course, courseOfferingAllOf.course) &&
        Objects.equals(this.programOffering, courseOfferingAllOf.programOffering) &&
        Objects.equals(this.organization, courseOfferingAllOf.organization) &&
        Objects.equals(this.academicSession, courseOfferingAllOf.academicSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, enrollStartDate, enrollEndDate, flexibleEntryPeriodStart, flexibleEntryPeriodEnd, addresses, priceInformation, course, programOffering, organization, academicSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourseOfferingAllOf {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    enrollStartDate: ").append(toIndentedString(enrollStartDate)).append("\n");
    sb.append("    enrollEndDate: ").append(toIndentedString(enrollEndDate)).append("\n");
    sb.append("    flexibleEntryPeriodStart: ").append(toIndentedString(flexibleEntryPeriodStart)).append("\n");
    sb.append("    flexibleEntryPeriodEnd: ").append(toIndentedString(flexibleEntryPeriodEnd)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    priceInformation: ").append(toIndentedString(priceInformation)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    programOffering: ").append(toIndentedString(programOffering)).append("\n");
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

