package polymorphism;


import inheritance.person.Teacher;
import polymorphism.carTask.BMW;
import polymorphism.carTask.Car;
import polymorphism.carTask.Tesla;
import polymorphism.carTask.Toyota;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        String s = "a";
        Integer i = 1;
        List<Object> objects = new ArrayList<>();
        objects.add(s);
        objects.add(i);
        System.out.println(objects);



        Car[] cars = {
                new Toyota("Highlander", 2010, 25000, "White", 255000),
                new BMW("X5", 2014, 32000, "Red", 12000),
                new Toyota("Corolla", 2011, 20000, "White", 310000),
                new BMW("M3", 2015, 33000, "Blue", 14030),
                new BMW("M5", 2017, 35000, "Black", 15000),
                new BMW("M4", 2018, 40000, "White", 19000),
                new BMW("7 Series", 2009, 30000, "Purple", 21000),
                new BMW("i3", 2011, 30000, "Black", 9000),
                new Toyota("Camry", 2018, 30000, "Red", 185000),
                new Toyota("Rav4", 2012, 23000, "Red", 285000),
                new Toyota("Avalon", 2019, 35000, "Blue", 175230),
                new Tesla("Model 3", 2015, 45000, "White", 235000),
                new Tesla("Model Y", 2017, 65000, "Black", 135000),
                new Tesla("Model X", 2016, 48000, "White", 235000),
                new Tesla("Model X", 2014, 48000, "White", 236000),
        };

//        Car newCar = new Tesla("Model X", 2014, 48000, "White", 236000);
//        Car newCar2 = new BMW("Model X", 2014, 48000, "White", 236000);
//        ((Tesla)newCar).autoPilot();
//        newCar.drive();
//        newCar2.drive();
        List<BMW> BMWList = new ArrayList<>();
        List<BMW> yearList = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof BMW) {
                BMWList.add((BMW) car);
                if (car.year == 2015 || car.year == 2017) {
                    yearList.add((BMW) car);
                }
            }
        }
//        System.out.println(BMWList);
        BMW minPrice = BMWList.get(0);
        for (BMW bmw : BMWList) {
            if (bmw.price < minPrice.price) {
                minPrice = bmw;
            }
            if (bmw.year == 2015 || bmw.year == 2017) {
                yearList.add(bmw);
            }
        }
        System.out.println(yearList);
        System.out.println(minPrice);


    }
}
