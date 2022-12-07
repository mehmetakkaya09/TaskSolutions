package arraysTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers do you want to calculate!");
        int howMany = scanner.nextInt();
        int number[] = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            System.out.println("please enter your "+ (i+1)+". number");
            number[i] = scanner.nextInt();
        }
        System.out.println("numbers = " + Arrays.toString(number));
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        double result = sum / howMany;
        System.out.println("result = " + result);
        //[45, 5, 987, 65, 12, 4546, 98, 656, 32, 6]
    }
}
