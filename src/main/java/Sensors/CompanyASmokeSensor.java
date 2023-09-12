package Sensors;


import Command.Command;
import Command.SprinklerControlCommand;
import Command.Sprinkler;
import Observer.HomeOwnerObserverControl;
import Observer.HomeOwner;
import Singelton.Logger;

public class CompanyASmokeSensor implements Sensor {
    private final HomeOwnerObserverControl homeOwnerObserverControl;
    CompanyASmokeSensor(){
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
