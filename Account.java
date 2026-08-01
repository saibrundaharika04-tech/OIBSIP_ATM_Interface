package atm;

public class Account {

    private String accountHolderName;
    private int accountNumber;
    private int pin;
    private double balance;

    // Constructor
    public Account(String accountHolderName, int accountNumber, int pin, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Get Account Holder Name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Set Account Holder Name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Get Account Number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Set Account Number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Get PIN
    public int getPin() {
        return pin;
    }

    // Set PIN
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Get Balance
    public double getBalance() {
        return balance;
    }

    // Deposit Money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
            System.out.println("Available Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
            System.out.println("Available Balance: ₹" + balance);
        }
    }

    // Display Account Details
    public void displayAccountDetails() {
        System.out.println("\n========== ACCOUNT DETAILS ==========");
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("=====================================");
    }
}