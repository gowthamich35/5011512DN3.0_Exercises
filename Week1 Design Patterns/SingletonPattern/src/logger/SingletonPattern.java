package logger;

public class SingletonPattern {
    public static void main(String[] args) {
        Logger lo1 = Logger.getInstance();
        Logger lo2 = Logger.getInstance();

        lo1.getName("This is the first log message.");
        lo2.getName("This is the second log message.");

        if (lo1 == lo2) {
            System.out.println("Both log1 and log2 are the same instance.");
        } else {
            System.out.println("log1 and log2 are different instances.");
        }
    }
}