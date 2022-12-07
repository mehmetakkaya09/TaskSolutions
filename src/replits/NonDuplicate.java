package replits;

public class NonDuplicate {
    public static void main(String[] args) {
        int nums[] = {6, 44, 6, 4, 3, 4, 1};
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (num == i){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(num);
                break;
            }
        }
    }
}
