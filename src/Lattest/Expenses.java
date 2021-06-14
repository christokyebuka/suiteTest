package Lattest;

import java.util.Scanner;

public class Expenses extends Transaction {
    Scanner scanner = new Scanner(System.in);
    String itemPaid;
    double amountPaid;
    public void expenses(){
        System.out.println("Name of the item paid");
        String itemPaid = scanner.nextLine();
   // }
   // public void add_amountPaid(){
        System.out.println("enter the amount");
        double amount = scanner.nextDouble();
   // }
   // public void accountSummary(){
        System.out.println("enter your income");
        double income = scanner.nextDouble();
      //  System.out.println("enter your debit");
    //    double debit = scanner.nextDouble();
        double balance = income - amount;
        System.out.println("Account balance is  "+ balance);
    }
    }

