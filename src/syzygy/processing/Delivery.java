/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.processing;

/**
 *
 * @author Jamith
 */
public class Delivery implements HandOverMethod {

    private String method = "DELIVERY";

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public void handOverMethod() {
        System.out.println("Order Hand Overed to Delivery Guy!!!");
    }

    @Override
    public String toString() {
        return "Delivery{" + '}';
    }

}
