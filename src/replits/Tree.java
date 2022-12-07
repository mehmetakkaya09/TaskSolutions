package replits;

public class Tree {
    public static void main(String[] args) {
        int year = 4;
        int size = 3;
        for (int i = 1; i <= 3; i++) {
            System.out.println("year "+i+" - growth 1 cm");
            System.out.println("tree size: "+i+" cm");
        }
        for (int i = 4; i <= 10; i++) {
            size += 2;
            System.out.println("year "+ i +" - growth 2 cm");
            System.out.println("tree size: "+size+" cm");
        }




    }
}
