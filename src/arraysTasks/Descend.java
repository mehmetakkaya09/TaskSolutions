package arraysTasks;

import java.util.Arrays;

public class Descend {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6};
        int numDesc[] = new int[num.length];
        int k = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            numDesc[k++] = num[i];
        }
        System.out.println(Arrays.toString(numDesc));
    }
}
