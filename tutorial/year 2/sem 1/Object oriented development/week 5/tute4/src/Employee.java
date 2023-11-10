public abstract class Employee {
    private Date birthDate;

    public Employee(Date birthDate){
        this.birthDate = birthDate;
    }

    public abstract double earnings();

    public boolean isBirthdayMonth(int currentMonth) {
        return birthDate.getMonth() == currentMonth;
    }
}

