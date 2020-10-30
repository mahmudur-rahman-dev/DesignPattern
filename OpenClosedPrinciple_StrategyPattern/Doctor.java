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
class Doctor extends Employee implements EmployeeWork{
    
    public Doctor(String name, int id, String department, boolean working) {
        super(name, id, department, working);
        System.out.println("Doctor in action");
        
    }
    
    //doctor
    private void prescribeMedicine(){
        System.out.println("prescribe Medicine");
    }
    
    private void diagnosePatient(){
        System.out.println("Diagnosing pati");
    }
    
    @Override
    public void performDuties(){
        prescribeMedicine();
        diagnosePatient();
    }

}
