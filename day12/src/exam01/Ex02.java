package exam01;

import java.util.Vector;

public class Ex02 {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>(3);
        System.out.println(names.capacity()); // 배열안에 남아있는 공간
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        System.out.println("capacity: " + names.capacity());

        names.add("이름4");
        System.out.println("capacity: " + names.capacity()); // 공간이 부족하면 2배로 늘려서 추가

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }
    }
}
