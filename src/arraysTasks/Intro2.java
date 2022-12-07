package arraysTasks;

import java.util.Arrays;

public class Intro2 {
    public static void main(String[] args) {
        String names[] = {"ahmet", "Mehmet", "zeliha", "hakkı", "gülçin"};
        String[] newNames = Arrays.copyOf(names,3);
        System.out.println(Arrays.toString(newNames));
        //copyOf metodu ile en baştan itibaren kaç tane eleman almak istiyorsam o kadarını değişken adı ile alabiliyorum
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int newNumbers[] = Arrays.copyOfRange(numbers, 2,5);//first INCLUDED, second EXCLUDED
        System.out.println(Arrays.toString(newNumbers));
        //copyOfRange metodunda ayıklama yaparken eleman sayısına göre değil INDEX NUMARASINA göre ayırım yapılır ve başlamak elemanın index numarasını dahil eder bitirdiğimiz elemanın index numarasını dahil etmez!!! Substring metodu ile bu anlamda aynı mantıkta çalışır!!!







    }
}
