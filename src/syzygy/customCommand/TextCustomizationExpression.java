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
public class TextCustomizationExpression implements CustomizationExpression {

    private CustomizationExpression[] expressions;

    public TextCustomizationExpression(CustomizationExpression... expressions) {
        this.expressions = expressions;
    }

    @Override
    public void intepret(ToppingContext context) {
        for (CustomizationExpression expression : expressions) {
            expression.intepret(context);
        }
    }

}
