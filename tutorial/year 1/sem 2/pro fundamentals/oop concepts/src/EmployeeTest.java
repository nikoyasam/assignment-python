public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John",1001, 4, 40000);

        employee1.promote(90000,7);
        employee1.viewEmployeeDetails();

        Employee employee2= new Employee("Peter", 1002, 5,100000);
        employee2.viewEmployeeDetails();

        Employee employee3 = new Employee("Nick", 1006, 6, 200000);
        employee3.viewEmployeeDetails();

        System.out.println(" ");


        System.out.println("No of employees: " + Employee.getEmployeeCount());




    }
}