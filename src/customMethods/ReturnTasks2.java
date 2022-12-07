package customMethods;

import java.util.Arrays;

public class ReturnTasks2 {
    public static void main(String[] args) {
        int res1 = frequency(new int[]{1, 1, 1, 1, 1, 2, 2}, 1);
        System.out.println(res1);
        int[] res2 = addElement(new int[]{1, 2, 3}, 4);
        System.out.println(Arrays.toString(res2));
        int[] res3 = merge(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println(Arrays.toString(res3));
        int[] res4 = reverse(new int[]{10, 20, 30, 40});
        System.out.println(Arrays.toString(res4));
        boolean res5 = contains(new int[]{1, 2, 3, 4, 5, 6, 7}, 5);
        System.out.println(res5);
        int[] res6 = removeElement(new int[]{10, 20, 30, 40, 50, 60}, 3);
        System.out.println(Arrays.toString(res6));
    }
    public static int frequency(int[] array, int number) {
        int frequency = 0;
        for (int i : array) {
            if (i == number)
                frequency++;
        }

        return frequency;
    }
    public static int[] addElement(int[] arr, int number) {
        int[] addElement = new int[arr.length + 1];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            addElement[j] = arr[i];
        }
        addElement[addElement.length - 1] = number;
        return addElement;
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        int add = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[add++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[add++] = arr2[i];
        }


        return merge;
    }
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }
    public static boolean contains(int[] array, int number) {
        boolean contains = false;
        for (int i : array) {
            if (i == number)
                contains = true;
        }
        return contains;
    }
    public static int[] removeElement(int[] array, int indexNum) {
        int removeElement[] = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == indexNum)
                continue;
            removeElement[j++] = array[i];
        }
        return removeElement;
    }
}
