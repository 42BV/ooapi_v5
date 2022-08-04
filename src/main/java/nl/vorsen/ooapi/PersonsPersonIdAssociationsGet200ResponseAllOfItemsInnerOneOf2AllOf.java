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

import java.util.Objects;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf
 */
@JsonPropertyOrder({
  PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf.JSON_PROPERTY_OFFERING,
  PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf.JSON_PROPERTY_ACADEMIC_SESSION
})
@JsonTypeName("_persons__personId__associations_get_200_response_allOf_items_inner_oneOf_2_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:55:03.988058+02:00[Europe/Amsterdam]")
public class PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf {
  public static final String JSON_PROPERTY_OFFERING = "offering";
  private ComponentOffering offering;

  public static final String JSON_PROPERTY_ACADEMIC_SESSION = "academicSession";
  private AcademicSession academicSession;

  public PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf() { 
  }

  public PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf offering(ComponentOffering offering) {
    
    this.offering = offering;
    return this;
  }

   /**
   * Get offering
   * @return offering
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OFFERING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ComponentOffering getOffering() {
    return offering;
  }


  @JsonProperty(JSON_PROPERTY_OFFERING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOffering(ComponentOffering offering) {
    this.offering = offering;
  }


  public PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf academicSession(AcademicSession academicSession) {
    
    this.academicSession = academicSession;
    return this;
  }

   /**
   * Get academicSession
   * @return academicSession
  **/
  
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AcademicSession getAcademicSession() {
    return academicSession;
  }


  @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcademicSession(AcademicSession academicSession) {
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
    PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf personsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf = (PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf) o;
    return Objects.equals(this.offering, personsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf.offering) &&
        Objects.equals(this.academicSession, personsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf.academicSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offering, academicSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonsPersonIdAssociationsGet200ResponseAllOfItemsInnerOneOf2AllOf {\n");
    sb.append("    offering: ").append(toIndentedString(offering)).append("\n");
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

