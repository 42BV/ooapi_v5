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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The organization that manages this group. [&#x60;expandable&#x60;](.#tag/organization_model) By default only the &#x60;organizationId&#x60; (a string) is returned. If the client requested an expansion of &#x60;organization&#x60; the full organization object should be returned. 
 */
@ApiModel(description = "The organization that manages this group. [`expandable`](.#tag/organization_model) By default only the `organizationId` (a string) is returned. If the client requested an expansion of `organization` the full organization object should be returned. ")
@JsonPropertyOrder({
  GroupOrganization.JSON_PROPERTY_ORGANIZATION_ID,
  GroupOrganization.JSON_PROPERTY_PRIMARY_CODE,
  GroupOrganization.JSON_PROPERTY_ORGANIZATION_TYPE,
  GroupOrganization.JSON_PROPERTY_NAME,
  GroupOrganization.JSON_PROPERTY_SHORT_NAME,
  GroupOrganization.JSON_PROPERTY_DESCRIPTION,
  GroupOrganization.JSON_PROPERTY_ADDRESSES,
  GroupOrganization.JSON_PROPERTY_LINK,
  GroupOrganization.JSON_PROPERTY_LOGO,
  GroupOrganization.JSON_PROPERTY_OTHER_CODES,
  GroupOrganization.JSON_PROPERTY_PARENT,
  GroupOrganization.JSON_PROPERTY_CHILDREN,
  GroupOrganization.JSON_PROPERTY_CONSUMERS,
  GroupOrganization.JSON_PROPERTY_EXT
})
@JsonTypeName("Group_organization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:55:03.988058+02:00[Europe/Amsterdam]")
public class GroupOrganization {
  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
  private UUID organizationId;

  public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
  private IdentifierEntry primaryCode;

  public static final String JSON_PROPERTY_ORGANIZATION_TYPE = "organizationType";
  private OrganizationType organizationType;

  public static final String JSON_PROPERTY_NAME = "name";
  private List<LanguageTypedString> name = new ArrayList<>();

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private String shortName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private List<LanguageTypedString> description = null;

  public static final String JSON_PROPERTY_ADDRESSES = "addresses";
  private List<Address> addresses = null;

  public static final String JSON_PROPERTY_LINK = "link";
  private URI link;

  public static final String JSON_PROPERTY_LOGO = "logo";
  private URI logo;

  public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
  private List<IdentifierEntry> otherCodes = null;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private OrganizationParent parent;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<OrganizationChildrenInner> children = null;

  public static final String JSON_PROPERTY_CONSUMERS = "consumers";
  private List<Consumer> consumers = null;

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public GroupOrganization() { 
  }

  @JsonCreator
  public GroupOrganization(
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
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-123514174000", required = true, value = "Unique id of this organization")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getOrganizationId() {
    return organizationId;
  }




  public GroupOrganization primaryCode(IdentifierEntry primaryCode) {
    
    this.primaryCode = primaryCode;
    return this;
  }

   /**
   * Get primaryCode
   * @return primaryCode
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
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


  public GroupOrganization organizationType(OrganizationType organizationType) {
    
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Get organizationType
   * @return organizationType
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
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


  public GroupOrganization name(List<LanguageTypedString> name) {
    
    this.name = name;
    return this;
  }

  public GroupOrganization addNameItem(LanguageTypedString nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * The name of the organization
   * @return name
  **/
  @NotNull
  @ApiModelProperty(example = "[{language=nl-NL, value=Coöperatie SURF U.A.}]", required = true, value = "The name of the organization")
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


  public GroupOrganization shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Short name of the organization
   * @return shortName
  **/
  @NotNull
  @ApiModelProperty(example = "SURF", required = true, value = "Short name of the organization")
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


  public GroupOrganization description(List<LanguageTypedString> description) {
    
    this.description = description;
    return this;
  }

  public GroupOrganization addDescriptionItem(LanguageTypedString descriptionItem) {
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
  
  @ApiModelProperty(example = "[{language=nl-NL, value=SURF is een coöperatieve vereniging van Nederlandse onderwijs- en onderzoeksinstellingen waarin de leden hun krachten bundelen. De leden zijn eigenaar van SURF.}]", value = "Any general description of the organization should clearly mention the type of higher education organization, especially in the case of a binary system. In Dutch; universiteit (university) or hogeschool (university of applied sciences).")
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


  public GroupOrganization addresses(List<Address> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public GroupOrganization addAddressesItem(Address addressesItem) {
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
  
  @ApiModelProperty(value = "Addresses of this organization")
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


  public GroupOrganization link(URI link) {
    
    this.link = link;
    return this;
  }

   /**
   * URL of the organization&#39;s website
   * @return link
  **/
  
  @ApiModelProperty(example = "https://surf.nl", value = "URL of the organization's website")
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


  public GroupOrganization logo(URI logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Logo of this organization
   * @return logo
  **/
  
  @ApiModelProperty(example = "https://www.surf.nl/themes/surf/logo.svg", value = "Logo of this organization")
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


  public GroupOrganization otherCodes(List<IdentifierEntry> otherCodes) {
    
    this.otherCodes = otherCodes;
    return this;
  }

  public GroupOrganization addOtherCodesItem(IdentifierEntry otherCodesItem) {
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
  
  @ApiModelProperty(example = "[{codeType=brin, code=00AA}, {codeType=kvk, code=12345678}]", value = "An array of additional human readable codes/identifiers for the entity being described.")
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


  public GroupOrganization parent(OrganizationParent parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  
  @ApiModelProperty(value = "")
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


  public GroupOrganization children(List<OrganizationChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public GroupOrganization addChildrenItem(OrganizationChildrenInner childrenItem) {
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
  
  @ApiModelProperty(value = "All the organizational units for which this organization is the parent. [`expandable`](#tag/organization_model) By default only the `organizationId` (a string) is returned. If the client requested an expansion of `organization` the full organization object should be returned. ")
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


  public GroupOrganization consumers(List<Consumer> consumers) {
    
    this.consumers = consumers;
    return this;
  }

  public GroupOrganization addConsumersItem(Consumer consumersItem) {
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
  
  @ApiModelProperty(example = "{$ref=../consumers/TEST/V1/examples/TestConsumer.yaml}", value = "The additional consumer elements that can be provided, see the [documentation on support for specific consumers](https://open-education-api.github.io/specification/#/consumers) for more information about this mechanism.")
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


  public GroupOrganization ext(Object ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Object for additional non-standard attributes
   * @return ext
  **/
  
  @ApiModelProperty(value = "Object for additional non-standard attributes")
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
    GroupOrganization groupOrganization = (GroupOrganization) o;
    return Objects.equals(this.organizationId, groupOrganization.organizationId) &&
        Objects.equals(this.primaryCode, groupOrganization.primaryCode) &&
        Objects.equals(this.organizationType, groupOrganization.organizationType) &&
        Objects.equals(this.name, groupOrganization.name) &&
        Objects.equals(this.shortName, groupOrganization.shortName) &&
        Objects.equals(this.description, groupOrganization.description) &&
        Objects.equals(this.addresses, groupOrganization.addresses) &&
        Objects.equals(this.link, groupOrganization.link) &&
        Objects.equals(this.logo, groupOrganization.logo) &&
        Objects.equals(this.otherCodes, groupOrganization.otherCodes) &&
        Objects.equals(this.parent, groupOrganization.parent) &&
        Objects.equals(this.children, groupOrganization.children) &&
        Objects.equals(this.consumers, groupOrganization.consumers) &&
        Objects.equals(this.ext, groupOrganization.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, primaryCode, organizationType, name, shortName, description, addresses, link, logo, otherCodes, parent, children, consumers, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupOrganization {\n");
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

