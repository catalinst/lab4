package isp.lab4.exercise3;

// intre Controller si FireAlarm exista agregare
// intre Controller si TemperatureSensor exista agregare

public class Controller {
    private TemperatureSensor temperatureSensor;
    private FireAlarm fireSensor;

    public Controller(TemperatureSensor temperatureSensor, FireAlarm fireAlarm) {
        this.temperatureSensor = temperatureSensor;
        this.fireSensor = fireAlarm;
    }

    public void controlStep() {
        if (temperatureSensor.getValue() > 50) {
            fireSensor.setActive(true);
            System.out.println("Fire alarm started");
        } else {
            fireSensor.setActive(false);
            System.out.println("Fire alarm not started");
        }
    }
}
