package Task_5;

public class BankAccount {

    // Encapsulated fields
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        balance += amount;

        System.out.printf("₹%.2f deposited successfully.%n", amount);
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    // Withdraw money
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;

        System.out.printf("₹%.2f withdrawn successfully.%n", amount);
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    // Display account details
    public void displayAccountDetails() {

        System.out.println("\n------ Account Details ------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.printf("Balance        : ₹%.2f%n", balance);
    }
}
