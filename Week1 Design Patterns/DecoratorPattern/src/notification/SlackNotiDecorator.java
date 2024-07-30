package notification;

public class SlackNotiDecorator extends NotifierDoc {
    public SlackNotiDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message with: " + message);
    }
}