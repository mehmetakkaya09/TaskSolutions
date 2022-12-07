package Strings;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter A Sentence!");
        String snt = inp.nextLine();
        int lng = snt.length();
        if (lng == 0){
            System.out.println("string is empty");
        } else if (lng > 3) {
            System.out.println(snt.charAt(lng - 3) +""+ snt.charAt(lng - 2) +""+ snt.charAt(lng-1));
        } else if (lng <= 3) {
            System.out.println(snt);
        }
    }
}
/*
 Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */