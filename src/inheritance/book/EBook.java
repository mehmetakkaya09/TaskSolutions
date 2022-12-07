package inheritance.book;

public class EBook extends Book {
    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize() {
        return size;
    }

    public int getPages() {
        return pages;
    }

    public void setSize(String size) {
        if (size.equals("")) {
            System.out.println("Invalid Size");
            return;
        } else
            this.size = size;
    }

    public void setPages(int pages) {
        if (pages < 0) {
            System.out.println("Invalid Page");
            return;
        } else
            this.pages = pages;
    }
    public void readBook(){
        System.out.println("Book called " +getTitle() + " written by " + getAuthor() + " is reading");
    }
    public String toString() {
        return "EBook{" +
                "title='" + getTitle() + '\'' +
                ", type='" + getType() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", size=" +  size+
                ", pages=" + pages +
                '}';
    }
}
