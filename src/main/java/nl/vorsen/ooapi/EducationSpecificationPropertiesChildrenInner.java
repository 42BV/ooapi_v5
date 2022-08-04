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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EducationSpecificationPropertiesChildrenInner
 */
@JsonPropertyOrder({
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_EDUCATION_SPECIFICATION_ID,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_PRIMARY_CODE,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_OTHER_CODES,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_EDUCATION_SPECIFICATION_TYPE,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_NAME,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_ABBREVIATION,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_DESCRIPTION,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_FORMAL_DOCUMENT,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_LEVEL,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_SECTOR,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_LEVEL_OF_QUALIFICATION,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_FIELDS_OF_STUDY,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_STUDY_LOAD,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_LEARNING_OUTCOMES,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_LINK,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_PARENT,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_CHILDREN,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_ORGANIZATION,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_CONSUMERS,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_EXT,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_VALID_FROM,
        EducationSpecificationPropertiesChildrenInner.JSON_PROPERTY_VALID_TO
})
@JsonTypeName("EducationSpecificationProperties_children_inner")

public class EducationSpecificationPropertiesChildrenInner {
    public static final String JSON_PROPERTY_EDUCATION_SPECIFICATION_ID = "educationSpecificationId";
    public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
    public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
    public static final String JSON_PROPERTY_EDUCATION_SPECIFICATION_TYPE = "educationSpecificationType";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_ABBREVIATION = "abbreviation";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_FORMAL_DOCUMENT = "formalDocument";
    public static final String JSON_PROPERTY_LEVEL = "level";
    public static final String JSON_PROPERTY_SECTOR = "sector";
    public static final String JSON_PROPERTY_LEVEL_OF_QUALIFICATION = "levelOfQualification";
    public static final String JSON_PROPERTY_FIELDS_OF_STUDY = "fieldsOfStudy";
    public static final String JSON_PROPERTY_STUDY_LOAD = "studyLoad";
    public static final String JSON_PROPERTY_LEARNING_OUTCOMES = "learningOutcomes";
    public static final String JSON_PROPERTY_LINK = "link";
    public static final String JSON_PROPERTY_PARENT = "parent";
    public static final String JSON_PROPERTY_CHILDREN = "children";
    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    public static final String JSON_PROPERTY_CONSUMERS = "consumers";
    public static final String JSON_PROPERTY_EXT = "ext";
    public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
    public static final String JSON_PROPERTY_VALID_TO = "validTo";
    private UUID educationSpecificationId;
    private IdentifierEntry primaryCode;
    private List<IdentifierEntry> otherCodes = null;
    private EducationSpecificationType educationSpecificationType;
    private List<LanguageTypedString> name = new ArrayList<>();
    private String abbreviation;
    private List<LanguageTypedString> description = null;
    private FormalDocument formalDocument;
    private Level level;
    private Sector sector;
    private LevelOfQualification levelOfQualification;
    private String fieldsOfStudy;
    private StudyLoadDescriptor studyLoad;
    private List<List<LanguageTypedString>> learningOutcomes = null;
    private URI link;
    private EducationSpecificationPropertiesParent parent;
    private List<EducationSpecificationPropertiesChildrenInner> children = null;
    private CoursePropertiesOrganization organization;
    private List<Consumer> consumers = null;
    private Object ext;
    private LocalDate validFrom;
    private LocalDate validTo;

    public EducationSpecificationPropertiesChildrenInner() {
    }

    public EducationSpecificationPropertiesChildrenInner educationSpecificationId(UUID educationSpecificationId) {

        this.educationSpecificationId = educationSpecificationId;
        return this;
    }

    /**
     * Unique id for this education specification
     * @return educationSpecificationId
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public UUID getEducationSpecificationId() {
        return educationSpecificationId;
    }

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEducationSpecificationId(UUID educationSpecificationId) {
        this.educationSpecificationId = educationSpecificationId;
    }

    public EducationSpecificationPropertiesChildrenInner primaryCode(IdentifierEntry primaryCode) {

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

    public EducationSpecificationPropertiesChildrenInner otherCodes(List<IdentifierEntry> otherCodes) {

        this.otherCodes = otherCodes;
        return this;
    }

    public EducationSpecificationPropertiesChildrenInner addOtherCodesItem(IdentifierEntry otherCodesItem) {
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

    public EducationSpecificationPropertiesChildrenInner educationSpecificationType(EducationSpecificationType educationSpecificationType) {

        this.educationSpecificationType = educationSpecificationType;
        return this;
    }

    /**
     * Get educationSpecificationType
     * @return educationSpecificationType
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public EducationSpecificationType getEducationSpecificationType() {
        return educationSpecificationType;
    }

    @JsonProperty(JSON_PROPERTY_EDUCATION_SPECIFICATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEducationSpecificationType(EducationSpecificationType educationSpecificationType) {
        this.educationSpecificationType = educationSpecificationType;
    }

    public EducationSpecificationPropertiesChildrenInner name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public EducationSpecificationPropertiesChildrenInner addNameItem(LanguageTypedString nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * The name of this education specification
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

    public EducationSpecificationPropertiesChildrenInner abbreviation(String abbreviation) {

        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * The abbreviation of this program
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

    public EducationSpecificationPropertiesChildrenInner description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public EducationSpecificationPropertiesChildrenInner addDescriptionItem(LanguageTypedString descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    /**
     * The description of this program. [The limited implementation of Git Hub Markdown syntax](#tag/formatting-and-displaying-results-from-API) MAY be used for rich text representation.
     * @return description
     **/

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<LanguageTypedString> getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(List<LanguageTypedString> description) {
        this.description = description;
    }

    public EducationSpecificationPropertiesChildrenInner formalDocument(FormalDocument formalDocument) {

        this.formalDocument = formalDocument;
        return this;
    }

    /**
     * Get formalDocument
     * @return formalDocument
     **/

    @JsonProperty(JSON_PROPERTY_FORMAL_DOCUMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public FormalDocument getFormalDocument() {
        return formalDocument;
    }

    @JsonProperty(JSON_PROPERTY_FORMAL_DOCUMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFormalDocument(FormalDocument formalDocument) {
        this.formalDocument = formalDocument;
    }

    public EducationSpecificationPropertiesChildrenInner level(Level level) {

        this.level = level;
        return this;
    }

    /**
     * Get level
     * @return level
     **/

    @JsonProperty(JSON_PROPERTY_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Level getLevel() {
        return level;
    }

    @JsonProperty(JSON_PROPERTY_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLevel(Level level) {
        this.level = level;
    }

    public EducationSpecificationPropertiesChildrenInner sector(Sector sector) {

        this.sector = sector;
        return this;
    }

    /**
     * Get sector
     * @return sector
     **/

    @JsonProperty(JSON_PROPERTY_SECTOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Sector getSector() {
        return sector;
    }

    @JsonProperty(JSON_PROPERTY_SECTOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public EducationSpecificationPropertiesChildrenInner levelOfQualification(LevelOfQualification levelOfQualification) {

        this.levelOfQualification = levelOfQualification;
        return this;
    }

    /**
     * Get levelOfQualification
     * @return levelOfQualification
     **/

    @JsonProperty(JSON_PROPERTY_LEVEL_OF_QUALIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LevelOfQualification getLevelOfQualification() {
        return levelOfQualification;
    }

    @JsonProperty(JSON_PROPERTY_LEVEL_OF_QUALIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLevelOfQualification(LevelOfQualification levelOfQualification) {
        this.levelOfQualification = levelOfQualification;
    }

    public EducationSpecificationPropertiesChildrenInner fieldsOfStudy(String fieldsOfStudy) {

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

    public EducationSpecificationPropertiesChildrenInner studyLoad(StudyLoadDescriptor studyLoad) {

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

    public EducationSpecificationPropertiesChildrenInner learningOutcomes(List<List<LanguageTypedString>> learningOutcomes) {

        this.learningOutcomes = learningOutcomes;
        return this;
    }

    public EducationSpecificationPropertiesChildrenInner addLearningOutcomesItem(List<LanguageTypedString> learningOutcomesItem) {
        if (this.learningOutcomes == null) {
            this.learningOutcomes = new ArrayList<>();
        }
        this.learningOutcomes.add(learningOutcomesItem);
        return this;
    }

    /**
     * Statements that describe the knowledge or skills students should acquire by the end of a particular course or program (ECTS-learningoutcome).
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

    public EducationSpecificationPropertiesChildrenInner link(URI link) {

        this.link = link;
        return this;
    }

    /**
     * URL of the program&#39;s website
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

    public EducationSpecificationPropertiesChildrenInner parent(EducationSpecificationPropertiesParent parent) {

        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     * @return parent
     **/

    @JsonProperty(JSON_PROPERTY_PARENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public EducationSpecificationPropertiesParent getParent() {
        return parent;
    }

    @JsonProperty(JSON_PROPERTY_PARENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParent(EducationSpecificationPropertiesParent parent) {
        this.parent = parent;
    }

    public EducationSpecificationPropertiesChildrenInner children(List<EducationSpecificationPropertiesChildrenInner> children) {

        this.children = children;
        return this;
    }

    public EducationSpecificationPropertiesChildrenInner addChildrenItem(EducationSpecificationPropertiesChildrenInner childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    /**
     * The EducationSpecifications that have this EducationSpecification as their parent. [&#x60;expandable&#x60;](#tag/education_specification_model)
     * @return children
     **/

    @JsonProperty(JSON_PROPERTY_CHILDREN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<EducationSpecificationPropertiesChildrenInner> getChildren() {
        return children;
    }

    @JsonProperty(JSON_PROPERTY_CHILDREN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setChildren(List<EducationSpecificationPropertiesChildrenInner> children) {
        this.children = children;
    }

    public EducationSpecificationPropertiesChildrenInner organization(CoursePropertiesOrganization organization) {

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

    public EducationSpecificationPropertiesChildrenInner consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public EducationSpecificationPropertiesChildrenInner addConsumersItem(Consumer consumersItem) {
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

    public EducationSpecificationPropertiesChildrenInner ext(Object ext) {

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

    public EducationSpecificationPropertiesChildrenInner validFrom(LocalDate validFrom) {

        this.validFrom = validFrom;
        return this;
    }

    /**
     * The first day this EducationSpecification is valid (inclusive).
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

    public EducationSpecificationPropertiesChildrenInner validTo(LocalDate validTo) {

        this.validTo = validTo;
        return this;
    }

    /**
     * The day this EducationSpecification ceases to be valid (e.g. exclusive).
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
        EducationSpecificationPropertiesChildrenInner educationSpecificationPropertiesChildrenInner = (EducationSpecificationPropertiesChildrenInner) o;
        return Objects.equals(this.educationSpecificationId, educationSpecificationPropertiesChildrenInner.educationSpecificationId) &&
                Objects.equals(this.primaryCode, educationSpecificationPropertiesChildrenInner.primaryCode) &&
                Objects.equals(this.otherCodes, educationSpecificationPropertiesChildrenInner.otherCodes) &&
                Objects.equals(this.educationSpecificationType, educationSpecificationPropertiesChildrenInner.educationSpecificationType) &&
                Objects.equals(this.name, educationSpecificationPropertiesChildrenInner.name) &&
                Objects.equals(this.abbreviation, educationSpecificationPropertiesChildrenInner.abbreviation) &&
                Objects.equals(this.description, educationSpecificationPropertiesChildrenInner.description) &&
                Objects.equals(this.formalDocument, educationSpecificationPropertiesChildrenInner.formalDocument) &&
                Objects.equals(this.level, educationSpecificationPropertiesChildrenInner.level) &&
                Objects.equals(this.sector, educationSpecificationPropertiesChildrenInner.sector) &&
                Objects.equals(this.levelOfQualification, educationSpecificationPropertiesChildrenInner.levelOfQualification) &&
                Objects.equals(this.fieldsOfStudy, educationSpecificationPropertiesChildrenInner.fieldsOfStudy) &&
                Objects.equals(this.studyLoad, educationSpecificationPropertiesChildrenInner.studyLoad) &&
                Objects.equals(this.learningOutcomes, educationSpecificationPropertiesChildrenInner.learningOutcomes) &&
                Objects.equals(this.link, educationSpecificationPropertiesChildrenInner.link) &&
                Objects.equals(this.parent, educationSpecificationPropertiesChildrenInner.parent) &&
                Objects.equals(this.children, educationSpecificationPropertiesChildrenInner.children) &&
                Objects.equals(this.organization, educationSpecificationPropertiesChildrenInner.organization) &&
                Objects.equals(this.consumers, educationSpecificationPropertiesChildrenInner.consumers) &&
                Objects.equals(this.ext, educationSpecificationPropertiesChildrenInner.ext) &&
                Objects.equals(this.validFrom, educationSpecificationPropertiesChildrenInner.validFrom) &&
                Objects.equals(this.validTo, educationSpecificationPropertiesChildrenInner.validTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(educationSpecificationId, primaryCode, otherCodes, educationSpecificationType, name, abbreviation, description, formalDocument,
                level, sector, levelOfQualification, fieldsOfStudy, studyLoad, learningOutcomes, link, parent, children, organization, consumers, ext,
                validFrom, validTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EducationSpecificationPropertiesChildrenInner {\n");
        sb.append("    educationSpecificationId: ").append(toIndentedString(educationSpecificationId)).append("\n");
        sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
        sb.append("    otherCodes: ").append(toIndentedString(otherCodes)).append("\n");
        sb.append("    educationSpecificationType: ").append(toIndentedString(educationSpecificationType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    formalDocument: ").append(toIndentedString(formalDocument)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    sector: ").append(toIndentedString(sector)).append("\n");
        sb.append("    levelOfQualification: ").append(toIndentedString(levelOfQualification)).append("\n");
        sb.append("    fieldsOfStudy: ").append(toIndentedString(fieldsOfStudy)).append("\n");
        sb.append("    studyLoad: ").append(toIndentedString(studyLoad)).append("\n");
        sb.append("    learningOutcomes: ").append(toIndentedString(learningOutcomes)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
        sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
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

}

