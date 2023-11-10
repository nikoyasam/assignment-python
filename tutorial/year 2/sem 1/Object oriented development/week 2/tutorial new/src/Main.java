import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        double weightInPounds = scanner.nextDouble();

        System.out.println("Enter height in inches");
        double heightInInches = scanner.nextDouble();

        Person person = new Person(weightInPounds,heightInInches);

        person.calculateBMI();


    }
}