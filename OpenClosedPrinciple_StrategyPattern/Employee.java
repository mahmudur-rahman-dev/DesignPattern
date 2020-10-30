/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenClosedPrinciple_StrategyPattern;

/**
 *
 * @author promise
 */
public abstract class Employee implements EmployeeWork{
    private String name;
    private int id;
    private String department;
    private boolean working;

    public Employee(String name, int id, String department, boolean working) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.working = working;
    }
    
    @Override
    public String toString(){
        return String.format("Employee id: %d, name: %s, department %s, working : %b",
                this.id,this.name,this.department,this.working);
    }
   
    @Override
    public abstract void performDuties();
}
