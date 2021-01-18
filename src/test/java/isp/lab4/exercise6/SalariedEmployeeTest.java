package isp.lab4.exercise6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {

    @Test
    public void getPaymentAmount() {
        SalariedEmployee employee = new SalariedEmployee("Elon", "Musk", 2100450.4);
        assertEquals("Elon should have 2100450.4 dollars", 2100450.4, employee.getPaymentAmount(), 0);
    }
}