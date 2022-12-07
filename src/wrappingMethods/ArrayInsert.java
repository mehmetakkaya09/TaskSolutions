package wrappingMethods;

import java.util.Arrays;

public class ArrayInsert {
    public static Integer[] insertArray(Integer[] arr, Integer index, Integer element) {
        arr[index] = element;
        return arr;
    }

    public static Double[] insertArray(Double[] arr, Integer index, Double element) {
        arr[index] = element;
        return arr;
    }

    public static String[] insertArray(String[] arr, Integer index, String element) {
        arr[index] = element;
        return arr;
    }

    public static Character[] insertArray(Character[] arr, Integer index, Character element) {
        arr[index] = element;
        return arr;
    }

    public static Integer[] swapArray(Integer[] arr, Integer i, Integer j) {
        Integer swap[] = new Integer[arr.length];
        Integer z = 0;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                swap[z++] = arr[j];
                continue;
            }
            if (k == j) {
                swap[z++] = arr[i];
                continue;
            }
            swap[z++] = arr[k];
        }
        return swap;
    }

    public static Double[] swapArray(Double[] arr, Integer i, Integer j) {
        Double swap[] = new Double[arr.length];
        Integer z = 0;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                swap[z++] = arr[j];
                continue;
            }
            if (k == j) {
                swap[z++] = arr[i];
                continue;
            }
            swap[z++] = arr[k];
        }
        return swap;
    }

    public static Character[] swapArray(Character[] arr, Integer i, Integer j) {
        Character swap[] = new Character[arr.length];
        Integer z = 0;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                swap[z++] = arr[j];
                continue;
            }
            if (k == j) {
                swap[z++] = arr[i];
                continue;
            }
            swap[z++] = arr[k];
        }
        return swap;
    }
    public static String[] swapArray(String[] arr, Integer i, Integer j) {
        String swap[] = new String[arr.length];
        Integer z = 0;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                swap[z++] = arr[j];
                continue;
            }
            if (k == j) {
                swap[z++] = arr[i];
                continue;
            }
            swap[z++] = arr[k];
        }
        return swap;
    }


    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        array = insertArray(array, 2, 30);
        System.out.println(Arrays.toString(array));
        array = swapArray(array, 4, 2);
        System.out.println(Arrays.toString(array));
    }
}
