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
public class CSVParser implements Parser{
    
    public CSVParser(File file) {
        System.out.println("created csv parser");
    }

    @Override
    public List<Record> parse() {
        System.out.println("parsing csv values");
        return null;
    }
    
    
}
