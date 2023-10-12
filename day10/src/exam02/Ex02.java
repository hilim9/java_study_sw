package exam02;

public class Ex02 {
    public static void main(String[] args) {

        // 언박싱
        // Wrapper 클래스의 객체를 기본형 값으로 자동 변환
        Integer i1 = new Integer(10);
        int num2 = i1 + 20;  // i1.intValue()
        System.out.println(num2);

    }
}
