package switchCase;

import java.util.Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Can you give size(tall, grande, venti) : ");

        int size = scan.nextInt();
        boolean big = (size == 1 )|| (size == 2) || (size == 3);
        if (big) {

            switch (size) {
                case 1:
                    System.out.println("price is $3.69");
                    System.out.println("90 calories");
                    break;
                case 2:
                    System.out.println("price is $3.99");
                    System.out.println("120 calories");
                    break;
                default:
                    System.out.println("price is $4.29");
                    System.out.println("150 calories");

            }
        } else {
            System.out.println("Invalid Size");
        }
    }
}







/*

        boolean big = size == "venti";
        if (big){

            switch (size) {
                case "tall":
                    System.out.println("price is $3.69");
                    System.out.println("90 calories");
                    break;
                case "grande":
                    System.out.println("price is $3.99");
                    System.out.println("120 calories");
                    break;

                default:
                    System.out.println("price is $4.29");
                    System.out.println("150 calories");

            }

        }else {
            System.out.println("Invalid Size");
        }



    }

}
*/


/*
	1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
/*

        boolean big = size == "tall" || size == "grande" || size == "venti";
        if (big) {
            switch (size) {
                case "tall":
                    System.out.println("price is $3.69");
                    System.out.println("90 calories");
                    break;
                case "grande":
                    System.out.println("price is $3.99");
                    System.out.println("120 calories");
                    break;
                default:
                    System.out.println("price is $4.29");
                    System.out.println("150 calories");

            }
        } else {
            System.out.println("Invalid Size");
        }
    }
}


*/