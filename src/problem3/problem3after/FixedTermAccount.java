package problem3.problem3after;

public class FixedTermAccount implements Account{
    private double balance;

    public FixedTermAccount(double balance){
        this.balance = balance;
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public double getBalance(){
        return balance;
    }
}
