package customClasses.adamTasks;

public class MyCalculatorV2 {
    public int num1, num2;

    public MyCalculatorV2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int plus(){
        return num1+num2;
    }
    public int minus(){
        return  num1-num2;
    }
    public int multiply(){
        return num1*num2;
    }
    public double divide(){
        return (double) num1/(double)num2;
    }
}
