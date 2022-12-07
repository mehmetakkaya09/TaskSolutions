package Strings;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A Sentence!");
        String sentence = input.nextLine();

        int l3 = sentence.length();
        char s1 = sentence.charAt(l3 -3);
        char s2 = sentence.charAt(l3 -2);
        char s3 = sentence.charAt(l3 -1);
        String great = s1+""+s2+""+s3;
        char f1 =sentence.charAt(0);
        char f2 =sentence.charAt(1);
        char f3 =sentence.charAt(2);
        String less = f1+""+f2+""+f3;




        if (l3 == 0){
            System.out.println("string is empty");
        }else if (l3 > 3 ){
            String lastThree = sentence.substring(l3-3);
            System.out.println(lastThree);
        }else if (l3 < 4) {
            System.out.println(sentence);
        }


    }
}


/*
 Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
 /*       Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.nextLine();

        scan.close();

        int length = word.length();
        String result = "";

        if(length == 0){
            result = "Empty";
        } else if (length > 3){
            int lastIndex = word.length() - 1;
            result = ""+ word.charAt(length - 3)+ word.charAt(length - 2)+ word.charAt(length - 1);
        }else {
            result = word;
        }

        System.out.println(result);

    }

}

 */