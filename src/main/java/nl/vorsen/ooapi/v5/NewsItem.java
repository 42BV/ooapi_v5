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


package nl.vorsen.ooapi.v5;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A newsitem contains the message and metadata of that message
 */

@JsonPropertyOrder({
        NewsItem.JSON_PROPERTY_NEWS_ITEM_ID,
        NewsItem.JSON_PROPERTY_NEWS_ITEM_TYPE,
        NewsItem.JSON_PROPERTY_NAME,
        NewsItem.JSON_PROPERTY_AUTHORS,
        NewsItem.JSON_PROPERTY_IMAGE,
        NewsItem.JSON_PROPERTY_LINK,
        NewsItem.JSON_PROPERTY_CONTENT,
        NewsItem.JSON_PROPERTY_NEWS_FEEDS,
        NewsItem.JSON_PROPERTY_VALID_FROM,
        NewsItem.JSON_PROPERTY_VALID_UNTIL,
        NewsItem.JSON_PROPERTY_LAST_MODIFIED,
        NewsItem.JSON_PROPERTY_CONSUMERS,
        NewsItem.JSON_PROPERTY_EXT
})

public class NewsItem {
    public static final String JSON_PROPERTY_NEWS_ITEM_ID = "newsItemId";
    public static final String JSON_PROPERTY_NEWS_ITEM_TYPE = "newsItemType";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_AUTHORS = "authors";
    public static final String JSON_PROPERTY_IMAGE = "image";
    public static final String JSON_PROPERTY_LINK = "link";
    public static final String JSON_PROPERTY_CONTENT = "content";
    public static final String JSON_PROPERTY_NEWS_FEEDS = "newsFeeds";
    public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
    public static final String JSON_PROPERTY_VALID_UNTIL = "validUntil";
    public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
    public static final String JSON_PROPERTY_CONSUMERS = "consumers";
    public static final String JSON_PROPERTY_EXT = "ext";
    private UUID newsItemId;
    private NewsItemType newsItemType;
    private List<LanguageTypedString> name = new ArrayList<>();
    private List<String> authors = null;
    private URI image;
    private URI link;
    private List<LanguageTypedString> content = null;
    private List<NewsItemNewsFeedsInner> newsFeeds = null;
    private OffsetDateTime validFrom;
    private OffsetDateTime validUntil;
    private OffsetDateTime lastModified;
    private List<Consumer> consumers = null;
    private Object ext;

    public NewsItem() {
    }

    public NewsItem newsItemId(UUID newsItemId) {

        this.newsItemId = newsItemId;
        return this;
    }

    /**
     * Unique id for this news item
     * @return newsItemId
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_NEWS_ITEM_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public UUID getNewsItemId() {
        return newsItemId;
    }

    @JsonProperty(JSON_PROPERTY_NEWS_ITEM_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNewsItemId(UUID newsItemId) {
        this.newsItemId = newsItemId;
    }

    public NewsItem newsItemType(NewsItemType newsItemType) {

        this.newsItemType = newsItemType;
        return this;
    }

    /**
     * Get newsItemType
     * @return newsItemType
     **/

    @JsonProperty(JSON_PROPERTY_NEWS_ITEM_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public NewsItemType getNewsItemType() {
        return newsItemType;
    }

    @JsonProperty(JSON_PROPERTY_NEWS_ITEM_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNewsItemType(NewsItemType newsItemType) {
        this.newsItemType = newsItemType;
    }

    public NewsItem name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public NewsItem addNameItem(LanguageTypedString nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * The name for this news item
     * @return name
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public List<LanguageTypedString> getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(List<LanguageTypedString> name) {
        this.name = name;
    }

    public NewsItem authors(List<String> authors) {

        this.authors = authors;
        return this;
    }

    public NewsItem addAuthorsItem(String authorsItem) {
        if (this.authors == null) {
            this.authors = new ArrayList<>();
        }
        this.authors.add(authorsItem);
        return this;
    }

    /**
     * The authors of the article with this news item
     * @return authors
     **/

    @JsonProperty(JSON_PROPERTY_AUTHORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<String> getAuthors() {
        return authors;
    }

    @JsonProperty(JSON_PROPERTY_AUTHORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public NewsItem image(URI image) {

        this.image = image;
        return this;
    }

    /**
     * The url containing the address of the image belonging to this news item
     * @return image
     **/

    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public URI getImage() {
        return image;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setImage(URI image) {
        this.image = image;
    }

    public NewsItem link(URI link) {

        this.link = link;
        return this;
    }

    /**
     * The url containing the address of the article belonging to this news item
     * @return link
     **/

    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public URI getLink() {
        return link;
    }

    @JsonProperty(JSON_PROPERTY_LINK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLink(URI link) {
        this.link = link;
    }

    public NewsItem content(List<LanguageTypedString> content) {

        this.content = content;
        return this;
    }

    public NewsItem addContentItem(LanguageTypedString contentItem) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(contentItem);
        return this;
    }

    /**
     * The content of this news item.
     * @return content
     **/

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<LanguageTypedString> getContent() {
        return content;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContent(List<LanguageTypedString> content) {
        this.content = content;
    }

    public NewsItem newsFeeds(List<NewsItemNewsFeedsInner> newsFeeds) {

        this.newsFeeds = newsFeeds;
        return this;
    }

    public NewsItem addNewsFeedsItem(NewsItemNewsFeedsInner newsFeedsItem) {
        if (this.newsFeeds == null) {
            this.newsFeeds = new ArrayList<>();
        }
        this.newsFeeds.add(newsFeedsItem);
        return this;
    }

    /**
     * The newsFeeds where this item can be found. [&#x60;expandable&#x60;](#tag/news_feed_model)
     * @return newsFeeds
     **/

    @JsonProperty(JSON_PROPERTY_NEWS_FEEDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<NewsItemNewsFeedsInner> getNewsFeeds() {
        return newsFeeds;
    }

    @JsonProperty(JSON_PROPERTY_NEWS_FEEDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNewsFeeds(List<NewsItemNewsFeedsInner> newsFeeds) {
        this.newsFeeds = newsFeeds;
    }

    public NewsItem validFrom(OffsetDateTime validFrom) {

        this.validFrom = validFrom;
        return this;
    }

    /**
     * The moment from which this news item is valid, RFC3339 (date-time)
     * @return validFrom
     **/

    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getValidFrom() {
        return validFrom;
    }

    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public NewsItem validUntil(OffsetDateTime validUntil) {

        this.validUntil = validUntil;
        return this;
    }

    /**
     * The moment until which this news item is valid, RFC3339 (date-time)
     * @return validUntil
     **/

    @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getValidUntil() {
        return validUntil;
    }

    @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public NewsItem lastModified(OffsetDateTime lastModified) {

        this.lastModified = lastModified;
        return this;
    }

    /**
     * The moment on which this news item was updated, RFC3339 (date-time)
     * @return lastModified
     **/

    @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public NewsItem consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public NewsItem addConsumersItem(Consumer consumersItem) {
        if (this.consumers == null) {
            this.consumers = new ArrayList<>();
        }
        this.consumers.add(consumersItem);
        return this;
    }

    /**
     * The additional consumer elements that can be provided, see the [documentation on support for specific consumers](https://open-education-api.github.io/specification/#/consumers) for more information about this mechanism.
     * @return consumers
     **/

    @JsonProperty(JSON_PROPERTY_CONSUMERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<Consumer> getConsumers() {
        return consumers;
    }

    @JsonProperty(JSON_PROPERTY_CONSUMERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConsumers(List<Consumer> consumers) {
        this.consumers = consumers;
    }

    public NewsItem ext(Object ext) {

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
        NewsItem newsItem = (NewsItem) o;
        return Objects.equals(this.newsItemId, newsItem.newsItemId) &&
                Objects.equals(this.newsItemType, newsItem.newsItemType) &&
                Objects.equals(this.name, newsItem.name) &&
                Objects.equals(this.authors, newsItem.authors) &&
                Objects.equals(this.image, newsItem.image) &&
                Objects.equals(this.link, newsItem.link) &&
                Objects.equals(this.content, newsItem.content) &&
                Objects.equals(this.newsFeeds, newsItem.newsFeeds) &&
                Objects.equals(this.validFrom, newsItem.validFrom) &&
                Objects.equals(this.validUntil, newsItem.validUntil) &&
                Objects.equals(this.lastModified, newsItem.lastModified) &&
                Objects.equals(this.consumers, newsItem.consumers) &&
                Objects.equals(this.ext, newsItem.ext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsItemId, newsItemType, name, authors, image, link, content, newsFeeds, validFrom, validUntil, lastModified, consumers, ext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewsItem {\n");
        sb.append("    newsItemId: ").append(toIndentedString(newsItemId)).append("\n");
        sb.append("    newsItemType: ").append(toIndentedString(newsItemType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    newsFeeds: ").append(toIndentedString(newsFeeds)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
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

