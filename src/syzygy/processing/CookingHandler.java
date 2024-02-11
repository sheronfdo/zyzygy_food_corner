/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.processing;

import syzygy.order.Order;
import syzygy.order.OrderStatus;
import syzygy.customCommand.CustomizationExpression;
import syzygy.customCommand.TextCustomizationExpression;
import syzygy.customCommand.AddExpression;

/**
 *
 * @author Jamith
 */
public class CookingHandler extends OrderProcessHandler {

    @Override
    public void handleProcess(Order order) {
        if (order.getOrderStatus().equals(OrderStatus.ACCEPTED)) {
            order.setOrderStatus(OrderStatus.COOKING);
            CustomizationExpression ce = new AddExpression();
            CustomizationExpression textCustomizationExpression = new TextCustomizationExpression(ce);
            
            order.getFoodItems().forEach(action -> {
                System.out.println(action.getFood().getFoodName() + " cooking started ");
                action.getIngredients().forEach(action2 -> {
                    System.out.println(action2.getIngredientName() + " ingredient added");
                });
                action.getToppings().forEach(action2 -> {
                    System.out.println(action2.getToppingName() + " topping added");
                });
                action.getToppingContext().forEach(action2 -> {
                    textCustomizationExpression.intepret(action2);
                });
                System.out.println("cooked");
            });
            order.setOrderStatus(OrderStatus.COOKED);
            next.handleProcess(order);
        }
    }
}
