package customClasses.restaurant;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }
    public void takeOrder(){
        System.out.println(name + "is taking an order");
    }
    public void cleanTable(){
        System.out.println(name + "is cleaning the table");
    }
    public String fullTime(){
        if (isFullTime == true){
            return "full-time";
        }else
            return "part-time";
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", Time Status = " + fullTime() +
                '}';
    }
}
/*
6. Restaurant Task:
		6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

Add A constructor that can set all the fields

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */