package isp.lab4.exercise5;

//intre controller si house e asociere unidirectionala

public class House {
    private Controller controller; // should i make  = new Controller?

    public House(Controller controller) {
        this.controller = controller;
    }

    public Controller getController() {
        return controller;
    }
}
