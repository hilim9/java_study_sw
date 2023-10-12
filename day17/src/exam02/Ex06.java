package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class Ex06 {
    public static void main(String[] args) throws ClassNotFoundException {

        try(FileInputStream fis = new FileInputStream("data.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Map<String, Object> data = (Map<String, Object>)ois.readObject();
            Book book2 = (Book)data.get("book2");
            String str = (String)data.get("str");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
