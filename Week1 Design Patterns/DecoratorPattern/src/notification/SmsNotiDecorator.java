package notification;

public class SmsNotiDecorator extends NotifierDoc {
    public SmsNotiDecorator(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }
    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}