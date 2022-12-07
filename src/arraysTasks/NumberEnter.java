package arraysTasks;

import java.util.Arrays;
import java.util.Scanner;

public class NumberEnter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers do you want to enter?");
        int numberCount = scanner.nextInt();
        while (numberCount<0){
            System.out.println("please enter a valid number!");
            numberCount = scanner.nextInt();
        }
        int[] num = new int[numberCount];
        for (int i = 0; i < num.length; i++) {
            System.out.println("please enter " + (i+1)+". number" );
            num[i] = scanner.nextInt();
            //num[i] = number;

        }
        System.out.println(Arrays.toString(num));


    }
}
