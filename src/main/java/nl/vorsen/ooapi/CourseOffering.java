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
 * CourseOffering
 */
@JsonPropertyOrder({
        CourseOffering.JSON_PROPERTY_OFFERING_ID,
        CourseOffering.JSON_PROPERTY_PRIMARY_CODE,
        CourseOffering.JSON_PROPERTY_OFFERING_TYPE,
        CourseOffering.JSON_PROPERTY_ACADEMIC_SESSION,
        CourseOffering.JSON_PROPERTY_NAME,
        CourseOffering.JSON_PROPERTY_ABBREVIATION,
        CourseOffering.JSON_PROPERTY_DESCRIPTION,
        CourseOffering.JSON_PROPERTY_TEACHING_LANGUAGE,
        CourseOffering.JSON_PROPERTY_MODE_OF_DELIVERY,
        CourseOffering.JSON_PROPERTY_MAX_NUMBER_STUDENTS,
        CourseOffering.JSON_PROPERTY_ENROLLED_NUMBER_STUDENTS,
        CourseOffering.JSON_PROPERTY_PENDING_NUMBER_STUDENTS,
        CourseOffering.JSON_PROPERTY_MIN_NUMBER_STUDENTS,
        CourseOffering.JSON_PROPERTY_RESULT_EXPECTED,
        CourseOffering.JSON_PROPERTY_RESULT_VALUE_TYPE,
        CourseOffering.JSON_PROPERTY_LINK,
        CourseOffering.JSON_PROPERTY_OTHER_CODES,
        CourseOffering.JSON_PROPERTY_CONSUMERS,
        CourseOffering.JSON_PROPERTY_EXT,
        CourseOffering.JSON_PROPERTY_START_DATE,
        CourseOffering.JSON_PROPERTY_END_DATE,
        CourseOffering.JSON_PROPERTY_ENROLL_START_DATE,
        CourseOffering.JSON_PROPERTY_ENROLL_END_DATE,
        CourseOffering.JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START,
        CourseOffering.JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END,
        CourseOffering.JSON_PROPERTY_ADDRESSES,
        CourseOffering.JSON_PROPERTY_PRICE_INFORMATION,
        CourseOffering.JSON_PROPERTY_COURSE,
        CourseOffering.JSON_PROPERTY_PROGRAM_OFFERING,
        CourseOffering.JSON_PROPERTY_ORGANIZATION
})

public class CourseOffering {
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
    public static final String JSON_PROPERTY_START_DATE = "startDate";
    public static final String JSON_PROPERTY_END_DATE = "endDate";
    public static final String JSON_PROPERTY_ENROLL_START_DATE = "enrollStartDate";
    public static final String JSON_PROPERTY_ENROLL_END_DATE = "enrollEndDate";
    public static final String JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START = "flexibleEntryPeriodStart";
    public static final String JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END = "flexibleEntryPeriodEnd";
    public static final String JSON_PROPERTY_ADDRESSES = "addresses";
    public static final String JSON_PROPERTY_PRICE_INFORMATION = "priceInformation";
    public static final String JSON_PROPERTY_COURSE = "course";
    public static final String JSON_PROPERTY_PROGRAM_OFFERING = "programOffering";
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
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate enrollStartDate;
    private LocalDate enrollEndDate;
    private LocalDate flexibleEntryPeriodStart;
    private LocalDate flexibleEntryPeriodEnd;
    private List<Address> addresses = null;
    private List<Cost> priceInformation = null;
    private String course;
    private String programOffering;
    private String organization;

    public CourseOffering() {
    }
    @JsonCreator
    public CourseOffering(
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

    public CourseOffering primaryCode(IdentifierEntry primaryCode) {

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

    public CourseOffering offeringType(OfferingTypeEnum offeringType) {

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

    public CourseOffering academicSession(String academicSession) {

        this.academicSession = academicSession;
        return this;
    }

    /**
     * The academicsession during which this courseoffering takes place. [&#x60;expandable&#x60;](#tag/academic_session_model) By default only the &#x60;academicSessionId&#x60; (a string) is returned. If the client requested an expansion of &#x60;academicSession&#x60; the full academicsession object should be returned.
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

    public CourseOffering name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public CourseOffering addNameItem(LanguageTypedString nameItem) {
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

    public CourseOffering abbreviation(String abbreviation) {

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

    public CourseOffering description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public CourseOffering addDescriptionItem(LanguageTypedString descriptionItem) {
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

    public CourseOffering teachingLanguage(String teachingLanguage) {

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

    public CourseOffering modeOfDelivery(List<ModeOfDeliveryEnum> modeOfDelivery) {

        this.modeOfDelivery = modeOfDelivery;
        return this;
    }

    public CourseOffering addModeOfDeliveryItem(ModeOfDeliveryEnum modeOfDeliveryItem) {
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

    public CourseOffering maxNumberStudents(BigDecimal maxNumberStudents) {

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

    public CourseOffering enrolledNumberStudents(BigDecimal enrolledNumberStudents) {

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

    public CourseOffering pendingNumberStudents(BigDecimal pendingNumberStudents) {

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

    public CourseOffering minNumberStudents(BigDecimal minNumberStudents) {

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

    public CourseOffering resultExpected(Boolean resultExpected) {

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

    public CourseOffering resultValueType(ResultValueType resultValueType) {

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

    public CourseOffering link(URI link) {

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

    public CourseOffering otherCodes(List<IdentifierEntry> otherCodes) {

        this.otherCodes = otherCodes;
        return this;
    }

    public CourseOffering addOtherCodesItem(IdentifierEntry otherCodesItem) {
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

    public CourseOffering consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public CourseOffering addConsumersItem(Consumer consumersItem) {
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

    public CourseOffering ext(Object ext) {

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

    public CourseOffering startDate(LocalDate startDate) {

        this.startDate = startDate;
        return this;
    }

    /**
     * The moment on which this offering starts, RFC3339 (full-date)
     * @return startDate
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public LocalDate getStartDate() {
        return startDate;
    }

    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public CourseOffering endDate(LocalDate endDate) {

        this.endDate = endDate;
        return this;
    }

    /**
     * The moment on which this offering ends, RFC3339 (full-date)
     * @return endDate
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public LocalDate getEndDate() {
        return endDate;
    }

    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public CourseOffering enrollStartDate(LocalDate enrollStartDate) {

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

    public CourseOffering enrollEndDate(LocalDate enrollEndDate) {

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

    public CourseOffering flexibleEntryPeriodStart(LocalDate flexibleEntryPeriodStart) {

        this.flexibleEntryPeriodStart = flexibleEntryPeriodStart;
        return this;
    }

    /**
     * If this is a course wherein participants can start at various moments, without missing anything, use this attribute in combination with &#x60;flexibleEntryPeriodEnd&#x60;.
     * @return flexibleEntryPeriodStart
     **/

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getFlexibleEntryPeriodStart() {
        return flexibleEntryPeriodStart;
    }

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_START)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFlexibleEntryPeriodStart(LocalDate flexibleEntryPeriodStart) {
        this.flexibleEntryPeriodStart = flexibleEntryPeriodStart;
    }

    public CourseOffering flexibleEntryPeriodEnd(LocalDate flexibleEntryPeriodEnd) {

        this.flexibleEntryPeriodEnd = flexibleEntryPeriodEnd;
        return this;
    }

    /**
     * If this is a course wherein participants can start at various moments, without missing anything, use this attribute in combination with &#x60;flexibleEntryPeriodStart&#x60;.
     * @return flexibleEntryPeriodEnd
     **/

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getFlexibleEntryPeriodEnd() {
        return flexibleEntryPeriodEnd;
    }

    @JsonProperty(JSON_PROPERTY_FLEXIBLE_ENTRY_PERIOD_END)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFlexibleEntryPeriodEnd(LocalDate flexibleEntryPeriodEnd) {
        this.flexibleEntryPeriodEnd = flexibleEntryPeriodEnd;
    }

    public CourseOffering addresses(List<Address> addresses) {

        this.addresses = addresses;
        return this;
    }

    public CourseOffering addAddressesItem(Address addressesItem) {
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

    public CourseOffering priceInformation(List<Cost> priceInformation) {

        this.priceInformation = priceInformation;
        return this;
    }

    public CourseOffering addPriceInformationItem(Cost priceInformationItem) {
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

    public CourseOffering course(String course) {

        this.course = course;
        return this;
    }

    /**
     * The course that is offered in this courseoffering. [&#x60;expandable&#x60;](#tag/course_model) By default only the &#x60;courseId&#x60; (a string) is returned. If the client requested an expansion of &#x60;course&#x60; the full course object should be returned.
     * @return course
     **/

    @JsonProperty(JSON_PROPERTY_COURSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getCourse() {
        return course;
    }

    @JsonProperty(JSON_PROPERTY_COURSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCourse(String course) {
        this.course = course;
    }

    public CourseOffering programOffering(String programOffering) {

        this.programOffering = programOffering;
        return this;
    }

    /**
     * The programoffering where this courseoffering is related to. [&#x60;expandable&#x60;](#tag/program_offering_model) By default only the &#x60;programOfferingId&#x60; (a string) is returned. If the client requested an expansion of &#x60;programOffering&#x60; the full programOffering object should be returned.
     * @return programOffering
     **/

    @JsonProperty(JSON_PROPERTY_PROGRAM_OFFERING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getProgramOffering() {
        return programOffering;
    }

    @JsonProperty(JSON_PROPERTY_PROGRAM_OFFERING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProgramOffering(String programOffering) {
        this.programOffering = programOffering;
    }

    public CourseOffering organization(String organization) {

        this.organization = organization;
        return this;
    }

    /**
     * The organization that manages this courseoffering. [&#x60;expandable&#x60;](#tag/organization_model) By default only the &#x60;organizationId&#x60; (a string) is returned. If the client requested an expansion of &#x60;organization&#x60; the full organization object should be returned.
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
        CourseOffering courseOffering = (CourseOffering) o;
        return Objects.equals(this.offeringId, courseOffering.offeringId) &&
                Objects.equals(this.primaryCode, courseOffering.primaryCode) &&
                Objects.equals(this.offeringType, courseOffering.offeringType) &&
                Objects.equals(this.academicSession, courseOffering.academicSession) &&
                Objects.equals(this.name, courseOffering.name) &&
                Objects.equals(this.abbreviation, courseOffering.abbreviation) &&
                Objects.equals(this.description, courseOffering.description) &&
                Objects.equals(this.teachingLanguage, courseOffering.teachingLanguage) &&
                Objects.equals(this.modeOfDelivery, courseOffering.modeOfDelivery) &&
                Objects.equals(this.maxNumberStudents, courseOffering.maxNumberStudents) &&
                Objects.equals(this.enrolledNumberStudents, courseOffering.enrolledNumberStudents) &&
                Objects.equals(this.pendingNumberStudents, courseOffering.pendingNumberStudents) &&
                Objects.equals(this.minNumberStudents, courseOffering.minNumberStudents) &&
                Objects.equals(this.resultExpected, courseOffering.resultExpected) &&
                Objects.equals(this.resultValueType, courseOffering.resultValueType) &&
                Objects.equals(this.link, courseOffering.link) &&
                Objects.equals(this.otherCodes, courseOffering.otherCodes) &&
                Objects.equals(this.consumers, courseOffering.consumers) &&
                Objects.equals(this.ext, courseOffering.ext) &&
                Objects.equals(this.startDate, courseOffering.startDate) &&
                Objects.equals(this.endDate, courseOffering.endDate) &&
                Objects.equals(this.enrollStartDate, courseOffering.enrollStartDate) &&
                Objects.equals(this.enrollEndDate, courseOffering.enrollEndDate) &&
                Objects.equals(this.flexibleEntryPeriodStart, courseOffering.flexibleEntryPeriodStart) &&
                Objects.equals(this.flexibleEntryPeriodEnd, courseOffering.flexibleEntryPeriodEnd) &&
                Objects.equals(this.addresses, courseOffering.addresses) &&
                Objects.equals(this.priceInformation, courseOffering.priceInformation) &&
                Objects.equals(this.course, courseOffering.course) &&
                Objects.equals(this.programOffering, courseOffering.programOffering) &&
                Objects.equals(this.organization, courseOffering.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offeringId, primaryCode, offeringType, academicSession, name, abbreviation, description, teachingLanguage, modeOfDelivery,
                maxNumberStudents, enrolledNumberStudents, pendingNumberStudents, minNumberStudents, resultExpected, resultValueType, link, otherCodes,
                consumers, ext, startDate, endDate, enrollStartDate, enrollEndDate, flexibleEntryPeriodStart, flexibleEntryPeriodEnd, addresses,
                priceInformation, course, programOffering, organization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CourseOffering {\n");
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
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    enrollStartDate: ").append(toIndentedString(enrollStartDate)).append("\n");
        sb.append("    enrollEndDate: ").append(toIndentedString(enrollEndDate)).append("\n");
        sb.append("    flexibleEntryPeriodStart: ").append(toIndentedString(flexibleEntryPeriodStart)).append("\n");
        sb.append("    flexibleEntryPeriodEnd: ").append(toIndentedString(flexibleEntryPeriodEnd)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    priceInformation: ").append(toIndentedString(priceInformation)).append("\n");
        sb.append("    course: ").append(toIndentedString(course)).append("\n");
        sb.append("    programOffering: ").append(toIndentedString(programOffering)).append("\n");
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

