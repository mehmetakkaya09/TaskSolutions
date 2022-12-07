package replits;

import java.util.Scanner;

public class Watertax {
    public static double waterTax(double units){
        double waterTax = 0.0;
        if (units < 50) {
            waterTax += 0.60 * units;
        } else if (units > 50 && units <=99) {
            waterTax += 0.90 * units;
        } else if (units >= 100 && units <= 149) {
            waterTax += 0.90 * units + 50.0;
        }else if (units > 150) {
            waterTax += 0.90 * units;
            waterTax += 100;
        }

        return waterTax;






    }//end waterTax



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));

    }

}

