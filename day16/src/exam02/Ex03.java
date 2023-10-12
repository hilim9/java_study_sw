package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("test1.txt")) {

            byte[] buffer = new byte[5];
            while(fis.available() > 0) {
                int ch = fis.read(buffer); // 5byte
                /*System.out.println("바이트 수 : " + ch);
                for(byte b : buffer) { // 기존 데이터를 덮어씀
                    System.out.print((char)b);
                }*/
                for(int i = 0; i < ch; i++) {
                    System.out.print((char)buffer[i]); // 마지막이 1byte 이므로 있는것만 가져온다
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
