/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Jamith
 */
public class Ingredient {

    private String ingredientName;
    private int ingredientPrice;

    public String getIngredientName() {
        return ingredientName;
    }

    public int getIngredientPrice() {
        return ingredientPrice;
    }

//    public Ingredient setIngredientName(String ingredientName) {
//        return Ingredient.makeIngredient(ingredientName);
//    }
    private static final HashMap<String, Ingredient> INGREDIENTS_POOL = new HashMap<String, Ingredient>();

    private Ingredient() {
    }

    public static Ingredient makeIngredient(String newIngredient, int price) {
        Ingredient ingredient = INGREDIENTS_POOL.get(newIngredient);
        if (ingredient == null) {
            ingredient = new Ingredient();
            ingredient.ingredientName = newIngredient;
            ingredient.ingredientPrice = price;
            INGREDIENTS_POOL.put(newIngredient.toLowerCase(), ingredient);
        }
        return ingredient;
    }

    public static void removeFromPool(String ingredient) {
        INGREDIENTS_POOL.remove(ingredient.toLowerCase());
    }
    
    public static Ingredient getFromPool(String ingredient){
        return INGREDIENTS_POOL.get(ingredient.toLowerCase());
    }

    public static List<Ingredient> getAllFromPool() {
        List ingredientList = new ArrayList();
        INGREDIENTS_POOL.forEach((k, v) -> {
            ingredientList.add(v);
        });
        return ingredientList;
    }

    public static void showAllFromPool() {
        INGREDIENTS_POOL.forEach((k, v) -> {
            System.out.println(v.getIngredientName() + " " + v.getIngredientPrice());
        });
    }

    @Override
    public String toString() {
        return "Ingredient{" + "ingredientName=" + ingredientName + ", ingredientPrice=" + ingredientPrice + '}';
    }
    
    
}
