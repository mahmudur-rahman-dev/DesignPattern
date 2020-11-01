/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import java.util.ArrayList;

/**
 *
 * @author promise
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        //creates an ArrayList to hold all observers
        this.observers = new ArrayList<>();

    }

    @Override
    public void register(Observer o) {
        //Adds a new observer to the ArrayList
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer " + (observerIndex + 1) + " deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        //cycle through all observers and notifies them of price changes
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    //change prices for all stocks and notifies observers of changes
    public void setIBMPrice(double newIBMPrice) {
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newIBMPrice) {
        this.aaplPrice = newIBMPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newIBMPrice) {
        this.googPrice = newIBMPrice;
        notifyObserver();
    }

}
