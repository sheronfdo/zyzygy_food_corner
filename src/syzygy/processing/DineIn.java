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
public class DineIn implements HandOverMethod {

    private String method = "DINEIN";

    @Override
    public String getMethod() {
        return method;
    }

    @Override
    public void handOverMethod() {
        System.out.println("Take The Meal And Get The Appertite at Here!!!");
    }

    @Override
    public String toString() {
        return "DineIn{" + '}';
    }

}
