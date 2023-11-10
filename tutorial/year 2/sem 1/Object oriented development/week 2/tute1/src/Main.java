import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        System.out.println("Enter height in inches");
        double heightInInches = scanner.nextDouble();

        double BMI = (weightInPounds * 703)/(heightInInches * heightInInches);
        System.out.println("BMI is " + BMI);


        if(BMI > 0 && BMI <= 18.5){
            System.out.println("It is underweight");
        }
        else if(BMI > 18.5 && BMI <= 24.9){
            System.out.println("It is normal");
        }
        else if(BMI >=25 && BMI <= 29.9){
            System.out.println("It is overweight");
        }
        else if(BMI >= 30){
            System.out.println("Obese");
        }
        else{
            System.out.println("Enter a value greater than 0");
        }
    }
}