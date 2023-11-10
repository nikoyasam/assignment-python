import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the holder name: ");
        String holderName = scanner.nextLine();

        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter account type: ");
        String accountType = scanner.nextLine();

        System.out.println("Enter current balance: ");
        int currentBalance = scanner.nextInt();

        AccountTest accountTest = new AccountTest(holderName,accountNumber,accountType,currentBalance);

        System.out.println("The holder name is " + holderName);
        System.out.println("The account Number is " + accountNumber);
        System.out.println("The account type is " + accountType);
        System.out.println("The current balance is " + currentBalance);

        scanner.close();

    }
}