/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author promise
 */
public class EnemyRobot {
    public void walkForward(){
        System.out.println("robot walking forward");
    }
    public void assignDriver(String name){
        System.out.println(name+ " is driving (robot)");
    }
    public void handWeaponDamage(){
        System.out.println("hand is damaging something");
    }
}
