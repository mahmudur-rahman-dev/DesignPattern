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

interface IPrintScan {

    void printContent(String content);

    void scanContent(String content);

    void photocopyContent(String content);

}

interface IFaxContent {

    void faxContent(String content);
}
interface IPrintDuplex{
    void printDuplexContent(String content);
}

interface IPrintFeature{
    void features();
}