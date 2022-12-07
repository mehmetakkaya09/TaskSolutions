package doWhile;

import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string!");
        String str = scanner.nextLine().toLowerCase();
        int numCat = 0;
        int numDog = 0;
        while (str.contains("cat")){
            str = str.replaceFirst("cat","");
            numCat++;
        }
        while (str.contains("dog")){
            str = str.replaceFirst("dog","");
            numDog++;
        }
        if (numCat == numDog){
            System.out.println("numbers are equal");
        }else
            System.out.println("not equal");
    }
}
