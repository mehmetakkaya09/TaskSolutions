package forEachLoops;

public class FirstLast {
    public static void main(String[] args) {
        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};
        for (String word : words) {
            System.out.println(word.charAt(0) + " " + word.charAt(word.length() - 1));
        }


        System.out.println("---------");

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String name : names) {
            System.out.println(name.charAt(0) + " " + name.charAt(name.indexOf(" ") + 1));

        }
        for (String name : names) {
            String reversed = "";
            for (int i = name.length()-1; i >= 0; i--){
                reversed += name.charAt(i);
            }
            System.out.println(reversed);

        }

    }
}
