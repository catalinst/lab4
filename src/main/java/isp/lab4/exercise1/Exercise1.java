package isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        TemperatureSensor t = new TemperatureSensor();
        System.out.println(t);
        System.out.println("-------");
        TemperatureSensor temperatureSensor = new TemperatureSensor(103,"Cluj");
        System.out.println(temperatureSensor.getValue() + " at " + temperatureSensor.getLocation());
        System.out.println(temperatureSensor);
    }
}
