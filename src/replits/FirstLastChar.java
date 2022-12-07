package replits;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple" , "note"};
        for (int i = 0; i < words.length; i++) {
            System.out.println("" + words[i].charAt(0)+words[i].charAt(words[i].length()-1));
        }
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++){
            arr[i] = input.nextLine();
        }
        String temp[] = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            temp[j] = arr[i];
        }
        System.out.println(Arrays.toString(temp));

    }
}
