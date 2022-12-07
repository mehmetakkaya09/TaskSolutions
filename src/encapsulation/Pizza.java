package encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large")){
        this.size = size;
        }else {
            System.out.println("Invalid Size");
        }
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping<0){
            System.out.println("Invalid Number!");
            return;
        } else if (size.equalsIgnoreCase("small")) {
            if (numberOfCheeseTopping>3){
                System.out.println("Invalid Number!");
                return;
            }else
                this.numberOfCheeseTopping = numberOfCheeseTopping;
        } else if (size.equalsIgnoreCase("medium")) {
            if (numberOfCheeseTopping>4){
                System.out.println("Invalid Number!");
                return;
            }else
                this.numberOfCheeseTopping = numberOfCheeseTopping;
        }else if (size.equalsIgnoreCase("large")) {
            if (numberOfCheeseTopping>5){
                System.out.println("Invalid Number!");
                return;
            }else
                this.numberOfCheeseTopping = numberOfCheeseTopping;
        }

    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping<0){
            System.out.println("Invalid Number!");
            return;
        } else if (size.equalsIgnoreCase("small")) {
            if (numberOfPepperoniTopping>4){
                System.out.println("Invalid Number!");
                return;
            }else
                this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        } else if (size.equalsIgnoreCase("medium")) {
            if (numberOfPepperoniTopping>5){
                System.out.println("Invalid Number!");
                return;
            }else
                this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }else if (size.equalsIgnoreCase("large")) {
            if (numberOfPepperoniTopping>6){
                System.out.println("Invalid Number!");
                return;
            }else
                this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }
    }
    public double calcCost(){
        double cost = 0;
        if (size.equalsIgnoreCase("small")){
            cost+=10;
            cost+=(numberOfCheeseTopping+numberOfPepperoniTopping) * 2;
        } else if (size.equalsIgnoreCase("medium")) {
            cost+=12;
            cost+=(numberOfCheeseTopping+numberOfPepperoniTopping) * 2;
        }else{
            cost+=14;
            cost+=(numberOfCheeseTopping+numberOfPepperoniTopping) * 2;
        }
        return cost;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost = $" + calcCost() +
                '}';
    }
}
/*

5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */
