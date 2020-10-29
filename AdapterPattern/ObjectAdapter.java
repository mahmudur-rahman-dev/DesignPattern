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
//bird is client
interface Bird{
    void fly();
    void makeSound();
}

class Sparrow 
        implements Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow is flyting");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow making sound");
    }
    
}

interface ToyDuck{
    void squeak();
}

class PlasticToyDuck 
        implements ToyDuck{

    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
    
}

class BirdAdapter implements ToyDuck{
    Bird bird;
    public BirdAdapter(Bird bird){
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}

class Main{
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();
        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        
        sparrow.fly();
        sparrow.makeSound();
        
        toyDuck.squeak();
        
        birdAdapter.squeak();
        
    }   
    
}