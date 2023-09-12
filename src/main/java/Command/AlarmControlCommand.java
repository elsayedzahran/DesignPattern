package Command;

public class AlarmControlCommand implements Command {
    final private Alarm alarm;

    public AlarmControlCommand(Alarm alarm) {
        this.alarm = alarm;
    }
    @Override
    public void execute() {
        alarm.turnOn();
    }

    @Override
    public void disable() {
        alarm.turnOff();
    }
}
