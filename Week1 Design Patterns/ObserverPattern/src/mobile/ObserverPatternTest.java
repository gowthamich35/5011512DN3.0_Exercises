package mobile;

public class ObserverPatternTest {
 public static void main(String[] args) {
     StockMarket stockMarket = new StockMarket();

     MobileApp mobileApp = new MobileApp();
     WebApp webApp = new WebApp();

     stockMarket.registerObserver(mobileApp);
     stockMarket.registerObserver(webApp);

     stockMarket.setStockPrice(150.75);
     System.out.println();

     stockMarket.setStockPrice(155.20);
 }
}
