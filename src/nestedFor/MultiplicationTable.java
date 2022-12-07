package nestedFor;

public class MultiplicationTable {
    public static void main(String[] args) {
        String space = "       ";
        for (int i = 1; i <= 10; i++) {
            if (i >= 10) {
                System.out.print(i + space.replaceFirst(" ", ""));
            } else
                System.out.print(i + space);

            for (int j = 2; j <= 10; j++) {
                if ((j * i) >= 10) {
                    System.out.print((j * i) + space.replaceFirst(" ", ""));
                } else if ((j * i) < 10)
                    System.out.print((j * i) + space);
            }
            System.out.println();
        }


    }
}
