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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WithTimelineOverrides
 */
@JsonPropertyOrder({
        WithTimelineOverrides.JSON_PROPERTY_TIMELINE_OVERRIDES
})
@JsonTypeName("With_timelineOverrides")

public class WithTimelineOverrides {
    public static final String JSON_PROPERTY_TIMELINE_OVERRIDES = "timelineOverrides";
    private List<TimelineOverrideEducationSpecification> timelineOverrides = null;

    public WithTimelineOverrides() {
    }

    public WithTimelineOverrides timelineOverrides(List<TimelineOverrideEducationSpecification> timelineOverrides) {

        this.timelineOverrides = timelineOverrides;
        return this;
    }

    public WithTimelineOverrides addTimelineOverridesItem(TimelineOverrideEducationSpecification timelineOverridesItem) {
        if (this.timelineOverrides == null) {
            this.timelineOverrides = new ArrayList<>();
        }
        this.timelineOverrides.add(timelineOverridesItem);
        return this;
    }

    /**
     * Timeline overrides allow an implementation to provide versions of entities that will be valid in the future or have been in the past.
     * @return timelineOverrides
     **/

    @JsonProperty(JSON_PROPERTY_TIMELINE_OVERRIDES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<TimelineOverrideEducationSpecification> getTimelineOverrides() {
        return timelineOverrides;
    }

    @JsonProperty(JSON_PROPERTY_TIMELINE_OVERRIDES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTimelineOverrides(List<TimelineOverrideEducationSpecification> timelineOverrides) {
        this.timelineOverrides = timelineOverrides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WithTimelineOverrides withTimelineOverrides = (WithTimelineOverrides) o;
        return Objects.equals(this.timelineOverrides, withTimelineOverrides.timelineOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timelineOverrides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WithTimelineOverrides {\n");
        sb.append("    timelineOverrides: ").append(toIndentedString(timelineOverrides)).append("\n");
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

