package abstraction.browsers;

public interface WebDriver extends SearchContext{
    void get(String url);
    void close();
    void quit();
    void getTitle();
}
