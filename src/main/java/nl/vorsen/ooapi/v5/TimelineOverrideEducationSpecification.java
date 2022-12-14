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

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A timeline override of the EducationSpecification.
 */

@JsonPropertyOrder({
        TimelineOverrideEducationSpecification.JSON_PROPERTY_VALID_FROM,
        TimelineOverrideEducationSpecification.JSON_PROPERTY_VALID_TO,
        TimelineOverrideEducationSpecification.JSON_PROPERTY_EDUCATION_SPECIFICATION
})

public class TimelineOverrideEducationSpecification {
    public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
    public static final String JSON_PROPERTY_VALID_TO = "validTo";
    public static final String JSON_PROPERTY_EDUCATION_SPECIFICATION = "educationSpecification";
    private LocalDate validFrom;
    private LocalDate validTo;
    private EducationSpecificationProperties educationSpecification;

    public TimelineOverrideEducationSpecification() {
    }

    public TimelineOverrideEducationSpecification validFrom(LocalDate validFrom) {

        this.validFrom = validFrom;
        return this;
    }

    /**
     * The day on which this timelineOverride starts (inclusive), RFC3339 (date)
     * @return validFrom
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public LocalDate getValidFrom() {
        return validFrom;
    }

    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public TimelineOverrideEducationSpecification validTo(LocalDate validTo) {

        this.validTo = validTo;
        return this;
    }

    /**
     * The day on which this timelineOverride ends (exclusive), RFC3339 (date)
     * @return validTo
     **/

    @JsonProperty(JSON_PROPERTY_VALID_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getValidTo() {
        return validTo;
    }

    @JsonProperty(JSON_PROPERTY_VALID_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public TimelineOverrideEducationSpecification educationSpecification(EducationSpecificationProperties educationSpecification) {

        this.educationSpecification = educationSpecification;
        return this;
    }

    /**
     * Get educationSpecification
     * @return educationSpecification
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public EducationSpecificationProperties getEducationSpecification() {
        return educationSpecification;
    }

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEducationSpecification(EducationSpecificationProperties educationSpecification) {
        this.educationSpecification = educationSpecification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineOverrideEducationSpecification timelineOverrideEducationSpecification = (TimelineOverrideEducationSpecification) o;
        return Objects.equals(this.validFrom, timelineOverrideEducationSpecification.validFrom) &&
                Objects.equals(this.validTo, timelineOverrideEducationSpecification.validTo) &&
                Objects.equals(this.educationSpecification, timelineOverrideEducationSpecification.educationSpecification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validFrom, validTo, educationSpecification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineOverrideEducationSpecification {\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
        sb.append("    educationSpecification: ").append(toIndentedString(educationSpecification)).append("\n");
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

