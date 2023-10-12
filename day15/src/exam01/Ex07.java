package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex07 {
    public static void main(String[] args) {

        // 무한스트림 iterate(), generate()
        // 무한스트림이므로 제한을 주어야함
        
        // generate()
        List<String> stars = Stream.generate(() -> "*").limit(10).toList();
        System.out.println(stars);

        // iterate()
        int[] nums = IntStream.iterate(2, x -> x + 2).limit(10).toArray();
        System.out.println(Arrays.toString(nums));
    }
}
