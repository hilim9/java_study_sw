package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a2.txt");

            fis.close(); // IOException


        } catch (IOException e) { // FileNotFoundException의 상위 클래스인 IOException (다형성)
            e.printStackTrace();

            /*// 예외가 발생하지 않아도 자원은 해제 해주어야 한다(메모리 부족현상 방지)
            try {
                fis.close();
            } catch (IOException e2) {

            }*/
        } finally {
            // 예외가 발생하든 안하든 무조건 실행되는 코드 - finally의 용도
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("자원 해제!!");
        }

    }
}
