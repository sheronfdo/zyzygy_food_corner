/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syzygy.customCommand;

import syzygy.food.ToppingContext;

/**
 *
 * @author Jamith
 */
public class AddExpression implements 
       CustomizationExpression{

    @Override
    public void intepret(ToppingContext context) {
        System.out.println("Added "+context.getText());
    }
    
}
