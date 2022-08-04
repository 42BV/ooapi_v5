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

import java.util.HashMap;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object for communicating data to a specific consumer (destination). This object has no relationship with the &#x60;consumer&#x60; query parameter.
 */
@ApiModel(description = "Object for communicating data to a specific consumer (destination). This object has no relationship with the `consumer` query parameter.")
@JsonPropertyOrder({
  Consumer.JSON_PROPERTY_CONSUMER_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T11:38:05.422668+02:00[Europe/Amsterdam]")
public class Consumer extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_CONSUMER_KEY = "consumerKey";
  private String consumerKey;

  public Consumer() { 
  }

  public Consumer consumerKey(String consumerKey) {
    
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * The key of the consumer (destination) for which this information is intended. See the [consumer registry](https://open-education-api.github.io/specification/#/consumers) for more information.
   * @return consumerKey
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "The key of the consumer (destination) for which this information is intended. See the [consumer registry](https://open-education-api.github.io/specification/#/consumers) for more information.")
  @JsonProperty(JSON_PROPERTY_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConsumerKey() {
    return consumerKey;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consumer consumer = (Consumer) o;
    return Objects.equals(this.consumerKey, consumer.consumerKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
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

