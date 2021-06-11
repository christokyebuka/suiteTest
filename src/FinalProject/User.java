package FinalProject;

import java.util.Scanner;

public class User extends AccountOpening {
    String greetings;
    double earning;
    double expenses;
    double accountBalance;

    public User(String name, String address, int passcord) {
        super(name, address, passcord);
    }

    //Users should be able to:
            //add expenses and earnings through the console
            //retrieve all previously inserted expenses and earnings
            //receive summaries and balances*/
    public void greetings(){
            Scanner scanner = new Scanner(System.in);
            String greetings = "welcome to your accounting software";
            System.out.println(greetings);
    }
    public void userDetails(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner.nextLine();

            System.out.println("address");
            String homeAddress = scanner.nextLine();

    }
    public void userOption(){
    Scanner scanner = new Scanner(System.in);
            System.out.println("enter 2 for account log in,3 for quit");
            int userOptions = scanner.nextInt();
            //int secretCode = 1234;
            double intialIncome = 10.00;
            double intialExpenses = 0.00;
            int counter = 0;
            while (intialIncome >intialExpenses){
                System.out.println("enter transaction date");
                int period = scanner.nextInt();
                System.out.println("enter your password");
                int password = scanner.nextInt();


                if(userOptions == 3){
                    System.out.println("bye");
                    break;
                }
                if(password != passcord){
                    System.out.println("invalid password");
                    //continue;

                }

                System.out.println("enter 5 for adding earnings,6 for adding expenses");
                double userInput = scanner.nextDouble();
                System.out.println("enter the amount");
                double amount = scanner.nextDouble();
                System.out.println(amount);




                if (userInput == 5){
                    intialIncome += amount;
                    counter++;
                    System.out.println("Income is " + intialIncome);
                }
               else if (userInput == 6){
                    intialIncome -= amount;
                    counter++;
                    System.out.println("Expenses "  + amount + " and balance is  " + intialIncome);

                }
               else{
                    System.out.println("invalid number");
                }



            }

        }
        public void name_monthly_expenses(){
        Scanner scanner = new Scanner(System.in);
        int counting = 0;
        String purchase = "";
        while (purchase.equals("orange")){
            System.out.println("name of the purchased item");
            String items = scanner.nextLine();
            counting++;
            continue;
        }
        }

    }

