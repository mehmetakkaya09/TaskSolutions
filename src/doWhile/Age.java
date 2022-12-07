package doWhile;

import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("enter an age : ");
        int age = scan.nextInt();
        while (!(age >=1 && age <=120)){
            System.out.println("please enter a valid number!");
            age = scan.nextInt();
        }
        System.out.println("your age is : "+age);
        System.out.println("are you a turkey citizen? yes or no?");
        String yesNo = scan.next().toLowerCase();

        while (!(yesNo.equals("yes") || yesNo.equals("no"))){
            System.out.println("please enter your citizen");
            yesNo = scan.next();
        }
    }
}
