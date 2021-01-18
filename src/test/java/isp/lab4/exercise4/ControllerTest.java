package isp.lab4.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void controlStep() {
        FireAlarm fireAlarm = new FireAlarm(false);
        TemperatureSensor[] temperatureSensors = new TemperatureSensor[3];
        temperatureSensors[0]= new TemperatureSensor(30, "Nebraska");
        temperatureSensors[1] = new TemperatureSensor(40,"Ohio");
        temperatureSensors[2] = new TemperatureSensor(55,"Malibu");
        Controller controller = new Controller(temperatureSensors, fireAlarm);
        controller.controlStep();

        assertFalse("Alarm wasn't started", fireAlarm.isActive());

        for (TemperatureSensor t : temperatureSensors) {
            t.setValue(51);
        }
        controller.controlStep();

        assertTrue("Alarm is started", fireAlarm.isActive());

    }
}