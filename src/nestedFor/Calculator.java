package nestedFor;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter first number!");
            double num1 = input.nextDouble();
            System.out.println("Please enter a math operator! ' +, -, /, *' ");
            String opr = input.next();
            while (!(opr.equals("*") || opr.equals("/") || opr.equals("-") || opr.equals("+"))) {
                System.err.println("You entered an invalid operator, please try again!");
                opr = input.next();
            }
            System.out.println("Please enter second number!");
            double num2 = input.nextDouble();

            switch (opr) {
                case "+":
                    System.out.println(num2 + num1);
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
            }

            System.out.println("Do you want to continue?");
            String yesNo = input.next();
            while (!(yesNo.equals("yes")||yesNo.equals("no"))){
                System.err.println("Please re enter yes/no!");
                yesNo = input.next();
            }
            if (yesNo.equals("no")){
                break;
            }


        }
        System.out.println("Thanks for using Cydeo calculator!");

    }
}
/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry


 */