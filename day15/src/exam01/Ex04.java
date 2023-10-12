package exam01;

public class Ex04 {
    public static void main(String[] args) {

        Integer num1 = 100;
        Integer num2 = 200;
        Integer num3 = num1 + num2; // 객체끼리는 연산이 되지 않기 때문에 오토박싱과 언박싱이 발생하여 효율적이지 않다
        System.out.println(num3);

    }
}
