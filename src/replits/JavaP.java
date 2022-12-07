package replits;

import java.util.Scanner;

public class JavaP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int java = 0;
        int python = 0;
        if (sentence.contains("java") && sentence.contains("python")) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.contains("java")) {
                    sentence = sentence.replaceFirst("java", "");
                    java++;
                }
                if (sentence.contains("python")) {
                    sentence = sentence.replaceFirst("python", "");
                    python++;
                }
            }
            System.out.println(java == python);
        } else if ((sentence.contains("java")) && !(sentence.contains("python"))) {
            System.out.println(false);
        }else if ((sentence.contains("python")) && !(sentence.contains("java"))) {
            System.out.println(false);
        }else
            System.out.println(true);


    }
}
