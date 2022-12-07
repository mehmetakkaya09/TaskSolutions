package encapsulation;

public class Items {
    private String name;
    private double unitPrice;
    private int quantity;

    public Items(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i))) {
                if (name.charAt(i) == ' ' && Character.isLetter(name.charAt(0)))
                    continue;
                System.out.println("Invalid name!");
                System.exit(0);
            } else if (!Character.isLetter(name.charAt(0))) {
                System.out.println("Invalid name!");
                System.exit(0);
            }
        }
        if (name.equals("") || name.equals(" ")) {
            System.out.println("wrong name!");
            System.exit(0);
        } else
            this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.out.println("Invalid price");
        } else
            this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("quantity cannot be less than 0");
            return;
        }
        if (getName().equalsIgnoreCase("toilet paper")) {
            if (quantity > 1) {
                System.out.println("you cannot buy more than 1 toilet paper!");
                return;
            } else
                this.quantity = quantity;
        }
    }

    public double calcCost() {
        return unitPrice * quantity;
    }


    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost = " + calcCost() +
                '}';
    }
}
/*
4. Item Task
		4.1create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()


 */