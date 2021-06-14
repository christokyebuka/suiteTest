package Lattest;

import java.util.Scanner;

public class Income extends Transaction {
    Scanner scanner = new Scanner(System.in);
    double amount;
    public void addAmount(){
        System.out.println("enter the amount earned");
        double amount = scanner.nextDouble();

    }
}
