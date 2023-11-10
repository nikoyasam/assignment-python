import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks = scanner.nextInt();

        if(marks<25 && marks>=0){
            System.out.println("F");
        }
        else if(marks>=25 && marks<=45){
            System.out.println("E");
        }
        else if(marks>=45 && marks<=50){
            System.out.println("D");
        }
        else if(marks>=50 && marks<=60 ){
            System.out.println("C");
        }
        else if(marks>=60 && marks<=80){
            System.out.println("B");
        }
        else if(marks>80 && marks<=100){
            System.out.println("A");
        }
        else{
            System.out.println("Invalid input.Please enter again!!!!");
        }
    }
}