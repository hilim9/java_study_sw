package exam01;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {

        // joining()
        // 첫번째만 제외하고 ,붙이기
        String[] fruits = {"Apple", "Orange","Melon"}; // Apple, Orange, Melon

        String str = Arrays.stream(fruits).collect(Collectors.joining("#"));
        System.out.println(str);

    }
}
