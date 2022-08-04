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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.client.model.CourseProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A timeline override of the course.
 */
@ApiModel(description = "A timeline override of the course.")
@JsonPropertyOrder({
  TimelineOverrideCourse.JSON_PROPERTY_VALID_FROM,
  TimelineOverrideCourse.JSON_PROPERTY_VALID_TO,
  TimelineOverrideCourse.JSON_PROPERTY_COURSE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class TimelineOverrideCourse {
  public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
  private LocalDate validFrom;

  public static final String JSON_PROPERTY_VALID_TO = "validTo";
  private LocalDate validTo;

  public static final String JSON_PROPERTY_COURSE = "course";
  private CourseProperties course;

  public TimelineOverrideCourse() { 
  }

  public TimelineOverrideCourse validFrom(LocalDate validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * The day on which this timelineOverride starts (inclusive), RFC3339 (date)
   * @return validFrom
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Wed Sep 01 02:00:00 CEST 2021", required = true, value = "The day on which this timelineOverride starts (inclusive), RFC3339 (date)")
  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getValidFrom() {
    return validFrom;
  }


  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }


  public TimelineOverrideCourse validTo(LocalDate validTo) {
    
    this.validTo = validTo;
    return this;
  }

   /**
   * The day on which this timelineOverride ends (exclusive), RFC3339 (date)
   * @return validTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Aug 31 02:00:00 CEST 2022", value = "The day on which this timelineOverride ends (exclusive), RFC3339 (date)")
  @JsonProperty(JSON_PROPERTY_VALID_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getValidTo() {
    return validTo;
  }


  @JsonProperty(JSON_PROPERTY_VALID_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidTo(LocalDate validTo) {
    this.validTo = validTo;
  }


  public TimelineOverrideCourse course(CourseProperties course) {
    
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CourseProperties getCourse() {
    return course;
  }


  @JsonProperty(JSON_PROPERTY_COURSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCourse(CourseProperties course) {
    this.course = course;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimelineOverrideCourse timelineOverrideCourse = (TimelineOverrideCourse) o;
    return Objects.equals(this.validFrom, timelineOverrideCourse.validFrom) &&
        Objects.equals(this.validTo, timelineOverrideCourse.validTo) &&
        Objects.equals(this.course, timelineOverrideCourse.course);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFrom, validTo, course);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimelineOverrideCourse {\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
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
