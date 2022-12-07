package replits;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length() < 5){
            System.out.println("Too short!");
        } else if (word.length()>5) {
            System.out.println("Too long!");
        } else if (word.length() == 5) {
            String str = "";
            for (int i = word.length()-1; i >= 0; i--) {
                char ch =  word.charAt(i);
                str +=ch;
            }
            System.out.println(str);
        }


    }
}
