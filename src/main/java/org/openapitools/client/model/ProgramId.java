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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A collection of courses that lead to a certifiable learning outcome
 */
@ApiModel(description = "A collection of courses that lead to a certifiable learning outcome")
@JsonPropertyOrder({
  ProgramId.JSON_PROPERTY_PROGRAM_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class ProgramId {
  public static final String JSON_PROPERTY_PROGRAM_ID = "programId";
  private UUID programId;

  public ProgramId() { 
  }

  @JsonCreator
  public ProgramId(
    @JsonProperty(JSON_PROPERTY_PROGRAM_ID) UUID programId
  ) {
    this();
    this.programId = programId;
  }

   /**
   * Unique id for this program
   * @return programId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", required = true, value = "Unique id for this program")
  @JsonProperty(JSON_PROPERTY_PROGRAM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProgramId() {
    return programId;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramId programId = (ProgramId) o;
    return Objects.equals(this.programId, programId.programId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramId {\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
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

