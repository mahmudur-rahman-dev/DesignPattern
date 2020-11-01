/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

// A Template Method Pattern contains a method that provides
// the steps of the algorithm. It allows subclasses to override 
// some of the methods
public abstract class Hoagie {
    boolean afterFirstCondiment = false;
    
    /**
     * - this is the template method
     * - Declare this method final to keep subclasses from 
     *   changing the algorithm
     */
    final void makeSandwich(){
        cutBun();
        
        if(customerWantsMeat()){
            addMeat();
            //here to handle new lines for spacing
            afterFirstCondiment = true;
        }
        
        if(customerWantsCheese()){
            if(afterFirstCondiment) {System.out.println("");}
            addCheese();
            afterFirstCondiment = true;
        }
        
        if(customerWantsVegetables()){
            if(afterFirstCondiment) {System.out.println("");}
            addVegetables();
            afterFirstCondiment = true;
        }
        
        if(customerWantsCondiments()){
            if(afterFirstCondiment) {System.out.println("");}
            addCondiments();
            afterFirstCondiment = true;
        }
        wrapTheHoagie();
    }
   
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();
   
    public void cutBun(){
        System.out.println("The Hoagie is Cut");
    }
    
    /**
     * - These are called hooks
     * - If the user wants to override these they can
     * - Use abstract methods when we want to force the user to override
     *   and use a hook when we want it to be optional
     * @return 
     */
    boolean customerWantsMeat() {return true;}
    boolean customerWantsCheese() {return true;}
    boolean customerWantsVegetables() {return true;}
    boolean customerWantsCondiments() {return true;}
    
    public void wrapTheHoagie(){
        System.out.println("Wrap the Hoagie");
    }
    
    public void afterFirstCondiment(){
        System.out.println("\n");
    }
    
    
}
