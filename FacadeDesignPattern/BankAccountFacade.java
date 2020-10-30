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
class BankAccountFacade {

    private int accNum;
    private int pin;
    
    AccountNumberCheck accChecker;
    PinNumberChecker pinChecker = new PinNumberChecker();
    FundChecker fundChecker;

    public BankAccountFacade(int accNum, int pin) {
        this.accNum = accNum;
        this.pin = pin;

        accChecker = new AccountNumberCheck();
        pinChecker = new PinNumberChecker();
        fundChecker = new FundChecker();

    }

    public void withdrawCash(double balance) {
        if(accChecker.validateAccountNumber(this.accNum) && pinChecker.validatePin(pin)){
           fundChecker.fundAvailability(balance);
        }
    }
    
    public void depositCash(double balance){
        if(accChecker.validateAccountNumber(this.accNum)&& pinChecker.validatePin(this.pin)){
            fundChecker.makeDeposit(balance);
        }
    }

}
