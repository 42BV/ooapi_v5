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

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A system message as a response to a POST message
 */
@ApiModel(description = "A system message as a response to a POST message")
@JsonPropertyOrder({
  PostResponse.JSON_PROPERTY_MESSAGE,
  PostResponse.JSON_PROPERTY_REDIRECT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T11:38:05.422668+02:00[Europe/Amsterdam]")
public class PostResponse {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private List<LanguageTypedString> message = new ArrayList<>();

  public static final String JSON_PROPERTY_REDIRECT = "redirect";
  private URI redirect;

  public PostResponse() { 
  }

  public PostResponse message(List<LanguageTypedString> message) {
    
    this.message = message;
    return this;
  }

  public PostResponse addMessageItem(LanguageTypedString messageItem) {
    this.message.add(messageItem);
    return this;
  }

   /**
   * information displayed to user
   * @return message
  **/
  @NotNull
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


  public PostResponse redirect(URI redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * URL where additional information can be found e.g. by use of deeplink
   * @return redirect
  **/

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
    PostResponse postResponse = (PostResponse) o;
    return Objects.equals(this.message, postResponse.message) &&
        Objects.equals(this.redirect, postResponse.redirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, redirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostResponse {\n");
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

