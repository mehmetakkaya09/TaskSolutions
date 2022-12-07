package arraysTasks;

public class Palindrome {
    public static void main(String[] args) {
        String words[] = {"anna", "level", "Java"};
        int count = 0;
        for (String word : words) {
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equals(reversed))
                count++;
        }

        System.out.println(count);

    }
}
