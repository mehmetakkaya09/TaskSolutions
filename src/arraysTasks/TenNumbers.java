package arraysTasks;

import java.util.Scanner;

public class TenNumbers {
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
        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];
            }else if (num[i]<min){
                min = num[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
