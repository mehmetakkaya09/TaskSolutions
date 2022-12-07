package replits;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        double rating = 0;
        for (int i = 0; i <8; i++){
            if (i == 7){
                System.out.println("Enter the difficulty rating:");
                 double num2= input.nextDouble();
                 rating = num2;
                break;
            }
            System.out.println("Enter score for judge "+(i+1)+":");
            int num = input.nextInt();
            score[i] = num;
        }
        Arrays.sort(score);
        double sum = 0;
        for (int i = 1; i < score.length-1; i++) {
            sum += score[i];
        }
        sum *= rating * 0.6;
        System.out.println(sum);
    }
}
