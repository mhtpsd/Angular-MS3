package BankAccountSystem;

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount Customer1 = new BankAccount();
        System.out.println(Customer1.getBalance());
        System.out.println(Customer1.getAccountNumber());
        Customer1.deposit(200);
        System.out.println(Customer1.getBalance());
        Customer1.withdraw(100);
        System.out.println(Customer1.getBalance());
        Customer1.setAccountNumber("10723412");
        System.out.println(Customer1.getAccountNumber());
        Customer1.withdraw(5000);
        
    }
}