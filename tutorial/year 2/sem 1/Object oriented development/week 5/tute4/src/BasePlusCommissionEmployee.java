public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // base salary per week

    public BasePlusCommissionEmployee(Date birthdate, double grossSales, double commissionRate, double baseSalary) {
        super(birthdate, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }
}