public class AccountTest {
    private String holder_name;
    private String account_number;

    private String account_type;
    private double current_balance;

    public AccountTest(String holder_name, String account_number, String account_type, double current_balance){
        this.holder_name = holder_name;
        this.account_number = account_number;
        this.account_type = account_type;
        this.current_balance = current_balance;

    }

    public String getHolder_name() {
        return holder_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getAccount_type() {
        return account_type;
    }

    public double getCurrent_balance() {
        return current_balance;
    }
}
