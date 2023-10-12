package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        
        // addAll()
        // 가변적인 매개변수를 담을 때
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "이름1","이름2","이름3","이름1","이름1");
        System.out.println(names);

        // frequency()
        int cnt = Collections.frequency(names, "이름1");
        System.out.println(cnt);

        // disjoint()
        // 공통된 값이 없을 때 true
        // 공통된 값이 있을 때 false
        List<String> names2 = Arrays.asList("이름4","이름5","이름6");
        List<String> names3 = Arrays.asList("이름4","이름5","이름6","이름3");
        boolean result = Collections.disjoint(names, names2);
        boolean result2 = Collections.disjoint(names, names3);
        System.out.println(result); // true
        System.out.println(result2); // false
    }
}
