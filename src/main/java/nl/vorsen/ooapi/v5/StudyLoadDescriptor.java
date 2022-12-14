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

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The amount of effort to complete this education in the specified unit.
 */

@JsonPropertyOrder({
        StudyLoadDescriptor.JSON_PROPERTY_STUDY_LOAD_UNIT,
        StudyLoadDescriptor.JSON_PROPERTY_VALUE
})

public class StudyLoadDescriptor {
    public static final String JSON_PROPERTY_STUDY_LOAD_UNIT = "studyLoadUnit";
    public static final String JSON_PROPERTY_VALUE = "value";
    private StudyLoadUnitEnum studyLoadUnit;
    private BigDecimal value;
    public StudyLoadDescriptor() {
    }

    public StudyLoadDescriptor studyLoadUnit(StudyLoadUnitEnum studyLoadUnit) {

        this.studyLoadUnit = studyLoadUnit;
        return this;
    }

    /**
     * The unit in which the studyload is specfied - contacttime: CONTACTUUR amount of time spent in classes - ects: ECTS_PUNT European Credit Transfer System - sbu: SBU studentloadhours - sp: STUDIEPUNT studentpoints - hour: UUR hours
     * @return studyLoadUnit
     **/

    @JsonProperty(JSON_PROPERTY_STUDY_LOAD_UNIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public StudyLoadUnitEnum getStudyLoadUnit() {
        return studyLoadUnit;
    }

    @JsonProperty(JSON_PROPERTY_STUDY_LOAD_UNIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStudyLoadUnit(StudyLoadUnitEnum studyLoadUnit) {
        this.studyLoadUnit = studyLoadUnit;
    }

    public StudyLoadDescriptor value(BigDecimal value) {

        this.value = value;
        return this;
    }

    /**
     * The amount of load depicted in numbers
     * @return value
     **/

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudyLoadDescriptor studyLoadDescriptor = (StudyLoadDescriptor) o;
        return Objects.equals(this.studyLoadUnit, studyLoadDescriptor.studyLoadUnit) &&
                Objects.equals(this.value, studyLoadDescriptor.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studyLoadUnit, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StudyLoadDescriptor {\n");
        sb.append("    studyLoadUnit: ").append(toIndentedString(studyLoadUnit)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
     * The unit in which the studyload is specfied - contacttime: CONTACTUUR amount of time spent in classes - ects: ECTS_PUNT European Credit Transfer System - sbu: SBU studentloadhours - sp: STUDIEPUNT studentpoints - hour: UUR hours
     */
    public enum StudyLoadUnitEnum {
        CONTACTTIME("contacttime"),

        ECTS("ects"),

        SBU("sbu"),

        SP("sp"),

        HOUR("hour");

        private final String value;

        StudyLoadUnitEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StudyLoadUnitEnum fromValue(String value) {
            for (StudyLoadUnitEnum b : StudyLoadUnitEnum.values()) {
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

