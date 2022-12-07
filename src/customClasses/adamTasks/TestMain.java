package customClasses.adamTasks;

public class TestMain {
    public static void main(String[] args) {
        HouseItems item1 = new HouseItems("table","brown",1);
        System.out.println(item1);
        MyCalculator my1 = new MyCalculator();
        System.out.println("my1.divide(4,2) = " + my1.divide(4, 2));
        MyCalculatorV2 my2 = new MyCalculatorV2(5,6);
        System.out.println(my2.multiply());
    }
}
