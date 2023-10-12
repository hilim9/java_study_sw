package exam07;

public class Outer {

    int num1 = 30;
    int num2 = 20;

    static int num;

    // 인스턴스 내부 클래스
    class Inner {

        int num1 = 10;

        static int num; // (JDK 16이상 부터 가능)
        void method () {

            //System.out.println("인스턴스 내부 클래스!");
            System.out.println("Inner.num1 : " + num1);
            System.out.println("Outer.num1 : " + Outer.this.num1);
            System.out.println("num2 : " + num2);
        }

        static void staticMethod() { // (JDK 16이상 부터 가능)
            System.out.println("정적 메서드!");
        }
    }
}
