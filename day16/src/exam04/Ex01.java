package exam04;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("test3.txt")) {
                                                                // HUX8?
            /* data3.txt 파일을 확인해 보면 -> HUX8?
               한글 '안' -> 유니코드 50504
               버퍼에서 계속 돌다가 50504번째에 해당하는 H로 변환
               '안' -> H
            */

            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('.');
            System.out.println((int)'안');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
