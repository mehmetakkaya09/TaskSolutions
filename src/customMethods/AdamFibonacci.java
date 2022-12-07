package customMethods;

import java.util.Arrays;

public class AdamFibonacci {

    public static void main(String[] args) {
        fibonacci(6);
        System.out.println(fibonacciValue(6));
        System.out.println(Arrays.toString(fibonacciArray(6)));
        String str = "ame was tied";
        int index = str.indexOf("game");
    }
    public static void fibonacci(int number){
        int fibo1 = 0;
        int fibo2 = 1;
        int result = 1;//1, 1, 2, 3, 5, 8, 13, 21
        for (int i = 0; i < number; i++) {
            if (i == 0){
                System.out.print(result + " ");
                continue;
            }
            result = fibo1 + fibo2;
            System.out.print(result + " ");
            fibo1 = fibo2;
            fibo2 = result;
        }
//recursive
    }
    public static int fibonacciValue(int number){
        int fibo1 = 0;
        int fibo2 = 1;
        int result = 1;//1, 1, 2, 3, 5, 8, 13, 21
        for (int i = 0; i < number; i++) {
            if (i == 0){
                result = result;
                continue;
            }
            result = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = result;
        }
        System.out.println();
        return result;
    }
    public static int[] fibonacciArray(int number){
        int[] array = new int[number];
        int fibo1 = 0;
        int fibo2 = 1;
        int result = 1;//1, 1, 2, 3, 5, 8, 13, 21
        int index = 0;
        for (int i = 0; i < number; i++) {
            if (i == 0){
                array[index++] = result;
                continue;
            }
            result = fibo1 + fibo2;
            array[index++] = result;
            fibo1 = fibo2;
            fibo2 = result;
        }
        System.out.println();
        return array;
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
                           , 1, 1, 2, 3, 5, 8, 13, 21

                            1- Create one method and only print the numbers
                            2- You will return the numbers
                            3- Yuo will put that numbers into the array then you will return it
 */
