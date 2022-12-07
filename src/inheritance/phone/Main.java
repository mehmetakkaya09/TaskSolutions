package inheritance.phone;

public class Main {
    public static void main(String[] args) {
        Iphone i1 = new Iphone("14 pro", "max", "rose",45000 );
        i1.faceTime("mehmet@mehmet.com");
        Samsung s1 = new Samsung("", "plus","dark blue", -8);
        s1.freeze();
        Nokia n1 = new Nokia("8.3","max","white",10000);
        n1.selfDefense();
        i1.call(1241243);
        s1.text(23431242);
        System.out.println(i1);
        System.out.println(s1);
        System.out.println(n1);

    }
}
