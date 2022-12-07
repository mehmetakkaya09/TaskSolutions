package replits;

public class RemoveDuplicates {
    public static String uniqueChars(String str) {
        String uniqueChars = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!(uniqueChars.contains("" + str.charAt(i)))){
                uniqueChars += str.charAt(i);
            }
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("spoon"));
    }
}
