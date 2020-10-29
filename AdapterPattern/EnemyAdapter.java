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
public class EnemyAdapter implements EnemyAttacker{
    EnemyRobot enemyRobot;
    
    public EnemyAdapter(EnemyRobot enemyRobot){
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void driver(String name) {
        this.enemyRobot.assignDriver(name);
    }

    @Override
    public void fireWeapon() {
        this.enemyRobot.handWeaponDamage();
    }

    @Override
    public void moveForward() {
        this.enemyRobot.walkForward();
    }
}
