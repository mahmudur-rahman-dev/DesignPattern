/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod_2;

import java.util.Scanner;

/**
 *
 * @author promise
 */
public class App {
   
    public static void main(String[] args) {
        Dialog dialog = null;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals("w")){
            dialog = new WinDialog();
        }
        else if(input.equals("h")){
            dialog = new HTMLDialog();
        }
        dialog.render();
    }
}
