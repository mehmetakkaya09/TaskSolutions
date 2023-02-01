package Strings;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        String i = "everything is Fine";
        String j = "fine";

        System.out.println(i.toLowerCase().contains(j));
        System.out.println(i.toLowerCase().startsWith("ev"));
        System.out.println(i.toLowerCase().endsWith("ine"));
        Scanner input = new Scanner(System.in);
        int sel = 1+(int)(Math.random()*10);
        int gue = 0;
        System.out.println(sel);
        while (gue!=sel){
            gue = input.nextInt();
        }
        System.out.println(gue);
    }
}
