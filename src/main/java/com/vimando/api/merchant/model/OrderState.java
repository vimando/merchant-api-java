/*
 * Merchant API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.vimando.api.merchant.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrderState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-08T15:53:32.613+02:00")
public class OrderState implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("delivery")
  private List<OrderDelivery> delivery = null;

  @JsonProperty("done")
  private String done = null;

  @JsonProperty("history")
  private List<OrderStateHistory> history = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("orderNumber")
  private String orderNumber = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("stateCode")
  private String stateCode = null;

  public OrderState date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public OrderState delivery(List<OrderDelivery> delivery) {
    this.delivery = delivery;
    return this;
  }

  public OrderState addDeliveryItem(OrderDelivery deliveryItem) {
    if (this.delivery == null) {
      this.delivery = new ArrayList<OrderDelivery>();
    }
    this.delivery.add(deliveryItem);
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")
  public List<OrderDelivery> getDelivery() {
    return delivery;
  }

  public void setDelivery(List<OrderDelivery> delivery) {
    this.delivery = delivery;
  }

  public OrderState done(String done) {
    this.done = done;
    return this;
  }

   /**
   * Get done
   * @return done
  **/
  @ApiModelProperty(value = "")
  public String getDone() {
    return done;
  }

  public void setDone(String done) {
    this.done = done;
  }

  public OrderState history(List<OrderStateHistory> history) {
    this.history = history;
    return this;
  }

  public OrderState addHistoryItem(OrderStateHistory historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<OrderStateHistory>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(value = "")
  public List<OrderStateHistory> getHistory() {
    return history;
  }

  public void setHistory(List<OrderStateHistory> history) {
    this.history = history;
  }

  public OrderState id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderState orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderState orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public OrderState state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public OrderState stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @ApiModelProperty(value = "")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderState orderState = (OrderState) o;
    return Objects.equals(this.date, orderState.date) &&
        Objects.equals(this.delivery, orderState.delivery) &&
        Objects.equals(this.done, orderState.done) &&
        Objects.equals(this.history, orderState.history) &&
        Objects.equals(this.id, orderState.id) &&
        Objects.equals(this.orderId, orderState.orderId) &&
        Objects.equals(this.orderNumber, orderState.orderNumber) &&
        Objects.equals(this.state, orderState.state) &&
        Objects.equals(this.stateCode, orderState.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, delivery, done, history, id, orderId, orderNumber, state, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderState {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

