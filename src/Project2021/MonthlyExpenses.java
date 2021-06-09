package Project2021;

import java.util.Scanner;

public class MonthlyExpenses {
    Scanner scanner = new Scanner(System.in);
    double livingExpenses;
    double mobility;
    double insurance;
    double others;
  public void add_livingExpenses(){
      System.out.println("enter your living expenses");
      double living_expenses = scanner.nextDouble();
  }
  public void add_mobility(){
      System.out.println("enter your mobility expenses");
      double mobility = scanner.nextDouble();
  }
  public void add_insurance(){
      System.out.println("enter your insurance expenses");
      double insurance = scanner.nextDouble();
  }
  public void add_other_expenses(){
      System.out.println("enter your other expenses");
      double othersExpenses = scanner.nextDouble();
  }

}
