package notification;

public class App {
    public static void main(String[] args) throws Exception {
        Notifier mailntf = new EmailNotifier();
        Notifier smsntf = new SmsNotiDecorator(mailntf);
        Notifier slackntf = new SlackNotiDecorator(smsntf);
        slackntf.send("Hello, this is a test message!");
    }
}