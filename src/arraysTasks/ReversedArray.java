package arraysTasks;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] newLine = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
            newLine[i] = array[j];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newLine));
    }
}
/*
5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */