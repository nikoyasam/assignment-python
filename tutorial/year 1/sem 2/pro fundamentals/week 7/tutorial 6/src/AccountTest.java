import java.util.Scanner;

public class AccountTest {
    private String holderName;
    private String accountNumber;
    private String accountType;

    private int currentBalance;

    AccountTest(String holderName, String accountNumber, String accountType, int currentBalance){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
    }

    public String getHoldername() {
        return holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

}


