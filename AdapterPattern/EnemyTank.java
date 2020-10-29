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
public class EnemyTank implements EnemyAttacker{

    @Override
    public void driver(String name) {
        System.out.println(name+ " is driving tank");
    }

    @Override
    public void fireWeapon() {
        System.out.println("weapon is firing");
    }

    @Override
    public void moveForward() {
        System.out.println("tank is moving forward");
    }
    
}
