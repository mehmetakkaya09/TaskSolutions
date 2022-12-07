package replits;

import java.util.Scanner;

public class Alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String email = s.nextLine();

        if (email.contains("Alejandro") && email.contains("project")){
            System.out.println("priority");
        } else if (email.contains("Alejandro")) {
            System.out.println("read");
        } else if (!email.contains("Alejandro")) {
            System.out.println("don't read");
        }


    }
}
