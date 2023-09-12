package Sensors;

public interface SensorFactory {
    Sensor createSmokeSensor();

    Sensor createMotionSensor();
}
