package replits;

import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println("without first letter: "+ word.substring(1));
        System.out.println("without last letter: "+ word.substring(0,word.length()-1));



    }
}
