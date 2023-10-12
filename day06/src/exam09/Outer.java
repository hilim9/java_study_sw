package exam09;

public class Outer {
    
    int num1 = 10;
    static int num2 = 20;

    // 정적 내부 클래스
    static class Inner {

        void method() {
            System.out.println("정적 내부 클래스!");
            // System.out.println(Outer.this.num1); -> 접근 불가
            System.out.println(num2); // 정적자원은 접근 가능
            
            // 정적 내부 클래스에서 인스턴스 자원에 접근하고 싶을 때
            // 내부에서 객체 생성하면 접근 가능
            Outer out = new Outer();
            System.out.println(out.num1);
        }
    }
}
