package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SetArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list.set(list.size() - 1, 0);
        System.out.println(list);

        System.out.println("---------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            if (i == 0) {
                newList.add(list2.get(list2.size()-1));
                continue;
            }else if (i == list2.size() - 1){
                newList.add(list2.get(0));
                break;
            }
            newList.add(list2.get(i));
        }
        System.out.println(newList);

        System.out.println("-------------------------");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> multiplies = new ArrayList<>();
        for (Integer number : numbers) {
            if (number%2 != 0){
            multiplies.add(number*2);
              continue;
            }
            multiplies.add(number);
        }
        System.out.println(multiplies);

        System.out.println("--------------------");

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> merge = new ArrayList<>();
        for (String each : arr1) {
            merge.add(each);
        }
        for (String each : arr2) {
            merge.add(each);
        }
        System.out.println(merge);

        System.out.println("----------------------");

        ArrayList<Integer> maxList = new ArrayList<>(Arrays.asList(6,8,23,1,45,3,2));
        int max = maxList.get(0);
        int min = maxList.get(0);

        for (Integer integer : maxList) {
            if (integer > max)
                max  = integer;
            if (integer<min)
                min = integer;
        }

        System.out.println(max);
        int maxNew = Collections.max(maxList);

        System.out.println(maxNew);
        System.out.println(min);
        int minNew = Collections.min(maxList);
        System.out.println(minNew);
        Collections.sort(maxList);
        System.out.println(maxList);

    }
}
