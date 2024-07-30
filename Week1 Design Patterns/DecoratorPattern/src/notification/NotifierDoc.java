package notification;

public abstract class NotifierDoc implements Notifier {
    protected Notifier ntf;
    public NotifierDoc(Notifier notifier) {
        this.ntf = notifier;
    }
    @Override
    public void send(String message) {
        ntf.send(message);
    }
}