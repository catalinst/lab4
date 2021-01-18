package isp.lab4.exercise3;

public class TemperatureSensor {
    private int value;
    private String location;

    public TemperatureSensor() {
        value = 1;
        location = "New York";
    }

    public TemperatureSensor(int type, String location) {
        this.value = type;
        this.location = location;
    }

    public int getValue() {
        return value;
    }

    public String getLocation() {
        return location;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "value=" + value +
                ", location='" + location + '\'' +
                '}';
    }
}
