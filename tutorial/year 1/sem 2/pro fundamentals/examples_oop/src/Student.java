abstract class Student {
    protected String name;
    protected int numCourses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public Student(String name, int numCourses){
        this.name = name;
        this.numCourses = numCourses;
    }

    public abstract double calculateFee();

}

class PartTimeStudent extends Student{
    private double feePerCourse;

    public PartTimeStudent(String name,int numCourses,double feePerCourse){
        super(name,numCourses);
        this.feePerCourse = feePerCourse;
    }


    public double calculateFee() {
        return feePerCourse * numCourses;
    }
}

class FullTimeStudent extends Student{
    private double flatFee;

    public FullTimeStudent(String name, int numCourses,double flatFee){
        super(name,numCourses);
        this.flatFee = flatFee;
    }

    public double calculateFee(){
        return flatFee;
    }
}
