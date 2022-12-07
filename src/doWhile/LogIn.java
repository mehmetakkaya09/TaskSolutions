package doWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your username");
        String userName = scanner.next();
        System.out.println("enter your password");
        String password = scanner.next();
        int attempt = 3;
        while (!(userName.equals("cydeo") || password.equals("cydeo123")) && attempt >0){
            System.out.println("you have "+attempt+" left");

            System.out.println("enter your username");
            userName = scanner.next();
            System.out.println("enter your password");
            password = scanner.next();
            attempt--;
        }
        if (userName.equals("cydeo") || password.equals("cydeo123") ){
            System.out.println("welcome");
        }else
            System.out.println("your account is locked!");
    }
}
