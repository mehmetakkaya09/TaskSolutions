package wrappingMethods;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperCount;
        int lowCount;
        int digitCount;
        int specialCount;
        do {
            upperCount = 0;
            lowCount = 0;
            digitCount = 0;
            specialCount = 0;
            System.out.println("enter a password that contains upperCase letter, lowerCase letter, special character and digit!");
            String password = scanner.next();
            while ((password.length() <= 8)) {
                System.out.println("please enter a password that the length is greater than 8");
                password = scanner.next();
            }
            char passChars[] = password.toCharArray();
            for (char passChar : passChars) {
                if (Character.isUpperCase(passChar)) {
                    upperCount++;
                }
                if (Character.isLowerCase(passChar)) {
                    lowCount++;
                }
                if (Character.isDigit(passChar)) {
                    digitCount++;
                }
                if (!Character.isLetterOrDigit(passChar)) {
                    specialCount++;
                }
            }

        } while (!(specialCount >= 1 && digitCount >= 1 && lowCount >= 1 && upperCount >= 1));
        System.out.println("you have a strong password!");
    }
}

/*
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */