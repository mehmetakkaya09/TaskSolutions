package customMethods;

public class ReturnMethod {
    public static void main(String[] args) {
        int max = maxBetween10and200(114,154);
        System.out.println(max * 2);
    }
    public static int maxBetween10and200(int number1, int number2){
        int result = 0;
        if (number1 > number2){
            result = number1;
        }else
            result = number2;

        return result;
    }
}
