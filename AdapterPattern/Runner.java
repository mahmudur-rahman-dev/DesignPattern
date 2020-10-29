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
public class Runner {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyAdapter(robot);
        
        System.out.println("the Robot: ");
        robot.assignDriver("promise");
        robot.handWeaponDamage();
        robot.walkForward();
        System.out.println("");
        
        System.out.println("The Enemy Tank: ");
        tank.driver("Mark");
        tank.fireWeapon();
        tank.moveForward();
        System.out.println("");
        
        System.out.println("The Robot with Adapter: ");
        robotAdapter.driver("sazeeb");
        robotAdapter.fireWeapon();
        robotAdapter.moveForward();
    }
}
