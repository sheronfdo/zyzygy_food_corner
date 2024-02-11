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
public class PackingHandler extends OrderProcessHandler {

    @Override
    public void handleProcess(Order order) {
        if (order.getOrderStatus().equals(OrderStatus.COOKED)) {
            if (order.getHandOverMethod().getMethod().equals("DELIVERY")) {
                order.setOrderStatus(OrderStatus.PACKED);
                System.out.println(order.getOrderId() + " ready to deliver");
            } else if (order.getHandOverMethod().getMethod().equals("DINEIN")) {
                System.out.println(order.getOrderId() + " ready to dine in");
            } else if (order.getHandOverMethod().getMethod().equals("TAKEAWAY")) {
                System.out.println(order.getOrderId() + " ready to takeaway");
            }
            next.handleProcess(order);
        }
    }
}
