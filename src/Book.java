import java.time.LocalDate;
import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private LocalDate date;

    public Book() {
    }

    public Book(String title, String author, LocalDate date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Book("Title", "Mayis", LocalDate.now()));
    }}
