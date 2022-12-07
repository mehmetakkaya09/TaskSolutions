package arraysTasks;

public class ClassMates {
    public static void main(String[] args) {
        String [] names = {"mehmet akkaya", "sezen aksu", "ahmet kaya"};
        for (String name : names) {
            System.out.println(name.charAt(0) + "." + name.charAt(name.indexOf(" ")+1));
        }

        for (String name : names) {
            String res = "";
            for (int i = name.length()-1; i >=0; i--){
                res += name.charAt(i);
            }
            System.out.println(res);
        }


    }
}
