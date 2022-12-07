package replits;

import java.util.Scanner;

public class Guests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the guest's name:");
        String name = input.next();
        System.out.println("Do you want to enter another guest's name?");
        String yesNo = input.next();
        String list = "";
        list +=name + ", ";
        while (yesNo.equals("yes")){
            System.out.println("Please enter the guest's name:");
            name = input.next();
            list +=name + ", ";
            System.out.println("Do you want to enter another guest's name?");
            yesNo = input.next();
        }
        System.out.println("Guests' list: " + list.substring(0,list.length()-2));
    }
}
