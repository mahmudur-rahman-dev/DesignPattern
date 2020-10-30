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
public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse("peggy", 1, "emergency", true);
        ERDirector.callUpon(peggy);
        System.out.println("");
        Employee suzan = new Doctor("suzan", 2, "emergency", true);
        ERDirector.callUpon(suzan);
        
    }   
    
}
