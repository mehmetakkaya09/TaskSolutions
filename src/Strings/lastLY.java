package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class lastLY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String word = input.next();
        int length = word.length() - 2;
        String last2 = word.substring(length);
        if (last2.equals("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

        int d = 0;
        do {
            d = d++ + --d - (d%3);
        }while (++d<4);
        System.out.println("s"+d);
        String f = "DAS AS ASFASasasaF AFS afsaS asdasdf";
        do {
            System.out.print(f.charAt(0));
            f = f.substring(3);
        }while (!f.isEmpty());
        System.out.println();
        System.out.println(0%3);
        double[] sd = new double[4];
        sd[0] = 1.0;
        sd[2] = 42.0;
        sd = new double[4];
        sd[1] = 17;
        sd[3] = sd.length;
        System.out.println(Arrays.toString(sd));
        int[] arr = {2,1,2,1,1,2};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 !=0){
                total+=3;

            }else
                total+=10;
            if (i%3 == 0)
                total-=15;
        }
        System.out.println(total);
        String cyb = "cybertek";
        for (int i = 0; i <= cyb.length(); i+=2) {
            System.out.println(cyb.charAt(i));

        }
        input.close();
    }
}
/*
 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */