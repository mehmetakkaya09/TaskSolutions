package doWhile;

import java.util.Scanner;

public class Married {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("will you marry me? yes/no");
        String yesNo = scanner.next().toLowerCase();
        while (!(yesNo.equals("yes") || yesNo.equals("no"))){
            System.out.println("please enter yes or no!");
            yesNo = scanner.next().toLowerCase();
        }
        if (yesNo.equals("yes")){
            System.out.println("congrats");
        }else
            System.out.println("goodbye ");
    }
}
