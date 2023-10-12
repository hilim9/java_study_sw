package exam01;

import java.util.LinkedList;
import java.util.Queue;

public class ex05 {
    public static void main(String[] args) {

        // offer( ) : 끝에 추가
        Queue<String> names = new LinkedList<>(); // 구현체는 LinkedList
        names.offer("이름1");
        names.offer("이름2");
        names.offer("이름3");

        // poll() : 앞에서 요소를 꺼내온다
        /* System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll()); */
        
        while(names.size() > 0) {
            System.out.println(names.poll());
        }
    }
}
