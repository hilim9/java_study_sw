package exam07;

public class Ex01 {
    public static void main(String[] args) {

        // 인스턴스 내부 클래스
        // 외부 클래스의 객체가 생성되어야 생성할 수 있는 클래스
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.method();



    }
}
