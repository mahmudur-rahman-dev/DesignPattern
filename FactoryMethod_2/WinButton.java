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
class WinButton implements Button{

    @Override
    public void render() {
        System.out.println("rendering button of windows");
    }

    @Override
    public void onClick() {
        System.out.println("windows button is clicking");
    }
    
}
