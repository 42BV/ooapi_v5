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

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Cost
 */
@JsonPropertyOrder({
  Cost.JSON_PROPERTY_COST_TYPE,
  Cost.JSON_PROPERTY_AMOUNT,
  Cost.JSON_PROPERTY_VAT_AMOUNT,
  Cost.JSON_PROPERTY_AMOUNT_WITHOUT_VAT,
  Cost.JSON_PROPERTY_CURRENCY,
  Cost.JSON_PROPERTY_DISPLAY_AMOUNT,
  Cost.JSON_PROPERTY_EXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-04T11:38:05.422668+02:00[Europe/Amsterdam]")
public class Cost {
  public static final String JSON_PROPERTY_COST_TYPE = "costType";
  private String costType;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_VAT_AMOUNT = "vatAmount";
  private String vatAmount;

  public static final String JSON_PROPERTY_AMOUNT_WITHOUT_VAT = "amountWithoutVat";
  private String amountWithoutVat;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DISPLAY_AMOUNT = "displayAmount";
  private List<LanguageTypedString> displayAmount = null;

  public static final String JSON_PROPERTY_EXT = "ext";
  private Object ext;

  public Cost() { 
  }

  public Cost costType(String costType) {
    
    this.costType = costType;
    return this;
  }

   /**
   * The type of the cost. This is an *extensible enumeration*.  The following values have been defined in the specification:   - &#x60;STAP eligible&#x60;: the costs that a student can get STAP subsidy for   - &#x60;total costs&#x60;: the total costs that a student is to pay to follow this offering  Implementations are allowed to add additional values to those above, as long as they do not overlap in definition to existing values. 
   * @return costType
  **/
  @NotNull
  @ApiModelProperty(example = "total costs", required = true, value = "The type of the cost. This is an *extensible enumeration*.  The following values have been defined in the specification:   - `STAP eligible`: the costs that a student can get STAP subsidy for   - `total costs`: the total costs that a student is to pay to follow this offering  Implementations are allowed to add additional values to those above, as long as they do not overlap in definition to existing values. ")
  @JsonProperty(JSON_PROPERTY_COST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCostType() {
    return costType;
  }


  @JsonProperty(JSON_PROPERTY_COST_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCostType(String costType) {
    this.costType = costType;
  }


  public Cost amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The total amount of the cost as a string. Use a &#39;.&#39; (dot) as an optional separator. The numbers before the separator signify the major units of the currency, after the dot the minor units. Only a single separator is allowed. Do not use a comma.
   * @return amount
  **/
 
  @ApiModelProperty(example = "340.84", value = "The total amount of the cost as a string. Use a '.' (dot) as an optional separator. The numbers before the separator signify the major units of the currency, after the dot the minor units. Only a single separator is allowed. Do not use a comma.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Cost vatAmount(String vatAmount) {
    
    this.vatAmount = vatAmount;
    return this;
  }

   /**
   * The part of the cost that is VAT, as a string. Use a &#39;.&#39; (dot) as an optional separator. The numbers before the separator signify the major units of the currency, after the dot the minor units. Only a single separator is allowed. Do not use a comma.
   * @return vatAmount
  **/
 
  @ApiModelProperty(example = "40", value = "The part of the cost that is VAT, as a string. Use a '.' (dot) as an optional separator. The numbers before the separator signify the major units of the currency, after the dot the minor units. Only a single separator is allowed. Do not use a comma.")
  @JsonProperty(JSON_PROPERTY_VAT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVatAmount() {
    return vatAmount;
  }


  @JsonProperty(JSON_PROPERTY_VAT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatAmount(String vatAmount) {
    this.vatAmount = vatAmount;
  }


  public Cost amountWithoutVat(String amountWithoutVat) {
    
    this.amountWithoutVat = amountWithoutVat;
    return this;
  }

   /**
   * The part of the cost that is non-VAT. as a string. Use a &#39;.&#39; (dot) as an optional separator. The numbers before the separator signify the major units of the currency, after the dot the minor units. Only a single separator is allowed. Do not use a comma.
   * @return amountWithoutVat
  **/
 
  @ApiModelProperty(example = "300.84", value = "The part of the cost that is non-VAT. as a string. Use a '.' (dot) as an optional separator. The numbers before the separator signify the major units of the currency, after the dot the minor units. Only a single separator is allowed. Do not use a comma.")
  @JsonProperty(JSON_PROPERTY_AMOUNT_WITHOUT_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmountWithoutVat() {
    return amountWithoutVat;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_WITHOUT_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountWithoutVat(String amountWithoutVat) {
    this.amountWithoutVat = amountWithoutVat;
  }


  public Cost currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The currency this cost is in. Should correspond to one of the currency codes from ISO 4217.
   * @return currency
  **/
 
  @ApiModelProperty(example = "EUR", value = "The currency this cost is in. Should correspond to one of the currency codes from ISO 4217.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Cost displayAmount(List<LanguageTypedString> displayAmount) {
    
    this.displayAmount = displayAmount;
    return this;
  }

  public Cost addDisplayAmountItem(LanguageTypedString displayAmountItem) {
    if (this.displayAmount == null) {
      this.displayAmount = new ArrayList<>();
    }
    this.displayAmount.add(displayAmountItem);
    return this;
  }

   /**
   * An array of optional pre-formatted strings in different locales. Clients can choose to use this string instead of rendering their own based on the current locale of the user.
   * @return displayAmount
  **/
 
  @ApiModelProperty(example = "[{language=nl-NL, value=€380,84}, {language=en-US, value=$401.17}]", value = "An array of optional pre-formatted strings in different locales. Clients can choose to use this string instead of rendering their own based on the current locale of the user.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LanguageTypedString> getDisplayAmount() {
    return displayAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayAmount(List<LanguageTypedString> displayAmount) {
    this.displayAmount = displayAmount;
  }


  public Cost ext(Object ext) {
    
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
    Cost cost = (Cost) o;
    return Objects.equals(this.costType, cost.costType) &&
        Objects.equals(this.amount, cost.amount) &&
        Objects.equals(this.vatAmount, cost.vatAmount) &&
        Objects.equals(this.amountWithoutVat, cost.amountWithoutVat) &&
        Objects.equals(this.currency, cost.currency) &&
        Objects.equals(this.displayAmount, cost.displayAmount) &&
        Objects.equals(this.ext, cost.ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costType, amount, vatAmount, amountWithoutVat, currency, displayAmount, ext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cost {\n");
    sb.append("    costType: ").append(toIndentedString(costType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    vatAmount: ").append(toIndentedString(vatAmount)).append("\n");
    sb.append("    amountWithoutVat: ").append(toIndentedString(amountWithoutVat)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    displayAmount: ").append(toIndentedString(displayAmount)).append("\n");
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

