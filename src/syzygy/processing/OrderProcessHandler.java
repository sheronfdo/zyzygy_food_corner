/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.processing;

import syzygy.order.Order;

/**
 *
 * @author Jamith
 */
public abstract class OrderProcessHandler {

    protected OrderProcessHandler next;

    public void setNext(OrderProcessHandler handler) {
        this.next = handler;
    }
    
    public abstract void handleProcess(Order order);

}
