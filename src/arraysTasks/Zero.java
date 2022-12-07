package arraysTasks;

import java.util.Arrays;

public class Zero {
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] zeroArray = new int[array.length];

        int  j=0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i]==0)) continue;
            zeroArray[j++]=array[i];

        }
        System.out.println(Arrays.toString(zeroArray));
        /*
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] tempArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                tempArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(tempArray));
 */

    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */

