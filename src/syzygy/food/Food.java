/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.food;

import java.util.ArrayList;
import java.util.HashMap;
import syzygy.processing.Creator;

/**
 *
 * @author Jamith
 */
public class Food {

    private String foodName;
    private int foodPrice;
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    private Creator creator;

    private static HashMap<String, Food> FOOD_POOL = new HashMap();

    public static Food makeFood(String foodName, int foodPrice, ArrayList<Ingredient> ingredients, Creator creator) {

        String name = foodName;
        for (Ingredient ingredient : ingredients) {
            name += ("_" + ingredient.getIngredientName());
        }
        name += ("_" + creator.name());
        System.out.println(name);
        Food newfood = FOOD_POOL.get(name);
        if (newfood == null) {
            newfood = new Food();
            newfood.creator = creator;
            newfood.ingredients = ingredients;
            newfood.foodName = foodName;
            newfood.foodPrice = foodPrice;
            FOOD_POOL.put(name, newfood);
        }
        return newfood;
    }
    public static void removeFromPool(String food) {
        System.out.println(food);
        FOOD_POOL.remove(food);
    }

    private Food() {
    }
    
    public static Food getOneFromPool(String foodName){
        return FOOD_POOL.get(foodName);
    }

    public String getFoodName() {
        return foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public Creator getCreator() {
        return creator;
    }

    public Food setFoodName(String foodName) {
        return makeFood(foodName, this.getFoodPrice(), this.getIngredients(), this.getCreator());
    }

    public Food setFoodPrice(int foodPrice) {
        return makeFood(this.getFoodName(), foodPrice, this.getIngredients(), this.getCreator());
    }

    public Food setIngredients(ArrayList<Ingredient> ingredients) {
        return makeFood(this.getFoodName(), this.getFoodPrice(), ingredients, this.getCreator());
    }

    public Food setCreator(Creator creator) {
        return makeFood(this.getFoodName(), this.getFoodPrice(), this.getIngredients(), creator);
    }

    @Override
    public String toString() {
        return "Food{" + "foodName=" + foodName + ", foodPrice=" + foodPrice + ", ingredients=" + ingredients + ", creator=" + creator + '}';
    }

    public static ArrayList<Food> getAllFromPoolByAdmin() {
        ArrayList<Food> foods = new ArrayList<>();
        FOOD_POOL.forEach((k, v) -> {
            if (v.getCreator().equals(Creator.ADMIN)) {
                foods.add(v);
            }
        });
        return foods;
    }

}
