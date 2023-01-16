package replits;

import java.util.Scanner;

public class Booking {

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {
        // WRITE YOUR CODE BELOW:
        boolean isFalse = true;
        if (isAvailable == true) {
            if (year == 2018){
                if (month == 7 && day<8){
                    isFalse = false;
                    return isFalse;
                }else {
                    return isFalse;
                }

            }else {
                isFalse = false;
                return isFalse;
            }
        }else{
            isFalse = false;
            return isFalse;
        }

    }
    public static String countLetters(String str){
        String countLetters = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!str.contains(str.charAt(i) + "")) {
                countLetters += "" + count + str.charAt(i);
            }
        }
        return countLetters;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
in.close();
    }
}

