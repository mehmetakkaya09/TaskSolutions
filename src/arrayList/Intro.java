package arrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)*2);
        }
        System.out.println(numbers);
    }
}
