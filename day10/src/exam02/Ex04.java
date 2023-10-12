package exam02;

public class Ex04 {
    public static void main(String[] args) {

        Integer num1 = 100; // Integer.valueOf(100)
        Integer num2 = 200; // Integer.valueOf(200)

        // 객체와 객체간의 연산은 불가능
        // 언박싱
        // num1.intValue() + num2.inValue();
        int num3 = num1 + num2; 
        System.out.println(num3);
    }
}
