public class Student extends Person{
    private String studentId;

    Student(){

    }

    public Student(String firstname, String lastName, int age,String studentId){
        super(firstname,lastName,age);
        this.studentId = studentId;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void display(){
        System.out.println("This is the parent");
    }

}
