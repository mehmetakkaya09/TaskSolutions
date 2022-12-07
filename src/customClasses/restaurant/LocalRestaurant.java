package customClasses.restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {
        Server server1 = new Server("Mehmet",001,30,false);
        Server server2 = new Server("Ahmet",003,30,true);
        Server server3 = new Server("Ayşe",004,30,false);
        System.out.println(server1);
        Chef chef1 = new Chef("Akkaya",002,35,true);
        System.out.println(chef1);
        Restaurant restaurant1 = new Restaurant("M.A","Aydın",5);
        restaurant1.hireServer(server1);
        Server[] servers = {server2,server3};
        restaurant1.hireServer(servers);
        restaurant1.hireChef(chef1);
        System.out.println(restaurant1);

    }
}
