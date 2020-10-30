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
public class Nurse extends Employee implements EmployeeWork{
    
    public Nurse(String name, int id, String department, boolean working) {
        super(name, id, department, working);
        System.out.println("Nurse in Action");
    }
    
    //nurse
    private void checkVitalSigns(){
        System.out.println("checking vital signs");
    }
    
    private void drawBlood(){
        System.out.println("drawing blood");
    }
    
    private void clearPatientArea(){
        System.out.println("cleaning patient area");
    }
    
    @Override
    public void performDuties(){
        checkVitalSigns();
        drawBlood();
        clearPatientArea();
    }
}
