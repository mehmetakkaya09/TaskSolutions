package nestedFor;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string!");
        String word = scanner.next();
        String res = "";
        int max = -2147483648;

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count >= max ) {
                max = count;
                res = "" + word.charAt(i) + " is " +count;
            }
        }
        System.out.println(res);
    }
}
