package isp.lab4.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseTest {

    @Test
    public void getController() {
        Controller controller = new Controller();
        House house = new House(controller);
        assertEquals("Should have the same values", controller.toString(), house.getController().toString());
    }
}