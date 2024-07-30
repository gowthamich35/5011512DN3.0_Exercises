package mobile;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
 private List<Observer> observers;
 private double stockPrice;

 public StockMarket() {
     observers = new ArrayList<>();
 }

 public void setStockPrice(double price) {
     this.stockPrice = price;
     notifyObservers();
 }

 @Override
 public void registerObserver(Observer observer) {
     observers.add(observer);
 }

 @Override
 public void deregisterObserver(Observer observer) {
     observers.remove(observer);
 }

 @Override
 public void notifyObservers() {
     for (Observer observer : observers) {
         observer.update(stockPrice);
     }
 }
}

