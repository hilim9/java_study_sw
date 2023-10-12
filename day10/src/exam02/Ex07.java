package exam02;

import java.util.Objects;

public class Ex07 {
    public static void main(String[] args) {

        // Objects 클래스
        // requireNonNullElse(T obj, T defaultObj)
        // obj가 null이면 defaultObj을 사용
        String str = null;
        str = Objects.requireNonNullElse(str, "abc");
        str.toUpperCase();
        System.out.println(str);
    }
}
