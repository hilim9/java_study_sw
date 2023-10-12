package exam10;

public class Outer {
    
    // 지역 내부 클래스
    void method() {
        class Inner {
            void mehtod() {
                System.out.println("지역 내부 클래스!");
            }
        }

        Inner in = new Inner();
        in.mehtod();
    }
}
