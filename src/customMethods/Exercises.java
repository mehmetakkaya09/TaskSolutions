package customMethods;

public class Exercises {
    public static void helloWorld(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world!");
        }

    }
    public static void helloCydeo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello cydeo!");
        }
    }
    public static void evenNumbers1to10(){
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }



    public static void main(String[] args) {
        helloWorld();
        helloCydeo();
        evenNumbers1to10();

    }
}
