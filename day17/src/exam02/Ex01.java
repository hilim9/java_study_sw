package exam02;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException, InterruptedException{

        /*File file = new File("D:/SW_1400LHI/uploads/test.txt");
        file.createNewFile();*/

        File dir = new File("D:/SW_1400LHI/uploads");

        // 임시폴더에 생성
        File file = File.createTempFile("tmp",".log", dir);
        String path = file.getAbsolutePath(); // 절대경로
        System.out.println(path);
        file.deleteOnExit(); // 5초뒤 자동 삭제

        Thread.sleep(5000); // 5초
        System.out.println("5초");
    }
}
