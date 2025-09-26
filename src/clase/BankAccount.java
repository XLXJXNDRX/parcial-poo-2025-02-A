package clase;
public class BankAccount {
    private String accountNumber;
    private double balance;
    private double amount;

    public BankAccount() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.amount = 0.0;
    }
      public BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
        this.amount = 0.0;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
      public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Depósito de " + amount + " realizado.");
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println("Retiro de " + amount + " realizado.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
    public void showBalance() {
        System.out.println("Saldo actual: " + balance);
    }
}
    