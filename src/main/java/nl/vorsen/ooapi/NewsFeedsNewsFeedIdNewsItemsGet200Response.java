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

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * NewsFeedsNewsFeedIdNewsItemsGet200Response
 */
@JsonPropertyOrder({
        NewsFeedsNewsFeedIdNewsItemsGet200Response.JSON_PROPERTY_PAGE_SIZE,
        NewsFeedsNewsFeedIdNewsItemsGet200Response.JSON_PROPERTY_PAGE_NUMBER,
        NewsFeedsNewsFeedIdNewsItemsGet200Response.JSON_PROPERTY_HAS_PREVIOUS_PAGE,
        NewsFeedsNewsFeedIdNewsItemsGet200Response.JSON_PROPERTY_HAS_NEXT_PAGE,
        NewsFeedsNewsFeedIdNewsItemsGet200Response.JSON_PROPERTY_TOTAL_PAGES,
        NewsFeedsNewsFeedIdNewsItemsGet200Response.JSON_PROPERTY_ITEMS,
        NewsFeedsNewsFeedIdNewsItemsGet200Response.JSON_PROPERTY_EXT
})
@JsonTypeName("_news_feeds__newsFeedId__news_items_get_200_response")

public class NewsFeedsNewsFeedIdNewsItemsGet200Response {
    public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
    public static final String JSON_PROPERTY_PAGE_NUMBER = "pageNumber";
    public static final String JSON_PROPERTY_HAS_PREVIOUS_PAGE = "hasPreviousPage";
    public static final String JSON_PROPERTY_HAS_NEXT_PAGE = "hasNextPage";
    public static final String JSON_PROPERTY_TOTAL_PAGES = "totalPages";
    public static final String JSON_PROPERTY_ITEMS = "items";
    public static final String JSON_PROPERTY_EXT = "ext";
    private Integer pageSize;
    private Integer pageNumber;
    private Boolean hasPreviousPage;
    private Boolean hasNextPage;
    private Integer totalPages;
    private List<NewsItem> items = new ArrayList<>();
    private Object ext;

    public NewsFeedsNewsFeedIdNewsItemsGet200Response() {
    }

    public NewsFeedsNewsFeedIdNewsItemsGet200Response pageSize(Integer pageSize) {

        this.pageSize = pageSize;
        return this;
    }

    /**
     * The number of items per page
     * @return pageSize
     **/
    @NotNull

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

    public NewsFeedsNewsFeedIdNewsItemsGet200Response pageNumber(Integer pageNumber) {

        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * The current page number
     * minimum: 1
     * @return pageNumber
     **/
    @NotNull

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

    public NewsFeedsNewsFeedIdNewsItemsGet200Response hasPreviousPage(Boolean hasPreviousPage) {

        this.hasPreviousPage = hasPreviousPage;
        return this;
    }

    /**
     * Whether there is a previous page
     * @return hasPreviousPage
     **/
    @NotNull

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

    public NewsFeedsNewsFeedIdNewsItemsGet200Response hasNextPage(Boolean hasNextPage) {

        this.hasNextPage = hasNextPage;
        return this;
    }

    /**
     * Whether there is a previous page
     * @return hasNextPage
     **/
    @NotNull

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

    public NewsFeedsNewsFeedIdNewsItemsGet200Response totalPages(Integer totalPages) {

        this.totalPages = totalPages;
        return this;
    }

    /**
     * Total number of pages
     * @return totalPages
     **/

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

    public NewsFeedsNewsFeedIdNewsItemsGet200Response items(List<NewsItem> items) {

        this.items = items;
        return this;
    }

    public NewsFeedsNewsFeedIdNewsItemsGet200Response addItemsItem(NewsItem itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     * @return items
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public List<NewsItem> getItems() {
        return items;
    }

    @JsonProperty(JSON_PROPERTY_ITEMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setItems(List<NewsItem> items) {
        this.items = items;
    }

    public NewsFeedsNewsFeedIdNewsItemsGet200Response ext(Object ext) {

        this.ext = ext;
        return this;
    }

    /**
     * Object for additional non-standard attributes
     * @return ext
     **/

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
        NewsFeedsNewsFeedIdNewsItemsGet200Response newsFeedsNewsFeedIdNewsItemsGet200Response = (NewsFeedsNewsFeedIdNewsItemsGet200Response) o;
        return Objects.equals(this.pageSize, newsFeedsNewsFeedIdNewsItemsGet200Response.pageSize) &&
                Objects.equals(this.pageNumber, newsFeedsNewsFeedIdNewsItemsGet200Response.pageNumber) &&
                Objects.equals(this.hasPreviousPage, newsFeedsNewsFeedIdNewsItemsGet200Response.hasPreviousPage) &&
                Objects.equals(this.hasNextPage, newsFeedsNewsFeedIdNewsItemsGet200Response.hasNextPage) &&
                Objects.equals(this.totalPages, newsFeedsNewsFeedIdNewsItemsGet200Response.totalPages) &&
                Objects.equals(this.items, newsFeedsNewsFeedIdNewsItemsGet200Response.items) &&
                Objects.equals(this.ext, newsFeedsNewsFeedIdNewsItemsGet200Response.ext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageSize, pageNumber, hasPreviousPage, hasNextPage, totalPages, items, ext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewsFeedsNewsFeedIdNewsItemsGet200Response {\n");
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

