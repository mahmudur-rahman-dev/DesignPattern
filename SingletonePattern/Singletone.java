/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonePattern;

/**
 *
 * @author promise
 */

//here final keyword is the hero to save singletone class behaviour
final class Test{
    private static Test test = null;
    private Test(){
        System.out.println("creating...");
    }
    public static Test getTest(){
        if(test == null){
            test = new Test();
        }
        return test;
    }
    
    //breaking singletone class. But if we use final class then it wont be breoken
//    class X extends Test{
//        
//    }
}
public class Singletone {
    public static void main(String[] args){
        Test t1 = Test.getTest();
        Test t2 = Test.getTest();
        print("s1",t1);
        print("s2",t2);
        
//        //nested class
//        Test.X x = t1.new X(); // will break the singletone class
        
    }
    public static void print(String name,Object object){
        System.out.println(String.format("name:%s :: hashcode:%d",name,object.hashCode()));
    }
}
