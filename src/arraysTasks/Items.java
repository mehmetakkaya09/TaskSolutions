package arraysTasks;

public class Items {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        //                   0         1           2         3        4           5

        double[] prices = {99.99,   150.0,  9.99,   250.0 ,  439.50,  39.99};
        //                   0        1       2       3        4         5

        int[] itemIDs =   {12345 ,  12346,  12347,  12348,  12349,   12350};
        //                   0        1       2       3       4        5

        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")){
                System.out.println(true);
            }

        }

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " - " + itemIDs[i]);
        }


    }
}
