package problem3.problem3after;

public class CurrentAccount implements WithdrawableAccount{
    private double balance;

    public CurrentAccount(double balance){
        this.balance = balance;
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public void withdraw(double amount){
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    @Override
    public double getBalance(){
        return balance;
    }
}
