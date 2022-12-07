package forLoops;

import java.util.Scanner;

public class DigitSpe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = inp.next();
        char ch = ' ';
        String digits = "", letters = "", special = "";

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letters += ch;
            } else {
                special += ch;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(special);
    }
}
