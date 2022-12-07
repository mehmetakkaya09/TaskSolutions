package replits;

import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        if (word1.length() == 3 && word2.length() == 3){
            String str = "";
            for (int i = 0; i < 3; i++) {
                char ch = word1.charAt(i);
                str += ch;
                char ch2 = word2.charAt(i);
                str+=ch2;
            }
            System.out.println(str);


        }else
            System.out.println("cannot merge");



    }
}
