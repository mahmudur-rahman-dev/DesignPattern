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
public class Bird extends Animal{
    public Bird(){
        super();
        super.setSound("Tweet");
        super.flyingType = new ItFlys();
    }
}
