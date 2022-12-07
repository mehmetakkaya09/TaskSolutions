package inheritance.book;

public class Book {
    private String title, type, author;
    private double price;

    public Book(String title, String type, String author, double price) {
        setTitle(title);
        setType(type);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        if (title.equals("")) {
            System.out.println("Invalid Title");
            return;
        } else
            this.title = title;
    }

    public void setType(String type) {
        if (type.equals("")) {
            System.out.println("Invalid Type");
            return;
        } else
            this.type = type;
    }

    public void setAuthor(String author) {
        if (author.equals("")) {
            System.out.println("Invalid Author");
            return;
        } else
            this.author = author;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid Price");
            return;
        } else
            this.price = price;
    }


    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
