package customClasses.movie;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch EU10", "Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay");
        movie1.addCast("mehmet");
        String[] casts = {"veli","mustafa","ömer","furkan"};
        movie1.addCasts(casts);
        System.out.println(movie1);





    }
}
