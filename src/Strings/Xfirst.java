package Strings;

import java.util.Scanner;

public class Xfirst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name : ");
        String name = input.nextLine();
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1));

    }
}













/*
        System.out.println("Please enter a word:");
        String word=scanner.next().toLowerCase().trim();
        if ((""+word.charAt(0)).equals("x"))
            System.out.println(word.substring(1));
        else System.out.println(word);
        scanner.close();
 */