abstract class Employee {
    private String name;
    private int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public abstract double salary();
}
class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int employeeId, double hourlyRate){
        super(name,employeeId);
        this.hourlyRate = hourlyRate;


    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double salary(){
        return hourlyRate * hoursWorked;
    }
}

class FullTimeEmployee extends Employee{
    private double basicSalary;
    private double epfRate;
    private double Allowance;

    FullTimeEmployee(String name,int employeeId,double basicSalary, double epfRate, double Allowance){
        super(name,employeeId);
        this.basicSalary = basicSalary;
        this.epfRate = epfRate;
        this.Allowance = Allowance;

    }

    public double salary() {
        double glossSalary = basicSalary - (basicSalary * (epfRate / 100)) + Allowance;
        return glossSalary;

    }
}