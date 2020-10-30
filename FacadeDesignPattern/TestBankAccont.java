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
/**
 * what is  facade?  when we create a simplified interface that performs many other actions behind the scenes
 * problem statement:
 * can I withdraw 50$ from the bank?
 * -> check if the checking account is valid
 * -> check if the security code is valid
 * -> check if funds are available
 * -> Make changes accordingly
 * @author promise
 */

public class TestBankAccont {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678,1234);
        accessingBank.withdrawCash(50.00);
        
        accessingBank.withdrawCash(900.00);
        
        accessingBank.depositCash(200.00);
        
    }
}
