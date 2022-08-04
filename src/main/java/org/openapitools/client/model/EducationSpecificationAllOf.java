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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EducationSpecificationAllOf
 */
@JsonPropertyOrder({
  EducationSpecificationAllOf.JSON_PROPERTY_VALID_FROM,
  EducationSpecificationAllOf.JSON_PROPERTY_VALID_TO
})
@JsonTypeName("EducationSpecification_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class EducationSpecificationAllOf {
  public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
  private LocalDate validFrom;

  public static final String JSON_PROPERTY_VALID_TO = "validTo";
  private LocalDate validTo;

  public EducationSpecificationAllOf() { 
  }

  public EducationSpecificationAllOf validFrom(LocalDate validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * The first day this EducationSpecification is valid (inclusive).
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first day this EducationSpecification is valid (inclusive).")
  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getValidFrom() {
    return validFrom;
  }


  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }


  public EducationSpecificationAllOf validTo(LocalDate validTo) {
    
    this.validTo = validTo;
    return this;
  }

   /**
   * The day this EducationSpecification ceases to be valid (e.g. exclusive).
   * @return validTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The day this EducationSpecification ceases to be valid (e.g. exclusive).")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EducationSpecificationAllOf educationSpecificationAllOf = (EducationSpecificationAllOf) o;
    return Objects.equals(this.validFrom, educationSpecificationAllOf.validFrom) &&
        Objects.equals(this.validTo, educationSpecificationAllOf.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFrom, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EducationSpecificationAllOf {\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

