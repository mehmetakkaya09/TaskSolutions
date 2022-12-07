package nestedFor;

public class Switch {
    public static void main(String[] args) {

        int x = 1;
        int j = 2;
        switch (x){
            case 2:
                j+= 2;
            case 1:
                j+=5;
            default:
                System.out.println("sss");
                break;
            case 3:
                j+=1;
                System.out.println("dddd");
        }

        System.out.println(j);
    }
}
