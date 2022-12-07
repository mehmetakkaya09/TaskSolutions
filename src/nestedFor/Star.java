package nestedFor;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number for star : ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }


    }
}
