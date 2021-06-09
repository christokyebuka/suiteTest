package Project2021;

import java.util.Scanner;

public class AccountCreation {
    Scanner scanner = new Scanner(System.in);
    String name;
    String address;
    int secretCode;

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }
    /*public void getName(){
        System.out.println("give us your name");
        String name = scanner.nextLine();

    }
    public void getAddress(){
        System.out.println("enter your address");
        String address = scanner.nextLine();
    }
    public void getSecretCode(){
        System.out.println("choose your secretcode");
        int secretCode = scanner.nextInt();
    }*/
}
