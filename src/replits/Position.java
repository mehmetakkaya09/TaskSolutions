package replits;

import java.util.Scanner;

public class Position {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next().toLowerCase();


        if ((word.contains("java") && word.charAt(0)=='j')||word.contains("java") && word.charAt(1)=='j'){
            System.out.println(!exists);
        }else
            System.out.println(exists);



    }
}
