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

import java.math.BigDecimal;
import java.net.URI;
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
 * Offering
 */
@JsonPropertyOrder({
        Offering.JSON_PROPERTY_OFFERING_ID,
        Offering.JSON_PROPERTY_PRIMARY_CODE,
        Offering.JSON_PROPERTY_OFFERING_TYPE,
        Offering.JSON_PROPERTY_ACADEMIC_SESSION,
        Offering.JSON_PROPERTY_NAME,
        Offering.JSON_PROPERTY_ABBREVIATION,
        Offering.JSON_PROPERTY_DESCRIPTION,
        Offering.JSON_PROPERTY_TEACHING_LANGUAGE,
        Offering.JSON_PROPERTY_MODE_OF_DELIVERY,
        Offering.JSON_PROPERTY_MAX_NUMBER_STUDENTS,
        Offering.JSON_PROPERTY_ENROLLED_NUMBER_STUDENTS,
        Offering.JSON_PROPERTY_PENDING_NUMBER_STUDENTS,
        Offering.JSON_PROPERTY_MIN_NUMBER_STUDENTS,
        Offering.JSON_PROPERTY_RESULT_EXPECTED,
        Offering.JSON_PROPERTY_RESULT_VALUE_TYPE,
        Offering.JSON_PROPERTY_LINK,
        Offering.JSON_PROPERTY_OTHER_CODES,
        Offering.JSON_PROPERTY_CONSUMERS,
        Offering.JSON_PROPERTY_EXT
})

public class Offering {
    public static final String JSON_PROPERTY_OFFERING_ID = "offeringId";
    public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
    public static final String JSON_PROPERTY_OFFERING_TYPE = "offeringType";
    public static final String JSON_PROPERTY_ACADEMIC_SESSION = "academicSession";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_ABBREVIATION = "abbreviation";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_TEACHING_LANGUAGE = "teachingLanguage";
    public static final String JSON_PROPERTY_MODE_OF_DELIVERY = "modeOfDelivery";
    public static final String JSON_PROPERTY_MAX_NUMBER_STUDENTS = "maxNumberStudents";
    public static final String JSON_PROPERTY_ENROLLED_NUMBER_STUDENTS = "enrolledNumberStudents";
    public static final String JSON_PROPERTY_PENDING_NUMBER_STUDENTS = "pendingNumberStudents";
    public static final String JSON_PROPERTY_MIN_NUMBER_STUDENTS = "minNumberStudents";
    public static final String JSON_PROPERTY_RESULT_EXPECTED = "resultExpected";
    public static final String JSON_PROPERTY_RESULT_VALUE_TYPE = "resultValueType";
    public static final String JSON_PROPERTY_LINK = "link";
    public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
    public static final String JSON_PROPERTY_CONSUMERS = "consumers";
    public static final String JSON_PROPERTY_EXT = "ext";
    private UUID offeringId;
    private IdentifierEntry primaryCode;
    private OfferingTypeEnum offeringType;
    private AcademicSession academicSession;
    private List<LanguageTypedString> name = new ArrayList<>();
    private String abbreviation;
    private List<LanguageTypedString> description = new ArrayList<>();
    private String teachingLanguage;
    private List<ModeOfDeliveryEnum> modeOfDelivery = null;
    private BigDecimal maxNumberStudents;
    private BigDecimal enrolledNumberStudents;
    private BigDecimal pendingNumberStudents;
    private BigDecimal minNumberStudents;
    private Boolean resultExpected;
    private ResultValueType resultValueType;
    private URI link;
    private List<IdentifierEntry> otherCodes = null;
    private List<Consumer> consumers = null;
    private Object ext;

    public Offering() {
    }
    @JsonCreator
    public Offering(
            @JsonProperty(JSON_PROPERTY_OFFERING_ID) UUID offeringId
    ) {
        this();
        this.offeringId = offeringId;
    }

    /**
     * Unique id of this offering
     * @return offeringId
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_OFFERING_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public UUID getOfferingId() {
        return offeringId;
    }

    public Offering primaryCode(IdentifierEntry primaryCode) {

        this.primaryCode = primaryCode;
        return this;
    }

    /**
     * Get primaryCode
     * @return primaryCode
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_PRIMARY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public IdentifierEntry getPrimaryCode() {
        return primaryCode;
    }

    @JsonProperty(JSON_PROPERTY_PRIMARY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPrimaryCode(IdentifierEntry primaryCode) {
        this.primaryCode = primaryCode;
    }

    public Offering offeringType(OfferingTypeEnum offeringType) {

        this.offeringType = offeringType;
        return this;
    }

    /**
     * The type of this offering
     * @return offeringType
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_OFFERING_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public OfferingTypeEnum getOfferingType() {
        return offeringType;
    }

    @JsonProperty(JSON_PROPERTY_OFFERING_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOfferingType(OfferingTypeEnum offeringType) {
        this.offeringType = offeringType;
    }

    public Offering academicSession(AcademicSession academicSession) {

        this.academicSession = academicSession;
        return this;
    }

    /**
     * Get academicSession
     * @return academicSession
     **/

    @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public AcademicSession getAcademicSession() {
        return academicSession;
    }

    @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAcademicSession(AcademicSession academicSession) {
        this.academicSession = academicSession;
    }

    public Offering name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public Offering addNameItem(LanguageTypedString nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * The name of this offering
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

    public Offering abbreviation(String abbreviation) {

        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * The abbreviation or internal code used to identify this offering
     * @return abbreviation
     **/

    @JsonProperty(JSON_PROPERTY_ABBREVIATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty(JSON_PROPERTY_ABBREVIATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Offering description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public Offering addDescriptionItem(LanguageTypedString descriptionItem) {
        this.description.add(descriptionItem);
        return this;
    }

    /**
     * The description of this offering.
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

    public Offering teachingLanguage(String teachingLanguage) {

        this.teachingLanguage = teachingLanguage;
        return this;
    }

    /**
     * The (primary) teaching language in which this offering is given, should be a three-letter language code as specified by ISO 639-2.
     * @return teachingLanguage
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_TEACHING_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getTeachingLanguage() {
        return teachingLanguage;
    }

    @JsonProperty(JSON_PROPERTY_TEACHING_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTeachingLanguage(String teachingLanguage) {
        this.teachingLanguage = teachingLanguage;
    }

    public Offering modeOfDelivery(List<ModeOfDeliveryEnum> modeOfDelivery) {

        this.modeOfDelivery = modeOfDelivery;
        return this;
    }

    public Offering addModeOfDeliveryItem(ModeOfDeliveryEnum modeOfDeliveryItem) {
        if (this.modeOfDelivery == null) {
            this.modeOfDelivery = new ArrayList<>();
        }
        this.modeOfDelivery.add(modeOfDeliveryItem);
        return this;
    }

    /**
     * The mode of delivery of the component (ECTS-mode of delivery) - distance-learning: afstandsleren - on campus: op de campus - online: online - hybrid: hybride - situated: op locatie
     * @return modeOfDelivery
     **/

    @JsonProperty(JSON_PROPERTY_MODE_OF_DELIVERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ModeOfDeliveryEnum> getModeOfDelivery() {
        return modeOfDelivery;
    }

    @JsonProperty(JSON_PROPERTY_MODE_OF_DELIVERY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setModeOfDelivery(List<ModeOfDeliveryEnum> modeOfDelivery) {
        this.modeOfDelivery = modeOfDelivery;
    }

    public Offering maxNumberStudents(BigDecimal maxNumberStudents) {

        this.maxNumberStudents = maxNumberStudents;
        return this;
    }

    /**
     * The maximum number of students allowed to enroll for this offering
     * minimum: 0
     * @return maxNumberStudents
     **/

    @JsonProperty(JSON_PROPERTY_MAX_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getMaxNumberStudents() {
        return maxNumberStudents;
    }

    @JsonProperty(JSON_PROPERTY_MAX_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMaxNumberStudents(BigDecimal maxNumberStudents) {
        this.maxNumberStudents = maxNumberStudents;
    }

    public Offering enrolledNumberStudents(BigDecimal enrolledNumberStudents) {

        this.enrolledNumberStudents = enrolledNumberStudents;
        return this;
    }

    /**
     * The number of students that have already enrolled for this offering
     * minimum: 0
     * @return enrolledNumberStudents
     **/

    @JsonProperty(JSON_PROPERTY_ENROLLED_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getEnrolledNumberStudents() {
        return enrolledNumberStudents;
    }

    @JsonProperty(JSON_PROPERTY_ENROLLED_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnrolledNumberStudents(BigDecimal enrolledNumberStudents) {
        this.enrolledNumberStudents = enrolledNumberStudents;
    }

    public Offering pendingNumberStudents(BigDecimal pendingNumberStudents) {

        this.pendingNumberStudents = pendingNumberStudents;
        return this;
    }

    /**
     * The number of students that have a pending enrollment request for this offering
     * minimum: 0
     * @return pendingNumberStudents
     **/

    @JsonProperty(JSON_PROPERTY_PENDING_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getPendingNumberStudents() {
        return pendingNumberStudents;
    }

    @JsonProperty(JSON_PROPERTY_PENDING_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPendingNumberStudents(BigDecimal pendingNumberStudents) {
        this.pendingNumberStudents = pendingNumberStudents;
    }

    public Offering minNumberStudents(BigDecimal minNumberStudents) {

        this.minNumberStudents = minNumberStudents;
        return this;
    }

    /**
     * The minimum number of students needed for this offering to proceed
     * minimum: 0
     * @return minNumberStudents
     **/

    @JsonProperty(JSON_PROPERTY_MIN_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getMinNumberStudents() {
        return minNumberStudents;
    }

    @JsonProperty(JSON_PROPERTY_MIN_NUMBER_STUDENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMinNumberStudents(BigDecimal minNumberStudents) {
        this.minNumberStudents = minNumberStudents;
    }

    public Offering resultExpected(Boolean resultExpected) {

        this.resultExpected = resultExpected;
        return this;
    }

    /**
     * resultExpected, previously knwon as isLineItem is used so the specific instance of the object is identified as being an element that CAN contain “grade” information. Offerings do not always have to result in a grade or an other type of result.  If there is a result expected from a programOffering/courseOffering/componentOffering the is resultExpected field should parse true
     * @return resultExpected
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_RESULT_EXPECTED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Boolean getResultExpected() {
        return resultExpected;
    }

    @JsonProperty(JSON_PROPERTY_RESULT_EXPECTED)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setResultExpected(Boolean resultExpected) {
        this.resultExpected = resultExpected;
    }

    public Offering resultValueType(ResultValueType resultValueType) {

        this.resultValueType = resultValueType;
        return this;
    }

    /**
     * Get resultValueType
     * @return resultValueType
     **/

    @JsonProperty(JSON_PROPERTY_RESULT_VALUE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ResultValueType getResultValueType() {
        return resultValueType;
    }

    @JsonProperty(JSON_PROPERTY_RESULT_VALUE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResultValueType(ResultValueType resultValueType) {
        this.resultValueType = resultValueType;
    }

    public Offering link(URI link) {

        this.link = link;
        return this;
    }

    /**
     * URL of this offering&#39;s webpage.
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

    public Offering otherCodes(List<IdentifierEntry> otherCodes) {

        this.otherCodes = otherCodes;
        return this;
    }

    public Offering addOtherCodesItem(IdentifierEntry otherCodesItem) {
        if (this.otherCodes == null) {
            this.otherCodes = new ArrayList<>();
        }
        this.otherCodes.add(otherCodesItem);
        return this;
    }

    /**
     * An array of additional human readable codes/identifiers for the entity being described.
     * @return otherCodes
     **/

    @JsonProperty(JSON_PROPERTY_OTHER_CODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<IdentifierEntry> getOtherCodes() {
        return otherCodes;
    }

    @JsonProperty(JSON_PROPERTY_OTHER_CODES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOtherCodes(List<IdentifierEntry> otherCodes) {
        this.otherCodes = otherCodes;
    }

    public Offering consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public Offering addConsumersItem(Consumer consumersItem) {
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

    public Offering ext(Object ext) {

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
        Offering offering = (Offering) o;
        return Objects.equals(this.offeringId, offering.offeringId) &&
                Objects.equals(this.primaryCode, offering.primaryCode) &&
                Objects.equals(this.offeringType, offering.offeringType) &&
                Objects.equals(this.academicSession, offering.academicSession) &&
                Objects.equals(this.name, offering.name) &&
                Objects.equals(this.abbreviation, offering.abbreviation) &&
                Objects.equals(this.description, offering.description) &&
                Objects.equals(this.teachingLanguage, offering.teachingLanguage) &&
                Objects.equals(this.modeOfDelivery, offering.modeOfDelivery) &&
                Objects.equals(this.maxNumberStudents, offering.maxNumberStudents) &&
                Objects.equals(this.enrolledNumberStudents, offering.enrolledNumberStudents) &&
                Objects.equals(this.pendingNumberStudents, offering.pendingNumberStudents) &&
                Objects.equals(this.minNumberStudents, offering.minNumberStudents) &&
                Objects.equals(this.resultExpected, offering.resultExpected) &&
                Objects.equals(this.resultValueType, offering.resultValueType) &&
                Objects.equals(this.link, offering.link) &&
                Objects.equals(this.otherCodes, offering.otherCodes) &&
                Objects.equals(this.consumers, offering.consumers) &&
                Objects.equals(this.ext, offering.ext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offeringId, primaryCode, offeringType, academicSession, name, abbreviation, description, teachingLanguage, modeOfDelivery,
                maxNumberStudents, enrolledNumberStudents, pendingNumberStudents, minNumberStudents, resultExpected, resultValueType, link, otherCodes,
                consumers, ext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Offering {\n");
        sb.append("    offeringId: ").append(toIndentedString(offeringId)).append("\n");
        sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
        sb.append("    offeringType: ").append(toIndentedString(offeringType)).append("\n");
        sb.append("    academicSession: ").append(toIndentedString(academicSession)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    teachingLanguage: ").append(toIndentedString(teachingLanguage)).append("\n");
        sb.append("    modeOfDelivery: ").append(toIndentedString(modeOfDelivery)).append("\n");
        sb.append("    maxNumberStudents: ").append(toIndentedString(maxNumberStudents)).append("\n");
        sb.append("    enrolledNumberStudents: ").append(toIndentedString(enrolledNumberStudents)).append("\n");
        sb.append("    pendingNumberStudents: ").append(toIndentedString(pendingNumberStudents)).append("\n");
        sb.append("    minNumberStudents: ").append(toIndentedString(minNumberStudents)).append("\n");
        sb.append("    resultExpected: ").append(toIndentedString(resultExpected)).append("\n");
        sb.append("    resultValueType: ").append(toIndentedString(resultValueType)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    otherCodes: ").append(toIndentedString(otherCodes)).append("\n");
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
     * The type of this offering
     */
    public enum OfferingTypeEnum {
        PROGRAM("program"),

        COURSE("course"),

        COMPONENT("component");

        private final String value;

        OfferingTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static OfferingTypeEnum fromValue(String value) {
            for (OfferingTypeEnum b : OfferingTypeEnum.values()) {
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

    /**
     * Gets or Sets modeOfDelivery
     */
    public enum ModeOfDeliveryEnum {
        DISTANCE_LEARNING("distance-learning"),

        ON_CAMPUS("on campus"),

        ONLINE("online"),

        HYBRID("hybrid"),

        SITUATED("situated");

        private final String value;

        ModeOfDeliveryEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ModeOfDeliveryEnum fromValue(String value) {
            for (ModeOfDeliveryEnum b : ModeOfDeliveryEnum.values()) {
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

