package replits;

import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String temp = "";
        String temp2 = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            temp+=ch;
        }
        System.out.println(temp);
        for (int j = n; j < str.length(); j++) {
            char ch2 = str.charAt(j);
            temp2+=ch2;
        }
        System.out.println(temp2);
        if (temp.contains(temp2) || temp2.contains(temp)){
            System.out.println(true);
        }else
            System.out.println(false);



    }
}
