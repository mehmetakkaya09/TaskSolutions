package nestedFor;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the side of the square!");
            double side = scan.nextDouble();
            if (side < 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double area = side * side;
            double perimeter = 4 * side;

            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another square?");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Re-enter valid entry!");
                answer = scan.next();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo square Calculator APP");
                break;
            }

        }
    }
}
