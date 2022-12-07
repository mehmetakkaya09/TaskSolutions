package forLoops;

import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        int sum = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = inp.nextInt();
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("Summary of Numbers : " + sum);
    }
}
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

 */