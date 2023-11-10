import java.util.Scanner;


public class Bro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double celsius = scanner.nextDouble();
        double farenheiht = (9.0/5) * celsius + 32;
        System.out.println(celsius + "°C is equivalent to " + farenheiht + "°F");
    }
}