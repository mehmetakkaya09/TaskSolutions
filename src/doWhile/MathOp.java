package doWhile;

import java.util.Scanner;

public class MathOp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 1. number");
        int num1 = scan.nextInt();
        System.out.println("enter 2. number");
        int num2 = scan.nextInt();
        System.out.println("enter an operator");
        char oper = scan.next().charAt(0);
        while (! (oper == '+' ||oper == '-' ||oper == '/' ||oper == '*')){
            System.out.println("enter an operator");
            oper = scan.next().charAt(0);
        }
        if (oper == '+'){
            System.out.println(num1 + num2);
        } else if (oper == '-') {
            System.out.println(num1 - num2);
        }else if (oper == '/') {
            System.out.println(num1 / num2);
        }else if (oper == '*') {
            System.out.println(num1 * num2);
        }

    }
}
/*
 write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)

 */