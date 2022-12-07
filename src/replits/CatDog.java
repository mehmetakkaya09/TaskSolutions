package replits;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("cat")){
                str = str.replaceFirst("cat","");
                catCount++;
            }
            if (str.contains("dog")){
                str = str.replaceFirst("dog","");
                dogCount++;
            }
        }
        System.out.println(catCount == dogCount);



    }
}
