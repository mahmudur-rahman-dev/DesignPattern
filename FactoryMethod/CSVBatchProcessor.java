/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import java.io.File;

/**
 *
 * @author promise
 */
public class CSVBatchProcessor extends BatchProcessor {

    @Override
    public Parser createParser(File file) {
        return new CSVParser(file);
    }
    
}
