package exam01;

import java.util.Stack;

public class Ex04 {
    public static void main(String[] args) {

        Stack<String> names = new Stack<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        
        // 꺼내는 순서가 가장 뒤에 있는 것 부터 꺼내짐
        // pop() : 마지막 요소를 꺼내온다
        System.out.println(names.pop()); // 이름3
        System.out.println(names.pop()); // 이름2
        System.out.println(names.pop()); // 이름1
    }
}
