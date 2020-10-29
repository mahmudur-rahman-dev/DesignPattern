/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author promise
 */
public class App {
    public static void main(String[] args) {
        String text = "Text";
        String csv = "CSV";
        BatchProcessor batchProcessor = createBatchProcessor(csv);
        batchProcessor.processBatch(csv);
        System.out.println("Done");
    }

    private static BatchProcessor createBatchProcessor(String text) {
        if(text.equals("Text")) return new TextBatchProcessor();
        else if (text.equals("CSV")) return new CSVBatchProcessor();
        return null;
    }
}
