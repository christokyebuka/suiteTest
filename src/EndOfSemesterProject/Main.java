package EndOfSemesterProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Users should be able to:
        //add expenses and earnings through the console
        //retrieve all previously inserted expenses and earnings
        //receive summaries and balances*/
        Scanner scanner = new Scanner(System.in);
        String greetings = "welcome to your accounting software";
        System.out.println(greetings);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("address");
        String homeAddress = scanner.nextLine();
        int secretCode = 1234;


        System.out.println("enter 2 for account log in,3 for quit");
        int userOptions = scanner.nextInt();

          //  System.out.println("enter your password");
           // int password = scanner.nextInt();



        double intialIncome = 10.00;
        double intialExpenses = 0.00;
        int counter = 0;
        while (intialIncome >intialExpenses){
            System.out.println("transaction date");
            String date = scanner.nextLine();
            System.out.println("enter your password");
            int password = scanner.nextInt();


           if(userOptions == 3){
                System.out.println("bye");
                break;
            }
            if(password != secretCode){
                System.out.println("invalid password");
              //continue;

            }
            System.out.println("enter 5 for adding earnings,6 for adding expenses");
            double userInput = scanner.nextDouble();
            System.out.println("enter the amount");
            double amount = scanner.nextDouble();
            System.out.println(amount);

           // System.out.println("transaction date");
            //String date = scanner.nextLine();

            if (userInput == 5){
                intialIncome += amount;
                counter++;
                System.out.println("Income is " + intialIncome);
            }
            else if (userInput == 6){
                intialIncome -= amount;
                counter++;
                System.out.println("Expenses is " + amount + " and balance is  " + intialIncome);
            }
        }

    }

    }

