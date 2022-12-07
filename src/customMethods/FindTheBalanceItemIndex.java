package customMethods;

public class FindTheBalanceItemIndex {
    public static void main(String[] args) {
        int array[] = {4, 9, 10, 1 ,10, 3, 6, 4};

        int sumFirst = 0;
        for (int i = 0; i < array.length; i++) {
            int sumLast = 0;
            sumFirst+=array[i];
            for (int j = array.length - 1; j > i+1; j--) {
                sumLast+=array[j];
            }
            if (sumFirst == sumLast){
                System.out.println(i+1);
            }
        }


    }
}
/*
   //Given an array of integers, write a program that prints the index of an item in the array, where the sum of all items on its left is equal to the sum of the ones on the right.

   For example :
       Given array => [4, 9, 1, 3, 6, 4]
   //Output:
       your program should print as a result => 2
       because the item at index 2 is 1, and 4+9 = 3+6+4
 */