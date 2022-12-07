package replits;

import java.util.Scanner;

public class Half {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int length = word.length();
        int half = length/2;
        String str = "";
        for (int i = 0; i < half; i++) {
            str+= ""+word.charAt(i);
        }
        System.out.println(str);


    }
}
