public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(Date birthdate, double weeklySalary) {
        super(birthdate);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary * 4; // Assuming 4 weeks in a month
    }
}