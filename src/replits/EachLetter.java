package replits;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            String str ="" + word.charAt(i);
            System.out.println(str);
        }




    }
}
