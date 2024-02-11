/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.food;

import java.util.ArrayList;

/**
 *
 * @author Jamith
 */
public class FoodItem {

    private Food food;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Topping> toppings;
    private ArrayList<ToppingContext> toppingContexts;
    private int qty;
    private int price;

    private FoodItem(Builder builder) {
        this.food = builder.food;
        this.ingredients = builder.ingredients;
        this.toppings = builder.toppings;
        this.qty = builder.qty;
        this.price = builder.price;
        this.toppingContexts = builder.toppingContexts;
    }

    public Food getFood() {
        return food;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }
    
    public ArrayList<ToppingContext> getToppingContext(){
        return toppingContexts;
    }

    @Override
    public String toString() {
        return "FoodItem{" + "food=" + food + ", ingredients=" + ingredients + ", toppings=" + toppings + ", qty=" + qty + ", price=" + price + '}';
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {

        private Food food;
        private ArrayList<Ingredient> ingredients;
        private ArrayList<Topping> toppings;
        private ArrayList<ToppingContext> toppingContexts;
        private int qty;
        private int price;

        public Builder setFood(Food food) {
            this.food = food;
            return this;
        }

        public Builder setIngredients(ArrayList<Ingredient> ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public Builder setToppings(ArrayList<Topping> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Builder setQty(int qty) {
            this.qty = qty;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setToppingContexts(ArrayList<ToppingContext> toppingContexts) {
            this.toppingContexts = toppingContexts;
            return this;
        }

        public FoodItem build() {
            return new FoodItem(this);
        }

    }

}
