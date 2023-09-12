package Sensors;

public class CompanyASensorFactory implements SensorFactory{
    @Override
    public Sensor createSmokeSensor() {
        return new CompanyASmokeSensor();
    }

    @Override
    public Sensor createMotionSensor() {
        return new CompanyAMotionSensor();
    }
}
