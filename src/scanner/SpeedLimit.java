package scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your speed : ");
        int speed = scan.nextInt();
        int speedLimit = 55;
        int diff = speed - speedLimit;
        if (speed > speedLimit) {
            System.out.println("You're driving " + diff + " mph over the limit. Slow down!");

        }


    }
}
/*
2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */