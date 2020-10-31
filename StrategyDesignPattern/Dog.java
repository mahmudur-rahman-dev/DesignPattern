/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyDesignPattern;

/**
 *
 * @author promise
 */
public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        super();
        super.setSound("Bark");
        super.flyingType = new CantFly();
    }

}
