package atm;

public class Transaction {

    private Account account;

    // Constructor
    public Transaction(Account account) {
        this.account = account;
    }

    // Deposit Money
    public void deposit(double amount) {
        account.deposit(amount);
    }

    // Withdraw Money
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("\n========== BALANCE ==========");
        System.out.println("Current Balance: ₹" + account.getBalance());
        System.out.println("=============================");
    }

    // Display Account Details
    public void showAccountDetails() {
        account.displayAccountDetails();
    }
}
