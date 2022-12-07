package replits;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        firstName = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
        domain = domain.toUpperCase().substring(0,1) + domain.toLowerCase().substring(1);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(domain);



    }
}
