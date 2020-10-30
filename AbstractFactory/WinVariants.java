/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author promise
 */
class WinButton implements Button{

    @Override
    public void paint() {
        System.out.println("windows \"Button\" color is Blue");
    }
    
}

class WinCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("windows \"Checkbox\" color is Blue");
    }
    
}
