/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author promise
 */
public class ItalianHoagie extends Hoagie{

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provolone"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = { "Oil", "Vinegar" };
   
    @Override
    void addMeat() {
        System.out.print("Adding the Meat:");
        for(String meat: meatUsed){
            System.out.print(meat+" ");
        }
       
    }

    @Override
    void addCheese() {
        System.out.print("Adding Cheese:");
        for(String cheese: cheeseUsed){
            System.out.print(cheese+" ");
        }
        
    }

    @Override
    void addVegetables() {
        System.out.print("Adding Vegetables:");
        for(String veg: veggiesUsed){
            System.out.print(veg+" ");
        }
    }

    @Override
    void addCondiments() {
        System.out.print("Adding condiments:");
        for(String condiment: condimentsUsed){
            System.out.print(condiment+" ");
        }
    }
    
}
