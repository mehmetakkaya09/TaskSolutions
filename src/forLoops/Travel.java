package forLoops;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double baseCost = 1000;
        System.out.println("do you have passport? yes or no?");
        String pass = inp.next();
        String Country="";
        byte bags = 0;
        short people = 0;
        String names ="";
        int renewal = 200;
        int expire;
        if (pass.equals("yes")){
            System.out.println("which Country?");
            inp.nextLine();
            Country = inp.nextLine();
            System.out.println("how many bags?");
            bags = inp.nextByte();
            double bagBase = bags *50;
            System.out.println("how many people?");
            people = inp.nextShort();
            if (people >=1&& people<=3){
                baseCost += people * 1000;
                baseCost -= people * 100;
            } else {
                baseCost += people + 1000;
                baseCost -= 300;
            }
            System.out.println("enter the names of people with comma!");
            inp.nextLine();
            names = inp.nextLine();
            System.out.println("Your ticket is booked to "+Country+ ". We have charged extra for the "+ bags +" but you are traveling with "+people+" so we are giving a discount. Your total cost is "+(baseCost+bagBase));
        }

        if (pass.equals("no")){
            System.out.println("how many years do you want?");
            expire = inp.nextInt();
            renewal += expire * 75;
            System.out.println("which country?");
            Country = inp.next();
            System.out.println("do you want to go next year? yes or no?");
            String nextY = inp.next();
            if (nextY.equals("yes")){
                renewal+=100;
            }else
                renewal-=50;
            System.out.println("Looks like your password has been expired for "+expire+" years, but not to worry we will get it ready for you to travel to "+Country+". Your total cost has come out to "+renewal);

        }

    }
}
