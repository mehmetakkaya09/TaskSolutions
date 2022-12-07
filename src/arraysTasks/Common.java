package arraysTasks;

import java.util.Arrays;

public class Common {
    public static void main(String[] args) {

        int[] rr1 = {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8};
        int[] sumArray = new int[rr1.length + arr2.length];
        int count = 0;
        for (int i : rr1) {
            sumArray[count++] = rr1[i-1];
        }
        for (int j : arr2) {
            sumArray[count++] = arr2[j-4];
        }
        for (int i : rr1) {
            for (int i1 : arr2) {
                if (i == i1)
                    System.out.println(i);
            }
        }

        System.out.println(Arrays.toString(sumArray));
    }
}
/*

	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */