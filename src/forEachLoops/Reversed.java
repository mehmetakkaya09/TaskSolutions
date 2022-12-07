package forEachLoops;

import java.util.Arrays;

public class Reversed {
    public static void main(String[] args) {
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
        for (String name : names) {
            String reversed = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                reversed += name.charAt(i);
            }
            System.out.println(reversed);

        }

        int[] numbers = {10, 20, 30, 40, 50, 60};
            int reversed[] = new int[numbers.length];
        for (int i = numbers.length-1, j = 0; i >=0 ; i--, j++) {
            reversed[i] = numbers[j];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
