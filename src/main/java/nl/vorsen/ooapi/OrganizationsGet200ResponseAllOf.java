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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrganizationsGet200ResponseAllOf
 */
@JsonPropertyOrder({
  OrganizationsGet200ResponseAllOf.JSON_PROPERTY_ITEMS,
  OrganizationsGet200ResponseAllOf.JSON_PROPERTY_EXT
})
@JsonTypeName("_organizations_get_200_response_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:55:03.988058+02:00[Europe/Amsterdam]")
public class OrganizationsGet200ResponseAllOf {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Organization> items = new ArrayList<>();

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public OrganizationsGet200ResponseAllOf() { 
  }

  public OrganizationsGet200ResponseAllOf items(List<Organization> items) {
    
    this.items = items;
    return this;
  }

  public OrganizationsGet200ResponseAllOf addItemsItem(Organization itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Organization> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<Organization> items) {
    this.items = items;
  }


  public OrganizationsGet200ResponseAllOf ext(Object ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Object for additional non-standard attributes
   * @return ext
  **/
  
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
    OrganizationsGet200ResponseAllOf organizationsGet200ResponseAllOf = (OrganizationsGet200ResponseAllOf) o;
    return Objects.equals(this.items, organizationsGet200ResponseAllOf.items) &&
        Objects.equals(this.ext, organizationsGet200ResponseAllOf.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsGet200ResponseAllOf {\n");
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

