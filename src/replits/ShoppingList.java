package replits;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int item = 0;
        System.out.println("Enter the name of item "+ ++item);
        String itemName = scanner.next();
        System.out.println("Enter the price of the " + itemName);
        double price = scanner.nextDouble();
        System.out.println("How many "+itemName+" will you buy?");
        int howMany = scanner.nextInt();
        System.out.println("Do you want to add more items to the shopping list?");
        String yesNo = scanner.next();

        double total = 0;
        String list = "";
        list += itemName + " x " + howMany + " - $"+ price*howMany + "\n";
        total += price*howMany;
        while (yesNo.equals("yes")){
            System.out.println("Enter the name of item "+ ++item);
            itemName = scanner.next();
            System.out.println("Enter the price of the " + itemName);
            price = scanner.nextDouble();
            System.out.println("How many "+itemName+" will you buy?");
            howMany = scanner.nextInt();
            System.out.println("Do you want to add more items to the shopping list?");
            yesNo = scanner.next();
            list += itemName + " x " + howMany + " - $"+ price*howMany + "\n";
            total += price*howMany;
        }
        System.out.println("SHOPPING LIST:");
        System.out.print(list);
        System.out.println("Total cost: $"+total);
    }
}
