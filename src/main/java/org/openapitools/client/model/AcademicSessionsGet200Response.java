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
import org.openapitools.client.model.AcademicSession;
import org.openapitools.client.model.AcademicSessionsGet200ResponseAllOf;
import org.openapitools.client.model.Pagination;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AcademicSessionsGet200Response
 */
@JsonPropertyOrder({
  AcademicSessionsGet200Response.JSON_PROPERTY_PAGE_SIZE,
  AcademicSessionsGet200Response.JSON_PROPERTY_PAGE_NUMBER,
  AcademicSessionsGet200Response.JSON_PROPERTY_HAS_PREVIOUS_PAGE,
  AcademicSessionsGet200Response.JSON_PROPERTY_HAS_NEXT_PAGE,
  AcademicSessionsGet200Response.JSON_PROPERTY_TOTAL_PAGES,
  AcademicSessionsGet200Response.JSON_PROPERTY_ITEMS,
  AcademicSessionsGet200Response.JSON_PROPERTY_EXT
})
@JsonTypeName("_academic_sessions_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class AcademicSessionsGet200Response {
  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "pageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_HAS_PREVIOUS_PAGE = "hasPreviousPage";
  private Boolean hasPreviousPage;

  public static final String JSON_PROPERTY_HAS_NEXT_PAGE = "hasNextPage";
  private Boolean hasNextPage;

  public static final String JSON_PROPERTY_TOTAL_PAGES = "totalPages";
  private Integer totalPages;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<AcademicSession> items = new ArrayList<>();

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public AcademicSessionsGet200Response() { 
  }

  public AcademicSessionsGet200Response pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of items per page
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "The number of items per page")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AcademicSessionsGet200Response pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * The current page number
   * minimum: 1
   * @return pageNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The current page number")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public AcademicSessionsGet200Response hasPreviousPage(Boolean hasPreviousPage) {
    
    this.hasPreviousPage = hasPreviousPage;
    return this;
  }

   /**
   * Whether there is a previous page
   * @return hasPreviousPage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Whether there is a previous page")
  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasPreviousPage() {
    return hasPreviousPage;
  }


  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }


  public AcademicSessionsGet200Response hasNextPage(Boolean hasNextPage) {
    
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * Whether there is a previous page
   * @return hasNextPage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Whether there is a previous page")
  @JsonProperty(JSON_PROPERTY_HAS_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasNextPage() {
    return hasNextPage;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }


  public AcademicSessionsGet200Response totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "Total number of pages")
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPages() {
    return totalPages;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public AcademicSessionsGet200Response items(List<AcademicSession> items) {
    
    this.items = items;
    return this;
  }

  public AcademicSessionsGet200Response addItemsItem(AcademicSession itemsItem) {
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

  public List<AcademicSession> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<AcademicSession> items) {
    this.items = items;
  }


  public AcademicSessionsGet200Response ext(Object ext) {
    
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
    AcademicSessionsGet200Response academicSessionsGet200Response = (AcademicSessionsGet200Response) o;
    return Objects.equals(this.pageSize, academicSessionsGet200Response.pageSize) &&
        Objects.equals(this.pageNumber, academicSessionsGet200Response.pageNumber) &&
        Objects.equals(this.hasPreviousPage, academicSessionsGet200Response.hasPreviousPage) &&
        Objects.equals(this.hasNextPage, academicSessionsGet200Response.hasNextPage) &&
        Objects.equals(this.totalPages, academicSessionsGet200Response.totalPages) &&
        Objects.equals(this.items, academicSessionsGet200Response.items) &&
        Objects.equals(this.ext, academicSessionsGet200Response.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, hasPreviousPage, hasNextPage, totalPages, items, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicSessionsGet200Response {\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

