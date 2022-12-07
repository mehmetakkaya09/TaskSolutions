package customMethods;

public class MethodTasks {
    public static void oddNumbers(){
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0)
                System.out.print(i + " ");
        }
    }
    public static void evenNumbers(){
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0)
                System.out.print(i + " ");
        }
    }
    public static void eligibleToBuyAlcohol(int age){
        if (age >=18){
            System.out.println("eligible to buy alcohol!");
        }else
            System.out.println("not eligible to buy alcohol!");
    }
    public static void eligibleToVote(int age, String citizen){
        if (age>=21 && citizen.equalsIgnoreCase("usa")){
            System.out.println("eligible to vote");
        }else
            System.out.println("not eligible to vote");

    }

    public static void main(String[] args) {
        evenNumbers();
        System.out.println();
        oddNumbers();
        System.out.println();
        eligibleToBuyAlcohol(12);
        eligibleToVote(21,"usa");
    }
}
