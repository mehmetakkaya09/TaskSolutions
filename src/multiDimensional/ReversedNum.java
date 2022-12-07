package multiDimensional;

import java.util.Arrays;

public class ReversedNum {
    public static void main(String[] args) {
        int[][] array = { {1,2,3}, {4,5,6}};
        int[][] temp = new int[array.length][array[0].length];
        for (int i = array.length - 1,z=0; i >= 0; i--,z++) {
            for (int j = array[i].length - 1 , k=0; j >= 0; j--,k++) {
                temp[z][k] = array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(temp));
    }
}
