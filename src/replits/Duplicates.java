package replits;

public class Duplicates {
    public static int getDup(String[] arr) {
        int getDup = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j]))
                    count++;
            }
            if (count>1){
                getDup++;
            }
        }
        return getDup;
    }

    public static void main(String[] args) {
        System.out.println(getDup(new String[] {"1","2","aa","1"}));
    }
}
