package inheritance.phone;

public class Samsung extends Phone {

    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }
    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " is freezing");
    }

}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */
