package exam01;

public abstract class Calculator {

    // 추상 클래스

    // 추상클래스에서 class 앞에 abstract 예약어를 추가
    // 추상메서드에 abstract 예약어를 추가

    // 1. 추상메서드(메서드의 구현체가 구현되지 않음)
    public abstract int add(int num1, int num2);

    public abstract int minus(int num1, int num2);


    // 2. 완전히 구현된 인스턴스 메서드와 멤버변수 정의
    int num = 10;

    public final void commonMethod() {
        System.out.println("공통 메서드!");
    }


}
