package payment;

public class PhonePeAdapter implements PaymentProcessor {
    private PhonePe pay;
     public PhonePeAdapter(PhonePe pay){
        this.pay = pay;
    }
    @Override
    public void paymentProcess(String amt){
        pay.payKaro(amt);
    }
}
