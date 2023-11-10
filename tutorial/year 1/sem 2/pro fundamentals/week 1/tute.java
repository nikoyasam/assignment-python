TASK 1

public class hello {
	public static void main(String[] args) {
	    System.out.println("Hello World");
            System.out.println("This is easy");
            System.out.println("Goodbye world!");
        }
}


TASK 2

public class hello {
    public static void main(String[] args) {

        System.out.println("Hello! I am Sam. I am \n21 years old");

    }
}

TASK3

2Much (variable names cannot start with a digit)

*star (variable names cannot contain special characters)


TASK 4




























TASK5

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double celsius = scanner.nextDouble();
        double farenheiht = (9.0/5) * celsius + 32;
        System.out.println(celsius + "°C is equivalent to " + farenheiht + "°F");
    }
}

TASK6

public class Main {
    public static void main(String[] args) {
        double v1 = 123.456;
        System.out.printf("%.2f", v1);


TASK7

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of manual workers: ");
        int manualworkers = scanner.nextInt();
        System.out.print("Enter the number of skilled workers: ");
        int skilledworkers = scanner.nextInt();
        System.out.print("Enter the number of management workers: ");
        int managementworkers = scanner.nextInt();


        double manualWage = manualworkers * 500;
        double skilledWage = skilledworkers * 700;
        double managementWage = managementworkers * 800;
        double totalWage = manualWage + skilledWage + managementWage;
        double taxWage = totalWage * 0.2;

        System.out.println("Total wage bill: £" + totalWage);
        System.out.println("Approximate tax to pay: £" + taxWage);
    }
}



TASK 8

public class Main {
    public static void main(String[] args) {
        double number = 1234567.456;
        System.out.printf("%,.1f", number);
    }
}


TASK 9


public class Main {
    public static void main(String[] args) {
	

