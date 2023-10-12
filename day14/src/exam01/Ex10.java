package exam01;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex10 {
    public static void main(String[] args) {

        // 매개변수를 구현체에서 그대로 사용하는 경우

        // 1) 참조변수::메서드명
        Consumer<String> func1 = System.out::println; // out: 참조변수
                                // s -> System.out.println(s);
        func1.accept("가나다");
        
        // 2) 클래스명::메서드명
        Function<String, String> func2 = String::toUpperCase;
        System.out.println(func2.apply("abc"));
        
        BiPredicate<String, String> func3 = String::equals;
                                            // (s1, s2) -> s1.equals(s2);
        System.out.println(func3.test("가나다","가나다"));
        
        // 순서가 동일할 때만 간결하게 표현 가능
        BiPredicate<String, String> func4 = (s1, s2) -> s2.equals(s1);
                                                     // 불가


        
        

    }
}
