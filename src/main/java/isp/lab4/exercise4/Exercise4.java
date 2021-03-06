package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        FireAlarm fireAlarm = new FireAlarm(false);
        TemperatureSensor[] temperatureSensors = new TemperatureSensor[3];
        temperatureSensors[0]= new TemperatureSensor(30, "Nebraska");
        temperatureSensors[1] = new TemperatureSensor(40,"Ohio");
        temperatureSensors[2] = new TemperatureSensor(55,"Malibu");

        Controller controller = new Controller(temperatureSensors, fireAlarm);
        controller.controlStep();

        System.out.println("--------------------- now making them all 50+ to start the alarm");

        for (TemperatureSensor t : temperatureSensors) {
            t.setValue(51);
        }

        controller.controlStep();

    }
}
