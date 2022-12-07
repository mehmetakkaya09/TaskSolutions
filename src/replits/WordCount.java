package replits;

import java.util.Scanner;

public class WordCount {

    public static int wordCount(String words) {
        // your code
        int wordCount = 0;
        String[] w = words.split(" ");
        wordCount = w.length;
        return wordCount;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}

