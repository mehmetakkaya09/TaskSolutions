package collections;

import java.util.*;

public class Adam {

    static List<String> list=new ArrayList<>();
    public static void main(String[] args) {
        list.addAll(Arrays.asList("saffet","rafet","mehmet","ahmet","temel"));
        List<String> newList = sortedOrder(list);
        System.out.println(newList);
    }

    private static List<String> sortedOrder(List<String> list) {
        Set<String> list1=new TreeSet<>(list);
        return new ArrayList<>(list1);
    }
    
}
