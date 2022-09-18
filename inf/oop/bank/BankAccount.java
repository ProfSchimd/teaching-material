package bank;

/**
 * BankAccount
 */
public class BankAccount {
    private int number;
    private double amount;
    
    public boolean withdraw(double cash) {
        if (amount >= cash) {
            amount -= cash;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
    }
}