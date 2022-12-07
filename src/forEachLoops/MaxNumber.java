package forEachLoops;

public class MaxNumber {
    public static void main(String[] args) {
        int numbers [] = {2,45,65,12,87,23,565};
        int max = numbers[0];
        double sum = 0;
        for (int number : numbers) {
            if (number > max)
                max = number;
            sum += number;
        }
        double result = sum / numbers.length;
        System.out.println(max);
        System.out.println(result);
    }
}
