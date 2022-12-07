package nestedFor;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle!");
            double radius = scan.nextDouble();
            if (radius < 0) {
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            double diameter = 2*radius;
            double area = radius * radius * 3.14;
            double perimeter = diameter * 3.14;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Woul you like to calculate another circle");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("re enter valid entry");
                answer = scan.next();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }
    }
}
