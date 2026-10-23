package problem3.problem3before;

import java.util.List;

public class Bank{
    public static void chargeMonthlyFee(List<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) accounts.get(i).withdraw(10);
    }
}
