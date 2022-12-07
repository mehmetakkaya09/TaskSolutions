package replits;

public class Elements {
    public static void main(String[] args) {
        int [] elements = {34,59,19};
        System.out.println("First element: " + elements[0]);
        System.out.println("Middle element: " + elements[1]);
        System.out.println("Last element: " + elements[2]);
        System.out.println("Second element: " +elements[1]);
        System.out.println("Second to last element: " +elements [elements.length -2]);
        double sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        double result = sum/ elements.length;

        System.out.println(result);
    }
}
