package atm;

import java.util.Scanner;

public class ATM {

    private Account account;
    private Login login;
    private Transaction transaction;
    private Scanner sc;

    // Constructor
    public ATM(Account account) {
        this.account = account;
        login = new Login(account);
        transaction = new Transaction(account);
        sc = new Scanner(System.in);
    }

    // Start ATM
    public void start() {

        if (!login.authenticate()) {
            System.out.println("Exiting ATM...");
            return;
        }

        int choice;

        do {
            System.out.println("\n==================================");
            System.out.println("           ATM MENU");
            System.out.println("==================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    transaction.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    transaction.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    transaction.withdraw(withdraw);
                    break;

                case 4:
                    transaction.showAccountDetails();
                    break;

                case 5:
                    System.out.println("\nThank you for using our ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 5);
    }
}