package exam01;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("data.dat");
            DataOutputStream dos = new DataOutputStream(fos)){
                
                // 기본형 자료로 출력
                dos.writeInt(100);
                dos.writeBoolean(true);
                dos.writeUTF("안녕하세요");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
