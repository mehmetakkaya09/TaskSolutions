package forLoops;

import customMethods.Exercises;

public class AtoZ {
    public static void main(String[] args) {
        for (char i = 65; i <= 90; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (char j = 90; j>=65; j--){
            System.out.print(j+" ");
        }
        System.out.println();
        for (char k = 97; k <= 122; k++){
            System.out.print(k+" ");
        }
        System.out.println();
        for (char l = 122; l>=97; l--){
            System.out.print(l+" ");
        }
        Exercises.helloCydeo();
    }
}
