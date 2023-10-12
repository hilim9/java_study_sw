package exam02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex07 {
    public static void main(String[] args) {

        // shuffle()
        // 값을 섞음
        List<String> names = Arrays.asList("이름1","이름2", "이름3","이름4","이름5");
        Collections.shuffle(names);
        System.out.println(names);

        // max()
        // 맨 끝에 있는 값
        String max = Collections.max(names);

        // min()
        // 맨 처음에 있는 값
        String min = Collections.min(names);

        System.out.printf("max= %s, min= %s",max, min);

    }
}
