package customClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzaArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Pizza pizza1 = new Pizza('s',2,3);
            Pizza pizza2 = new Pizza('m',3,4);
            Pizza pizza3 = new Pizza('l',4,5);
            pizzaArrayList.addAll(Arrays.asList(pizza1,pizza2,pizza3));
        }
        System.out.println(pizzaArrayList.size());
        double total = 0;
        for (Pizza pizza : pizzaArrayList) {

                total += pizza.cost();

        }
        System.out.println(total);
    }
}
