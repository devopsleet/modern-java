public class Account {

    private String account_number;
    private double account_balance;

    private String customer_name;

    private String email;

    private String phone_number;

    public Account() {
        this("5689", 2.50, "default", "default", "987867787278");
        System.out.println("Empty constructor called");
    }

    public Account(String account_number, double account_balance, String name,
                   String customerEmail, String customerPhone) {
        this.account_number = account_number;
        this.account_balance = account_balance;
        customer_name = name;
        email = customerEmail;
        phone_number = customerPhone;
    }
    public String getAccount_number() {
        return "";
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void deposit(double depositAmount) {

        this.account_balance += this.account_balance + depositAmount;
        System.out.println("Deposited $" +this.account_balance);

    }

    public void withdraw(double withdrawalAmount) {
        if (account_balance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! Only have " + account_balance);

        } else {
            account_balance = account_balance - withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " and remaining balance of " + account_balance);
        }
    }
}
