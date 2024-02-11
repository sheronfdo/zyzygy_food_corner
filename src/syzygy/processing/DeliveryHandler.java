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
public class DeliveryHandler extends OrderProcessHandler{

    @Override
    public void handleProcess(Order order) {
        if(order.getOrderStatus().equals(OrderStatus.PACKED)){
            order.setOrderStatus(OrderStatus.READY_TO_DELIVER);
            System.out.println("Hand Over To Delivery Boy");
        }
    }
}
