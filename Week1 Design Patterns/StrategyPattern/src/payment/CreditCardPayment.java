package payment;

public class CreditCardPayment implements PaymentStrategy {
 private String cardHolderName;

 public CreditCardPayment(String cardNumber, String cardHolderName) {
     this.cardHolderName = cardHolderName;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Processing credit card payment of $" + amount + " for card holder " + cardHolderName);
 }
}
