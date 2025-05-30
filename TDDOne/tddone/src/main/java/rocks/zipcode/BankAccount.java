package rocks.zipcode;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    // TODO: Implement this class to make the tests pass
    private String accountNumber;
    private String ownerName;
    private double balance;

    
    public BankAccount(String accountNumber, String ownerName) {
        // Your implementation here
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }
    
    public String getAccountNumber() {
        // Your implementation here
        return accountNumber;
    }
    
    public String getOwnerName() {
        // Your implementation here
        return ownerName;
    }
    
    public double getBalance() {
        // Your implementation here
        return balance;
    }
    
    public void deposit(double amount) {
        // Your implementation here
        if(amount > 0){
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }
    
    public void withdraw(double amount) {
        // Your implementation here
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount > balance){
            throw new IllegalStateException("Insufficient funds");
        }
        balance -= amount;
    }
}
