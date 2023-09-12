package Sensors;

public class CompanyBSensorFactory implements SensorFactory{
    @Override
    public Sensor createSmokeSensor() {
        return new CompanyBSmokeSensor();
    }

    @Override
    public Sensor createMotionSensor() {
        return new CompanyBMotionSensor();
    }
}
