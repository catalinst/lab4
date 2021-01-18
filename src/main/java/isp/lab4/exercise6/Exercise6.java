package isp.lab4.exercise6;

public class Exercise6 {

    public static void main(String[] args) {
        //part 1
        Employee employee = new Employee("Elon", "Musk");
        System.out.println(employee.getPaymentAmount());
        CommissionEmployee commissionEmployee = new CommissionEmployee("Jeff", "Bezos", 2000, 50);
        System.out.println(commissionEmployee.getPaymentAmount());
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Bill", "Gates", 100.50, 10);
        System.out.println(hourlyEmployee.getPaymentAmount());
        SalariedEmployee salariedEmployee = new SalariedEmployee("Mark", "Zuckerberg", 2000);
        System.out.println(salariedEmployee.getPaymentAmount());

        // part 2

        Employee[] employees = new Employee[6];
        employees[0] = new CommissionEmployee("Joe", "Biden", 1200, 10);
        employees[1] = new CommissionEmployee("Donald", "Trump", 1500, 10);
        employees[2] = new HourlyEmployee("Hillary", "Clinton", 300, 20);
        employees[3] = new HourlyEmployee("Mike", "Pence", 200, 10);
        employees[4] = new SalariedEmployee("Barack", "Obama", 4500);
        employees[5] = new SalariedEmployee("Al", "Gore", 10000);
        double totalPayment = 0.0;

        for (Employee emp : employees ) {
            totalPayment += emp.getPaymentAmount();
        }

        System.out.println("They are payed " + totalPayment);
    }
}
