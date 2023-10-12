package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> stm = nums.stream();
       // int result = stm.mapToInt(x -> x * x).filter(x -> x % 2 == 1).sum();

        IntStream stmt = stm.mapToInt(x -> x * x).filter(x -> x % 2 == 1);
        int result = stmt.sum(); // 최종 연산

        // 중간 연산은 최종 연산이 호출 되기 전에는 연산X -> 지연된 연산
        System.out.println(result);

        // 1. 원본 데이터는 변경하지 않는다
        //System.out.println(nums);

        // 2. 스트림은 일회용 객체이다
        //int result2 = stm.mapToInt(x -> x * x * x).sum();

    }
}
