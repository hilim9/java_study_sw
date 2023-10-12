package exam01;

public class Ex08 {
    public static void main(String[] args) {

        // substring(s, e) s이상 e미만
        // substring(s) : s 위치부터 끝까지
        
        // lastIndexOf
        // 오른쪽에서 왼쪽으로(뒤에서 앞으로) 찾음
        // 확장자를 찾을 때 사용(.txt)
        String fileName = "abc.def.txt";

        String extension = fileName.substring(fileName.lastIndexOf(".") + 1 );
        System.out.println(extension);
    }
}
