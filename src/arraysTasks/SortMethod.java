package arraysTasks;

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int[] numbers = {1,20,54,6,12,65,14};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        String names[] = {"ahmet", "Mehmet", "zeliha", "hakkı", "gülçin"};
        //String sıralamalarında büyük harfler küçük harflerden önce gelir! çünkü ascii table numarası daha küçüktür!
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int [] eq1 = {1,3,2};
        int [] eq2 = {1,2,3};
        boolean isEqual = Arrays.equals(eq1,eq2);
        System.out.println(isEqual);
        Arrays.sort(eq1);
        Arrays.sort(eq2);
        boolean isEqual2 = Arrays.equals(eq1,eq2);
        System.out.println(isEqual2);
    }
}
