package Command;

public class Sprinkler {
    private static Sprinkler instance;

    private Sprinkler() {
    }

    public static Sprinkler getInstance() {
        if (instance == null) {
            instance = new Sprinkler();
        }
        return instance;
    }

    protected void turnOn() {
        System.out.println("Sprinkler turned on");
    }

    protected void turnOff() {
        System.out.println("Sprinkler turned off");
    }
}
