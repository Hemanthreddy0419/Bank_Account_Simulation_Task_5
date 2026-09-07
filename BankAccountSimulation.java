package Task_5;

import java.util.Scanner;

public class BankAccountSimulation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       BANK ACCOUNT SIMULATION");
        System.out.println("======================================");

        // Get account details
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter Initial Deposit: ₹");
        double initialDeposit = scanner.nextDouble();

        if (initialDeposit < 0) {
            System.out.println("Initial deposit cannot be negative.");
            scanner.close();
            return;
        }

        // Create BankAccount object
        BankAccount account = new BankAccount(
                accountNumber,
                accountHolderName,
                initialDeposit
        );

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("          BANK MENU");
            System.out.println("================================");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.printf(
                            "Current Balance: ₹%.2f%n",
                            account.getBalance()
                    );
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("\nThank you for using the Bank Account Simulation!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
