package payment;

public class PaytemAdapter implements PaymentProcessor{
    private Paytm pay;
    public PaytemAdapter(Paytm pay) {
        this.pay = pay;
    }
    @Override
    public void paymentProcess(String amt){
        pay.payKaro(amt);
    }

}