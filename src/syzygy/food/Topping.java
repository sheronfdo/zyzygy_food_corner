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
public class Topping {

    private String toppingName;
    private int toppingPrice;

    public String getToppingName() {
        return toppingName;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

//    public Ingredient setIngredientName(String ingredientName) {
//        return Ingredient.makeIngredient(ingredientName);
//    }
    private static final HashMap<String, Topping> TOPPINGS_POOL = new HashMap<String, Topping>();

    private Topping() {
    }

    public static Topping makeTopping(String newTopping, int price) {
        Topping topping = TOPPINGS_POOL.get(newTopping);
        if (topping == null) {
            topping = new Topping();
            topping.toppingName = newTopping;
            topping.toppingPrice = price;
            TOPPINGS_POOL.put(newTopping.toLowerCase(), topping);
        }
        return topping;
    }

    public static Topping getOneFromPool(String topping) {
        return TOPPINGS_POOL.get(topping.toLowerCase());
    }

    public static void removeFromPool(String topping) {
        TOPPINGS_POOL.remove(topping.toLowerCase());
    }

    public static List<Topping> getAllFromPool() {
        List ingredientList = new ArrayList();
        TOPPINGS_POOL.forEach((k, v) -> {
            ingredientList.add(v);
        });
        return ingredientList;
    }

    public static void showAllFromPool() {
        TOPPINGS_POOL.forEach((k, v) -> {
            System.out.println(v.getToppingName() + " " + v.getToppingPrice());
        });
    }

    @Override
    public String toString() {
        return "Topping{" + "toppingName=" + toppingName + ", toppingPrice=" + toppingPrice + '}';
    }

}
