package customMethods;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbccdd";
        String res = removeDuplicates(str);
        System.out.println(res);
    }

    public static String removeDuplicates(String str){
        String removed = "";
        char[] strChars = str.toCharArray();
        for (char strChar : strChars) {
            if (!removed.contains(strChar + "")){
                removed += strChar;
            }
        }
        return removed;
    }

}
