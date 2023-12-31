package exam01;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {

        Class cls = Ex02.class;
        MyAnno anno = (MyAnno) cls.getAnnotation(MyAnno.class); // 다형성
        /* String value = anno.value();
        System.out.println(value); */

        // 배열형태로 설정
        String[] values = anno.value();
        System.out.println(Arrays.toString(values));
        int max = anno.max();
        int min = anno.min();
        System.out.printf("max=%d, min=%d%n",max, min);
    }
}
