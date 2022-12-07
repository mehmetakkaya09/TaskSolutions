package nestedFor;

import java.util.Scanner;

public class FirstDuplicated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a string!");
            String word = scanner.next();
            String res = "";

            for (int i = 0; i < word.length(); i++) {
                int count = 0;
                for (int j = 0; j <= i; j++) {
                    if (word.charAt(i) == word.charAt(j)){
                        count++;
                    }
                }
                if (count > 1){

                    System.out.println(word.charAt(i) + "");
                    break;
                }


        }


    }
}
/*
//if (count == 2){
            //if (count > 1){
                //System.out.println("" + word.charAt(i));
                //System.out.println(word.indexOf(word.charAt(i)));
                //res += "" + word.charAt(i);
                //break;
                //if (word.contains(word.charAt(i) + ""))
                    //word = word.replace(word.charAt(i) + "", "");

            //}
                    System.out.println(res);

 */