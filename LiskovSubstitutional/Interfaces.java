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
interface IEmployeeBonus {
    int calculateBonus(int salary);
}

interface IEmployee{
    int getMinimumSalary();
}

