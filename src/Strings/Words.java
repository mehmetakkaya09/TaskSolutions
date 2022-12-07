package Strings;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first word");
        String word1 = input.next();
        System.out.println("enter second word");
        String word2 = input.next();
        String sonuc1 = word1.substring(1);
        String sonuc2 = word2.substring(1);
        System.out.println(sonuc1+sonuc2);

    }
}

/*
 1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */