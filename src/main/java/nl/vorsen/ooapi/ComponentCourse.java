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
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The course of which this component is a part. [&#x60;expandable&#x60;](#tag/course_model) By default only the &#x60;courseId&#x60; (a string) is returned. If the client requested an expansion of &#x60;course&#x60; the full course object should be returned. 
 */

@JsonPropertyOrder({
        ComponentCourse.JSON_PROPERTY_COURSE_ID,
        ComponentCourse.JSON_PROPERTY_PRIMARY_CODE,
        ComponentCourse.JSON_PROPERTY_NAME,
        ComponentCourse.JSON_PROPERTY_ABBREVIATION,
        ComponentCourse.JSON_PROPERTY_STUDY_LOAD,
        ComponentCourse.JSON_PROPERTY_MODE_OF_DELIVERY,
        ComponentCourse.JSON_PROPERTY_DURATION,
        ComponentCourse.JSON_PROPERTY_FIRST_START_DATE,
        ComponentCourse.JSON_PROPERTY_DESCRIPTION,
        ComponentCourse.JSON_PROPERTY_TEACHING_LANGUAGE,
        ComponentCourse.JSON_PROPERTY_FIELDS_OF_STUDY,
        ComponentCourse.JSON_PROPERTY_LEARNING_OUTCOMES,
        ComponentCourse.JSON_PROPERTY_ADMISSION_REQUIREMENTS,
        ComponentCourse.JSON_PROPERTY_QUALIFICATION_REQUIREMENTS,
        ComponentCourse.JSON_PROPERTY_LEVEL,
        ComponentCourse.JSON_PROPERTY_ENROLLMENT,
        ComponentCourse.JSON_PROPERTY_RESOURCES,
        ComponentCourse.JSON_PROPERTY_ASSESSMENT,
        ComponentCourse.JSON_PROPERTY_LINK,
        ComponentCourse.JSON_PROPERTY_EDUCATION_SPECIFICATION,
        ComponentCourse.JSON_PROPERTY_ADDRESSES,
        ComponentCourse.JSON_PROPERTY_OTHER_CODES,
        ComponentCourse.JSON_PROPERTY_CONSUMERS,
        ComponentCourse.JSON_PROPERTY_EXT,
        ComponentCourse.JSON_PROPERTY_PROGRAMS,
        ComponentCourse.JSON_PROPERTY_COORDINATORS,
        ComponentCourse.JSON_PROPERTY_ORGANIZATION,
        ComponentCourse.JSON_PROPERTY_VALID_FROM,
        ComponentCourse.JSON_PROPERTY_VALID_TO
})
@JsonTypeName("Component_course")

public class ComponentCourse {
    public static final String JSON_PROPERTY_COURSE_ID = "courseId";
    public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_ABBREVIATION = "abbreviation";
    public static final String JSON_PROPERTY_STUDY_LOAD = "studyLoad";
    public static final String JSON_PROPERTY_MODE_OF_DELIVERY = "modeOfDelivery";
    public static final String JSON_PROPERTY_DURATION = "duration";
    public static final String JSON_PROPERTY_FIRST_START_DATE = "firstStartDate";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_TEACHING_LANGUAGE = "teachingLanguage";
    public static final String JSON_PROPERTY_FIELDS_OF_STUDY = "fieldsOfStudy";
    public static final String JSON_PROPERTY_LEARNING_OUTCOMES = "learningOutcomes";
    public static final String JSON_PROPERTY_ADMISSION_REQUIREMENTS = "admissionRequirements";
    public static final String JSON_PROPERTY_QUALIFICATION_REQUIREMENTS = "qualificationRequirements";
    public static final String JSON_PROPERTY_LEVEL = "level";
    public static final String JSON_PROPERTY_ENROLLMENT = "enrollment";
    public static final String JSON_PROPERTY_RESOURCES = "resources";
    public static final String JSON_PROPERTY_ASSESSMENT = "assessment";
    public static final String JSON_PROPERTY_LINK = "link";
    public static final String JSON_PROPERTY_EDUCATION_SPECIFICATION = "educationSpecification";
    public static final String JSON_PROPERTY_ADDRESSES = "addresses";
    public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
    public static final String JSON_PROPERTY_CONSUMERS = "consumers";
    public static final String JSON_PROPERTY_EXT = "ext";
    public static final String JSON_PROPERTY_PROGRAMS = "programs";
    public static final String JSON_PROPERTY_COORDINATORS = "coordinators";
    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
    public static final String JSON_PROPERTY_VALID_TO = "validTo";
    private UUID courseId;
    private IdentifierEntry primaryCode;
    private List<LanguageTypedString> name = new ArrayList<>();
    private String abbreviation;
    private StudyLoadDescriptor studyLoad;
    private List<ModeOfDeliveryEnum> modeOfDelivery = null;
    private String duration;
    private LocalDate firstStartDate;
    private List<LanguageTypedString> description = new ArrayList<>();
    private String teachingLanguage;
    private String fieldsOfStudy;
    private List<List<LanguageTypedString>> learningOutcomes = null;
    private List<LanguageTypedString> admissionRequirements = null;
    private List<LanguageTypedString> qualificationRequirements = null;
    private Level level;
    private List<LanguageTypedString> enrollment = null;
    private List<String> resources = null;
    private List<LanguageTypedString> assessment = null;
    private URI link;
    private CoursePropertiesEducationSpecification educationSpecification;
    private List<Address> addresses = null;
    private List<IdentifierEntry> otherCodes = null;
    private List<Consumer> consumers = null;
    private Object ext;
    private List<ProgramPropertiesChildrenInner> programs = null;
    private List<ProgramPropertiesCoordinatorsInner> coordinators = null;
    private CoursePropertiesOrganization organization;
    private LocalDate validFrom;
    private LocalDate validTo;
    public ComponentCourse() {
    }

    @JsonCreator
    public ComponentCourse(
            @JsonProperty(JSON_PROPERTY_COURSE_ID) UUID courseId
    ) {
        this();
        this.courseId = courseId;
    }

    /**
     * Unique id of this course
     * @return courseId
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_COURSE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public UUID getCourseId() {
        return courseId;
    }

    public ComponentCourse primaryCode(IdentifierEntry primaryCode) {

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

    public ComponentCourse name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public ComponentCourse addNameItem(LanguageTypedString nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * The name of this course (ECTS-title)
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

    public ComponentCourse abbreviation(String abbreviation) {

        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * The abbreviation or internal code used to identify this course (ECTS-code)
     * @return abbreviation
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_ABBREVIATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty(JSON_PROPERTY_ABBREVIATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public ComponentCourse studyLoad(StudyLoadDescriptor studyLoad) {

        this.studyLoad = studyLoad;
        return this;
    }

    /**
     * Get studyLoad
     * @return studyLoad
     **/

    @JsonProperty(JSON_PROPERTY_STUDY_LOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public StudyLoadDescriptor getStudyLoad() {
        return studyLoad;
    }

    @JsonProperty(JSON_PROPERTY_STUDY_LOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStudyLoad(StudyLoadDescriptor studyLoad) {
        this.studyLoad = studyLoad;
    }

    public ComponentCourse modeOfDelivery(List<ModeOfDeliveryEnum> modeOfDelivery) {

        this.modeOfDelivery = modeOfDelivery;
        return this;
    }

    public ComponentCourse addModeOfDeliveryItem(ModeOfDeliveryEnum modeOfDeliveryItem) {
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

    public ComponentCourse duration(String duration) {

        this.duration = duration;
        return this;
    }

    /**
     * The duration of this course. The duration format is from the ISO 8601 ABNF as given in Appendix A of RFC 3339.
     * @return duration
     **/

    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getDuration() {
        return duration;
    }

    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ComponentCourse firstStartDate(LocalDate firstStartDate) {

        this.firstStartDate = firstStartDate;
        return this;
    }

    /**
     * The date when participants can follow this course for the first time.
     * @return firstStartDate
     **/

    @JsonProperty(JSON_PROPERTY_FIRST_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getFirstStartDate() {
        return firstStartDate;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFirstStartDate(LocalDate firstStartDate) {
        this.firstStartDate = firstStartDate;
    }

    public ComponentCourse description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public ComponentCourse addDescriptionItem(LanguageTypedString descriptionItem) {
        this.description.add(descriptionItem);
        return this;
    }

    /**
     * The description of this course (ECTS-description).
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

    public ComponentCourse teachingLanguage(String teachingLanguage) {

        this.teachingLanguage = teachingLanguage;
        return this;
    }

    /**
     * The (primary) teaching language in which this course is given, should be a three-letter language code as specified by ISO 639-2.
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

    public ComponentCourse fieldsOfStudy(String fieldsOfStudy) {

        this.fieldsOfStudy = fieldsOfStudy;
        return this;
    }

    /**
     * Field(s) of study (e.g. ISCED-F) (http://uis.unesco.org/sites/default/files/documents/isced-fields-of-education-and-training-2013-en.pdf.
     * @return fieldsOfStudy
     **/

    @JsonProperty(JSON_PROPERTY_FIELDS_OF_STUDY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getFieldsOfStudy() {
        return fieldsOfStudy;
    }

    @JsonProperty(JSON_PROPERTY_FIELDS_OF_STUDY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFieldsOfStudy(String fieldsOfStudy) {
        this.fieldsOfStudy = fieldsOfStudy;
    }

    public ComponentCourse learningOutcomes(List<List<LanguageTypedString>> learningOutcomes) {

        this.learningOutcomes = learningOutcomes;
        return this;
    }

    public ComponentCourse addLearningOutcomesItem(List<LanguageTypedString> learningOutcomesItem) {
        if (this.learningOutcomes == null) {
            this.learningOutcomes = new ArrayList<>();
        }
        this.learningOutcomes.add(learningOutcomesItem);
        return this;
    }

    /**
     * Statements that describe the knowledge or skills students should acquire by the end of a particular course (ECTS-learningoutcome).
     * @return learningOutcomes
     **/

    @JsonProperty(JSON_PROPERTY_LEARNING_OUTCOMES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<List<LanguageTypedString>> getLearningOutcomes() {
        return learningOutcomes;
    }

    @JsonProperty(JSON_PROPERTY_LEARNING_OUTCOMES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLearningOutcomes(List<List<LanguageTypedString>> learningOutcomes) {
        this.learningOutcomes = learningOutcomes;
    }

    public ComponentCourse admissionRequirements(List<LanguageTypedString> admissionRequirements) {

        this.admissionRequirements = admissionRequirements;
        return this;
    }

    public ComponentCourse addAdmissionRequirementsItem(LanguageTypedString admissionRequirementsItem) {
        if (this.admissionRequirements == null) {
            this.admissionRequirements = new ArrayList<>();
        }
        this.admissionRequirements.add(admissionRequirementsItem);
        return this;
    }

    /**
     * This information may be given at an institutional level and/or at the level of individual programmes. Make sure that it is clear whether the information applies to fee-paying students (national and/or international) or to exchange students.
     * @return admissionRequirements
     **/

    @JsonProperty(JSON_PROPERTY_ADMISSION_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<LanguageTypedString> getAdmissionRequirements() {
        return admissionRequirements;
    }

    @JsonProperty(JSON_PROPERTY_ADMISSION_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAdmissionRequirements(List<LanguageTypedString> admissionRequirements) {
        this.admissionRequirements = admissionRequirements;
    }

    public ComponentCourse qualificationRequirements(List<LanguageTypedString> qualificationRequirements) {

        this.qualificationRequirements = qualificationRequirements;
        return this;
    }

    public ComponentCourse addQualificationRequirementsItem(LanguageTypedString qualificationRequirementsItem) {
        if (this.qualificationRequirements == null) {
            this.qualificationRequirements = new ArrayList<>();
        }
        this.qualificationRequirements.add(qualificationRequirementsItem);
        return this;
    }

    /**
     * Normally, students will receive a diploma when they have completed the (official) study program and have obtained the required number of credits. If there are any other specific requirements that students need to have fulfilled, mention them here.
     * @return qualificationRequirements
     **/

    @JsonProperty(JSON_PROPERTY_QUALIFICATION_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<LanguageTypedString> getQualificationRequirements() {
        return qualificationRequirements;
    }

    @JsonProperty(JSON_PROPERTY_QUALIFICATION_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQualificationRequirements(List<LanguageTypedString> qualificationRequirements) {
        this.qualificationRequirements = qualificationRequirements;
    }

    public ComponentCourse level(Level level) {

        this.level = level;
        return this;
    }

    /**
     * Get level
     * @return level
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_LEVEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Level getLevel() {
        return level;
    }

    @JsonProperty(JSON_PROPERTY_LEVEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLevel(Level level) {
        this.level = level;
    }

    public ComponentCourse enrollment(List<LanguageTypedString> enrollment) {

        this.enrollment = enrollment;
        return this;
    }

    public ComponentCourse addEnrollmentItem(LanguageTypedString enrollmentItem) {
        if (this.enrollment == null) {
            this.enrollment = new ArrayList<>();
        }
        this.enrollment.add(enrollmentItem);
        return this;
    }

    /**
     * The extra information that is provided for enrollment
     * @return enrollment
     **/

    @JsonProperty(JSON_PROPERTY_ENROLLMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<LanguageTypedString> getEnrollment() {
        return enrollment;
    }

    @JsonProperty(JSON_PROPERTY_ENROLLMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnrollment(List<LanguageTypedString> enrollment) {
        this.enrollment = enrollment;
    }

    public ComponentCourse resources(List<String> resources) {

        this.resources = resources;
        return this;
    }

    public ComponentCourse addResourcesItem(String resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    /**
     * An overview of the literature and other resources that is used in this course (ECTS-recommended reading and other sources)
     * @return resources
     **/

    @JsonProperty(JSON_PROPERTY_RESOURCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<String> getResources() {
        return resources;
    }

    @JsonProperty(JSON_PROPERTY_RESOURCES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public ComponentCourse assessment(List<LanguageTypedString> assessment) {

        this.assessment = assessment;
        return this;
    }

    public ComponentCourse addAssessmentItem(LanguageTypedString assessmentItem) {
        if (this.assessment == null) {
            this.assessment = new ArrayList<>();
        }
        this.assessment.add(assessmentItem);
        return this;
    }

    /**
     * A description of the way exams for this course are taken (ECTS-assessment method and criteria).
     * @return assessment
     **/

    @JsonProperty(JSON_PROPERTY_ASSESSMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<LanguageTypedString> getAssessment() {
        return assessment;
    }

    @JsonProperty(JSON_PROPERTY_ASSESSMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAssessment(List<LanguageTypedString> assessment) {
        this.assessment = assessment;
    }

    public ComponentCourse link(URI link) {

        this.link = link;
        return this;
    }

    /**
     * URL of the course&#39;s website
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

    public ComponentCourse educationSpecification(CoursePropertiesEducationSpecification educationSpecification) {

        this.educationSpecification = educationSpecification;
        return this;
    }

    /**
     * Get educationSpecification
     * @return educationSpecification
     **/

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public CoursePropertiesEducationSpecification getEducationSpecification() {
        return educationSpecification;
    }

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEducationSpecification(CoursePropertiesEducationSpecification educationSpecification) {
        this.educationSpecification = educationSpecification;
    }

    public ComponentCourse addresses(List<Address> addresses) {

        this.addresses = addresses;
        return this;
    }

    public ComponentCourse addAddressesItem(Address addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
     * Addresses for this course
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

    public ComponentCourse otherCodes(List<IdentifierEntry> otherCodes) {

        this.otherCodes = otherCodes;
        return this;
    }

    public ComponentCourse addOtherCodesItem(IdentifierEntry otherCodesItem) {
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

    public ComponentCourse consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public ComponentCourse addConsumersItem(Consumer consumersItem) {
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

    public ComponentCourse ext(Object ext) {

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

    public ComponentCourse programs(List<ProgramPropertiesChildrenInner> programs) {

        this.programs = programs;
        return this;
    }

    public ComponentCourse addProgramsItem(ProgramPropertiesChildrenInner programsItem) {
        if (this.programs == null) {
            this.programs = new ArrayList<>();
        }
        this.programs.add(programsItem);
        return this;
    }

    /**
     * The program of which this course is a part of. This object is [&#x60;expandable&#x60;](#tag/program_model)
     * @return programs
     **/

    @JsonProperty(JSON_PROPERTY_PROGRAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ProgramPropertiesChildrenInner> getPrograms() {
        return programs;
    }

    @JsonProperty(JSON_PROPERTY_PROGRAMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPrograms(List<ProgramPropertiesChildrenInner> programs) {
        this.programs = programs;
    }

    public ComponentCourse coordinators(List<ProgramPropertiesCoordinatorsInner> coordinators) {

        this.coordinators = coordinators;
        return this;
    }

    public ComponentCourse addCoordinatorsItem(ProgramPropertiesCoordinatorsInner coordinatorsItem) {
        if (this.coordinators == null) {
            this.coordinators = new ArrayList<>();
        }
        this.coordinators.add(coordinatorsItem);
        return this;
    }

    /**
     * The person(s) responsible for this course. This object is [&#x60;expandable&#x60;](#tag/person_model)
     * @return coordinators
     **/

    @JsonProperty(JSON_PROPERTY_COORDINATORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ProgramPropertiesCoordinatorsInner> getCoordinators() {
        return coordinators;
    }

    @JsonProperty(JSON_PROPERTY_COORDINATORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCoordinators(List<ProgramPropertiesCoordinatorsInner> coordinators) {
        this.coordinators = coordinators;
    }

    public ComponentCourse organization(CoursePropertiesOrganization organization) {

        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     **/

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public CoursePropertiesOrganization getOrganization() {
        return organization;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganization(CoursePropertiesOrganization organization) {
        this.organization = organization;
    }

    public ComponentCourse validFrom(LocalDate validFrom) {

        this.validFrom = validFrom;
        return this;
    }

    /**
     * The first day this course is valid (inclusive).
     * @return validFrom
     **/

    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getValidFrom() {
        return validFrom;
    }

    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public ComponentCourse validTo(LocalDate validTo) {

        this.validTo = validTo;
        return this;
    }

    /**
     * The day this course ceases to be valid (e.g. exclusive).
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentCourse componentCourse = (ComponentCourse) o;
        return Objects.equals(this.courseId, componentCourse.courseId) &&
                Objects.equals(this.primaryCode, componentCourse.primaryCode) &&
                Objects.equals(this.name, componentCourse.name) &&
                Objects.equals(this.abbreviation, componentCourse.abbreviation) &&
                Objects.equals(this.studyLoad, componentCourse.studyLoad) &&
                Objects.equals(this.modeOfDelivery, componentCourse.modeOfDelivery) &&
                Objects.equals(this.duration, componentCourse.duration) &&
                Objects.equals(this.firstStartDate, componentCourse.firstStartDate) &&
                Objects.equals(this.description, componentCourse.description) &&
                Objects.equals(this.teachingLanguage, componentCourse.teachingLanguage) &&
                Objects.equals(this.fieldsOfStudy, componentCourse.fieldsOfStudy) &&
                Objects.equals(this.learningOutcomes, componentCourse.learningOutcomes) &&
                Objects.equals(this.admissionRequirements, componentCourse.admissionRequirements) &&
                Objects.equals(this.qualificationRequirements, componentCourse.qualificationRequirements) &&
                Objects.equals(this.level, componentCourse.level) &&
                Objects.equals(this.enrollment, componentCourse.enrollment) &&
                Objects.equals(this.resources, componentCourse.resources) &&
                Objects.equals(this.assessment, componentCourse.assessment) &&
                Objects.equals(this.link, componentCourse.link) &&
                Objects.equals(this.educationSpecification, componentCourse.educationSpecification) &&
                Objects.equals(this.addresses, componentCourse.addresses) &&
                Objects.equals(this.otherCodes, componentCourse.otherCodes) &&
                Objects.equals(this.consumers, componentCourse.consumers) &&
                Objects.equals(this.ext, componentCourse.ext) &&
                Objects.equals(this.programs, componentCourse.programs) &&
                Objects.equals(this.coordinators, componentCourse.coordinators) &&
                Objects.equals(this.organization, componentCourse.organization) &&
                Objects.equals(this.validFrom, componentCourse.validFrom) &&
                Objects.equals(this.validTo, componentCourse.validTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, primaryCode, name, abbreviation, studyLoad, modeOfDelivery, duration, firstStartDate, description, teachingLanguage,
                fieldsOfStudy, learningOutcomes, admissionRequirements, qualificationRequirements, level, enrollment, resources, assessment, link,
                educationSpecification, addresses, otherCodes, consumers, ext, programs, coordinators, organization, validFrom, validTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentCourse {\n");
        sb.append("    courseId: ").append(toIndentedString(courseId)).append("\n");
        sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
        sb.append("    studyLoad: ").append(toIndentedString(studyLoad)).append("\n");
        sb.append("    modeOfDelivery: ").append(toIndentedString(modeOfDelivery)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    firstStartDate: ").append(toIndentedString(firstStartDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    teachingLanguage: ").append(toIndentedString(teachingLanguage)).append("\n");
        sb.append("    fieldsOfStudy: ").append(toIndentedString(fieldsOfStudy)).append("\n");
        sb.append("    learningOutcomes: ").append(toIndentedString(learningOutcomes)).append("\n");
        sb.append("    admissionRequirements: ").append(toIndentedString(admissionRequirements)).append("\n");
        sb.append("    qualificationRequirements: ").append(toIndentedString(qualificationRequirements)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    enrollment: ").append(toIndentedString(enrollment)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    assessment: ").append(toIndentedString(assessment)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    educationSpecification: ").append(toIndentedString(educationSpecification)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    otherCodes: ").append(toIndentedString(otherCodes)).append("\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
        sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
        sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
        sb.append("    coordinators: ").append(toIndentedString(coordinators)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

