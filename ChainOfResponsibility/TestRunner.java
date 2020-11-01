/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *what is chain of responsibility?
 * - this pattern sends data to an object and if that object can't use it,
 *   it sends it to any number of other objects that may be able to use 
 * exercise: 
 * - Create 4 Objects that can either add,subtract,multiply or divide
 * - Send 2 numbers and a command and allow these 4 objects to decide which can 
 *   the requested calculation
 * @author promise
 */
public class TestRunner {
    public static void main(String[] args) {
        Chain chain1 = new AddNumbers();
        Chain chain2 = new MulNumbers();
        Chain chain3 = new DivNumbers();
        Chain chain4 = new SubNumbers();
        
        Numbers request = new Numbers(10, 2, "div");
        
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        
        chain1.calculate(request);
    }
}
