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
public class FundChecker {
    private double balance = 1000;
    
    public double getBalance(){
        return this.balance;
    }
    
    public void decreseAccountBalance(double decBalance){
        this.balance-=decBalance;
        System.out.println(decBalance+" money cashout success: your account balance is : "+ getBalance());
    }
   
    public void makeDeposit(double depBalance){
        this.balance+=depBalance;
        System.out.println(depBalance+" money deposited: current balance: "+getBalance());
    }
    
    public boolean fundAvailability(double balance){
       if(balance>getBalance()){
           System.out.println("do not have sufficiant balance!");
           return false;
       }
       else {
           decreseAccountBalance(balance);
           return true;
       }
    }
    
}
