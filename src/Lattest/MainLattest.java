package Lattest;

public class MainLattest {
    public static void main(String[] args) {
        Transaction user = new Transaction();
        user.addName();
        user.addPassword();
        Income userIncome = new Income();
        userIncome.addAmount();
        userIncome.addDate();
        userIncome.addTime();
        Expenses userExpenses = new Expenses();
        userExpenses.expenses();
       // userExpenses.add_itemPaid();
       // userExpenses.add_amountPaid();
        userExpenses.addDate();
        userExpenses.addTime();
       // userExpenses.accountSummary();

    }
}
