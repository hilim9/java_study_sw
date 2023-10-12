package exam02;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        
        // 경로와 파일을 분리
        File dir = new File("D:/SW_1400LHI/uploads/../../folder3/folder4");
        File file = new File(dir, "test3.txt");
        
        if(!dir.exists()) { // dir(디렉터리)가 없을 때
            //dir.mkdir(); // 디렉터리(폴더) 한개만 생성
            dir.mkdirs(); // 디렉터리(폴더) 여러개 생성
        }
        file.createNewFile(); // 파일이 존재하지 않을 때 오류(IOException) 발생
        System.out.println(file.getAbsolutePath()); // 절대경로
        System.out.println(file.getCanonicalPath()); // 정규화된 경로
    }
}
