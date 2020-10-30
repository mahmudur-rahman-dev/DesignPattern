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
public class HPLaserJet implements IPrintScan,IPrintFeature{

    @Override
    public void printContent(String content) {
        System.out.println("print done");
    }

    @Override
    public void scanContent(String content) {
        System.out.println("scan done");
    }

    @Override
    public void photocopyContent(String content) {
        System.out.println("photocopy done");
    }
    
    @Override
    public void features(){
        System.out.println(String.format("printer: scaner : photocopy"));
    }

    
}
