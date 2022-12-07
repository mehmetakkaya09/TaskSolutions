package forLoops;

import java.util.Scanner;

public class For_i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("enter a number : ");
            total = total + input.nextInt();

        }
        System.out.println(total);
        input.close();
    }
}
