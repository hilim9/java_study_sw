package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("data.dat");
            DataInputStream dis = new DataInputStream(fis)) {

            // 순서대로 입력 하지 않으면 제대로 데이터를 읽어오지 못한다
            // 공간에 맞는 자료형으로 하지 않으면 오류 발생 -> EOFException

            int num = dis.readInt();
            boolean result = dis.readBoolean();
            String str = dis.readUTF();

            System.out.printf("num=%d, result=%s, str=%s%n", num , result, str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
