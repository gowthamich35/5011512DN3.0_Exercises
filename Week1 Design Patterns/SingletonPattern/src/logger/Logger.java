package logger;

public class Logger {
    private static Logger inst;

    private Logger(){}

    public static Logger getInstance(){
        if(inst == null){
            inst = new Logger();
        }
        return inst;
    }
    public void getName(String str){
        System.out.println(str);
    }
}