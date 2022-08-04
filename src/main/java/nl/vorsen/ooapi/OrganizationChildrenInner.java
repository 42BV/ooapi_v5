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

/**
 * OrganizationChildrenInner
 */
@JsonPropertyOrder({
        OrganizationChildrenInner.JSON_PROPERTY_ORGANIZATION_ID,
        OrganizationChildrenInner.JSON_PROPERTY_PRIMARY_CODE,
        OrganizationChildrenInner.JSON_PROPERTY_ORGANIZATION_TYPE,
        OrganizationChildrenInner.JSON_PROPERTY_NAME,
        OrganizationChildrenInner.JSON_PROPERTY_SHORT_NAME,
        OrganizationChildrenInner.JSON_PROPERTY_DESCRIPTION,
        OrganizationChildrenInner.JSON_PROPERTY_ADDRESSES,
        OrganizationChildrenInner.JSON_PROPERTY_LINK,
        OrganizationChildrenInner.JSON_PROPERTY_LOGO,
        OrganizationChildrenInner.JSON_PROPERTY_OTHER_CODES,
        OrganizationChildrenInner.JSON_PROPERTY_PARENT,
        OrganizationChildrenInner.JSON_PROPERTY_CHILDREN,
        OrganizationChildrenInner.JSON_PROPERTY_CONSUMERS,
        OrganizationChildrenInner.JSON_PROPERTY_EXT
})
@JsonTypeName("Organization_children_inner")

public class OrganizationChildrenInner {
    public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
    public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
    public static final String JSON_PROPERTY_ORGANIZATION_TYPE = "organizationType";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_ADDRESSES = "addresses";
    public static final String JSON_PROPERTY_LINK = "link";
    public static final String JSON_PROPERTY_LOGO = "logo";
    public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
    public static final String JSON_PROPERTY_PARENT = "parent";
    public static final String JSON_PROPERTY_CHILDREN = "children";
    public static final String JSON_PROPERTY_CONSUMERS = "consumers";
    public static final String JSON_PROPERTY_EXT = "ext";
    private UUID organizationId;
    private IdentifierEntry primaryCode;
    private OrganizationType organizationType;
    private List<LanguageTypedString> name = new ArrayList<>();
    private String shortName;
    private List<LanguageTypedString> description = null;
    private List<Address> addresses = null;
    private URI link;
    private URI logo;
    private List<IdentifierEntry> otherCodes = null;
    private OrganizationParent parent;
    private List<OrganizationChildrenInner> children = null;
    private List<Consumer> consumers = null;
    private Object ext;

    public OrganizationChildrenInner() {
    }

    @JsonCreator
    public OrganizationChildrenInner(
            @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID) UUID organizationId
    ) {
        this();
        this.organizationId = organizationId;
    }

    /**
     * Unique id of this organization
     * @return organizationId
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public UUID getOrganizationId() {
        return organizationId;
    }

    public OrganizationChildrenInner primaryCode(IdentifierEntry primaryCode) {

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

    public OrganizationChildrenInner organizationType(OrganizationType organizationType) {

        this.organizationType = organizationType;
        return this;
    }

    /**
     * Get organizationType
     * @return organizationType
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    @JsonProperty(JSON_PROPERTY_ORGANIZATION_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

    public OrganizationChildrenInner name(List<LanguageTypedString> name) {

        this.name = name;
        return this;
    }

    public OrganizationChildrenInner addNameItem(LanguageTypedString nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * The name of the organization
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

    public OrganizationChildrenInner shortName(String shortName) {

        this.shortName = shortName;
        return this;
    }

    /**
     * Short name of the organization
     * @return shortName
     **/
    @NotNull

    @JsonProperty(JSON_PROPERTY_SHORT_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getShortName() {
        return shortName;
    }

    @JsonProperty(JSON_PROPERTY_SHORT_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public OrganizationChildrenInner description(List<LanguageTypedString> description) {

        this.description = description;
        return this;
    }

    public OrganizationChildrenInner addDescriptionItem(LanguageTypedString descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    /**
     * Any general description of the organization should clearly mention the type of higher education organization, especially in the case of a binary system. In Dutch; universiteit (university) or hogeschool (university of applied sciences).
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

    public OrganizationChildrenInner addresses(List<Address> addresses) {

        this.addresses = addresses;
        return this;
    }

    public OrganizationChildrenInner addAddressesItem(Address addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    /**
     * Addresses of this organization
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

    public OrganizationChildrenInner link(URI link) {

        this.link = link;
        return this;
    }

    /**
     * URL of the organization&#39;s website
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

    public OrganizationChildrenInner logo(URI logo) {

        this.logo = logo;
        return this;
    }

    /**
     * Logo of this organization
     * @return logo
     **/

    @JsonProperty(JSON_PROPERTY_LOGO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public URI getLogo() {
        return logo;
    }

    @JsonProperty(JSON_PROPERTY_LOGO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLogo(URI logo) {
        this.logo = logo;
    }

    public OrganizationChildrenInner otherCodes(List<IdentifierEntry> otherCodes) {

        this.otherCodes = otherCodes;
        return this;
    }

    public OrganizationChildrenInner addOtherCodesItem(IdentifierEntry otherCodesItem) {
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

    public OrganizationChildrenInner parent(OrganizationParent parent) {

        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     * @return parent
     **/

    @JsonProperty(JSON_PROPERTY_PARENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OrganizationParent getParent() {
        return parent;
    }

    @JsonProperty(JSON_PROPERTY_PARENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParent(OrganizationParent parent) {
        this.parent = parent;
    }

    public OrganizationChildrenInner children(List<OrganizationChildrenInner> children) {

        this.children = children;
        return this;
    }

    public OrganizationChildrenInner addChildrenItem(OrganizationChildrenInner childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    /**
     * All the organizational units for which this organization is the parent. [&#x60;expandable&#x60;](#tag/organization_model) By default only the &#x60;organizationId&#x60; (a string) is returned. If the client requested an expansion of &#x60;organization&#x60; the full organization object should be returned.
     * @return children
     **/

    @JsonProperty(JSON_PROPERTY_CHILDREN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<OrganizationChildrenInner> getChildren() {
        return children;
    }

    @JsonProperty(JSON_PROPERTY_CHILDREN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setChildren(List<OrganizationChildrenInner> children) {
        this.children = children;
    }

    public OrganizationChildrenInner consumers(List<Consumer> consumers) {

        this.consumers = consumers;
        return this;
    }

    public OrganizationChildrenInner addConsumersItem(Consumer consumersItem) {
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

    public OrganizationChildrenInner ext(Object ext) {

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
        OrganizationChildrenInner organizationChildrenInner = (OrganizationChildrenInner) o;
        return Objects.equals(this.organizationId, organizationChildrenInner.organizationId) &&
                Objects.equals(this.primaryCode, organizationChildrenInner.primaryCode) &&
                Objects.equals(this.organizationType, organizationChildrenInner.organizationType) &&
                Objects.equals(this.name, organizationChildrenInner.name) &&
                Objects.equals(this.shortName, organizationChildrenInner.shortName) &&
                Objects.equals(this.description, organizationChildrenInner.description) &&
                Objects.equals(this.addresses, organizationChildrenInner.addresses) &&
                Objects.equals(this.link, organizationChildrenInner.link) &&
                Objects.equals(this.logo, organizationChildrenInner.logo) &&
                Objects.equals(this.otherCodes, organizationChildrenInner.otherCodes) &&
                Objects.equals(this.parent, organizationChildrenInner.parent) &&
                Objects.equals(this.children, organizationChildrenInner.children) &&
                Objects.equals(this.consumers, organizationChildrenInner.consumers) &&
                Objects.equals(this.ext, organizationChildrenInner.ext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationId, primaryCode, organizationType, name, shortName, description, addresses, link, logo, otherCodes, parent, children,
                consumers, ext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationChildrenInner {\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
        sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    otherCodes: ").append(toIndentedString(otherCodes)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

}

