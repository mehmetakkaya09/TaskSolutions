package doWhile;

import java.util.Scanner;

public class qqqqq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cost = 0.0;
        System.out.println("Enter your full name");
        String name = scanner.nextLine();
        name = name.toUpperCase().charAt(0) + name.toLowerCase().substring(1, name.indexOf(" ")) + " " + name.toUpperCase().charAt(name.indexOf(" ")+1)  + name.toLowerCase().substring(name.indexOf(" ") + 2);
        System.out.println("Do you have a US driver license?");
        String dLicense = scanner.next().toLowerCase();
        if (dLicense.equals("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipCode = scanner.nextInt();
        if (zipCode == 20910 || zipCode == 20740){
            cost+=60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            cost +=30;
        }else
            cost +=50;
        System.out.println("Is this vehicle owned, financed, or leased?");
        String vehicle = scanner.next();
        if (vehicle.equals("owned")){
            cost+=10;
        } else if (vehicle.equals("financed")) {
            cost+=15;
        } else if (vehicle.equals("leased")) {
            cost+=20;
        }
        System.out.println("How is this vehicle primarily used?");
        String primarily = scanner.next();
        if (primarily.equals("business")){
            cost+=50;
        } else if (primarily.equals("pleasure")) {
            cost+=10;
        } else if (primarily.equals("commuting")) {
            cost +=20;
            System.out.println("How many days do you commute?");
            int day = scanner.nextInt();

            cost += (day*5);
        }
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age <16){
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age >= 16&&age<20) {
            cost *=10;
        } else if (age>=20&&age<25) {
            cost*=6;
        }else if (age>=25){
            cost*=2;
        }
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scanner.next();
        if (accident.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int howMany = scanner.nextInt();
            cost += (howMany * 10);
        }
        System.out.println("What is the highest level of education you have completed?");
        scanner.nextLine();
        String edu= scanner.nextLine();
        if (edu.equals("Bachelors")||edu.equals("Masters")){
            cost -= (cost * 0.95);
        } else if (edu.equals("PHD")) {
            cost -= (cost *= 0.9);
        } else if (edu.equals("High School")) {
            edu = edu.replace(" ","");
            cost-=(cost*0.95);
        }



        System.out.println(name+ ", here's your quote!");
        System.out.println("This is your start premium cost: $"+cost);
        String refNum = (name.substring(0,2) + age + name.substring(name.length()-3) + zipCode + edu).toUpperCase();
        System.out.println("This is your reference number: "+ refNum);
    }
}
/*
1
2
3
4
5
6
7
8
9
Dexter wood
yes
22209
owned
pleasure
28
yes
1
High School
 */