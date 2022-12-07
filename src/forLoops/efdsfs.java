package forLoops;

import java.util.Scanner;

public class efdsfs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a valid passport?");
        String hasPassport = scan.next();
        scan.nextLine();
        String arrival = "";
        byte bag = 0;
        short number = 0;
        int currentCost = 0;
        int discount = 0;
        if (hasPassport.equals("Yes")) {
            int baseCost = 1000;
            System.out.println("Where do you want to travel?");
            arrival = scan.nextLine();
            System.out.println("How many bags do you have?");
            bag = scan.nextByte();
            currentCost = baseCost + bag * 50;
            // System.out.println("currentCost = " + currentCost);
            scan.nextLine();
            System.out.println("How many people do you travel with?");
            number = scan.nextShort();

            switch (number) {
                case 1:
                case 2:
                case 3:
                    discount = number * 100;
                    break;
                default:
                    discount = 300;
            }
            currentCost -= discount;

            System.out.println("Enter the name of the people you will travel with");
            scan.nextLine();
            String names = scan.nextLine();
            System.out.println("Your ticket is booked to " + arrival + ". We have charged extra for the " + bag + " bags but you are traveling with " + number +
                    " so we are giving a discount. Your total cost is " + currentCost);
        }
    }
}

