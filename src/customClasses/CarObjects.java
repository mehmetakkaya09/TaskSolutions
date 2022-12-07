package customClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 =  new Car();
        car1.setInfo("BMW", "M3","White", 2020,50000);
        System.out.println(car1);
        car1.start();
        Car car2 = new Car();
        car2.setInfo("MERCEDES","E250", "Black",2020,55000);
        Car car3 = new Car();
        car3.setInfo("AUDI","A5", "Red",2018,45000);
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carsList);
        for (Car each : carsList) {
            System.out.println(each.brand + " = " + each.price);
        }
        carsList.removeIf(p->p.year == 2018 && p.brand.equalsIgnoreCase("audi"));
        System.out.println(carsList);
    }
}
