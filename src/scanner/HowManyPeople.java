package scanner;

import java.util.Scanner;

public class HowManyPeople {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many people do you live with? : ");
        int people = input.nextInt();

        if (people > 0){
            if (people >= 1 && people <= 3) {
            System.out.println("Live with less than 3 people");
        } else if (people >= 4 && people <= 6) {
            System.out.println("Live with 3 - 6 people");
        }else {
            System.out.println("Live with more than 6 people");
        }
        }else {
            System.out.println("Invalid Number");
        }

    }
}
/*
if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int num = scan.nextInt();
        if (num > 0){
            if (num <3)
                System.out.println("Live with less than 3 people");
            else if (num>=3 && num <= 6) {
                System.out.println("Live with 3 - 6 people");
            }else {
                System.out.println("Live with more than 6 people");
            }
        }else {
            System.out.println("Invalid Number");
        }

 */