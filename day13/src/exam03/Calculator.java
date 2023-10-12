package exam03;

@FunctionalInterface // 단일 기능만 정의 (다중 메서드 정의시 오류)
public interface Calculator {
    int add(int num1, int num2);

    //int minus(int num1, int num2);
}
