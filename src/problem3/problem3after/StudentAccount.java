package problem3.problem3after;

// Question 7: this intentionally strengthens CurrentAccount's preconditions.
public class StudentAccount extends CurrentAccount{
    public StudentAccount(double balance){
        super(balance);
    }

    @Override
    public void withdraw(double amount){
        if (amount > 200) throw new IllegalArgumentException("Maximum withdrawal is 200 MAD");
        super.withdraw(amount);
    }
}
