public class Employee {
    private String name;
    private int id;
    private int workExperience;
    private double basicSalary;

    private double allowance;

    private static int employeeCount = 0;

    public Employee(String name, int id, int workExperience, int basicSalary) {
        this.name = name;
        this.id = id;
        this.workExperience = workExperience;
        this.basicSalary = basicSalary;
        employeeCount++;
    }
    public double GrossSalary() {
        double allowance = 0.0;
        if (workExperience >= 5) {
            allowance = basicSalary * 0.4;
        } else if (workExperience >= 3) {
            allowance = basicSalary * 0.3;
        } else if (workExperience >= 1) {
            allowance = basicSalary * 0.2;
        }
        return allowance + basicSalary;
    }



    public void promote(double newSalary,int newExperience){
        this.basicSalary = newSalary;
        this.workExperience = newExperience;

    }
    public void viewEmployeeDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID : " + id);
        System.out.println("Work Experience : " + workExperience + "years");
        System.out.println("Basic Salary $ : " + basicSalary);
        System.out.println("Gross Salary $ : " + GrossSalary());
    }


    public static int getEmployeeCount(){
        return employeeCount;
    }
}
