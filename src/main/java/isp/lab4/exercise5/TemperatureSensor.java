package isp.lab4.exercise5;

public class TemperatureSensor {
    private int value;
    private String location;

    public TemperatureSensor() {
        value = 1;
        location = "New York";
    }

    public TemperatureSensor(int value, String location) {
        this.value = value;
        this.location = location;
    }

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + value +
                ", location='" + location + '\'' +
                '}';
    }
}
