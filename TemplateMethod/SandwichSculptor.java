/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 * what is template method?
 * - Used to create a group of subclasses that have to execute a similar group
 *   of methods
 * - we can create an abstract class that contains a method called the Template method
 * - The template method contains a series of method calls that every subclass object will call
 * - The subclasses objects can override some of the method calls
 * @author promise
 */
public class SandwichSculptor {
    public static void main(String[] args) {
        Hoagie cust1Hoagie = new ItalianHoagie();
        cust1Hoagie.makeSandwich();
        System.out.println();
       
        Hoagie cust2Hoagie = new VeggieHoagie();
        cust2Hoagie.makeSandwich();
    }
}
