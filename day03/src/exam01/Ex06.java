package exam01;

import java.util.Arrays; // 배열의 편의 기능 사용

public class Ex06 {
    public static void main(String[] args) {

        // 초기값 확인
        /*
        * 정수 0
        * 실수 0.0
        * 논리 false
        * String null
        */

        // 정수
        int[] nums1 = new int[4];
        System.out.println(Arrays.toString(nums1));

        // 실수
        double[] nums2 = new double[4];
        System.out.println(Arrays.toString(nums2));

        // 논리
        boolean[] bools = new boolean[4];
        System.out.println(Arrays.toString(bools));

        // String
        String[] strs = new String[4];
        System.out.println(Arrays.toString(strs));
        
    }
}
