package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex04 {
    public static void main(String[] args) throws ClassNotFoundException {

        try(FileInputStream fis = new FileInputStream("book.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            // 순서대로 가져와야 함
            Book book1 = (Book)ois.readObject(); // ClassNotFoundException
            Book book2 = (Book)ois.readObject();
            String str = (String)ois.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
