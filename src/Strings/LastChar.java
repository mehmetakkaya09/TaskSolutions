package Strings;

import java.util.Scanner;

public class LastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word!");
        String word = input.next();
        System.out.println("enter 2. word");
        String word2 = input.next();
        String result = word + word2;
        if (word.charAt(word.length()-1)==word2.charAt(0)){
            result = word + word2.substring(1);
        }
        System.out.println(result);
    }
}
/*
    4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */