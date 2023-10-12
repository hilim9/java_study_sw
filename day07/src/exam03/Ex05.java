package exam03;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {

        // try - with - resources문
        // 자원해제에 특화
        try(FileInputStream fis  = new FileInputStream("a.txt")) {

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
