package atm;

import java.util.Scanner;

public class Login {

    private Account account;

    // Constructor
    public Login(Account account) {
        this.account = account;
    }

    // Login Method
    public boolean authenticate() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("         ATM LOGIN");
        System.out.println("==================================");

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (accNo == account.getAccountNumber() && pin == account.getPin()) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome, " + account.getAccountHolderName());
            return true;
        } else {
            System.out.println("\nInvalid Account Number or PIN.");
            return false;
        }
    }
}
