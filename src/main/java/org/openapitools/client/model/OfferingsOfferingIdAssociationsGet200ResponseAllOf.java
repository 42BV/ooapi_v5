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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OfferingsOfferingIdAssociationsGet200ResponseAllOfItemsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OfferingsOfferingIdAssociationsGet200ResponseAllOf
 */
@JsonPropertyOrder({
  OfferingsOfferingIdAssociationsGet200ResponseAllOf.JSON_PROPERTY_ITEMS,
  OfferingsOfferingIdAssociationsGet200ResponseAllOf.JSON_PROPERTY_EXT
})
@JsonTypeName("_offerings__offeringId__associations_get_200_response_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class OfferingsOfferingIdAssociationsGet200ResponseAllOf {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<OfferingsOfferingIdAssociationsGet200ResponseAllOfItemsInner> items = new ArrayList<>();

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public OfferingsOfferingIdAssociationsGet200ResponseAllOf() { 
  }

  public OfferingsOfferingIdAssociationsGet200ResponseAllOf items(List<OfferingsOfferingIdAssociationsGet200ResponseAllOfItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public OfferingsOfferingIdAssociationsGet200ResponseAllOf addItemsItem(OfferingsOfferingIdAssociationsGet200ResponseAllOfItemsInner itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<OfferingsOfferingIdAssociationsGet200ResponseAllOfItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<OfferingsOfferingIdAssociationsGet200ResponseAllOfItemsInner> items) {
    this.items = items;
  }


  public OfferingsOfferingIdAssociationsGet200ResponseAllOf ext(Object ext) {
    
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
    OfferingsOfferingIdAssociationsGet200ResponseAllOf offeringsOfferingIdAssociationsGet200ResponseAllOf = (OfferingsOfferingIdAssociationsGet200ResponseAllOf) o;
    return Objects.equals(this.items, offeringsOfferingIdAssociationsGet200ResponseAllOf.items) &&
        Objects.equals(this.ext, offeringsOfferingIdAssociationsGet200ResponseAllOf.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferingsOfferingIdAssociationsGet200ResponseAllOf {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

