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
public interface Chain {
    void setNextChain(Chain nextChain);
    void calculate(Numbers request);
}


