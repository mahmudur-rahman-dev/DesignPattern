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

class MacButton implements Button{

    @Override
    public void paint() {
        System.out.println("Mac's \"Button\" color is Black");
    }
    
}

class MacCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Mac's \"Checkbox\" color is Black");
    }
    
}
