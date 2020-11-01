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
public class DivNumbers implements Chain{
    private Chain nextInChain;
    
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if("div".equals(request.getCalculationWanted())){
            System.out.println(request.getNumber1() + "/" +request.getNumber2()
                    +"= "+ (request.getNumber1()/request.getNumber2()) );
        }else{
            this.nextInChain.calculate(request);
        }
    }
    
    
}