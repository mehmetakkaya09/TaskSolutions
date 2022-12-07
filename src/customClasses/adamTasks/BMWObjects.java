package customClasses.adamTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BMWObjects {
    public static void main(String[] args) {


        BMW bmw1 = new BMW("BMW", "X5", "white", 100000, 50000, 2020, LocalDate.of(2020, 05, 20));
        BMW bmw2 = new BMW("BMW", "X6", "black", 120000, 40000, 2016, LocalDate.of(2020, 06, 20));
        BMW bmw3 = new BMW("BMW", "X3", "gray", 80000, 100000, 2015, LocalDate.of(2015, 10, 25));
        BMW bmw4 = new BMW("BMW", "i8", "red", 90000, 110000, 2014, LocalDate.of(2015, 10, 25));
        BMW bmw5 = new BMW("BMW", "i8", "red", 150000, 10000, 2019, LocalDate.of(2021, 1, 7));
        String brand1 = bmw1.brand;
        System.out.println(brand1);
        System.out.println(bmw2);
        ArrayList<BMW> bmwList1 = new ArrayList<>();
        bmwList1.addAll(Arrays.asList(bmw1,bmw2,bmw3,bmw4,bmw5));
        bmwList1.removeIf(p->p.year > 2017);
        System.out.println(bmwList1.size());
        ArrayList<BMW> bmwList2 = new ArrayList<>();
        bmwList2.addAll(Arrays.asList(bmw1,bmw2,bmw3,bmw4,bmw5));
        bmwList2.removeIf(p->!(p.year<2016 && p.model.equalsIgnoreCase("i8")));
        System.out.println(bmwList2);
    }

}
