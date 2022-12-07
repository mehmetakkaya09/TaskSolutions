package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AdamTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 8, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8, 9, 10, 11, 12));
        System.out.println(Arrays.toString(concat(list1, list2)));

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6};
        System.out.println(divisible3(list1));
        System.out.println(uniques(arr1,arr2));
    }

    public static ArrayList<Integer> divisible3(ArrayList<Integer> list) {
        ArrayList<Integer> divisible3List = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 3 == 0) {
                divisible3List.add(integer);
            }
        }
        return divisible3List;
    }

    public static int[] concat(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int[] concat = new int[list1.size() + list2.size()];
        int i = 0;
        for (Integer integer : list1) {
            concat[i++] = integer;
        }
        for (Integer integer : list2) {
            concat[i++] = integer;
        }
        return concat;
    }

    public static ArrayList<Integer> uniques(int[] list1, int[] list2) {
        ArrayList<Integer> uniques = new ArrayList<>();
        for (int i : list1) {
            int count = 0;
            for (int j : list1) {
                if (i == j)
                    count++;
            }
            if (count == 1)
                uniques.add(i);
        }
        for (int i : list2) {
            int count = 0;
            for (int j : list2) {
                if (i == j)
                    count++;
            }
            if (count == 1)
                uniques.add(i);
        }
        ArrayList<Integer> uniques2 = new ArrayList<>();

        for (Integer unique : uniques) {
            if (!uniques2.contains(unique))
                uniques2.add(unique);
        }
        return uniques2;


    }
}
/*
        for (int i = 0; i < list1.size() + list2.size(); i++) {
            if (i < list1.size() && (list1.lastIndexOf(list1.get(i)) == list1.indexOf(list1.get(i)))) {
                    uniques.add(list1.get(i));
            }
            if (i < list2.size() && (list2.lastIndexOf(list2.get(i)) == list2.indexOf(list2.get(i)))) {
                    uniques.add(list2.get(i));
            }
        }
        ArrayList<Integer> uniques2 = new ArrayList<>();

        for (Integer unique : uniques) {
            if (!uniques2.contains(unique))
                uniques2.add(unique);
        }


        Collections.sort(uniques2);

        return uniques2;
 */