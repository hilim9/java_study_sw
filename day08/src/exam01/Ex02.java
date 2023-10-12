package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        
        // try-with-resources문
        // 자원해제에 특화 (JDK7에서 추가)
        // 자원 자동해제의 기준
        //	-> AutoCloseable 인터페이스의 구현 클래스여야만 가능
        try(FileInputStream fis = new FileInputStream("a.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // JDK 9 추가
        /*FileInputStream fis = new FileInputStream("a.txt");
        try(fis) {

        }*/
    }
}
