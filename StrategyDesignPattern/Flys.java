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
public interface Flys {
    String fly();
}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "Flying High";
    }
    
}

class CantFly implements Flys{

    @Override
    public String fly() {
        return "can't fly";
    }
    
}