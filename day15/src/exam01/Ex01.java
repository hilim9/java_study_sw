package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {

        /*
         * 중간연산
         * 반환값이 Stream인 형태
         *
         * 최종연산
         * 반환값이 Stream이 아닌 형태
         */

        List<Integer> nums = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // map, filter: 반환값 stream -> 중간연산
        // toList: 반환값 list -> 최종연산
        Stream<Integer> stm = nums.stream().map(x -> x * x).filter(x -> x % 2 == 0);
        List<Integer> nums2 = stm.toList();  // map에서 filter로 넘어갈 때 언박싱 -> 오토박싱이 생기기 때문에 효율적이지 않다
        System.out.println(nums2);


    }
}
