package replits;

public class Alphabet {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        //int res = 1;

        for (int i = 1; i <= 18; i++) {
            if (i % 2 == 0)
                System.out.print(i+" ");

        }
        System.out.println("20");
        for (int j = 1; j <= 18; j++) {
            if (j % 2 != 0)
                System.out.print(j+" ");
        }
        System.out.println("19");

    }
}

