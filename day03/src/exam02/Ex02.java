package exam02;

public class Ex02 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int result = add(num1, num2);
        System.out.println(result);
        
    }

    // 함수 정의 (코드 덩어리)
    // 연산이 필요할 때만 실행되고 실행 후 스택 메모리에서 제거
    static int add(int num1, int num2) {

        // 함수 지역 (지역변수)
        int result = num1 + num2;
        return result; // 같은 자료형 반환 후 종료

        // System.out.println("테스트"); -> 종료되었으므로 실행 X
    }
}
