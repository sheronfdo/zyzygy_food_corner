/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.processing;

import syzygy.order.Order;
import syzygy.order.OrderStatus;

/**
 *
 * @author Jamith
 */
public class AcceptHandler extends OrderProcessHandler{

    @Override
    public void handleProcess(Order order) {
        System.out.println(order);
        if(order.getOrderStatus().equals(OrderStatus.ACCEPTED)){
            System.out.println("accepted");
            next.handleProcess(order);
        }else{
            System.out.println("not accepted");
        }
    }
}
