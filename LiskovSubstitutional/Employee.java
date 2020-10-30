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
public abstract class Employee implements IEmployee,IEmployeeBonus{
    private String name;
    private int ID;
    public Employee(String name,int ID){
        this.name = name;
        this.ID = ID;
    }
    
    @Override
    public abstract int calculateBonus(int salary);
    
    @Override
    public abstract int getMinimumSalary();
    
    @Override
   public String toString(){
    return String.format("name: %s,ID: %d", this.name, this.ID);
   } 
    
}
