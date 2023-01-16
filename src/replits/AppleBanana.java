package replits;

import java.util.Scanner;

public class AppleBanana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }
        for (int i = 0; i < arr.length-1; i++) {
        String temp = "";
        temp = arr[i] + ", ";
            System.out.print(temp);
            for (int i1 = i+1; i1 < i+2; i1++) {
                temp = arr[i1];
                System.out.print(temp);
            }

            System.out.println();

        }
        input.close();

    }
}
