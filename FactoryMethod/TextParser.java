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
class TextParser implements Parser{
    public TextParser(){}
    public TextParser(File file){
        System.out.println("creating text parser");
    }
    
    @Override
    public List<Record> parse(){
        System.out.println("parsing text and creating record list");
        return null;
    }
}
