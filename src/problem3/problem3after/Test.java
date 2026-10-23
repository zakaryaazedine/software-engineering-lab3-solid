package problem3.problem3after;

import java.util.List;

public class Test{
    public static void main(String[] args){
        System.out.println("Before refactoring:");
        problem3.problem3before.Account originalAccount = new problem3.problem3before.Account(500);
        problem3.problem3before.FixedTermAccount originalFixedTermAccount = new problem3.problem3before.FixedTermAccount(1000);
        List<problem3.problem3before.Account> originalAccounts = List.of(originalAccount, originalFixedTermAccount);

        try{
            problem3.problem3before.Bank.chargeMonthlyFee(originalAccounts);
        } catch (UnsupportedOperationException e){
            System.out.println("UnsupportedOperationException: " + e.getMessage());
        }
        System.out.println("Account balance: " + originalAccount.getBalance());
        System.out.println("Fixed-term account balance: " + originalFixedTermAccount.getBalance());

        System.out.println("\nAfter refactoring:");
        CurrentAccount currentAccount = new CurrentAccount(500);
        FixedTermAccount fixedTermAccount = new FixedTermAccount(1000);
        List<WithdrawableAccount> accounts = List.of(currentAccount);

        Bank.chargeMonthlyFee(accounts);
        System.out.println("Current account balance: " + currentAccount.getBalance());
        System.out.println("Fixed-term account balance: " + fixedTermAccount.getBalance());

        System.out.println("\nStudent account:");
        CurrentAccount ordinaryAccount = new CurrentAccount(500);
        CurrentAccount studentAccount = new StudentAccount(500);
        ordinaryAccount.withdraw(250);
        System.out.println("Current account after withdrawing 250: " + ordinaryAccount.getBalance());

        try{
            studentAccount.withdraw(250);
        } catch (IllegalArgumentException e){
            System.out.println("Student withdrawal rejected: " + e.getMessage());
        }
        System.out.println("Student account balance: " + studentAccount.getBalance());
        studentAccount.withdraw(200);
        System.out.println("Student account after withdrawing 200: " + studentAccount.getBalance());
    }
}
