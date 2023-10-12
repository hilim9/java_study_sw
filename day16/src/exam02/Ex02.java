package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("test1.txt")) {

            // int available()
            while(fis.available() > 0) { // 남아있는 바이트 수(0이면 다 읽어온 상태)
                int ch = fis.read();
                System.out.print((char)ch);
            }
            /*int ch = 0;
            while((ch = fis.read()) != -1) {

                System.out.println((char)ch);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}