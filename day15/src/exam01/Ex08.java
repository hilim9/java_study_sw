package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {

        String[] chars  = {"A","AA","BB","AA","CC","DD","AAA"};

        //Arrays.stream(chars).distinct().forEach(System.out::println);

        // skip()
        // index번호 이후 skip
        Arrays.stream(chars).distinct()
                            .skip(4)
                            .forEach(System.out::println);

    }
}
