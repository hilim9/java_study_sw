package exam01;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex11 {
    public static void main(String[] args) {

        // 반환값이 생성된 객체
        // 클래스명::new
        String[] strs = Stream.of("가","나","다").toArray(String[]::new);
        System.out.println(Arrays.toString(strs));                  // i -> new String[i]


                /*new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/


    }
}
