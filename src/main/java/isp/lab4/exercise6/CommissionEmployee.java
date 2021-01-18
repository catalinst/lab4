package isp.lab4.exercise6;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionSales;

    public CommissionEmployee(String firstName, String lastName, double grossSales, double commissionSale) {
        super(firstName, lastName);
        this.grossSales = grossSales;
        this.commissionSales = commissionSale;
    }

    public double getPaymentAmount() {
        return grossSales * commissionSales;
    }
}
