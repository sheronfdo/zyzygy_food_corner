/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.order;

import java.util.ArrayList;
import java.util.HashMap;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Jamith
 */
public class OrderManagementGroup {

    private static int currentOrderId = 0;
    private static HashMap<Integer, Order> ORDER_POOL = new HashMap<>();

    public static int getNextOrderId() {
        return ++currentOrderId;
    }

    public static void addOrder(Order order) {
        ORDER_POOL.put(order.getOrderId(), order);
    }

    public static Order getOrder(int orderId) {
        return ORDER_POOL.get(orderId);
    }

    public static void showAllFromPool(){
        ORDER_POOL.forEach((k,v)->{
            System.out.println(k + " - "+v);
        });
    }
    
    public static ArrayList<Order> getAllFromPool(){
        ArrayList<Order> orders =new ArrayList<>();
        ORDER_POOL.forEach((k,v)->{
            orders.add(v);
        });
        return orders;
    }
}
