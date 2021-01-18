package isp.lab4.exercise5;

//compozitie intre fire si controller
//compozitie intre temp si controller
//intre controller si house e asociere unidirectionala

import java.util.Arrays;

public class Controller {
    private TemperatureSensor[] temperatureSensors;
    private FireAlarm fireSensor;

    public Controller() {
        fireSensor = new FireAlarm(false);
        temperatureSensors = new TemperatureSensor[3]; // this line is here or up?
        temperatureSensors[0] = new TemperatureSensor(40, "Los Angeles");
        temperatureSensors[1] = new TemperatureSensor(45, "San Francisco");
        temperatureSensors[2] = new TemperatureSensor(55, "Palo Alto");
    }

    public void controlStep() {
        if (temperatureSensors[0].getValue() > 50
                || temperatureSensors[1].getValue() > 50
                || temperatureSensors[2].getValue() > 50) {
            fireSensor.setActive(true);
            System.out.println("Fire alarm started");
        } else {
            fireSensor.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }

    @Override
    public String toString() {
        return "Controller{" +
                "temperatureSensors=" + Arrays.toString(temperatureSensors) +
                ", fireSensor=" + fireSensor +
                '}';
    }
}
