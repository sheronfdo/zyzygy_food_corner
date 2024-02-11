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
public class TakeAway implements HandOverMethod {

    private String method = "TAKEAWAY";

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public void handOverMethod() {
        System.out.println("Order Has Collected By Customer!!!");
    }

    @Override
    public String toString() {
        return "TakeAway{" + '}';
    }

}
