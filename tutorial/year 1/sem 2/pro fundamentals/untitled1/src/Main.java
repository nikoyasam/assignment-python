import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        int distance = scanner.nextInt();

        if(distance < 0 || distance > 90){
            System.out.println("Invalid distance range");
        } else if (distance < 25){
            System.out.println("Need to walk further");
        } else if (distance < 50){
            System.out.println("Average. but not enough");
        } else if (distance < 70){
            System.out.println("Much better. but not enough");
        } else if (distance < 90){
            System.out.println("Almost there");
        } else {
            System.out.println("Mission completed");
        }


    }
}