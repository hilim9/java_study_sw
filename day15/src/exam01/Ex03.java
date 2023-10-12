package exam01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class Ex03 {
    public static void main(String[] args) {

        int[] scores = {90, 88, 55, 68, 73, 100};

        IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        System.out.println(stat);
        System.out.printf("총 개수: %d, 합계: %d, 평균: %.2f, 최대: %d, 최소: %d%n"
        , stat.getCount(),stat.getSum(),stat.getAverage(),stat.getMax(),stat.getMin());

        // boxed()
        // 기본 자료형 스트림 -> 일반 스트림 변환 메서드
        int[] scores2 = Arrays.stream(scores).boxed()
                                             .sorted(Comparator.reverseOrder())
                                             .mapToInt(x -> x)
                                             .toArray();
        System.out.println(Arrays.toString(scores2));
    }
}
