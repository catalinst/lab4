package isp.lab4.exercise6;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommissionEmployeeTest {

    @Test
    public void getPaymentAmount() {
        CommissionEmployee employee = new CommissionEmployee("Elon", "Musk", 1500.55, 10);
        assertEquals("Elon should have 15005.5 dollars", 15005.5, employee.getPaymentAmount(), 0);
    }
}