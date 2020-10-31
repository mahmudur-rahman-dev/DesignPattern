/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyDesignPattern;

public  class Animal {
     private String name;
     private double height;
     private int weight;
     private String favFood;
     private String sound;
     private double speed;
     
     public Flys flyingType;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
     
    public void setSound(String sound){
        this.sound = sound;
    }
     
    //strategy 
    public String tryToFly(){
        return flyingType.fly();
    }
    
    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }
    
}











