/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.io.File;
import java.util.List;

/**
 *
 * @author promise
 */
public abstract class BatchProcessor {
    public final void processBatch(String filename){
        File file = openFile(filename);
       
        Parser parser;
        parser = createParser(file); //factory method
        
        List<Record> records = parser.parse();
        processRecords(records);
        writeSummary();
        closeFile(file);
    }
    
    //Factory method
    public abstract Parser createParser(File file);
    
    
    private void processRecords(List<Record> records){
        System.out.println("Processing each record.. db.calls,etc..");
    }
    
    private void closeFile(File file) {
        System.out.println("closed File");
    }

    private void writeSummary() {
        System.out.println("wrote batch summary - 0 failed");
    }

    private File openFile(String filename) {
        System.out.println("Opened file");
        return null;
    }
    
}
