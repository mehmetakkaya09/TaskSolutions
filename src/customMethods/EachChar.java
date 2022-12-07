package customMethods;

import java.util.Arrays;

public class EachChar {
    public static void printEachChar(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            System.out.print(sentence.charAt(i) + " ");

        }
        System.out.println();
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void calculator(double num1, double num2, String mathOperator) {
        switch (mathOperator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }

    public static void fullName(String name, String surname) {
        System.out.println("" + name.toUpperCase().charAt(0) + name.toLowerCase().substring(1) + " " + surname.toUpperCase().charAt(0) + surname.toLowerCase().substring(1));
    }

    public static void anagram(String firstWord, String secondWord) {

        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first, second)) {

            System.out.println(firstWord + " and " + secondWord + " are anagram");
        } else
            System.out.println(firstWord + " and " + secondWord + " are not anagram");

    }

    public static void main(String[] args) {
        printEachChar("mehmet");
        printArray(new int[] {5,6,1,2});
        calculator(4,8,"-");
        fullName("mehmet", "akkaya");
        anagram("mehmet", "temhem");
        String str = "cat dog";
        System.out.println(0%1);
    }
}
