package exam02;

import java.util.Arrays;
import java.util.Comparator;

public class Ex05 {
    public static void main(String[] args) {

        // sort()
        // 오름차순 정렬
        String[] names = {"이름1","이름5","이름3","이름2","이름4"};
        Arrays.sort(names); // 오름차순
        Arrays.sort(names, Comparator.reverseOrder()); // 내림차순

        System.out.println(Arrays.toString(names));
    }
}
