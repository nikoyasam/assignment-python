import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        while(true) {
            try {
                System.out.println("Enter an index (0-4)");
                int index = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter the value");
                int value = Integer.parseInt(scanner.nextLine());

                array[index] = value;
                System.out.println("Value added successfully");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!Please enter an index between 0 and 4 ");
            } catch (NumberFormatException e) {
                System.out.println("Invalid value! Please enter a valid integer.");
            } finally {
                // Ask the user if they want to continue
                System.out.print("Do you want to add more values? (Y/N): ");
                String choice = scanner.nextLine();

                if (!choice.equalsIgnoreCase("Y")) {
                    break;
                }

            }
        }
        System.out.println("Final array: " + Arrays.toString(array));
        scanner.close();
    }
}
