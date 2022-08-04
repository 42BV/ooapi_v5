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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An area within a building where education can take place
 */
@ApiModel(description = "An area within a building where education can take place")
@JsonPropertyOrder({
  Room.JSON_PROPERTY_ROOM_ID,
  Room.JSON_PROPERTY_PRIMARY_CODE,
  Room.JSON_PROPERTY_ROOM_TYPE,
  Room.JSON_PROPERTY_ABBREVIATION,
  Room.JSON_PROPERTY_NAME,
  Room.JSON_PROPERTY_DESCRIPTION,
  Room.JSON_PROPERTY_TOTAL_SEATS,
  Room.JSON_PROPERTY_AVAILABLE_SEATS,
  Room.JSON_PROPERTY_FLOOR,
  Room.JSON_PROPERTY_WING,
  Room.JSON_PROPERTY_GEOLOCATION,
  Room.JSON_PROPERTY_OTHER_CODES,
  Room.JSON_PROPERTY_BUILDING,
  Room.JSON_PROPERTY_CONSUMERS,
  Room.JSON_PROPERTY_EXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T10:55:03.988058+02:00[Europe/Amsterdam]")
public class Room {
  public static final String JSON_PROPERTY_ROOM_ID = "roomId";
  private UUID roomId;

  public static final String JSON_PROPERTY_PRIMARY_CODE = "primaryCode";
  private IdentifierEntry primaryCode;

  public static final String JSON_PROPERTY_ROOM_TYPE = "roomType";
  private RoomType roomType;

  public static final String JSON_PROPERTY_ABBREVIATION = "abbreviation";
  private String abbreviation;

  public static final String JSON_PROPERTY_NAME = "name";
  private List<LanguageTypedString> name = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private List<LanguageTypedString> description = null;

  public static final String JSON_PROPERTY_TOTAL_SEATS = "totalSeats";
  private Integer totalSeats;

  public static final String JSON_PROPERTY_AVAILABLE_SEATS = "availableSeats";
  private Integer availableSeats;

  public static final String JSON_PROPERTY_FLOOR = "floor";
  private String floor;

  public static final String JSON_PROPERTY_WING = "wing";
  private String wing;

  public static final String JSON_PROPERTY_GEOLOCATION = "geolocation";
  private RoomGeolocation geolocation;

  public static final String JSON_PROPERTY_OTHER_CODES = "otherCodes";
  private List<IdentifierEntry> otherCodes = null;

  public static final String JSON_PROPERTY_BUILDING = "building";
  private RoomBuilding building;

  public static final String JSON_PROPERTY_CONSUMERS = "consumers";
  private List<Consumer> consumers = null;

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public Room() { 
  }

  public Room roomId(UUID roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * Unique id for this room
   * @return roomId
  **/
  @NotNull
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-332114174000", required = true, value = "Unique id for this room")
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomId(UUID roomId) {
    this.roomId = roomId;
  }


  public Room primaryCode(IdentifierEntry primaryCode) {
    
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


  public Room roomType(RoomType roomType) {
    
    this.roomType = roomType;
    return this;
  }

   /**
   * Get roomType
   * @return roomType
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoomType getRoomType() {
    return roomType;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoomType(RoomType roomType) {
    this.roomType = roomType;
  }


  public Room abbreviation(String abbreviation) {
    
    this.abbreviation = abbreviation;
    return this;
  }

   /**
   * The abbreviation of the name of this room
   * @return abbreviation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bb4.54", value = "The abbreviation of the name of this room")
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


  public Room name(List<LanguageTypedString> name) {
    
    this.name = name;
    return this;
  }

  public Room addNameItem(LanguageTypedString nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * The name of this room
   * @return name
  **/
  @NotNull
  @ApiModelProperty(example = "[{language=en-GB, value=Beatrix building room 4.54}]", required = true, value = "The name of this room")
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


  public Room description(List<LanguageTypedString> description) {
    
    this.description = description;
    return this;
  }

  public Room addDescriptionItem(LanguageTypedString descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<>();
    }
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * The description of this room. [The limited implementation of Git Hub Markdown syntax](#tag/formatting-and-displaying-results-from-API) MAY be used for rich text representation.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{language=en-GB, value=External education and exam room 4.54}]", value = "The description of this room. [The limited implementation of Git Hub Markdown syntax](#tag/formatting-and-displaying-results-from-API) MAY be used for rich text representation.")
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


  public Room totalSeats(Integer totalSeats) {
    
    this.totalSeats = totalSeats;
    return this;
  }

   /**
   * The total number of seats located in the room
   * @return totalSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "The total number of seats located in the room")
  @JsonProperty(JSON_PROPERTY_TOTAL_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalSeats() {
    return totalSeats;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalSeats(Integer totalSeats) {
    this.totalSeats = totalSeats;
  }


  public Room availableSeats(Integer availableSeats) {
    
    this.availableSeats = availableSeats;
    return this;
  }

   /**
   * The total number of available (&#x3D;non-reserved) seats in the room
   * @return availableSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The total number of available (=non-reserved) seats in the room")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvailableSeats() {
    return availableSeats;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableSeats(Integer availableSeats) {
    this.availableSeats = availableSeats;
  }


  public Room floor(String floor) {
    
    this.floor = floor;
    return this;
  }

   /**
   * The floor on which this room is located
   * @return floor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "The floor on which this room is located")
  @JsonProperty(JSON_PROPERTY_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFloor() {
    return floor;
  }


  @JsonProperty(JSON_PROPERTY_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFloor(String floor) {
    this.floor = floor;
  }


  public Room wing(String wing) {
    
    this.wing = wing;
    return this;
  }

   /**
   * The wing in which this room is located
   * @return wing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "None", value = "The wing in which this room is located")
  @JsonProperty(JSON_PROPERTY_WING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWing() {
    return wing;
  }


  @JsonProperty(JSON_PROPERTY_WING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWing(String wing) {
    this.wing = wing;
  }


  public Room geolocation(RoomGeolocation geolocation) {
    
    this.geolocation = geolocation;
    return this;
  }

   /**
   * Get geolocation
   * @return geolocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomGeolocation getGeolocation() {
    return geolocation;
  }


  @JsonProperty(JSON_PROPERTY_GEOLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeolocation(RoomGeolocation geolocation) {
    this.geolocation = geolocation;
  }


  public Room otherCodes(List<IdentifierEntry> otherCodes) {
    
    this.otherCodes = otherCodes;
    return this;
  }

  public Room addOtherCodesItem(IdentifierEntry otherCodesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of additional human readable codes/identifiers for the entity being described.")
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


  public Room building(RoomBuilding building) {
    
    this.building = building;
    return this;
  }

   /**
   * Get building
   * @return building
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoomBuilding getBuilding() {
    return building;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuilding(RoomBuilding building) {
    this.building = building;
  }


  public Room consumers(List<Consumer> consumers) {
    
    this.consumers = consumers;
    return this;
  }

  public Room addConsumersItem(Consumer consumersItem) {
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


  public Room ext(Object ext) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(this.roomId, room.roomId) &&
        Objects.equals(this.primaryCode, room.primaryCode) &&
        Objects.equals(this.roomType, room.roomType) &&
        Objects.equals(this.abbreviation, room.abbreviation) &&
        Objects.equals(this.name, room.name) &&
        Objects.equals(this.description, room.description) &&
        Objects.equals(this.totalSeats, room.totalSeats) &&
        Objects.equals(this.availableSeats, room.availableSeats) &&
        Objects.equals(this.floor, room.floor) &&
        Objects.equals(this.wing, room.wing) &&
        Objects.equals(this.geolocation, room.geolocation) &&
        Objects.equals(this.otherCodes, room.otherCodes) &&
        Objects.equals(this.building, room.building) &&
        Objects.equals(this.consumers, room.consumers) &&
        Objects.equals(this.ext, room.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, primaryCode, roomType, abbreviation, name, description, totalSeats, availableSeats, floor, wing, geolocation, otherCodes, building, consumers, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Room {\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    primaryCode: ").append(toIndentedString(primaryCode)).append("\n");
    sb.append("    roomType: ").append(toIndentedString(roomType)).append("\n");
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    totalSeats: ").append(toIndentedString(totalSeats)).append("\n");
    sb.append("    availableSeats: ").append(toIndentedString(availableSeats)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    wing: ").append(toIndentedString(wing)).append("\n");
    sb.append("    geolocation: ").append(toIndentedString(geolocation)).append("\n");
    sb.append("    otherCodes: ").append(toIndentedString(otherCodes)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
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
