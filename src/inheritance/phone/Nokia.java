package inheritance.phone;

public class Nokia extends Phone {
    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }
    public void selfDefense(){
        System.out.println("You can use "+getBrand()+" "+getModel()+" as self defense tool");
    }
}
/*

		1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

 */
