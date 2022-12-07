package replits;

public class CountAppearance {
    public static int countAppearance(String[] arr, String word) {
        int countAppearance = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(word))
                countAppearance++;
        }
        return countAppearance;
    }

    public static String profit(int buyPrice, int sellPrice) {
        String profit = "";
        if (buyPrice < sellPrice) {
            profit = "profit";
        } else if (buyPrice > sellPrice) {
            profit = "loss";
        } else
            profit = "no loss";
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(countAppearance(new String[]{"a", "foo", "bar", "foo", "bla"}, "foo"));
    }
}
