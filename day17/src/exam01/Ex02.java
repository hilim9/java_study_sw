package exam01;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {

        /*
           FileWriter(File file, boolean append)
		    - true: 이어서 쓰겠다(커서가 마지막위치에 멈춰있음)
		    - false: 처음부터 기록(커서가 맨앞으로 이동)
		    - 로그를 기록할 때 사용
        */

        try(FileWriter fw = new FileWriter("test2.txt",true)) {
                                                    // FileWriter(File file, boolean append)
            fw.write("안녕하세요.");



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
