import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in centigrade");
        double centigrade = scanner.nextDouble();
        double fahrenheit = convertCentigradesToFahrenheit(centigrade);
        System.out.println("The fahrenheit amount is " + fahrenheit);


    }

    public static double convertCentigradesToFahrenheit(double centigrade){
         double fahrenheit = (9/5)*centigrade + 32;
         return fahrenheit;
    }
}
