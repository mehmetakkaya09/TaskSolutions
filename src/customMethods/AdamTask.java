package customMethods;

import java.util.Arrays;

public class AdamTask {
    public static void fibonacci(int number){
        int fibo1 = 0;//1 1 2 3 5 8
        int fibo2 = 1;
        int sum = 1;
        for (int i = 1; i < number; i++) {
            if (i == 1)
                System.out.print(sum + " ");
            sum = fibo1 + fibo2;
            System.out.print(sum + " ");
            fibo1 = fibo2;
            fibo2 = sum;
        }
    }
    public static int fibonacci2(int number){
        int fibo1 = 0;//1 1 2 3 5 8
        int fibo2 = 1;
        int sum = 1;
        for (int i = 1; i < number; i++) {
            if (i == 1)
                sum = sum;
            sum = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = sum;
        }
        System.out.println();
        return sum;
    }
    public static int[] fibonacciArray(int number){
        int[] fibonacciArray = new int[number];
        int fibo1 = 0;//1 1 2 3 5 8
        int fibo2 = 1;
        int sum = 1;
        int index = 0;
        for (int i = 1; i < number; i++) {
            if (i == 1)
                fibonacciArray[index++] = sum;
            sum = fibo1 + fibo2;
            fibonacciArray[index++] = sum;
            fibo1 = fibo2;
            fibo2 = sum;
        }
        return fibonacciArray;
    }

    public static void main(String[] args) {
        fibonacci(8);
        System.out.println(fibonacci2(8));
        System.out.println(Arrays.toString(fibonacciArray(8)));
    }

}
/*

Task 6 :  Fibonacci

				Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

				    Ex:
				        Input:
				            8
				        Output:
				           1, 1, 2, 3, 5, 8, 13, 21

				            1- Create one method and only print the numbers
				            2- You will return the numbers
				            3- Yuo will put that numbers into the array then you will return it




 */