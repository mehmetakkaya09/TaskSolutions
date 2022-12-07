package customMethods;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] reverse = reverse(array);
        System.out.println(Arrays.toString(reverse));
    }
    public static int[] reverse(int[] array){
        int reverse[] = new int[array.length];
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            reverse[i++] = array[j];
        }
        return reverse;
    }
    public static double[] reverse(double[] array){
        double reverse[] = new double[array.length];
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            reverse[i++] = array[j];
        }
        return reverse;
    }
}
