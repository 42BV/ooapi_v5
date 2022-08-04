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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.LanguageTypedString;
import org.openapitools.client.model.PersonId;
import org.openapitools.client.model.PostResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PersonsGet201Response
 */
@JsonPropertyOrder({
  PersonsGet201Response.JSON_PROPERTY_PERSON_ID,
  PersonsGet201Response.JSON_PROPERTY_MESSAGE,
  PersonsGet201Response.JSON_PROPERTY_REDIRECT
})
@JsonTypeName("_persons_get_201_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class PersonsGet201Response {
  public static final String JSON_PROPERTY_PERSON_ID = "personId";
  private UUID personId;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private List<LanguageTypedString> message = new ArrayList<>();

  public static final String JSON_PROPERTY_REDIRECT = "redirect";
  private URI redirect;

  public PersonsGet201Response() { 
  }

  public PersonsGet201Response personId(UUID personId) {
    
    this.personId = personId;
    return this;
  }

   /**
   * Unique id of this person
   * @return personId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", required = true, value = "Unique id of this person")
  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getPersonId() {
    return personId;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPersonId(UUID personId) {
    this.personId = personId;
  }


  public PersonsGet201Response message(List<LanguageTypedString> message) {
    
    this.message = message;
    return this;
  }

  public PersonsGet201Response addMessageItem(LanguageTypedString messageItem) {
    this.message.add(messageItem);
    return this;
  }

   /**
   * information displayed to user
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{language=en-GB, value=Your enrollment was partly succesful, you have been placed on the waitinglist}]", required = true, value = "information displayed to user")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LanguageTypedString> getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(List<LanguageTypedString> message) {
    this.message = message;
  }


  public PersonsGet201Response redirect(URI redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * URL where additional information can be found e.g. by use of deeplink
   * @return redirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL where additional information can be found e.g. by use of deeplink")
  @JsonProperty(JSON_PROPERTY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getRedirect() {
    return redirect;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirect(URI redirect) {
    this.redirect = redirect;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonsGet201Response personsGet201Response = (PersonsGet201Response) o;
    return Objects.equals(this.personId, personsGet201Response.personId) &&
        Objects.equals(this.message, personsGet201Response.message) &&
        Objects.equals(this.redirect, personsGet201Response.redirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, message, redirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonsGet201Response {\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
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
