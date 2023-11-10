public class Test4 {
    public static void main(String[] args){
        Student partTimeStudent = new PartTimeStudent("Nikoya",2,20000000);
        double ptFee = partTimeStudent.calculateFee();
        System.out.println("Fee is " + ptFee);

        Student fullTimeStudent = new FullTimeStudent("nenene",2,1500000);
        double ftStudent = fullTimeStudent.calculateFee();
        System.out.println("Fee is " + ftStudent);
    }
}
