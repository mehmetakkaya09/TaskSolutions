package arraysTasks;

import java.util.Arrays;

public class Merge3 {
    public static void main(String[] args) {

        int [] rr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] sumArray = new int[rr1.length + arr2.length + arr3.length];
        int count = 0;
        for (int i = 0; i < rr1.length; i++) {
            sumArray[count++] = rr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sumArray[count++] = arr2[i];

        }
        for (int i = 0; i < arr3.length; i++) {
            sumArray[count++] = arr3[i];

        }
        System.out.println(Arrays.toString(sumArray));

    }
}
/*
        for (int i : rr1) {
            sumArray[count++] = rr1[i];
        }
        for (int i : arr2) {
            sumArray[count++] = arr2[i-4];
        }
        for (int i : arr3) {
            sumArray[count++] = arr3[i-8];
        }
 */