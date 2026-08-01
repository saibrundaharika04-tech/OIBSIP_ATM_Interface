package atm;

public class Main {

    public static void main(String[] args) {

        // Create Account
        Account account = new Account(
                "Harika",      // Account Holder Name
                12345678,      // Account Number
                1234,          // ATM PIN
                5000.0         // Initial Balance
        );

        // Create ATM Object
        ATM atm = new ATM(account);

        // Start ATM
        System.out.println("==================================");
        System.out.println("      WELCOME TO ATM SYSTEM");
        System.out.println("==================================");

        atm.start();

        System.out.println("\n==================================");
        System.out.println(" Thank You! Visit Again.");
        System.out.println("==================================");
    }
}