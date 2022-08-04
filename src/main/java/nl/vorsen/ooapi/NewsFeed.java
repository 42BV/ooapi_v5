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
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A placeholder or collection of news items
 */

@JsonPropertyOrder({
        NewsFeed.JSON_PROPERTY_NEWS_FEED_ID,
        NewsFeed.JSON_PROPERTY_NEWS_FEED_TYPE,
        NewsFeed.JSON_PROPERTY_NAME,
        NewsFeed.JSON_PROPERTY_DESCRIPTION,
        NewsFeed.JSON_PROPERTY_CONSUMERS,
        NewsFeed.JSON_PROPERTY_EXT
})

public class NewsFeed {
    public static final String JSON_PROPERTY_NEWS_FEED_ID = "newsFeedId";
    public static final String JSON_PROPERTY_NEWS_FEED_TYPE = "newsFeedType";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_CONSUMERS = "consumers";
    public static final String JSON_PROPERTY_EXT = "ext";
    private UUID newsFeedId;
    private NewsFeedTypeEnum newsFeedType;
    private List<LanguageTypedString> name = new ArrayList<>();
    private List<LanguageTypedString> description = new ArrayList<>();
    private List<Consumer> consumers = null;
    private Object ext;
    public NewsFeed() {
    }

    public NewsFeed newsFeedId(UUID newsFeedId) {

        this.newsFeedId = newsFeedId;
        return this;
    }

    /**
     * Unique id for this news feed
     * @return newsFeedId
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_NEWS_FEED_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public UUID getNewsFeedId() {
        return newsFeedId;
    }

    @JsonProperty(JSON_PROPERTY_NEWS_FEED_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNewsFeedId(UUID newsFeedId) {
        this.newsFeedId = newsFeedId;
    }

    public NewsFeed newsFeedType(NewsFeedTypeEnum newsFeedType) {

        this.newsFeedType = newsFeedType;
        return this;
    }

    /**
     * The type of the object this news feed relates to
     * @return newsFeedType
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_NEWS_FEED_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public NewsFeedTypeEnum getNewsFeedType() {
        return newsFeedType;
    }

    @JsonProperty(JSON_PROPERTY_NEWS_FEED_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNewsFeedType(NewsFeedTypeEnum newsFeedType) {
        this.newsFeedType = newsFeedType;
    }

    public NewsFeed name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public NewsFeed addNameItem(LanguageTypedString nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * The name for this news feed
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

    public NewsFeed description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public NewsFeed addDescriptionItem(LanguageTypedString descriptionItem) {
        this.description.add(descriptionItem);
        return this;
    }

    /**
     * The description of this news feed.
     * @return description
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public List<LanguageTypedString> getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDescription(List<LanguageTypedString> description) {
        this.description = description;
    }

    public NewsFeed consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public NewsFeed addConsumersItem(Consumer consumersItem) {
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

    public NewsFeed ext(Object ext) {

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
        NewsFeed newsFeed = (NewsFeed) o;
        return Objects.equals(this.newsFeedId, newsFeed.newsFeedId) &&
                Objects.equals(this.newsFeedType, newsFeed.newsFeedType) &&
                Objects.equals(this.name, newsFeed.name) &&
                Objects.equals(this.description, newsFeed.description) &&
                Objects.equals(this.consumers, newsFeed.consumers) &&
                Objects.equals(this.ext, newsFeed.ext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsFeedId, newsFeedType, name, description, consumers, ext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewsFeed {\n");
        sb.append("    newsFeedId: ").append(toIndentedString(newsFeedId)).append("\n");
        sb.append("    newsFeedType: ").append(toIndentedString(newsFeedType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

    /**
     * The type of the object this news feed relates to
     */
    public enum NewsFeedTypeEnum {
        ORGANIZATION("organization"),

        PROGRAM("program"),

        COURSE("course"),

        COMPONENT("component"),

        PERSON("person"),

        BUILDING("building"),

        ROOM("room");

        private final String value;

        NewsFeedTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static NewsFeedTypeEnum fromValue(String value) {
            for (NewsFeedTypeEnum b : NewsFeedTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

