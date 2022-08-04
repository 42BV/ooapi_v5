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
import java.time.LocalDate;
import java.time.OffsetDateTime;
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
 * ComponentOffering
 */
@JsonPropertyOrder({
        ComponentOffering.JSON_PROPERTY_OFFERING_ID,
        ComponentOffering.JSON_PROPERTY_PRIMARY_CODE,
        ComponentOffering.JSON_PROPERTY_OFFERING_TYPE,
        ComponentOffering.JSON_PROPERTY_ACADEMIC_SESSION,
        ComponentOffering.JSON_PROPERTY_NAME,
        ComponentOffering.JSON_PROPERTY_ABBREVIATION,
        ComponentOffering.JSON_PROPERTY_DESCRIPTION,
        ComponentOffering.JSON_PROPERTY_TEACHING_LANGUAGE,
        ComponentOffering.JSON_PROPERTY_MODE_OF_DELIVERY,
        ComponentOffering.JSON_PROPERTY_MAX_NUMBER_STUDENTS,
        ComponentOffering.JSON_PROPERTY_ENROLLED_NUMBER_STUDENTS,
        ComponentOffering.JSON_PROPERTY_PENDING_NUMBER_STUDENTS,
        ComponentOffering.JSON_PROPERTY_MIN_NUMBER_STUDENTS,
        ComponentOffering.JSON_PROPERTY_RESULT_EXPECTED,
        ComponentOffering.JSON_PROPERTY_RESULT_VALUE_TYPE,
        ComponentOffering.JSON_PROPERTY_LINK,
        ComponentOffering.JSON_PROPERTY_OTHER_CODES,
        ComponentOffering.JSON_PROPERTY_CONSUMERS,
        ComponentOffering.JSON_PROPERTY_EXT,
        ComponentOffering.JSON_PROPERTY_START_DATE_TIME,
        ComponentOffering.JSON_PROPERTY_END_DATE_TIME,
        ComponentOffering.JSON_PROPERTY_ENROLL_START_DATE,
        ComponentOffering.JSON_PROPERTY_ENROLL_END_DATE,
        ComponentOffering.JSON_PROPERTY_RESULT_WEIGHT,
        ComponentOffering.JSON_PROPERTY_ADDRESSES,
        ComponentOffering.JSON_PROPERTY_PRICE_INFORMATION,
        ComponentOffering.JSON_PROPERTY_ROOM,
        ComponentOffering.JSON_PROPERTY_COMPONENT,
        ComponentOffering.JSON_PROPERTY_COURSE_OFFERING,
        ComponentOffering.JSON_PROPERTY_ORGANIZATION
})

public class ComponentOffering {
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
    public static final String JSON_PROPERTY_START_DATE_TIME = "startDateTime";
    public static final String JSON_PROPERTY_END_DATE_TIME = "endDateTime";
    public static final String JSON_PROPERTY_ENROLL_START_DATE = "enrollStartDate";
    public static final String JSON_PROPERTY_ENROLL_END_DATE = "enrollEndDate";
    public static final String JSON_PROPERTY_RESULT_WEIGHT = "resultWeight";
    public static final String JSON_PROPERTY_ADDRESSES = "addresses";
    public static final String JSON_PROPERTY_PRICE_INFORMATION = "priceInformation";
    public static final String JSON_PROPERTY_ROOM = "room";
    public static final String JSON_PROPERTY_COMPONENT = "component";
    public static final String JSON_PROPERTY_COURSE_OFFERING = "courseOffering";
    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    private UUID offeringId;
    private IdentifierEntry primaryCode;
    private OfferingTypeEnum offeringType;
    private String academicSession;
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
    private OffsetDateTime startDateTime;
    private OffsetDateTime endDateTime;
    private LocalDate enrollStartDate;
    private LocalDate enrollEndDate;
    private Integer resultWeight;
    private List<Address> addresses = null;
    private List<Cost> priceInformation = null;
    private Room room;
    private String component;
    private String courseOffering;
    private String organization;

    public ComponentOffering() {
    }
    @JsonCreator
    public ComponentOffering(
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

    public ComponentOffering primaryCode(IdentifierEntry primaryCode) {

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

    public ComponentOffering offeringType(OfferingTypeEnum offeringType) {

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

    public ComponentOffering academicSession(String academicSession) {

        this.academicSession = academicSession;
        return this;
    }

    /**
     * The academicsession during which this componentoffering takes place. [&#x60;expandable&#x60;](#tag/academic_session_model) By default only the &#x60;academicSessionId&#x60; (a string) is returned. If the client requested an expansion of &#x60;academicSession&#x60; the full academicsession object should be returned.
     * @return academicSession
     **/

    @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getAcademicSession() {
        return academicSession;
    }

    @JsonProperty(JSON_PROPERTY_ACADEMIC_SESSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAcademicSession(String academicSession) {
        this.academicSession = academicSession;
    }

    public ComponentOffering name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public ComponentOffering addNameItem(LanguageTypedString nameItem) {
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

    public ComponentOffering abbreviation(String abbreviation) {

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

    public ComponentOffering description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public ComponentOffering addDescriptionItem(LanguageTypedString descriptionItem) {
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

    public ComponentOffering teachingLanguage(String teachingLanguage) {

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

    public ComponentOffering modeOfDelivery(List<ModeOfDeliveryEnum> modeOfDelivery) {

        this.modeOfDelivery = modeOfDelivery;
        return this;
    }

    public ComponentOffering addModeOfDeliveryItem(ModeOfDeliveryEnum modeOfDeliveryItem) {
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

    public ComponentOffering maxNumberStudents(BigDecimal maxNumberStudents) {

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

    public ComponentOffering enrolledNumberStudents(BigDecimal enrolledNumberStudents) {

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

    public ComponentOffering pendingNumberStudents(BigDecimal pendingNumberStudents) {

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

    public ComponentOffering minNumberStudents(BigDecimal minNumberStudents) {

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

    public ComponentOffering resultExpected(Boolean resultExpected) {

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

    public ComponentOffering resultValueType(ResultValueType resultValueType) {

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

    public ComponentOffering link(URI link) {

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

    public ComponentOffering otherCodes(List<IdentifierEntry> otherCodes) {

        this.otherCodes = otherCodes;
        return this;
    }

    public ComponentOffering addOtherCodesItem(IdentifierEntry otherCodesItem) {
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

    public ComponentOffering consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public ComponentOffering addConsumersItem(Consumer consumersItem) {
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

    public ComponentOffering ext(Object ext) {

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

    public ComponentOffering startDateTime(OffsetDateTime startDateTime) {

        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * The moment on which this offering starts, RFC3339 (date-time)
     * @return startDateTime
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public OffsetDateTime getStartDateTime() {
        return startDateTime;
    }

    @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public ComponentOffering endDateTime(OffsetDateTime endDateTime) {

        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * The moment on which this offering ends, RFC3339 (date-time)
     * @return endDateTime
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public OffsetDateTime getEndDateTime() {
        return endDateTime;
    }

    @JsonProperty(JSON_PROPERTY_END_DATE_TIME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEndDateTime(OffsetDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public ComponentOffering enrollStartDate(LocalDate enrollStartDate) {

        this.enrollStartDate = enrollStartDate;
        return this;
    }

    /**
     * The first day on which a student can enroll for this course.
     * @return enrollStartDate
     **/

    @JsonProperty(JSON_PROPERTY_ENROLL_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getEnrollStartDate() {
        return enrollStartDate;
    }

    @JsonProperty(JSON_PROPERTY_ENROLL_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnrollStartDate(LocalDate enrollStartDate) {
        this.enrollStartDate = enrollStartDate;
    }

    public ComponentOffering enrollEndDate(LocalDate enrollEndDate) {

        this.enrollEndDate = enrollEndDate;
        return this;
    }

    /**
     * The last day on which a student can enroll for this course.
     * @return enrollEndDate
     **/

    @JsonProperty(JSON_PROPERTY_ENROLL_END_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getEnrollEndDate() {
        return enrollEndDate;
    }

    @JsonProperty(JSON_PROPERTY_ENROLL_END_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnrollEndDate(LocalDate enrollEndDate) {
        this.enrollEndDate = enrollEndDate;
    }

    public ComponentOffering resultWeight(Integer resultWeight) {

        this.resultWeight = resultWeight;
        return this;
    }

    /**
     * The result weight of this offering
     * minimum: 0
     * maximum: 100
     * @return resultWeight
     **/

    @JsonProperty(JSON_PROPERTY_RESULT_WEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getResultWeight() {
        return resultWeight;
    }

    @JsonProperty(JSON_PROPERTY_RESULT_WEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResultWeight(Integer resultWeight) {
        this.resultWeight = resultWeight;
    }

    public ComponentOffering addresses(List<Address> addresses) {

        this.addresses = addresses;
        return this;
    }

    public ComponentOffering addAddressesItem(Address addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
     * Addresses for this offering
     * @return addresses
     **/

    @JsonProperty(JSON_PROPERTY_ADDRESSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public ComponentOffering priceInformation(List<Cost> priceInformation) {

        this.priceInformation = priceInformation;
        return this;
    }

    public ComponentOffering addPriceInformationItem(Cost priceInformationItem) {
        if (this.priceInformation == null) {
            this.priceInformation = new ArrayList<>();
        }
        this.priceInformation.add(priceInformationItem);
        return this;
    }

    /**
     * Price information for this offering.
     * @return priceInformation
     **/

    @JsonProperty(JSON_PROPERTY_PRICE_INFORMATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<Cost> getPriceInformation() {
        return priceInformation;
    }

    @JsonProperty(JSON_PROPERTY_PRICE_INFORMATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPriceInformation(List<Cost> priceInformation) {
        this.priceInformation = priceInformation;
    }

    public ComponentOffering room(Room room) {

        this.room = room;
        return this;
    }

    /**
     * Get room
     * @return room
     **/

    @JsonProperty(JSON_PROPERTY_ROOM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Room getRoom() {
        return room;
    }

    @JsonProperty(JSON_PROPERTY_ROOM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRoom(Room room) {
        this.room = room;
    }

    public ComponentOffering component(String component) {

        this.component = component;
        return this;
    }

    /**
     * The component that is offered in this componentoffering. [&#x60;expandable&#x60;](#tag/component_model) By default only the &#x60;componentId&#x60; (a string) is returned. If the client requested an expansion of &#x60;component&#x60; the full component object should be returned.
     * @return component
     **/

    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getComponent() {
        return component;
    }

    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponent(String component) {
        this.component = component;
    }

    public ComponentOffering courseOffering(String courseOffering) {

        this.courseOffering = courseOffering;
        return this;
    }

    /**
     * The courseoffering where this componentoffering is related to. [&#x60;expandable&#x60;](#tag/course_offering_model) By default only the &#x60;courseOfferingId&#x60; (a string) is returned. If the client requested an expansion of &#x60;courseOffering&#x60; the full courseOffering object should be returned.
     * @return courseOffering
     **/

    @JsonProperty(JSON_PROPERTY_COURSE_OFFERING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getCourseOffering() {
        return courseOffering;
    }

    @JsonProperty(JSON_PROPERTY_COURSE_OFFERING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCourseOffering(String courseOffering) {
        this.courseOffering = courseOffering;
    }

    public ComponentOffering organization(String organization) {

        this.organization = organization;
        return this;
    }

    /**
     * The organization that manages this componentoffering. [&#x60;expandable&#x60;](#tag/organization_model) By default only the &#x60;organizationId&#x60; (a string) is returned. If the client requested an expansion of &#x60;organization&#x60; the full organization object should be returned.
     * @return organization
     **/

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOrganization() {
        return organization;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentOffering componentOffering = (ComponentOffering) o;
        return Objects.equals(this.offeringId, componentOffering.offeringId) &&
                Objects.equals(this.primaryCode, componentOffering.primaryCode) &&
                Objects.equals(this.offeringType, componentOffering.offeringType) &&
                Objects.equals(this.academicSession, componentOffering.academicSession) &&
                Objects.equals(this.name, componentOffering.name) &&
                Objects.equals(this.abbreviation, componentOffering.abbreviation) &&
                Objects.equals(this.description, componentOffering.description) &&
                Objects.equals(this.teachingLanguage, componentOffering.teachingLanguage) &&
                Objects.equals(this.modeOfDelivery, componentOffering.modeOfDelivery) &&
                Objects.equals(this.maxNumberStudents, componentOffering.maxNumberStudents) &&
                Objects.equals(this.enrolledNumberStudents, componentOffering.enrolledNumberStudents) &&
                Objects.equals(this.pendingNumberStudents, componentOffering.pendingNumberStudents) &&
                Objects.equals(this.minNumberStudents, componentOffering.minNumberStudents) &&
                Objects.equals(this.resultExpected, componentOffering.resultExpected) &&
                Objects.equals(this.resultValueType, componentOffering.resultValueType) &&
                Objects.equals(this.link, componentOffering.link) &&
                Objects.equals(this.otherCodes, componentOffering.otherCodes) &&
                Objects.equals(this.consumers, componentOffering.consumers) &&
                Objects.equals(this.ext, componentOffering.ext) &&
                Objects.equals(this.startDateTime, componentOffering.startDateTime) &&
                Objects.equals(this.endDateTime, componentOffering.endDateTime) &&
                Objects.equals(this.enrollStartDate, componentOffering.enrollStartDate) &&
                Objects.equals(this.enrollEndDate, componentOffering.enrollEndDate) &&
                Objects.equals(this.resultWeight, componentOffering.resultWeight) &&
                Objects.equals(this.addresses, componentOffering.addresses) &&
                Objects.equals(this.priceInformation, componentOffering.priceInformation) &&
                Objects.equals(this.room, componentOffering.room) &&
                Objects.equals(this.component, componentOffering.component) &&
                Objects.equals(this.courseOffering, componentOffering.courseOffering) &&
                Objects.equals(this.organization, componentOffering.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offeringId, primaryCode, offeringType, academicSession, name, abbreviation, description, teachingLanguage, modeOfDelivery,
                maxNumberStudents, enrolledNumberStudents, pendingNumberStudents, minNumberStudents, resultExpected, resultValueType, link, otherCodes,
                consumers, ext, startDateTime, endDateTime, enrollStartDate, enrollEndDate, resultWeight, addresses, priceInformation, room, component,
                courseOffering, organization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentOffering {\n");
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
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    enrollStartDate: ").append(toIndentedString(enrollStartDate)).append("\n");
        sb.append("    enrollEndDate: ").append(toIndentedString(enrollEndDate)).append("\n");
        sb.append("    resultWeight: ").append(toIndentedString(resultWeight)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    priceInformation: ").append(toIndentedString(priceInformation)).append("\n");
        sb.append("    room: ").append(toIndentedString(room)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    courseOffering: ").append(toIndentedString(courseOffering)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

