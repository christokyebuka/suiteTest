package Project2021;

public class MainProject {
    public static void main(String[] args) {
        UserLogin user = new UserLogin();
        user.putYourUsername();
        AccountCreation customer1 = new AccountCreation();
       customer1.setName("chris");
       customer1.setAddress("universit strasse 11");
       customer1.setSecretCode(1234);

       MonthlyExpenses customer = new MonthlyExpenses();

       customer.add_livingExpenses();
       YearlyEarnings chris = new YearlyEarnings();
       chris.setJan_income(100);

       AccountTransactions afterLiving = new AccountTransactions();
       afterLiving.jan_accountBalance_afterLivingExpenses(chris.getJan_income(), customer.livingExpenses);
        System.out.println(afterLiving);

        }
    }

