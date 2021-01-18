package isp.lab4.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureSensorTest {
    //implement minimal tests

    @Test
    public void testGetValue() {
        TemperatureSensor t1 = new TemperatureSensor();
        assertEquals("Default value should be 1", 1, t1.getValue());
        TemperatureSensor t2 = new TemperatureSensor(20, "Nevada");
        assertEquals("Personalised value shoud be 20", 20, t2.getValue());
    }

    @Test
    public void testGetLocation() {
        TemperatureSensor t1 = new TemperatureSensor();
        assertEquals("Default value should be New York", "New York", t1.getLocation());
        TemperatureSensor t2 = new TemperatureSensor(20, "Nevada");
        assertEquals("Personalised value should be 20", "Nevada", t2.getLocation());
    }

    @Test
    public void testToString() {
        TemperatureSensor t1 = new TemperatureSensor();
        assertEquals("ToString should return", "TemperatureSensor{value=1, location='New York'}", t1.toString());
        TemperatureSensor t2 = new TemperatureSensor(20, "Nevada");
        assertEquals("ToString should return", "TemperatureSensor{value=20, location='Nevada'}", t2.toString());
    }
}
