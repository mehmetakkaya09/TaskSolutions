package Strings;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Email Adress : ");
        String email = input.next();


        String result = "";


        if (email.contains("_")&& email.contains("@")){
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            String tempo = firstName;
            String replace1 = email.replace(firstName,lastName);
            email = email.replace(lastName,tempo);
            result = email;
        }else {
            System.out.println(email);
        }
        System.out.println(result);
    }
}
/* 7. Create a class calledEmailTask1.
        Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

        Ex:
        input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
*/
/*
System.out.println(email.substring(email.indexOf("_")+1, email.indexOf("@"))+"_"+email.substring(0, email.indexOf("_"))+email.substring(email.indexOf("@")));
 */