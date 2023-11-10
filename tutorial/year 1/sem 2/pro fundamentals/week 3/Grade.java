import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your marks: ");
        int a = scanner.nextInt();

        if (a <= 25) {
            System.out.println("Grade is F");
        } 
		else if (a >= 25 && a <= 45) {
            System.out.println("Grade is E");

        } 
		else if (a >= 45 && a <= 50) {
            System.out.println("Grade is D");

        } 
		else if (a >= 50 && a <= 60) {
            System.out.println("Grade is C");

        } 
		else if (a >= 60 && a <= 80) {
            System.out.println("Grade is B");
        } 
		else if (a >= 80) {
            System.out.println("Grade is A");
        }
		
	
    }


}    