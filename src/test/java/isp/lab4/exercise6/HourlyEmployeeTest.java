package isp.lab4.exercise6;

import org.junit.Test;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    @Test
    public void getPaymentAmount() {
        HourlyEmployee employee = new HourlyEmployee("Elon", "Musk", 150.55, 10);
        assertEquals("Elon should have 1505.5 dollars", 1505.5, employee.getPaymentAmount(), 0);
    }
}