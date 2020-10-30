/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiskovSubstitutional;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author promise
 */
public class Runner {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new TemporaryEmployee("promise", 1));
        employees.add(new PermanentEmployee("shojib", 2));

        
        employees.forEach((em) -> {
            System.out.printf("%s, Bonus:%d , minimumSalary: %d\n",
                    em.toString(),em.calculateBonus(1000),em.getMinimumSalary());
        });
        
        
        
        List<IEmployee> employees1 = new ArrayList<>();

        employees1.add(new TemporaryEmployee("promise", 1));
        employees1.add(new PermanentEmployee("shojib", 2));
        employees1.add(new ContractEmployee("mashrur", 2));
        
        for(IEmployee em: employees1){
            System.out.printf("%s :minmumsalary:%d\n",em.toString(),em.getMinimumSalary());
        }
    }
}
