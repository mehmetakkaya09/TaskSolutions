package inheritance.phone;

public class Iphone extends Phone {

    public Iphone(String model, String size, String color, double price) {
        super("Iphone", model, size, color, price);
    }
    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " " + " is having a Face Time with phone number: " + phoneNumber);
    }
    public void faceTime(String eMail){
        System.out.println(getBrand() + " " + getModel() + " " + " is having a Face Time with eMail: " + eMail);
    }
}
/*
1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */