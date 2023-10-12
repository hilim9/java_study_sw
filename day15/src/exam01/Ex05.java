package exam01;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {

        // range(시작번호, 종료 번호(미만))
        //IntStream.range(0,10).forEach(i -> System.out.println(++i + "번 반복"));

        // rangeClosed(시작번호, 종료 번호(이하)
        int sum = IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 0).sum();
        System.out.println(sum);
    }
}
