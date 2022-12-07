package replits;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'||word.charAt(i) == 'A'||word.charAt(i) == 'e'||word.charAt(i) == 'E'||word.charAt(i) == 'I'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||word.charAt(i) == 'O'||word.charAt(i) == 'u'||word.charAt(i) == 'U'){
                str += word.charAt(i);
            }

        }
        System.out.println(str);


    }
}
