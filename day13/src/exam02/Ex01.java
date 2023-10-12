package exam02;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums)); // 1차원배열 일때 값 확인

        int[][] nums2 = {{10, 20, 30, 40}, {50, 60, 70 ,80}};
        System.out.println(nums2);
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.deepToString(nums2)); // 다차원 배열일때 값 확인

    }
}
