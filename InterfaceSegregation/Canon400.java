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
public class Canon400 implements IPrintFeature, IPrintScan, IFaxContent {

    @Override
    public void printContent(String content) {
        System.out.println("print is done");

    }

    @Override
    public void scanContent(String content) {
        System.out.println("scan is done");

    }

    @Override
    public void photocopyContent(String content) {
        System.out.println("photocopy is done");

    }

    @Override
    public void faxContent(String content) {
        System.out.println("fax is done");

    }

    public void features() {
        System.out.println(String.format("printer: scaner : photocopy: fax"));

    }

}
