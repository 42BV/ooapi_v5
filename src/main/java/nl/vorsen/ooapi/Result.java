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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A result as part of an association
 */
@ApiModel(description = "A result as part of an association")
@JsonPropertyOrder({
  Result.JSON_PROPERTY_STATE,
  Result.JSON_PROPERTY_PASS,
  Result.JSON_PROPERTY_COMMENT,
  Result.JSON_PROPERTY_SCORE,
  Result.JSON_PROPERTY_RESULT_DATE,
  Result.JSON_PROPERTY_EXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:55:03.988058+02:00[Europe/Amsterdam]")
public class Result {
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

  public Result() { 
  }

  public Result state(ResultState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @NotNull
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


  public Result pass(PassState pass) {
    
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


  public Result comment(String comment) {
    
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


  public Result score(String score) {
    
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


  public Result resultDate(LocalDate resultDate) {
    
    this.resultDate = resultDate;
    return this;
  }

   /**
   * The date this result has been published, RFC3339 (full-date)
   * @return resultDate
  **/
  @NotNull
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


  public Result ext(Object ext) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.state, result.state) &&
        Objects.equals(this.pass, result.pass) &&
        Objects.equals(this.comment, result.comment) &&
        Objects.equals(this.score, result.score) &&
        Objects.equals(this.resultDate, result.resultDate) &&
        Objects.equals(this.ext, result.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, pass, comment, score, resultDate, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    resultDate: ").append(toIndentedString(resultDate)).append("\n");
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
