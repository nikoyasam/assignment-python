public class Account {
    private String holder_name;
    private String account_number;

    private String account_type;
    private double current_balance;

    public Account(String holder_name, String account_number, String account_type, double current_balance){
        this.holder_name = holder_name;
        this.account_number = account_number;
        this.account_type = account_type;
        this.current_balance = current_balance;

    }

    public void depositing(double amount){
        current_balance+= amount;

    }

    public void withdrawing(double amount){
        if(current_balance>=amount){
            current_balance-=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }


    }

    public double checkBalance(){
        return current_balance;
    }
}
