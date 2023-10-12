package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {

        // 선언과 동시에 초기화
        int[][] nums = new int[][] {{10, 20, 30}, {40, 50, 60}};
        System.out.println(nums.length); // 2행 -> 행의 갯수 (0, 1)
        System.out.println(nums[0].length); // 3열 -> 열의 갯수 (0, 1, 2)
        System.out.println(nums[1].length); // 3열 -> 열의 갯수 (0, 1, 2)

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d행, %d열 = %d%n",i ,j, nums[i][j]);
            }
        }

        // deepToString() -> 다차원 배열
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(Arrays.deepToString(nums));
            }
        }

    }
}
