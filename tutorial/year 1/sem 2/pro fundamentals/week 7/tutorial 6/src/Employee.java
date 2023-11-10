public class Employee {
    private String name;
    private int employeeId;
    private int hourlyRate;
    private int hoursWorked;

    Employee(String name,int employeeId, int hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.employeeId = employeeId;
        this.hoursWorked = 0;

    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public double calculateWeeklyPay(){
        return hoursWorked * hourlyRate;

    }
    public void logHoursWorked(int hours) {
        hoursWorked += hours;
    }

    public int getCurrentHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
