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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.AssociationRole;
import org.openapitools.client.model.AssociationState;
import org.openapitools.client.model.ComponentOffering;
import org.openapitools.client.model.ComponentOfferingAssociation;
import org.openapitools.client.model.ComponentResult;
import org.openapitools.client.model.Consumer;
import org.openapitools.client.model.CourseOffering;
import org.openapitools.client.model.CourseOfferingAssociation;
import org.openapitools.client.model.ProgramOffering;
import org.openapitools.client.model.ProgramOfferingAssociation;
import org.openapitools.client.model.RemoteAssociationState;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AssociationWrite
 */
@JsonPropertyOrder({
  AssociationWrite.JSON_PROPERTY_OFFERING,
  AssociationWrite.JSON_PROPERTY_ASSOCIATION_ID,
  AssociationWrite.JSON_PROPERTY_ASSOCIATION_TYPE,
  AssociationWrite.JSON_PROPERTY_ROLE,
  AssociationWrite.JSON_PROPERTY_STATE,
  AssociationWrite.JSON_PROPERTY_REMOTE_STATE,
  AssociationWrite.JSON_PROPERTY_CONSUMERS,
  AssociationWrite.JSON_PROPERTY_EXT,
  AssociationWrite.JSON_PROPERTY_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:32:49.151315+02:00[Europe/Amsterdam]")
public class AssociationWrite {
  public static final String JSON_PROPERTY_OFFERING = "offering";
  private JsonNullable<OneOfComponentOfferingCourseOfferingProgramOffering> offering = JsonNullable.<OneOfComponentOfferingCourseOfferingProgramOffering>undefined();

  public static final String JSON_PROPERTY_ASSOCIATION_ID = "associationId";
  private UUID associationId;

  /**
   * The type of this association
   */
  public enum AssociationTypeEnum {
    PROGRAMOFFERINGASSOCIATION("programOfferingAssociation"),
    
    COURSEOFFERINGASSOCIATION("courseOfferingAssociation"),
    
    COMPONENTOFFERINGASSOCIATION("componentOfferingAssociation");

    private String value;

    AssociationTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssociationTypeEnum fromValue(String value) {
      for (AssociationTypeEnum b : AssociationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ASSOCIATION_TYPE = "associationType";
  private AssociationTypeEnum associationType;

  public static final String JSON_PROPERTY_ROLE = "role";
  private AssociationRole role;

  public static final String JSON_PROPERTY_STATE = "state";
  private AssociationState state;

  public static final String JSON_PROPERTY_REMOTE_STATE = "remoteState";
  private RemoteAssociationState remoteState;

  public static final String JSON_PROPERTY_CONSUMERS = "consumers";
  private List<Consumer> consumers = null;

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public static final String JSON_PROPERTY_RESULT = "result";
  private ComponentResult result;

  public AssociationWrite() { 
  }

  @JsonCreator
  public AssociationWrite(
    @JsonProperty(JSON_PROPERTY_ASSOCIATION_ID) UUID associationId, 
    @JsonProperty(JSON_PROPERTY_ASSOCIATION_TYPE) AssociationTypeEnum associationType
  ) {
    this();
    this.associationId = associationId;
    this.associationType = associationType;
  }

  public AssociationWrite offering(OneOfComponentOfferingCourseOfferingProgramOffering offering) {
    this.offering = JsonNullable.<OneOfComponentOfferingCourseOfferingProgramOffering>of(offering);
    
    return this;
  }

   /**
   * The offering this association is for
   * @return offering
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offering this association is for")
  @JsonIgnore

  public OneOfComponentOfferingCourseOfferingProgramOffering getOffering() {
        return offering.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OFFERING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OneOfComponentOfferingCourseOfferingProgramOffering> getOffering_JsonNullable() {
    return offering;
  }
  
  @JsonProperty(JSON_PROPERTY_OFFERING)
  public void setOffering_JsonNullable(JsonNullable<OneOfComponentOfferingCourseOfferingProgramOffering> offering) {
    this.offering = offering;
  }

  public void setOffering(OneOfComponentOfferingCourseOfferingProgramOffering offering) {
    this.offering = JsonNullable.<OneOfComponentOfferingCourseOfferingProgramOffering>of(offering);
  }


   /**
   * Unique id of this association
   * @return associationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", required = true, value = "Unique id of this association")
  @JsonProperty(JSON_PROPERTY_ASSOCIATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getAssociationId() {
    return associationId;
  }




   /**
   * The type of this association
   * @return associationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "componentOfferingAssociation", required = true, value = "The type of this association")
  @JsonProperty(JSON_PROPERTY_ASSOCIATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AssociationTypeEnum getAssociationType() {
    return associationType;
  }




  public AssociationWrite role(AssociationRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AssociationRole getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(AssociationRole role) {
    this.role = role;
  }


  public AssociationWrite state(AssociationState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AssociationState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(AssociationState state) {
    this.state = state;
  }


  public AssociationWrite remoteState(RemoteAssociationState remoteState) {
    
    this.remoteState = remoteState;
    return this;
  }

   /**
   * Get remoteState
   * @return remoteState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMOTE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RemoteAssociationState getRemoteState() {
    return remoteState;
  }


  @JsonProperty(JSON_PROPERTY_REMOTE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoteState(RemoteAssociationState remoteState) {
    this.remoteState = remoteState;
  }


  public AssociationWrite consumers(List<Consumer> consumers) {
    
    this.consumers = consumers;
    return this;
  }

  public AssociationWrite addConsumersItem(Consumer consumersItem) {
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
  @javax.annotation.Nullable
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


  public AssociationWrite ext(Object ext) {
    
    this.ext = ext;
    return this;
  }

   /**
   * Object for additional non-standard attributes
   * @return ext
  **/
  @javax.annotation.Nullable
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


  public AssociationWrite result(ComponentResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComponentResult getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(ComponentResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociationWrite associationWrite = (AssociationWrite) o;
    return equalsNullable(this.offering, associationWrite.offering) &&
        Objects.equals(this.associationId, associationWrite.associationId) &&
        Objects.equals(this.associationType, associationWrite.associationType) &&
        Objects.equals(this.role, associationWrite.role) &&
        Objects.equals(this.state, associationWrite.state) &&
        Objects.equals(this.remoteState, associationWrite.remoteState) &&
        Objects.equals(this.consumers, associationWrite.consumers) &&
        Objects.equals(this.ext, associationWrite.ext) &&
        Objects.equals(this.result, associationWrite.result);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(offering), associationId, associationType, role, state, remoteState, consumers, ext, result);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociationWrite {\n");
    sb.append("    offering: ").append(toIndentedString(offering)).append("\n");
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    remoteState: ").append(toIndentedString(remoteState)).append("\n");
    sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

