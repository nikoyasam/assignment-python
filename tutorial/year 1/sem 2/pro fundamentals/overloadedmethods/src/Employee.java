public class Employee {
    private String name;
    private double basicSalary;

    Employee(String name, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;

    }

    public double calBonus() {
        return 0.1 * basicSalary;
    }

    public double calBonus(double rate) {
        return rate * basicSalary;

    }

    public double calBonus(double basicSalary, double rate, int hours, char employeeClass) {
        double bonus = 0.0;
        switch (employeeClass) {
            case 'A':
                bonus = basicSalary * 0.3 * hours;
                break;
            case 'B':
                bonus = basicSalary * 0.2 * hours;
                break;
            case 'C':
                bonus = basicSalary * 0.1 * hours;
                break;
            default:
                System.out.println("Invalid employee class entered.");
        }
        return bonus;
    }


}
