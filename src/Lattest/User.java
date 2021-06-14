package Lattest;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    String name;
    int password = 1234;
    public void addName(){
        System.out.println("enter your name");
        String name = scanner.nextLine();
    }
    public void addPassword(){
        int count = 0;
        int pasword = 1234;
        while (password > 0){
            System.out.println("enter your password");
            int password = scanner.nextInt();

        if(pasword == password){
            System.out.println("welcome to the Accounting software");
            count++;
            break;
        }
        }
    }

}
