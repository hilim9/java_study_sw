package exam03;

import java.util.Objects;

public class Book{

    public String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // toString()의 재정의
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", hashCode()='" + hashCode() + '\'' + // hashCode() 출력
                '}';
    }

    @Override
    public boolean equals(Object obj) { // Object obj = b1
        if (obj instanceof Book) {
            Book book = (Book)obj;
            if (title.equals(book.title) &&
                    author.equals(book.author) &&
                    publisher.equals(book.publisher)) { // 동등성 비교 - 재정의를 통해 true로 만들어 준다
                return true;
            }
        }
        return false; // 동등하지 않을 때 false
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, author, publisher);
    }
}
