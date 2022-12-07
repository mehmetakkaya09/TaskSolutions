package arraysTasks;

import java.util.Scanner;

public class ReversedSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a sentence!");
        String sentence = scanner.nextLine();
        String[] splitSentence = sentence.split(" ");
        String res = "";
        for (int i = 0; i < splitSentence.length; i++) {
            if (i == 1){
                for (int i1 = splitSentence[i].length() - 1; i1 >= 0; i1--) {
                    if (i1 == 0){
                        res += splitSentence[i].charAt(i1) + " ";
                        break;
                    }
                    res += splitSentence[i].charAt(i1) + "";

                }
                System.out.print(" ");
                continue;
            }
            res += splitSentence[i] + " ";
        }
        for (int i = splitSentence.length - 1; i >= 0; i--) {
            res += splitSentence[i] + " ";
        }
        System.out.println(res);
    }
}
