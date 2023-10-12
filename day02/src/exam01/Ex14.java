package exam01;

public class Ex14 {
    public static void main(String[] args) {

        // 반복문 - do while
        // 조건이 거짓이라도 한번은 실행
        int num = 1, total = 0;

        do {
            total += num;
            num++;

        } while ( num <= 100);

        System.out.println(total);
    }
}
