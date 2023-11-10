import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the holder name: ");
        String holder_name = scanner.nextLine();

        System.out.println("Enter the account number: ");
        String account_number = scanner.nextLine();

        System.out.println("Enter account type: ");
        String account_type = scanner.nextLine();

        System.out.println("Enter current balance: ");
        double current_balance = scanner.nextDouble();

        AccountTest accountTest = new AccountTest(holder_name, account_number, account_type, current_balance);

        System.out.println("Account created:");
        System.out.println("Holder name: " + accountTest.getHolder_name());
        System.out.println("Account number: " + accountTest.getAccount_number());
        System.out.println("Account type: " + accountTest.getAccount_type());
        System.out.println("Balance: " + accountTest.getCurrent_balance());

        scanner.close();
    }
}
