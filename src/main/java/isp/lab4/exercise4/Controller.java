package isp.lab4.exercise4;

// intre Controller si FireAlarm exista agregare
// intre Controller si TemperatureSensor exista agregare

public class Controller {
    private TemperatureSensor[] temperatureSensors = new TemperatureSensor[3]; // its fine ?
    private FireAlarm fireSensor;

    public Controller(TemperatureSensor[] temperatureSensors, FireAlarm fireSensor) {
        this.temperatureSensors[0] = temperatureSensors[0];
        this.temperatureSensors[1] = temperatureSensors[1];
        this.temperatureSensors[2] = temperatureSensors[2];
        this.fireSensor = fireSensor;
    }

    public void controlStep() {
        if (temperatureSensors[0].getValue() > 50 &&
                temperatureSensors[1].getValue() > 50 &&
                temperatureSensors[2].getValue() > 50) {
            System.out.println("Fire alarm started");
            fireSensor.setActive(true);
        } else {
            System.out.println("Fire alarm not started");
            fireSensor.setActive(false);
        }
    }
}
