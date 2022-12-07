package forLoops;

public class Practises {
    public static void main(String[] args) {
        String star = "* ";

        for (int i = 10; i >= 1; i--) {
            System.out.println(" ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(star);
            }
        }
        System.out.println();
        for (int k = 15; k <= 45; k++){
            System.out.print(k+" ");
        }

    }

}
