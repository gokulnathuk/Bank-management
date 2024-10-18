package main;
import java.util.*;

class Account {
    private String acno;
    private String acname;
    private double balance;

    public Account(String acno, String acname) {
        this.acno = acno;
        this.acname = acname;
        this.balance = 0.0;
    }

    public String getAcno() {
        return acno;
    }

    public String getAcname() {
        return acname;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount");
        }
    }
}
x
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account number: ");
        String acno = sc.nextLine();

        System.out.print("Enter Account holder name: ");
        String acname = sc.nextLine();

        Account ac = new Account(acno, acname);

        while (true) {
            System.out.println("Banking menu");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Balance: " + ac.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double da = sc.nextDouble();
                    ac.deposit(da);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wa = sc.nextDouble();
                    ac.withdraw(wa);
                    break;
                case 4:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
