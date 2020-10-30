/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceSegregation;

/**
 *
 * @author promise
 */
public class Runner {
    public static void main(String[] args) {
       HPLaserJet hp = new HPLaserJet();
       Canon400 canon = new Canon400();
       hp.features();
       canon.features();
       
    }
}
