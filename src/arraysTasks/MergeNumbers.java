package arraysTasks;

import java.util.Arrays;

public class MergeNumbers {
    public static void main(String[] args) {
        int n1[] = {1,2,3};
        int n2[] = {4,5};
        int length[] = new int[n1.length + n2.length];
        for (int i = 0; i < n1.length; i++) {
            length[i] = n1[i];
        }
        for (int i = n1.length, j = 0; i < length.length ; i++, j++) {
            length[i] = n2[j];
        }
        System.out.println(Arrays.toString(length));

    }
}
