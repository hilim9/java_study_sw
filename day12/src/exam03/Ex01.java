package exam03;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
    public static void main(String[] args) {

        // Comparator: 대안적인 정렬 기준
        /*Comparator<String> comp = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순
            }
        };*/
        
        //Set<String> names = new TreeSet<>(comp);
        Set<String> names = new TreeSet<>(Comparator.reverseOrder()); // 내림차순으로 정렬
        names.add("이름2");
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        names.add("이름4");

        System.out.println(names);

    }


}
