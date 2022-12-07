package replits;

public class CountEvens {
    public static void main(String[] args) {
        /*int[] nums = {2, 1, 2, 3, 4};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0)
                count++;
        }
        System.out.println(count);
         */
        int[] nums = {1, 5, 5, 4, 1};
        boolean isFalse = false;
        for (int i = 0, j = 1; i < nums.length-1; i++, j++) {
            if (nums.length == 5 && (nums[i] == 5 && nums[j] == 5)){
                isFalse = true;
                break;
            }


        }
        System.out.println(isFalse);
    }
}
