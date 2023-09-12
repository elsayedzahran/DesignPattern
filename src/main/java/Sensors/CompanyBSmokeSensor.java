package Sensors;


import Command.Command;
import Command.Sprinkler;
import Command.SprinklerControlCommand;
import Observer.HomeOwnerObserverControl;
import Observer.HomeOwner;
import Singelton.Logger;

public class CompanyBSmokeSensor implements Sensor {
    private final HomeOwnerObserverControl homeOwnerObserverControl;
    CompanyBSmokeSensor(){
        this.homeOwnerObserverControl = new HomeOwnerObserverControl();
    }
    @Override
    public void detect() {
        System.out.println("Smoke detected");
        homeOwnerObserverControl.notify("Smoke detected");
        Logger.getInstance().log("Smoke detected");
        activateSprinkler();
    }

    @Override
    public void addOwner(HomeOwner homeOwner) {
        this.homeOwnerObserverControl.attach(homeOwner);
    }

    @Override
    public void removeOwner(HomeOwner homeOwner) {
        this.homeOwnerObserverControl.attach(homeOwner);
    }
    private void activateSprinkler() {
        Sprinkler sprinkler = Sprinkler.getInstance();
        Command turnOnCommand = new SprinklerControlCommand(sprinkler);
        turnOnCommand.execute();
    }
}
