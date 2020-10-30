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
public class Application {
    private GUIFactory factory;
    private Button button;
    
    public Application(GUIFactory factory){
        this.factory = factory;
    }
    
    public void createUI(){
        this.button = factory.createButton();
    }
    
    public void paint(){
        button.paint();
    }
    
}
