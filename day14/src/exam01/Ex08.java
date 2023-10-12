package exam01;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex08 {
    public static void main(String[] args) {

        // 매개변수를 그대로 반환 하는 함수 -> 항등 함수
        //Function<String, String> func1 = s -> s;
        Function<String, String> func1 = Function.identity(); // 위와 같은 코드
        String str = func1.apply("A");
        System.out.println(str);



    }
}
