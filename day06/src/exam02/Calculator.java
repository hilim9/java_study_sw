package exam02;

public interface Calculator {

    int num = 10; // public static final 자동 추가 -> 정적 상수

    public int add (int num1, int num2); // public abstract 자동 추가
                                         // 다른 접근제어자 불가 public만 가능
}
