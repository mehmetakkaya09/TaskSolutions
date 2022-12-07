package utility;

import java.util.ArrayList;
import java.util.Arrays;

public class UtilityArrays {
    public static int[] mergeArray(int[] arr1, int[] arr2){
        int merge[] = new int[arr2.length + arr1.length];
        int i = 0;
        for (int each : arr1) {
            merge[i++] = each;
        }
        for (int each : arr2) {
            merge[i++] = each;
        }
        return merge;
    }
    public static double[] mergeArray(double[] arr1, double[] arr2){
        double merge[] = new double[arr2.length + arr1.length];
        int i = 0;
        for (double each : arr1) {
            merge[i++] = each;
        }
        for (double each : arr2) {
            merge[i++] = each;
        }
        return merge;
    }
    public static String[] mergeArray(String[] arr1, String[] arr2){
        String merge[] = new String[arr2.length + arr1.length];
        int i = 0;
        for (String each : arr1) {
            merge[i++] = each;
        }
        for (String each : arr2) {
            merge[i++] = each;
        }
        return merge;
    }
    public static char[] mergeArray(char[] arr1, char[] arr2){
        char merge[] = new char[arr2.length + arr1.length];
        int i = 0;
        for (char each : arr1) {
            merge[i++] = each;
        }
        for (char each : arr2) {
            merge[i++] = each;
        }
        return merge;
    }
    public static int maxNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static double maxNumber(double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static long maxNumber(long[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static float maxNumber(float[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static short maxNumber(short[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static byte maxNumber(byte[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }    
    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static double minNumber(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static long minNumber(long[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static float minNumber(float[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static short minNumber(short[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static byte minNumber(byte[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int[] reverseArray(int[] arr){
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }
    public static String[] reverseArray(String[] arr){
        String[] reverse = new String[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }
    public static char[] reverseArray(char[] arr){
        char[] reverse = new char[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }
    public static ArrayList<String> charToArrayList(char[] array){
        ArrayList<String> charToArrayList = new ArrayList<>();
        for (char each : array) {
            charToArrayList.add(each + "");
        }
        return charToArrayList;
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7};
        int[] merge = mergeArray(array1,array2);
        System.out.println(Arrays.toString(merge));
        double[] array3 = {1,2,3,4};
        double[] array4 = {5,6,7};
        double[] merge2 = mergeArray(array3,array4);
        System.out.println(Arrays.toString(merge2));
        int max = maxNumber(array2);
        System.out.println(max);
        double max2 = maxNumber(array4);
        System.out.println(max2);
        long[] array5 = {1,2,3,4,50};
        float[] array6 = {1,2,3,4,50};
        long max3 = maxNumber(array5);
        System.out.println(max3);
        float max4 = maxNumber(array6);
        System.out.println(max4);
        int[] reverse = reverseArray(array1);
        System.out.println(Arrays.toString(reverse));
        String[] reverse2 = {"mehmet", "akkaya", "neziha", "ibrahim"};
        reverse2 = reverseArray(reverse2);
        System.out.println(Arrays.toString(reverse2));

    }
}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */