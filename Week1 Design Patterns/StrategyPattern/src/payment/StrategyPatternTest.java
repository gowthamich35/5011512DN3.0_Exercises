package payment;

public class StrategyPatternTest {
 public static void main(String[] args) {
     PaymentContext paymentContext = new PaymentContext();

     PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
     paymentContext.setPaymentStrategy(creditCard);
     paymentContext.executePayment(250.75);
     System.out.println();

     PaymentStrategy payPal = new PayPalPayment("john.doe@example.com");
     paymentContext.setPaymentStrategy(payPal);
     paymentContext.executePayment(99.99);
 }
}
