package exam02;

public class Q1 {
    public static void main(String[] args) {

        /* 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오 */

        int num1 = 20;
        double num2 = 3.0;

        int result = (int) (num1 + num2);
        
        int result2 = num1 * (int)num2;
        // 오답
        // +, - 경우에는 문제가 없지만, * /로 연산했을 때 값이 절사된다

        System.out.println(result);
        System.out.println(result2);

    }
}
