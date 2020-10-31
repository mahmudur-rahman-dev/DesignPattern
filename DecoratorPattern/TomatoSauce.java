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
public class TomatoSauce extends PizzaDecorator{
    
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("adding tomato sauce");
    }
    
    @Override
    public String getDescription(){
        return newPizza.getDescription()+",tomato";
    }
    
    @Override
    public double getCost(){
        return newPizza.getCost()+1;
    }
    
}
