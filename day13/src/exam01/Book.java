package exam01;

// JDK 14에 추가 (Record 클래스)
// toString() 정의 되어있음
public record Book(
        int id,
        String title,
        String author,
        String publisher) {


}
