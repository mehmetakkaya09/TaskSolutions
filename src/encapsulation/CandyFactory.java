package encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        Candy c1 = new Candy("ülker", 3, 1, true);
        Candy c2 = new Candy("eti", -1, 0, false);
        Candy c3 = new Candy("tadım", 6, -4, true);
        Candy c4 = new Candy("şölen", 2, 6, false);
        Candy c5 = new Candy("godiva", 123, 89, true);
        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(c1, c2, c3, c4, c5));


        for (Candy candy : candies) {
            System.out.println(candy.getBrand() + " : " +candy.getPrice());
        }
    }
}
