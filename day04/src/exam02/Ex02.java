package exam02;

import exam03.A;

public class Ex02{
    public static void main(String[] args) {

        A a = new A();
        // a.num1;
        System.out.println(a.num2);

        a.print();

        // System.out.println(a.num4);
        // num4가 protected이므로 접근 불가

        B b = new B();
        b.print2();

    }
}
