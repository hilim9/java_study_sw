package exam01;

import java.util.function.BinaryOperator;

public class Ex04 {
    public static void main(String[] args) {

        // extends BiFunction<T,T,T>
        BinaryOperator<Integer> cal = (a, b) -> a + b;
        int result = cal.apply(10, 20); // 언박싱 (연산효율 떨어짐) Integer -> int
        System.out.println(result);           // a.intValue() +  b.intValue()
    }
}
