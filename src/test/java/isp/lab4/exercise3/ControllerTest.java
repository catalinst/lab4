package isp.lab4.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void controlStep() {
        TemperatureSensor temperatureSensor = new TemperatureSensor(40, "Dallas");
        FireAlarm fireAlarm = new FireAlarm(false);
        Controller controller = new Controller(temperatureSensor,fireAlarm);

        controller.controlStep();
        assertFalse("Alarm should not be started", fireAlarm.isActive());

        temperatureSensor.setValue(60);
        controller.controlStep();
        assertTrue("Alarm now should be started", fireAlarm.isActive());

    }
}