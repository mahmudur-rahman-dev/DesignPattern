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
public class AccountNumberCheck {
    private int accNumber = 12345678;
    
    public int getAccountNumber(){
        return this.accNumber; 
    }
    
    public boolean validateAccountNumber(int accNo){
       if(getAccountNumber()!=accNo){
           System.out.println("invalid account number");
           return false;
       }
       return true;
    }
    
    
    
}
