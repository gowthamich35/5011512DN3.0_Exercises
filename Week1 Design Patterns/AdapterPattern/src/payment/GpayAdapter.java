package payment;

public class GpayAdapter implements PaymentProcessor {
    private Gpay pay;
    public GpayAdapter(Gpay pay) {
        this.pay = pay;
    }
    @Override
    public void paymentProcess(String amount) {
        pay.payKaro(amount);
    }
}
