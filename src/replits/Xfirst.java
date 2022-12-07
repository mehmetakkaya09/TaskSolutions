package replits;

import java.util.Scanner;

public class Xfirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if ((word.charAt(0) == 'x'||word.charAt(0) == 'X') && (word.substring(word.length()-1).equals("x")||word.substring(word.length()-1).equals("X"))){
            word = word.substring(1,word.length()-1);
            System.out.println(word);
            if (word.charAt(0) == 'x') {
                word = word.replaceFirst("x", "");
                System.out.println(word);
            } else if (word.charAt(0) == 'X') {
                word = word.replaceFirst("X", "");
                System.out.println(word);
            }
            if (word.substring(word.length()-1).equals("x")){
                word = word.substring(0,word.length()-1);
                System.out.println(word);
            } else if (word.substring(word.length()-1).equals("X")) {
                word = word.substring(0,word.length()-1);
                System.out.println(word);
            }
        }else if ((word.charAt(0) == 'x'||word.charAt(0) == 'X')){
            word = word.substring(1);
            System.out.println(word);
        } else if (word.substring(word.length()-1).equals("x")||word.substring(word.length()-1).equals("X")) {
            word = word.substring(0,word.length()-1);
            System.out.println(word);
        }else
            System.out.println(word);


    }
}
