import clase.BankAccount;

public class Objetos {
    public static void main(String[] args) {
        BankAccount cuenta1 = new BankAccount();
        cuenta1.setAccountNumber("001");
        cuenta1.setBalance(100.0);
        cuenta1.deposit(50.0);
        cuenta1.withdraw(30.0);
        cuenta1.showBalance();

        System.out.println("----------------------");

        BankAccount cuenta2 = new BankAccount("002", 500.0);
        cuenta2.deposit(200.0);
        cuenta2.withdraw(1000.0);
        cuenta2.showBalance();
    }
}   

