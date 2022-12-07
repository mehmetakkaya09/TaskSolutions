package replits;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();
        int middle = length/2;
        if (length%2==0) {
            System.out.println("" + ("" + word.charAt(middle - 1)) + word.charAt(middle));
        }else
            System.out.println(word.charAt(middle));


    }
}
