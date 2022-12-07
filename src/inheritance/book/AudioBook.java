package inheritance.book;

public class AudioBook extends Book {
    private double length;
    private String narrator;

    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public double getLength() {
        return length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setLength(double length) {
        if (length < 0) {
            System.out.println("Invalid length");
            return;
        } else
            this.length = length;
    }

    public void setNarrator(String narrator) {
        if (narrator.equals("")) {
            System.out.println("Invalid Name");
            return;
        } else
            this.narrator = narrator;
    }
    public void listen(){
        System.out.println("Book called "+getTitle()+" narrated by "+ narrator + " is listened!");
    }
    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", length=" +  length+
                ", narrator=" + narrator +
                '}';
    }

    public static void main(String[] args) {
        AudioBook a1 = new AudioBook("Kuyucaklı Yusuf","Novel", "Sabahattin Ali",-6,35.6, "Mehmet Akkaya");
        System.out.println(a1);
        a1.listen();
        EBook e1 = new EBook("Kuyucaklı Yusuf","Novel", "Sabahattin Ali",-6,"Large", 350);
        System.out.println(e1);
        e1.readBook();
    }
}
