package customMethods;

public class GradeTask {
    public static void gradesCalculater(int math, int physics, int chemistry) {
        if ((math >= 0 && math <= 100) && (physics >= 0 && physics <= 100) && (chemistry >= 0 && chemistry <= 100)) {
            if ((math + physics + chemistry) / 3 >= 90) {
                System.out.println("your grade is A");
            } else if ((math + physics + chemistry) / 3 >= 80) {
                System.out.println("your grade is B");
            } else if ((math + physics + chemistry) / 3 >= 70) {
                System.out.println("your grade is C");
            } else if ((math + physics + chemistry) / 3 >= 60) {
                System.out.println("your grade is D");
            } else {
                System.out.println("your grade is F");
            }
        }else
            System.out.println("please a valid number between 0 - 100!");
    }

    public static void main(String[] args) {
        gradesCalculater(92, 90, 100);
        dolarToLira(45);
    }

    public static void dolarToLira(double dolar){
        double lira = dolar * 18.60;
        System.out.println(dolar + " is " + lira + " lira!");

    }

}
