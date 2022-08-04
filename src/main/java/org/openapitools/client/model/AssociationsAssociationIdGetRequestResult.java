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
import org.openapitools.client.model.ComponentResult;
import org.openapitools.client.model.CourseResult;
import org.openapitools.client.model.PassState;
import org.openapitools.client.model.ProgramResult;
import org.openapitools.client.model.ResultState;
import org.openapitools.client.model.StudyLoadDescriptor;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AssociationsAssociationIdGetRequestResult
 */
@JsonPropertyOrder({
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_STATE,
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_PASS,
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_COMMENT,
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_SCORE,
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_RESULT_DATE,
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_EXT,
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_WEIGHT,
  AssociationsAssociationIdGetRequestResult.JSON_PROPERTY_STUDY_LOAD
})
@JsonTypeName("_associations__associationId__get_request_result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class AssociationsAssociationIdGetRequestResult {
  public static final String JSON_PROPERTY_STATE = "state";
  private ResultState state;

  public static final String JSON_PROPERTY_PASS = "pass";
  private PassState pass;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_SCORE = "score";
  private String score;

  public static final String JSON_PROPERTY_RESULT_DATE = "resultDate";
  private LocalDate resultDate;

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private Integer weight;

  public static final String JSON_PROPERTY_STUDY_LOAD = "studyLoad";
  private StudyLoadDescriptor studyLoad;

  public AssociationsAssociationIdGetRequestResult() { 
  }

  public AssociationsAssociationIdGetRequestResult state(ResultState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResultState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(ResultState state) {
    this.state = state;
  }


  public AssociationsAssociationIdGetRequestResult pass(PassState pass) {
    
    this.pass = pass;
    return this;
  }

   /**
   * Get pass
   * @return pass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PassState getPass() {
    return pass;
  }


  @JsonProperty(JSON_PROPERTY_PASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPass(PassState pass) {
    this.pass = pass;
  }


  public AssociationsAssociationIdGetRequestResult comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * The comment on this result
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comment on this result")
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public AssociationsAssociationIdGetRequestResult score(String score) {
    
    this.score = score;
    return this;
  }

   /**
   * The score of this program/course/component association (based on resultValueType in offering)
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "The score of this program/course/component association (based on resultValueType in offering)")
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScore() {
    return score;
  }


  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScore(String score) {
    this.score = score;
  }


  public AssociationsAssociationIdGetRequestResult resultDate(LocalDate resultDate) {
    
    this.resultDate = resultDate;
    return this;
  }

   /**
   * The date this result has been published, RFC3339 (full-date)
   * @return resultDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Mon Sep 28 02:00:00 CEST 2020", required = true, value = "The date this result has been published, RFC3339 (full-date)")
  @JsonProperty(JSON_PROPERTY_RESULT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getResultDate() {
    return resultDate;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultDate(LocalDate resultDate) {
    this.resultDate = resultDate;
  }


  public AssociationsAssociationIdGetRequestResult ext(Object ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Object for additional non-standard attributes
   * @return ext
  **/
  @javax.annotation.Nullable
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


  public AssociationsAssociationIdGetRequestResult weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * The weight to 100 as total for this offering in the course
   * minimum: 0
   * maximum: 100
   * @return weight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "The weight to 100 as total for this offering in the course")
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  public AssociationsAssociationIdGetRequestResult studyLoad(StudyLoadDescriptor studyLoad) {
    
    this.studyLoad = studyLoad;
    return this;
  }

   /**
   * Get studyLoad
   * @return studyLoad
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STUDY_LOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StudyLoadDescriptor getStudyLoad() {
    return studyLoad;
  }


  @JsonProperty(JSON_PROPERTY_STUDY_LOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStudyLoad(StudyLoadDescriptor studyLoad) {
    this.studyLoad = studyLoad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociationsAssociationIdGetRequestResult associationsAssociationIdGetRequestResult = (AssociationsAssociationIdGetRequestResult) o;
    return Objects.equals(this.state, associationsAssociationIdGetRequestResult.state) &&
        Objects.equals(this.pass, associationsAssociationIdGetRequestResult.pass) &&
        Objects.equals(this.comment, associationsAssociationIdGetRequestResult.comment) &&
        Objects.equals(this.score, associationsAssociationIdGetRequestResult.score) &&
        Objects.equals(this.resultDate, associationsAssociationIdGetRequestResult.resultDate) &&
        Objects.equals(this.ext, associationsAssociationIdGetRequestResult.ext) &&
        Objects.equals(this.weight, associationsAssociationIdGetRequestResult.weight) &&
        Objects.equals(this.studyLoad, associationsAssociationIdGetRequestResult.studyLoad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, pass, comment, score, resultDate, ext, weight, studyLoad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociationsAssociationIdGetRequestResult {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    resultDate: ").append(toIndentedString(resultDate)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    studyLoad: ").append(toIndentedString(studyLoad)).append("\n");
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

