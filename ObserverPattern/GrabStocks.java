/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 * when to use observer pattern?
 * # When we need many other objects to receive an update when another object changes
 * -Stock marker with thousands of stocks needs to send updates to objects representing individual stocks
 * -The Subject(Publisher) sends many stocks to the Observers
 * -The Observers(Subscriber) takes the ones they want and use them
 * @author promise
 */
public class GrabStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        
        StockObserver observer1 = new StockObserver(stockGrabber);
       
        stockGrabber.setIBMPrice(125);
        stockGrabber.setAAPLPrice(100);
        stockGrabber.setGOOGPrice(50);

        StockObserver observer2 = new StockObserver(stockGrabber);
        
        stockGrabber.setIBMPrice(200);
        stockGrabber.setAAPLPrice(500);
        stockGrabber.setGOOGPrice(600);
        
        //Delete one of the Observers
        stockGrabber.unregister(observer1);
        
        stockGrabber.setIBMPrice(20);
        stockGrabber.setAAPLPrice(5);
        stockGrabber.setGOOGPrice(6);
        
        //using thread
        //upcoming feature...
        
        
    }
}
