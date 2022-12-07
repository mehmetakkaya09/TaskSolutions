package arraysTasks;

import java.util.Arrays;
import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a new sentence!");
        String sentence = scanner.nextLine();
        String[] wordsOfSentence = sentence.split(" ");
        System.out.println(Arrays.toString(wordsOfSentence));
        int javaCount = 0;
        int pythonCount = 0;
        for (String s : wordsOfSentence) {
            if (s.contains("java")){
                javaCount++;
            } else if (s.contains("python")) {
                pythonCount++;
            }

        }

        System.out.println(javaCount == pythonCount);

    }
}
