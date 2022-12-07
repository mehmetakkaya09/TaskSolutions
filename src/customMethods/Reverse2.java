package customMethods;

import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] res = reverse(a);
        System.out.println(Arrays.toString(res));

    }
    public static int[] reverse(int[] arr){
        int reverse[]  = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j++] = arr[i];
        }
        return reverse;
    }
}
