package isp.lab4.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FireAlarmTest {

    @Test
    public void isActive() {
        FireAlarm fireAlarm = new FireAlarm(false);
        assertEquals("FireAlarm should be false", false, fireAlarm.isActive());

        assertFalse("FireAlarm should be false", fireAlarm.isActive()); // suggested by IDE
    }

    @Test
    public void setActive() {
        FireAlarm fireAlarm = new FireAlarm(false);
        fireAlarm.setActive(true);
        assertEquals("FireAlarm should be true", true, fireAlarm.isActive());

        assertTrue("FireAlarm should be true", fireAlarm.isActive()); // suggested by IDE
    }

    @Test
    public void testToString() {
        FireAlarm  fireAlarm = new FireAlarm(true);
        assertEquals("ToString should print", "FireAlarm{active=true}", fireAlarm.toString());
    }
}