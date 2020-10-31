/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 * what is the decorator design patter?
 * - The Decorator allows you to modify an object dynamically
 * - You would use it when you want the capabilities of inheritance with subclasses,
 *   but you need to add functionality at run time
 * - It is more flexible than inheritance
 * - Simplifies code because we add functionality using many simple classes
 * - Rather than rewrite old code we can extend with new code
 * @author promise
 */
public class PizzaMaker {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Pepperoni(new PlainPizza()));
        System.out.println("Ingredients: "+basicPizza.getDescription());
        System.out.println("Cost: "+basicPizza.getCost());
    }
}
