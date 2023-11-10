
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter euro amount");
        double euroAmount = scanner.nextDouble();
        double sterlingAmount = convertEurotoSterling(euroAmount);
        System.out.println("The sterling amount is " + sterlingAmount);

    }

    public static double convertEurotoSterling(double euroAmount){
        double conversionRate = 0.9;
        double sterlingAmount = euroAmount * conversionRate;
        return sterlingAmount;

    }
}