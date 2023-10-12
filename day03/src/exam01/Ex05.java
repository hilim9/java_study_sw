package exam01;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};

        // ArrayIndexOutOfBoundsException
        /*for (int i = 0; i <= 5; i++) {

            System.out.println(nums[i]);
        }*/

        // length : 공간의 갯수
        System.out.println(nums.length);

        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }

        // 향상된 for문
        for (int num : nums) {

            System.out.println(num);
        }

        for (int num : nums) System.out.println(num);

        
        // IntStream 사용
        IntStream.range(0, nums.length).forEach(i -> System.out.println(nums[i]));
    }
}
