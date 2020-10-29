/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod_2;

/**
 *
 * @author promise
 */
public abstract class Dialog {
    public abstract Button createButton(); //factory method
    
    public void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }
    
    
}
