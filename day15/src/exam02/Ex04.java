package exam02;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex04 {
    public static void main(String[] args) {

        int[] nums = IntStream.iterate(0, x -> x + 2).limit(10).toArray();
        System.out.println(Arrays.toString(nums));

        // boolean allMatch(Predicate ... ) : 전부 참인 경우 참 (AND)
        boolean result = Arrays.stream(nums).allMatch(x -> x % 2 == 0);
        System.out.println(result); // true

        // boolean anyMatch(Predicate ...) : 어떤 것이든 하나라도 참이면 참 (OR)
        boolean result2 = Arrays.stream(nums).anyMatch(x -> x % 2 == 0);
        System.out.println(result2); // true

        // boolean noneMatch(Predicate ...) : 전부 거짓일때 참 (NOT)
        boolean result3 = Arrays.stream(nums).noneMatch(x -> x % 2 == 0);
        System.out.println(result3); // false

        // findFirst()
        // 처음에 매칭된 자료만 가져오는 메서드
        int num = Arrays.stream(nums).filter(x -> x % 2 == 0).findFirst().getAsInt();
        System.out.println(num); // 0
    }
}
