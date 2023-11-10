abstract class EmployeeNew {
    private String name;
    private int employeeID;

    public EmployeeNew(String name, int employeeID){
        this.name = name;
        this.employeeID = employeeID;

    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public abstract double Salary();

}
class PartTimeEmployee extends EmployeeNew {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeID,double hourlyRate) {
        super(name,employeeID);
        this.hourlyRate = hourlyRate;

    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double Salary(){
        return hourlyRate * hoursWorked;
    }
}

class FullTimeEmployee extends EmployeeNew{
    private double basicSalary;
    private double epfRate;
    private double allowance;

    public FullTimeEmployee(String name, int employeeID, double basicSalary, double epfRate, double allowance){
        super(name, employeeID);
        this.basicSalary = basicSalary;
        this.epfRate = epfRate;
        this.allowance = allowance;
    }


    public double Salary(){
        double glossSalary = basicSalary - (basicSalary * (epfRate / 100)) + allowance;
        return glossSalary;

    }
}








