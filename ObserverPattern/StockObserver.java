/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author promise
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    //static used as a counter
    private static int observerIDTracker = 0;

    //used to track the observers
    private int observerID;

    //will hold reference to the StockGrabber object
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        /**
         * store the reference to the stockGrabber object so I can make calls to
         * its methods
         */
        this.stockGrabber = stockGrabber;

        //assign an observer ID and increment the static counter
        this.observerID = ++observerIDTracker;

        // Messege notifies user of new observer
        System.out.println("New Observer " + this.observerID);

        //Add the observer to the Subjects ArrayList
        stockGrabber.register(this);
    }

    //called to update all observers
    @Override
    public void update(double ibmPrice, double aaplprice, double googprice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplprice;
        this.googPrice = googprice;

        printThePrices();
    }

    public void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: "
                + aaplPrice + "\nGOOG: " + googPrice + "\n");

    }
}
