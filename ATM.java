import java.util.Scanner;
import java.util.Date;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn successfully:" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid amount ");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited successfully: " + amount);
            checkBalance();
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void showMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    public void showDate() {
        Date date = new Date();
        System.out.println("Current Date and Time: " + date);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
         ATM atm = new ATM(initialBalance);
        atm.showDate ();
        int choice = 0;

        while (choice != 4) {
            atm.showMenu();
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmount = sc.nextDouble();
                    atm.withdraw(wAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dAmount = sc.nextDouble();
                    atm.deposit(dAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using this ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}