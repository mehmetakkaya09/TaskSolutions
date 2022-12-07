package Strings;

public class Exercises {
    public static void main(String[] args) {
        String i = "everything is Fine";
        String j = "fine";

        System.out.println(i.toLowerCase().contains(j));
        System.out.println(i.toLowerCase().startsWith("ev"));
        System.out.println(i.toLowerCase().endsWith("ine"));
    }
}
