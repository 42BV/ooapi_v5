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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A group is simply a collection of persons. Groups can be used to accommodate various usecases.  Groups MAY optionally have a relation to an Offering, however the meaning of such relations is left unspecified and is left up to the implementer. 
 */

@JsonPropertyOrder({
        Group.JSON_PROPERTY_GROUP_ID,
        Group.JSON_PROPERTY_PRIMARY_CODE,
        Group.JSON_PROPERTY_GROUP_TYPE,
        Group.JSON_PROPERTY_NAME,
        Group.JSON_PROPERTY_DESCRIPTION,
        Group.JSON_PROPERTY_START_DATE,
        Group.JSON_PROPERTY_END_DATE,
        Group.JSON_PROPERTY_PERSON_COUNT,
        Group.JSON_PROPERTY_OTHER_CODES,
        Group.JSON_PROPERTY_CONSUMERS,
        Group.JSON_PROPERTY_ORGANIZATION,
        Group.JSON_PROPERTY_EXT
})

public class Group {
    public static final String JSON_PROPERTY_GROUP_ID = "groupId";
    public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
    public static final String JSON_PROPERTY_GROUP_TYPE = "groupType";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_START_DATE = "startDate";
    public static final String JSON_PROPERTY_END_DATE = "endDate";
    public static final String JSON_PROPERTY_PERSON_COUNT = "personCount";
    public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
    public static final String JSON_PROPERTY_CONSUMERS = "consumers";
    public static final String JSON_PROPERTY_ORGANIZATION = "organization";
    public static final String JSON_PROPERTY_EXT = "ext";
    private UUID groupId;
    private IdentifierEntry primaryCode;
    private GroupType groupType;
    private List<LanguageTypedString> name = new ArrayList<>();
    private List<LanguageTypedString> description = null;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal personCount;
    private List<IdentifierEntry> otherCodes = null;
    private List<Consumer> consumers = null;
    private GroupOrganization organization;
    private Object ext;

    public Group() {
    }

    public Group groupId(UUID groupId) {

        this.groupId = groupId;
        return this;
    }

    /**
     * Unique id for this group
     * @return groupId
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public UUID getGroupId() {
        return groupId;
    }

    @JsonProperty(JSON_PROPERTY_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    public Group primaryCode(IdentifierEntry primaryCode) {

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

    public Group groupType(GroupType groupType) {

        this.groupType = groupType;
        return this;
    }

    /**
     * Get groupType
     * @return groupType
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public GroupType getGroupType() {
        return groupType;
    }

    @JsonProperty(JSON_PROPERTY_GROUP_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public Group name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public Group addNameItem(LanguageTypedString nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * The name of this group
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

    public Group description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public Group addDescriptionItem(LanguageTypedString descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    /**
     * The description of this group
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

    public Group startDate(LocalDate startDate) {

        this.startDate = startDate;
        return this;
    }

    /**
     * The day on which this group starts being active, RFC3339 (full-date)
     * @return startDate
     **/

    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getStartDate() {
        return startDate;
    }

    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Group endDate(LocalDate endDate) {

        this.endDate = endDate;
        return this;
    }

    /**
     * The day on which this group ends being active, RFC3339 (full-date)
     * @return endDate
     **/

    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getEndDate() {
        return endDate;
    }

    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Group personCount(BigDecimal personCount) {

        this.personCount = personCount;
        return this;
    }

    /**
     * The number of persons that are member of this group
     * minimum: 0
     * @return personCount
     **/

    @JsonProperty(JSON_PROPERTY_PERSON_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getPersonCount() {
        return personCount;
    }

    @JsonProperty(JSON_PROPERTY_PERSON_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPersonCount(BigDecimal personCount) {
        this.personCount = personCount;
    }

    public Group otherCodes(List<IdentifierEntry> otherCodes) {

        this.otherCodes = otherCodes;
        return this;
    }

    public Group addOtherCodesItem(IdentifierEntry otherCodesItem) {
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

    public Group consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public Group addConsumersItem(Consumer consumersItem) {
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

    public Group organization(GroupOrganization organization) {

        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     **/

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public GroupOrganization getOrganization() {
        return organization;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganization(GroupOrganization organization) {
        this.organization = organization;
    }

    public Group ext(Object ext) {

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
        Group group = (Group) o;
        return Objects.equals(this.groupId, group.groupId) &&
                Objects.equals(this.primaryCode, group.primaryCode) &&
                Objects.equals(this.groupType, group.groupType) &&
                Objects.equals(this.name, group.name) &&
                Objects.equals(this.description, group.description) &&
                Objects.equals(this.startDate, group.startDate) &&
                Objects.equals(this.endDate, group.endDate) &&
                Objects.equals(this.personCount, group.personCount) &&
                Objects.equals(this.otherCodes, group.otherCodes) &&
                Objects.equals(this.consumers, group.consumers) &&
                Objects.equals(this.organization, group.organization) &&
                Objects.equals(this.ext, group.ext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, primaryCode, groupType, name, description, startDate, endDate, personCount, otherCodes, consumers, organization, ext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Group {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    personCount: ").append(toIndentedString(personCount)).append("\n");
        sb.append("    otherCodes: ").append(toIndentedString(otherCodes)).append("\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

