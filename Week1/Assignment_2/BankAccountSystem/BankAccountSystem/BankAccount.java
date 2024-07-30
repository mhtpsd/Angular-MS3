package BankAccountSystem;

class BankAccount {
    private String accountNumber = "10743276";
    private double balance = 100;

    public void deposit (double addBalance) {
        this.balance += addBalance;
    }
    
    public void withdraw (double subtractBalance) {
        if(this.balance>=subtractBalance) {
            this.balance -= subtractBalance;
        } else {
            System.err.println("Insufficent Balance. Try Again!");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accNum) {
        this.accountNumber = accNum;
    }
}