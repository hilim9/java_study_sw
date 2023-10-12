package exam02;

import java.io.Serializable;
public class Book implements Serializable { 
    // implements Serializable
    // 마커 인터페이스
    // 보안상 민감한 작업이기 때문에 implements Serializable 추가를 해주어야 직렬화가 가능(동의 기능)

    private static final long serialVersionUID = 100L; // 버전 수동 관리
    private String title;
    private transient String autuor; // 직렬화 배제
    private String publisher;

    private int price;

    private void method() {}

    public Book(String title, String autuor, String publisher) {
        this.title = title;
        this.autuor = autuor;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autuor='" + autuor + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
