package exam03;

public class Ex03 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 클래스의 동적 로딩
        // 반환값이 Class
        Class cls = Class.forName("exam03.Book");
    }
}
