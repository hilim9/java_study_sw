package exam03;

public class Ex02 {
    public static void main(String[] args) {

        // void print(String str);
        // 매개변수가 1개이면 ()도 생략 가능
        /* MyLamda my = s -> System.out.println(s);
        my.print("출력"); */

        // void print();
        // 매개변수가 없으면 ( )는 생략 불가
        MyLamda my = () -> System.out.println("출력");
    }
}
