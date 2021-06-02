package ClassEndOfYearProject;


import java.util.Scanner;

public class MainInput {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
        //Users should be able to:
        //add expenses and earnings through the console
        //retrieve all previously inserted expenses and earnings
        //receive summaries and balances
    Expenses january = new Expenses();
    january.setLivingExpenses(200.0);
    january.setHealth(96.0);
    january.setMobility(60.0);
    january.setOtherExpenses(230.0);
    january.printComment();
    System.out.println("Household expenses for January " + january.getLivingExpenses());
        System.out.println("Health expenses for January " + january.getHealth());
        System.out.println("Mobility expenses for January " + january.getMobility());
        System.out.println("Other expenses for January " + january.getOtherExpenses());
        MonthlyIncome januaryIncome = new MonthlyIncome();
        januaryIncome.display_income();
        januaryIncome.setJanuary_income(1000.0);
        System.out.println("January income " + januaryIncome.getJanuary_income());
        MonthlyIncome fabruaryIncome = new MonthlyIncome();
        fabruaryIncome.setFebruary_income(1200.0);
        System.out.println("February income " + fabruaryIncome.getFebruary_income());
        MonthlyIncome marchIncome = new MonthlyIncome();
        marchIncome.setMarch_income(900.0);
        System.out.println("march income " + marchIncome.getMarch_income());
        MonthlyIncome aprilIncome = new MonthlyIncome();
        aprilIncome.setApril_income(1300.0);
        System.out.println("April income " + aprilIncome.getApril_income());
        SummaryAndBalance accountForJanuary = new SummaryAndBalance();
        System.out.println("The balance of my income after spending on living expenses in month of January is " + accountForJanuary.account_balance(januaryIncome.getJanuary_income(), january.getLivingExpenses()));


    }
}
