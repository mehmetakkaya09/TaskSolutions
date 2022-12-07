package arraysTasks;

public class MaxMin {
    public static void main(String[] args) {
        int numbers[]={2,5,40,65,4};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        System.out.println(max);


        System.out.println("-----------------");


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min)
                min = numbers[i];
        }
        System.out.println(min);
    }
}
