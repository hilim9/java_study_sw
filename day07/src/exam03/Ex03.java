package exam03;

public class Ex03 {
    public static void main(String[] args) {

        // NPE(NullPointerException) - 런타임 예외

        try {
            int num1 = 10;
            int num2 = 0;
            int num3 = num1 / num2; // ArithmeticException
            System.out.println(num3);

            String str = null;
            System.out.println(str.toUpperCase()); // NullPointerException

        } catch (ArithmeticException | NullPointerException e) {

            System.out.println(e.getMessage());

            // 마지막에 상위 클래스를 정의
            // (코드는 위에서 아래로 실행되기 때문에 하위 클래스를 정의 하면 실행되지 않는다)
        } catch (Exception e) { // 다형성

            System.out.println(e.getMessage());
        }

        System.out.println("중요한 코드!");
    }
}
