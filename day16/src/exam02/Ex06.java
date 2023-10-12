package exam02;

import java.io.*;

public class Ex06 {
    public static void main(String[] args) {

        long sdate = System.currentTimeMillis();
        
        // 기본값 8KB -> 8KB씩 가져온다
        try(FileInputStream fis = new FileInputStream("specs.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("copied2.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while(bis.available() > 0) {
                bos.write(bis.read());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long edate = System.currentTimeMillis();
        System.out.printf("걸린시간: %d%n",edate - sdate);
    }
}
