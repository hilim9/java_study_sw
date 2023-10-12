package exam01;

public class Ex03 {
    public static void main(String[] args) {

        // 선언과 동시에 초기화 (두가지 방법)
        int [] nums = new int[] {10, 20, 30, 40}; // 1
        int [] num1 = {10, 20, 30, 40}; // 2

        /* int[] num2;
        num2 = new int[] {10, 20, 30, 40}; */

        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }

    }

}
