package exam02;

import java.util.Arrays;
import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {

        String[] fruits = {"apple","orange", "melon", "mango"};

        String[] converted = map(fruits, s -> s.replace("a","A"));
                                    // s => items[i]

        /*String[] converted = map(fruits, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.replace("a","A");
            }
        });*/

        System.out.println(Arrays.toString(converted));
    }

    // 3. 작업을 내부 반복으로 처리
    public static String[] map(String[] items, Function<String, String> func) { // 배열 items 형태로 들어오면 map으로 반환
        
        // 내부에서는 내부 반복만 지원
        String[] datas = new String[items.length];
        for(int i = 0; i < items.length; i++) {
            datas[i] = func.apply(items[i]);
        }
        return datas;
    }
}
