package Command;

public class SprinklerControlCommand implements Command{
    final private Sprinkler sprinkler;
    public SprinklerControlCommand(Sprinkler sprinkler) {
        this.sprinkler = sprinkler;
    }
    @Override
    public void execute() {
        sprinkler.turnOn();
    }

    @Override
    public void disable() {
        sprinkler.turnOff();
    }
}
