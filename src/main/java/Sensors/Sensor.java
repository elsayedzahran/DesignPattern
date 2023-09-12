package Sensors;

import Observer.HomeOwner;

public interface Sensor {
    public void detect();
    public void addOwner(HomeOwner homeOwner);
    public void removeOwner(HomeOwner homeOwner);
}
