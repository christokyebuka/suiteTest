package Lattest;

import java.util.Scanner;

public class Transaction extends User {
    Scanner scanner = new Scanner(System.in);
    String date;
    String time;
    public void addDate(){
        System.out.println("date of transaction");
        String date = scanner.nextLine();
    }
    public void addTime(){
        System.out.println("Time of transaction");
        String time = scanner.nextLine();
    }
}
