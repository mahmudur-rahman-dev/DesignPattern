/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsibility;

/**
 *
 * @author promise
 */
public class Numbers {
    private int number1;
    private int number2;
    
    private String calculationwanted;
  
    
    public Numbers(int number1,int number2,String calcWanted){
        this.number1 = number1;
        this.number2 = number2;
        this.calculationwanted = calcWanted;
    }
    
    public String getCalculationWanted(){
        return this.calculationwanted;
    }
    
    public int getNumber1(){
        return this.number1;
    }

    public int getNumber2(){
        return this.number2;
    }
}
