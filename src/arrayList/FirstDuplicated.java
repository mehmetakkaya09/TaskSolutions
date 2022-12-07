package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstDuplicated {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (list.get(i) == list.get(j))
                    count++;
            }
            if (count > 1){
                System.out.println(list.get(i));
                break;
            }
        }

        for (Integer integer : list) {
            int frequency = Collections.frequency(list,integer);
            if (frequency > 1){
                System.out.println(integer);
                break;
            }
        }

    }
}
/*

7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */