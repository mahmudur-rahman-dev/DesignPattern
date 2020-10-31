/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyDesignPattern;

/**
 * what is strategy pattern?
 * - Define a family of algorithms,encapsulate each one, and make them
 *   interchangeable.The strategy pattern lets the algorithm 
 *   vary independently from clients that use it
 * 
 * - when we want to define a class that will have one behavior that is similar to other behaviors in a list.
 *   example: # i want the class object to be able to choose from :
 *          -Not flying
 *          -Fly with Wings
 *          -Fly Super Fast
 * - When we need to use one of several behaviors dynamically
 * 
 *
 * @author promise
 */
public class AnimalPlay {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        
        Animal tweety = new Bird();
        
        System.out.println("Dog: "+sparky.tryToFly());
        System.out.println("Bird: "+tweety.tryToFly());
        
        //giving flying ability to dog
        sparky.setFlyingAbility(new ItFlys());
        System.out.println( "Dog: "+sparky.tryToFly());
    }
}
