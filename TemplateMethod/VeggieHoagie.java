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
public class VeggieHoagie extends Hoagie {

    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};
    
    @Override
    boolean customerWantsMeat(){return false;}
    @Override
    boolean customerWantsCheese(){return false;}
    
    @Override void addMeat() {}
    @Override void addCheese() {}
    
    @Override
    void addVegetables() {
        System.out.print("Adding vegetables: ");
        for(String vegetables: veggiesUsed){
            System.out.print(vegetables+" ");
        }
    }

    @Override
    void addCondiments() {
        System.out.print("Adding condiments: ");
        for(String condiment: condimentsUsed){
            System.out.print(condiment+" ");
        }
    }

}
