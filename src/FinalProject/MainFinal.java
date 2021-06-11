package FinalProject;

public class MainFinal {
    public static void main(String[] args) {
        User user = new User("chris","universit",1234);
        user.greetings();
        user.userDetails();
        user.userOption();
        user.name_monthly_expenses();
        AccountOpening account = new AccountOpening("chris","univesit",1234);



    }
}
