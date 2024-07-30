package payment;

public class App {
    public static void main(String[] args) throws Exception {
        Gpay gp = new Gpay();
        PaymentProcessor gpadapt = new GpayAdapter(gp);
        gpadapt.paymentProcess("100 rs");

        PhonePe pp = new PhonePe();
        PaymentProcessor ppAdapter = new PhonePeAdapter(pp);
        ppAdapter.paymentProcess("200 rs");

        Paytm pt = new Paytm();
        PaymentProcessor ptAdapter = new PaytemAdapter(pt);
        ptAdapter.paymentProcess("300 rs");
    }
}