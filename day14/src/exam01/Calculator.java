package exam01;

@FunctionalInterface // 단일 기능 정의 (사용자 정의 메서드는 1개만 정의해야함)
public interface Calculator {

    int add(int num1, int num2);

    //int minus(int num1, int num2);
}
