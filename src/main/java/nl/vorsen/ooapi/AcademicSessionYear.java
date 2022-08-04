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
import java.util.UUID;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The top level year of this session (e.g. 20xx where the current session is a week 40 of a semester). This object is [&#x60;expandable&#x60;](#tag/academic_sessions_model)
 */
@ApiModel(description = "The top level year of this session (e.g. 20xx where the current session is a week 40 of a semester). This object is [`expandable`](#tag/academic_sessions_model)")
@JsonPropertyOrder({
  AcademicSessionYear.JSON_PROPERTY_ACADEMIC_SESSION_ID,
  AcademicSessionYear.JSON_PROPERTY_ACADEMIC_SESSION_TYPE,
  AcademicSessionYear.JSON_PROPERTY_PRIMARY_CODE,
  AcademicSessionYear.JSON_PROPERTY_NAME,
  AcademicSessionYear.JSON_PROPERTY_START_DATE,
  AcademicSessionYear.JSON_PROPERTY_END_DATE,
  AcademicSessionYear.JSON_PROPERTY_PARENT,
  AcademicSessionYear.JSON_PROPERTY_CHILDREN,
  AcademicSessionYear.JSON_PROPERTY_YEAR,
  AcademicSessionYear.JSON_PROPERTY_OTHER_CODES,
  AcademicSessionYear.JSON_PROPERTY_CONSUMERS,
  AcademicSessionYear.JSON_PROPERTY_EXT
})
@JsonTypeName("AcademicSession_year")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:55:03.988058+02:00[Europe/Amsterdam]")
public class AcademicSessionYear {
  public static final String JSON_PROPERTY_ACADEMIC_SESSION_ID = "academicSessionId";
  private UUID academicSessionId;

  public static final String JSON_PROPERTY_ACADEMIC_SESSION_TYPE = "academicSessionType";
  private String academicSessionType;

  public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
  private IdentifierEntry primaryCode;

  public static final String JSON_PROPERTY_NAME = "name";
  private List<LanguageTypedString> name = new ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private LocalDate startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private LocalDate endDate;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private AcademicSessionParent parent;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<AcademicSessionChildrenInner> children = null;

  public static final String JSON_PROPERTY_YEAR = "year";
  private AcademicSessionYear year;

  public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
  private List<IdentifierEntry> otherCodes = null;

  public static final String JSON_PROPERTY_CONSUMERS = "consumers";
  private List<Consumer> consumers = null;

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public AcademicSessionYear() { 
  }

  @JsonCreator
  public AcademicSessionYear(
    @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION_ID) UUID academicSessionId
  ) {
    this();
    this.academicSessionId = academicSessionId;
  }

   /**
   * Unique id for this academic session
   * @return academicSessionId
  **/
  @NotNull
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", required = true, value = "Unique id for this academic session")
  @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getAcademicSessionId() {
    return academicSessionId;
  }




  public AcademicSessionYear academicSessionType(String academicSessionType) {
    
    this.academicSessionType = academicSessionType;
    return this;
  }

   /**
   * The type of this Academic Session This is an *extensible enumeration*. - academic year: academic year - semester: semester, typically there are two semesters per academic year - trimester: trimester, typically there are three semesters per academic year - quarter: quarter, typically there are four quarters per academic year - testing period: a period in which tests take place - period: any other period in an academic year  Implementations are allowed to add additional values to those above, as long as they do not overlap in definition to existing values. 
   * @return academicSessionType
  **/
  
  @ApiModelProperty(example = "semester", value = "The type of this Academic Session This is an *extensible enumeration*. - academic year: academic year - semester: semester, typically there are two semesters per academic year - trimester: trimester, typically there are three semesters per academic year - quarter: quarter, typically there are four quarters per academic year - testing period: a period in which tests take place - period: any other period in an academic year  Implementations are allowed to add additional values to those above, as long as they do not overlap in definition to existing values. ")
  @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcademicSessionType() {
    return academicSessionType;
  }


  @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcademicSessionType(String academicSessionType) {
    this.academicSessionType = academicSessionType;
  }


  public AcademicSessionYear primaryCode(IdentifierEntry primaryCode) {
    
    this.primaryCode = primaryCode;
    return this;
  }

   /**
   * Get primaryCode
   * @return primaryCode
  **/
  
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentifierEntry getPrimaryCode() {
    return primaryCode;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryCode(IdentifierEntry primaryCode) {
    this.primaryCode = primaryCode;
  }


  public AcademicSessionYear name(List<LanguageTypedString> name) {
    
    this.name = name;
    return this;
  }

  public AcademicSessionYear addNameItem(LanguageTypedString nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * The name of this academic session
   * @return name
  **/
  @NotNull
  @ApiModelProperty(example = "[{language=en-GB, value=Fall semester 2020}]", required = true, value = "The name of this academic session")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LanguageTypedString> getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(List<LanguageTypedString> name) {
    this.name = name;
  }


  public AcademicSessionYear startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The day on which this academic session starts, RFC3339 (full-date)
   * @return startDate
  **/
  @NotNull
  @ApiModelProperty(example = "Mon Aug 17 02:00:00 CEST 2020", required = true, value = "The day on which this academic session starts, RFC3339 (full-date)")
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


  public AcademicSessionYear endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The day on which this academic session ends, RFC3339 (full-date)
   * @return endDate
  **/
  @NotNull
  @ApiModelProperty(example = "Fri Dec 18 01:00:00 CET 2020", required = true, value = "The day on which this academic session ends, RFC3339 (full-date)")
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


  public AcademicSessionYear parent(AcademicSessionParent parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AcademicSessionParent getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(AcademicSessionParent parent) {
    this.parent = parent;
  }


  public AcademicSessionYear children(List<AcademicSessionChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public AcademicSessionYear addChildrenItem(AcademicSessionChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * The list of Academicsession children of this Session (e.g. all academic sessions in fall semester 20xx). This object is [&#x60;expandable&#x60;](#tag/academic_sessions_model)
   * @return children
  **/
  
  @ApiModelProperty(value = "The list of Academicsession children of this Session (e.g. all academic sessions in fall semester 20xx). This object is [`expandable`](#tag/academic_sessions_model)")
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AcademicSessionChildrenInner> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<AcademicSessionChildrenInner> children) {
    this.children = children;
  }


  public AcademicSessionYear year(AcademicSessionYear year) {
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AcademicSessionYear getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(AcademicSessionYear year) {
    this.year = year;
  }


  public AcademicSessionYear otherCodes(List<IdentifierEntry> otherCodes) {
    
    this.otherCodes = otherCodes;
    return this;
  }

  public AcademicSessionYear addOtherCodesItem(IdentifierEntry otherCodesItem) {
    if (this.otherCodes == null) {
      this.otherCodes = new ArrayList<>();
    }
    this.otherCodes.add(otherCodesItem);
    return this;
  }

   /**
   * An array of additional human readable codes/identifiers for the entity being described.
   * @return otherCodes
  **/
  
  @ApiModelProperty(value = "An array of additional human readable codes/identifiers for the entity being described.")
  @JsonProperty(JSON_PROPERTY_OTHER_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<IdentifierEntry> getOtherCodes() {
    return otherCodes;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOtherCodes(List<IdentifierEntry> otherCodes) {
    this.otherCodes = otherCodes;
  }


  public AcademicSessionYear consumers(List<Consumer> consumers) {
    
    this.consumers = consumers;
    return this;
  }

  public AcademicSessionYear addConsumersItem(Consumer consumersItem) {
    if (this.consumers == null) {
      this.consumers = new ArrayList<>();
    }
    this.consumers.add(consumersItem);
    return this;
  }

   /**
   * The additional consumer elements that can be provided, see the [documentation on support for specific consumers](https://open-education-api.github.io/specification/#/consumers) for more information about this mechanism.
   * @return consumers
  **/
  
  @ApiModelProperty(example = "{$ref=../consumers/TEST/V1/examples/TestConsumer.yaml}", value = "The additional consumer elements that can be provided, see the [documentation on support for specific consumers](https://open-education-api.github.io/specification/#/consumers) for more information about this mechanism.")
  @JsonProperty(JSON_PROPERTY_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Consumer> getConsumers() {
    return consumers;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumers(List<Consumer> consumers) {
    this.consumers = consumers;
  }


  public AcademicSessionYear ext(Object ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Object for additional non-standard attributes
   * @return ext
  **/
  
  @ApiModelProperty(value = "Object for additional non-standard attributes")
  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getExt() {
    return ext;
  }


  @JsonProperty(JSON_PROPERTY_EXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExt(Object ext) {
    this.ext = ext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicSessionYear academicSessionYear = (AcademicSessionYear) o;
    return Objects.equals(this.academicSessionId, academicSessionYear.academicSessionId) &&
        Objects.equals(this.academicSessionType, academicSessionYear.academicSessionType) &&
        Objects.equals(this.primaryCode, academicSessionYear.primaryCode) &&
        Objects.equals(this.name, academicSessionYear.name) &&
        Objects.equals(this.startDate, academicSessionYear.startDate) &&
        Objects.equals(this.endDate, academicSessionYear.endDate) &&
        Objects.equals(this.parent, academicSessionYear.parent) &&
        Objects.equals(this.children, academicSessionYear.children) &&
        Objects.equals(this.year, academicSessionYear.year) &&
        Objects.equals(this.otherCodes, academicSessionYear.otherCodes) &&
        Objects.equals(this.consumers, academicSessionYear.consumers) &&
        Objects.equals(this.ext, academicSessionYear.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSessionId, academicSessionType, primaryCode, name, startDate, endDate, parent, children, year, otherCodes, consumers, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicSessionYear {\n");
    sb.append("    academicSessionId: ").append(toIndentedString(academicSessionId)).append("\n");
    sb.append("    academicSessionType: ").append(toIndentedString(academicSessionType)).append("\n");
    sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    otherCodes: ").append(toIndentedString(otherCodes)).append("\n");
    sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
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

