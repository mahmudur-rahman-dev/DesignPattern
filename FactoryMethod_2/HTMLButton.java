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
class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("HTML is rendering");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button is clicking");
    }
    
}
