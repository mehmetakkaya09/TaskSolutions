package customMethods;

public class NumberParameters {
    public static void main(String[] args) {
        isEven(24);
    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else
            System.out.println(num + " is odd number");
    }



}
