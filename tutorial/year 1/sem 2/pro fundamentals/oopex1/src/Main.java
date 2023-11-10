import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do you want to enter width and height? (y/n)");

            char choice = scanner.next().charAt(0);

            if (choice == 'y')
                rectangles[i] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

            else
                rectangles[i] = new Rectangle();
        }

        System.out.println("The rectangles are: ");
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle" + (i + 1) + ": width: " + rectangles[i].getWidth() + ", height: " + rectangles[i].getHeight());

        }
    }
}




