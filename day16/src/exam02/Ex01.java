package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("test1.txt")) {

            // 1바이트 -126~126
            // unsigned byte :  양의 정수 (0~255)
            
            // byte로 읽어오는데 int자료형을 쓰는이유
            // 바이트 표현 범위가 넘어서기 때문에 값을 표현할 수있는 가장 효율적인 int 자료형을 사용
            int ch = fis.read(); // 1바이트(1바이트만큼 커서이동)
            //System.out.println(ch); // 65
            System.out.println((char) ch);// A

            ch = fis.read();
            System.out.println((char) ch); // B

            ch = fis.read();
            System.out.println((char) ch); // C

            ch = fis.read();
            System.out.println((char) ch); // D

            ch = fis.read();
            System.out.println(ch); // -1 (파일을 다 읽은 상태일 때 -1 출력)

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
