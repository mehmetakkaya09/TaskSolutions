package arraysTasks;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        char[] letters = new char[26];
        for (char i = 'Z', j = 0; i >= 'A'&& j < letters.length; i--, j++) {
            letters [j] = i;
        }
        System.out.println(Arrays.toString(letters));
        char[] letters2 = new char[26];
        char ch = 'A';
        for (int i = 0; i < letters2.length; i++) {
            letters2[i] = ch++;
        }
        System.out.println(Arrays.toString(letters2));


    }
}
