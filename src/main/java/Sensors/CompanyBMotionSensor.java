package Sensors;

import Command.Alarm;
import Command.AlarmControlCommand;
import Command.Command;
import Observer.HomeOwnerObserverControl;
import Observer.HomeOwner;
import Singelton.Logger;

public class CompanyBMotionSensor implements Sensor {
    private final HomeOwnerObserverControl homeOwnerObserverControl;
    CompanyBMotionSensor(){
        this.homeOwnerObserverControl = new HomeOwnerObserverControl();
    }
    @Override
    public void detect() {
        System.out.println("Motion detected");
        homeOwnerObserverControl.notify("Motion detected");
        Logger.getInstance().log("Motion detected");
        activateAlarm();
    }

    @Override
    public void addOwner(HomeOwner homeOwner) {
        this.homeOwnerObserverControl.attach(homeOwner);
    }

    @Override
    public void removeOwner(HomeOwner homeOwner) {
        this.homeOwnerObserverControl.attach(homeOwner);
    }
    private void activateAlarm() {
        Alarm alarm = Alarm.getInstance();
        Command turnOnCommand = new AlarmControlCommand(alarm);
        turnOnCommand.execute();
    }
}
