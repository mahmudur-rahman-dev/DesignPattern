/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDesignPattern;

/**
 *
 * @author promise
 */
public class PinNumberChecker {
    private int pin  = 1234;
    
    public boolean validatePin(int pin){
        if(this.pin != pin){
            System.out.println("invalid pin number");
            return false;
        }
        return true;
    }
}
