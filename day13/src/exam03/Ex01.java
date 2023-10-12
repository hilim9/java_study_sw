package exam03;

public class Ex01 {
    public static void main(String[] args) {
        
        // 람다식
        // 메서드(함수)를 하나의 식으로 표현
        /*Calculator cla = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return 0;
            }
        };*/

        // 접근 제어자, 반환값 타입, 함수명을 생략
        // 매개변수 정의 부분과 함수 구현 부분({ }) 사이에 -> 추가
        /* Calculator cal = (int num1, int num2) -> {
                return num1 + num2;
        }; */

        // 매개변수의 자료형 생략 가능
        /* Calculator cal = (num1, num2) -> {
                return num1 + num2;
        };*/

        // 구현코드가 한줄일때는 { ... } 생략 가능
        // return 예약어도 생략 해야 된다.
        /* Calculator cal = (num1, num2) -> num1 + num2; */

        // 최대한 짧게 쓰는 방향(변수명도 한 글자로 하는 것이 권장)

        Calculator cal = (a, b) -> a + b;
        calc(cal);
        calc((a,b) -> a + b);

        // 람다식으로 표현했을 때 구현할 수 있는 메서드가 1개 이상 있을 경우
        // 어떤 메서드인지 모르기때문에 오류 발생
        // 단일기능만 구현할 수 있다

        int result = cal.add(10, 20);
        System.out.println(result);

    }

    public static void calc(Calculator cal) {
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
