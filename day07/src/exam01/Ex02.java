package exam01;

import java.util.function.IntBinaryOperator;

public class Ex02 {
    public static void main(String[] args) {

        int num3 = 30;

        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {

                // 지역변수의 상수화
                // num3 = 40; -> 변경 불가
                return num1 + num2 + num3;
            }
        };

        // IntBinaryOperator
        /* IntBinaryOperator cal1 = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        };*/

        // Calculator cal = (a, b) -> a + b;

        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
