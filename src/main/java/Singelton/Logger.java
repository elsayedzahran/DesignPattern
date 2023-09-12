package Singelton;

// Singleton Pattern: Logger
public class Logger {
    private static Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }
    public void log(String message) {
        System.out.println("Logging: " + message);
    }
}
