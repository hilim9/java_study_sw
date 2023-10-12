package exam03;

public class Ex02 {
    public static void main(String[] args) {
        
        // 예외 처리의 목적
        // 프로그램 중단을 막는 것
        // 오류해결
        
        try {
            int num1 = 10;
            int num2 = 0;

            int num3 = num1 / num2; // ArithmethicException -> throw new ArithmethicException
            System.out.println(num3);

        } catch(ArithmeticException e) {

            //System.out.println("예외 발생");
            
            // 오류 메세지 확인하는 메서드
            /* String message = e.getMessage();
            System.out.println(message); */

            // 오류 메세지 확인 getMessage()보다 자세하게 출력
            e.printStackTrace();

        }
        System.out.println("아주 중요한 소스 코드... 실행안되면 절대 안됨");
    }
}
