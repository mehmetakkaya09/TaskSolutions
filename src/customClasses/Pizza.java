package customClasses;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +", total price = $" + cost() +
                '}';
    }
    public double cost(){
        double cost = 0;
        switch (size){
            case 's':
                cost += 10;
                break;
            case 'm':
                cost += 12;
                break;
            case 'l':
                cost+=14;
                break;
        }
        cost += numberOfCheeseTopping*2;
        cost+=numberOfPepperoniTopping*2;
        return cost;
    }
}
