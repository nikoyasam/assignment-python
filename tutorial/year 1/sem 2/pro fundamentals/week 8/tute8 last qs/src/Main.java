import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeNew partTimeEmployee = new PartTimeEmployee("John", 101, 10.0);
        ((PartTimeEmployee) partTimeEmployee).setHoursWorked(40);
        double partTimeSalary = partTimeEmployee.Salary();
        System.out.println("Part-time employee salary: " + partTimeSalary);

        EmployeeNew fullTimeEmployee = new FullTimeEmployee("Jane", 102, 5000.0, 8.0, 1000.0);
        double fullTimeSalary = fullTimeEmployee.Salary();
        System.out.println("Full-time employee salary: " + fullTimeSalary);
    }
}
