public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked for the week

    public HourlyEmployee(Date birthdate, double wage, double hours) {
        super(birthdate);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return wage * hours * 4; // Assuming 4 weeks in a month
    }
}