package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "melon", "orange");
        
        /*fruits.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        });*/
        
        // 람다식으로 줄임
        fruits.replaceAll( s -> s.toUpperCase());
        fruits.replaceAll(String::toUpperCase); // 위와 같은 코드

        System.out.println(fruits);
    }
}
