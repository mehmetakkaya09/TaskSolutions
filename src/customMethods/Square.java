package customMethods;

public class Square {
    public static int square(int number){
        return number*number;
    }

    public static double square(double number){
        return number*number;
    }
    public static int cube(int number){
        return number*number*number;
    }

    public static double cube(double number){
        return number*number*number;
    }

    public static void main(String[] args) {
        System.out.println(square(3));
        System.out.println(square(2.3));
        System.out.println(cube(5));
        System.out.println(cube(5.5));
    }
}
