public class Account {
    private String holdername;
    private String accountNumber;
    private String accountType;

    private int currentBalance;

    Account(String holdername, String accountNumber, String accountType, int currentBalance){
        this.holdername = holdername;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
    }

    public String getHoldername() {
        return holdername;
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

    public void depositing(double amount){
        currentBalance+=amount;
    }
    public void withdrawing(double amount){
        if (currentBalance>=amount){
            currentBalance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }

    }

    public double checkingBalance(){
        return currentBalance;
    }

}
