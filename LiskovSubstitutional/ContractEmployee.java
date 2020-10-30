/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiskovSubstitutional;

/**
 *
 * @author promise
 */
public class ContractEmployee implements IEmployee{
    private String name;
    private int ID;
    public ContractEmployee(String name,int ID){
        this.name = name;
        this.ID = ID;
    }

    @Override
    public int getMinimumSalary() {
        return 500;
    }
    
    @Override
    public String toString(){
        return String.format("name: %s, ID: %d",this.name,this.ID);
    }
 
   
}
