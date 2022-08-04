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

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Pagination
 */
@JsonPropertyOrder({
  Pagination.JSON_PROPERTY_PAGE_SIZE,
  Pagination.JSON_PROPERTY_PAGE_NUMBER,
  Pagination.JSON_PROPERTY_HAS_PREVIOUS_PAGE,
  Pagination.JSON_PROPERTY_HAS_NEXT_PAGE,
  Pagination.JSON_PROPERTY_TOTAL_PAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:55:03.988058+02:00[Europe/Amsterdam]")
public class Pagination {
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

  public Pagination() { 
  }

  public Pagination pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of items per page
   * @return pageSize
  **/
  @NotNull
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


  public Pagination pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * The current page number
   * minimum: 1
   * @return pageNumber
  **/
  @NotNull
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


  public Pagination hasPreviousPage(Boolean hasPreviousPage) {
    
    this.hasPreviousPage = hasPreviousPage;
    return this;
  }

   /**
   * Whether there is a previous page
   * @return hasPreviousPage
  **/
  @NotNull
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


  public Pagination hasNextPage(Boolean hasNextPage) {
    
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * Whether there is a previous page
   * @return hasNextPage
  **/
  @NotNull
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


  public Pagination totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages
   * @return totalPages
  **/

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.pageSize, pagination.pageSize) &&
        Objects.equals(this.pageNumber, pagination.pageNumber) &&
        Objects.equals(this.hasPreviousPage, pagination.hasPreviousPage) &&
        Objects.equals(this.hasNextPage, pagination.hasNextPage) &&
        Objects.equals(this.totalPages, pagination.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageNumber, hasPreviousPage, hasNextPage, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

