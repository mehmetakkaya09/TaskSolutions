package doWhile;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str = scan.next().toLowerCase();
        String res = "";

        if (str.contains("bread")){
            str = str.substring(str.indexOf("bread")+5);
        }
        if (str.contains("bread")){
            str = str.substring(0, str.indexOf("bread"));
            System.out.println(str);

        }else
            System.out.println("nothing");


    }
}
