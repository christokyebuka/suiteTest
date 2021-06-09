package Project2021;

public class AccountTransactions {
    double jan_accountBalance;
    double feb_accountBalance;
    double march_accountBalance;
    double april_accountBalance;
    public double jan_accountBalance_afterLivingExpenses(double income,double expenses){
        double balance = income - expenses;
        return balance;
    }
}
