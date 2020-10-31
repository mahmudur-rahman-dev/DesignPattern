/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author promise
 */
public class PizzaDecorator implements Pizza{
    Pizza newPizza;
    
    public PizzaDecorator(Pizza newPizza){
        this.newPizza = newPizza;
    }
    
    @Override
    public String getDescription() {
        return newPizza.getDescription();
    }

    @Override
    public double getCost() {
        return newPizza.getCost();
    }
    
}
