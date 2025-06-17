// Solution 1: Simple Banking System using basic methods
import java.util.Scanner;

class BasicBankingSystem {
    private double balance;  // To store the balance of the user

    // Constructor to initialize balance
    public BasicBankingSystem() {
        balance = 0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicBankingSystem bank = new BasicBankingSystem();
        boolean exit = false;

        // Main loop for user input
        while (!exit) {
            System.out.println("Enter command (1: Deposit, 2: Withdraw, 3: Check Balance, 4: Exit):");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdraw amount:");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;
                case 3:
                    bank.checkBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the banking system.");
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
        scanner.close();
    }
}
