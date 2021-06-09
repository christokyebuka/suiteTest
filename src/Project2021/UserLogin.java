package Project2021;

import java.util.Scanner;

public class UserLogin {
    Scanner scanner = new Scanner(System.in);
    String userName;
    int password;
    public void putYourUsername(){
        System.out.println("enter your userName");
        String userName = scanner.nextLine();
    }
    public void putYourPassword(){
        System.out.println("enter your password");
        int password = scanner.nextInt();
    }
}
