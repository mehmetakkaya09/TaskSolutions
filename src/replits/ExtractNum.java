package replits;


import java.util.ArrayList;

public class ExtractNum {
    public static String extractNum(String s) {
        String numbers = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                numbers+=s.charAt(i);
        }
        return numbers;

    }
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        ArrayList<String> swapList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == pos1){
                swapList.add(list.get(pos2));
                continue;
            } else if (i == pos2) {
                swapList.add(list.get(pos1));
                continue;
            }
            swapList.add(list.get(i));
        }
        return swapList;
    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> append = new ArrayList<>();
        int sum = 0;
        for (Integer integer : list) {
            if (integer > 0){
                append.add(integer);
                sum+=integer;
            }
        }
        append.add(sum);
        return append;
    }
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> multi = new ArrayList<>();
        for (Integer num : nums) {
            multi.add(num*2);
        }
        return multi;
    }
    public static String search(ArrayList<String> strs, String find) {
        String res = "";
        for (String str : strs) {
            if (str.contains(find)){
                res = str;
            }else
                res ="search failed";

        }
        return res;

    }
    public static ArrayList<String> combine(String[] r1, String[] r2){
        ArrayList<String> merge = new ArrayList<>();
        for (String s : r1) {
            merge.add(s);
        }
        for (String s : r2) {
            merge.add(s);
        }
        return merge;
    }
    public static int refuels(ArrayList<Integer> deliveries,int gasTank) {
        int sum = 0;
        for (Integer delivery : deliveries) {
            sum += delivery;
        }
        if ((sum % gasTank) == 0) {
            sum = sum/gasTank;
        } else
            sum = sum/gasTank + 1;
        return sum;
    }
    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {
        boolean hunt = true;
        int nanukNumber = 0;
        int sumBoast = 0;

        for (String each : result) {
            int num = 0;
            if (Character.isDigit(each.charAt(0))){
            num = Integer.parseInt(each);
            }
            sumBoast+=num;
            if (each.equalsIgnoreCase("nanuk")){
                nanukNumber++;
            }
        }
        if (sumBoast < boast)
            hunt = false;
        if (nanukNumber > wayStones){
            hunt = false;
        }
        return hunt;
    }
}
