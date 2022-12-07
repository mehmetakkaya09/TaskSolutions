package forLoops;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scan.nextInt();
        System.out.println("enter second number");
        int num2 = scan.nextInt();
        if (num1>0 && num2>0){

        System.out.println(num1 * num2);
        }else
            System.out.println("invalid");
    }
}
