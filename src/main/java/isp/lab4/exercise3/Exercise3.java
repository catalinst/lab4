package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        TemperatureSensor temp = new TemperatureSensor(60,"Denver");
        FireAlarm alarm = new FireAlarm(false);

        Controller controller = new Controller(temp, alarm);
        controller.controlStep();
    }
}
