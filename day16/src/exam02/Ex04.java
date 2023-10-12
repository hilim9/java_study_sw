package exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("test2.txt")) {

            for (char ch = 'A'; ch <= 'Z'; ch++) { // A ~ Z
                fos.write(ch);
            }
            // fos.write('A');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
