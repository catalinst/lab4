package isp.lab4.exercise6;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void getPaymentAmount() {
        Employee employee = new Employee("Elon", "Musk");
        assertEquals("Elon should have 0 dollars", 0, employee.getPaymentAmount(), 0);
    }
}