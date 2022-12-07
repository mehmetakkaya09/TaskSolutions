package switchCase;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select Floor : ");
        int floor = scan.nextInt();

        boolean bln = floor == 1 ||floor==2||floor==3;

        if (bln){

            if (floor == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if(floor == 2){
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }

        }else{
            System.out.println("Invalid Floor");
        }


    }
}

/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
/*

        int floorNumber = 1;
        boolean bln = floorNumber == 1 || floorNumber == 2 || floorNumber == 3;
        if (bln){
            switch (floorNumber){
                case 1:
                    System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                    break;
                case 2:
                    System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                    break;
                default:
                    System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }
        }else {
            System.out.println("Invalid floor");
        }
 */