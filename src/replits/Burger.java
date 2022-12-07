package replits;

import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String order = s.next();
        if (order.equals("chicken")) {
            System.out.println("Your total is $9.75");
        } else
            System.out.println("Your total is $12.50");
    }
}
