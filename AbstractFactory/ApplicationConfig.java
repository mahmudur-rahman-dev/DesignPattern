/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author promise
 */
public class ApplicationConfig {
    
    public static void main(String[] args) throws IOException, Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        GUIFactory factory;
        if(input.equals("windows")){
            factory = new WinFactory();
        }
        else if(input.equals("mac")){
            factory = new MacFactory();
        }
        else {
            throw new Exception("Error! Unknown operating system");
        }
        
        Application app = new Application(factory);
        Button btn = factory.createButton();
        Checkbox cBox = factory.createCheckbox();
        btn.paint();
        cBox.paint();
    }
    
}
