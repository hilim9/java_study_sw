package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        //List<String> names = new LinkedList<>();
        names.add("이름2"); // Append 순서가 중요
        names.add("이름1");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        LinkedList<String> names2 = new LinkedList<>(names);


        // 제거
        for (int i = 0; i < names.size(); i++) {
            names.remove(i);
        }

        // 조회
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
        }
        

        
        // 뒤에서 부터 제거
        /*for (int i = names.size() -1; i >=0; i--) {
            names.remove(i);
        }*/
    }
}
