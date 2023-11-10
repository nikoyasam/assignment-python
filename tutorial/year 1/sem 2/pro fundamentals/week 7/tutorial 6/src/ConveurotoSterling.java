import java.util.Scanner;

public class ConveurotoSterling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter euro amount");
        double euroAmount = scanner.nextDouble();
        double sterlingAmount = convertEuroToSterling(euroAmount);
        System.out.println("The sterling amount is " + sterlingAmount);

        }

    public static double convertEuroToSterling(double euroAmount){
        double conversionAmount = 0.9;
        double sterlingAmount = euroAmount * conversionAmount;
        return sterlingAmount;
    }
}
