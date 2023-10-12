package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class Ex03 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("book.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Book book1 = new Book("책1","저자1","출판사1");
            Book book2 = new Book("책2","저자2","출판사2");
            String str = "가나다";

            oos.writeObject(book1);
            oos.writeObject(book2);
            // NotSerializableException
            // 보안상 민감하기 때문에 특정한 작업을 해주어야 직렬화가 가능하다
            // (book 클래스에 implements Serializable 추가)

            oos.writeObject(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
