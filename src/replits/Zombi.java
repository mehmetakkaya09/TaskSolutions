package replits;

import java.util.Scanner;

public class Zombi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count = 0;
        if (inhabitants > 0) {
            System.out.println("Day " + count + " [" + inhabitants + "]");
            for (int i = inhabitants; i > 0; i--) {
                if (i/2 >0) {
                    System.out.println("Day " + ++count + " [" + i / 2 + "]");
                    i /= 2;
                    ++i;
                }

            }
        }
        System.out.println("---- EXTINCT ----");


    }
}
