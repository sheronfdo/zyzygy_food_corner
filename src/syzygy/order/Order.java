/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.order;

import java.util.ArrayList;
import syzygy.processing.Customer;
import syzygy.food.FoodItem;
import syzygy.processing.HandOverMethod;

/**
 *
 * @author Jamith
 */
public class Order {

    private int orderId;
    private ArrayList<FoodItem> foodItems;
    private Customer customer;
    private HandOverMethod handOverMethod;
    private int total;
    private OrderStatus orderStatus;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.foodItems = builder.foodItems;
        this.customer = builder.customer;
        this.handOverMethod = builder.handOverMethod;
        this.total = builder.total;
        this.orderStatus = builder.orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public HandOverMethod getHandOverMethod() {
        return handOverMethod;
    }

    public int getTotal() {
        return total;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {

        private int orderId;
        private ArrayList<FoodItem> foodItems;
        private Customer customer;
        private HandOverMethod handOverMethod;
        private int total;
        private OrderStatus orderStatus;

        public Builder setOrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setFoodItems(ArrayList<FoodItem> foodItems) {
            this.foodItems = foodItems;
            return this;
        }

        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Builder setHandOverMethod(HandOverMethod handOverMethod) {
            this.handOverMethod = handOverMethod;
            return this;
        }

        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        public Builder setOrderStatus(OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }

    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + ", foodItems=" + foodItems + ", customer=" + customer + ", handOverMethod=" + handOverMethod + ", total=" + total + '}';
    }

}
