package forLoops;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter str");
        String str = scan.nextLine();
        System.out.println("enter char");
        char ch = scan.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
/*
Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */