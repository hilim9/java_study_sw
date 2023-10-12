package exam01;

public class Outer {

    // 멤버 변수
    public Calculator cal = new Calculator() {

        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    Calculator method(final int num3) { // (jdk 1.8이상은 final 생략 가능 int num3)

        /* Calculator cal = new Calculator() {
            // cal(지역변수) -> 스택  Calculator() -> 힙 */

        return new Calculator() {  // 익명 내부 클래스 (메모리 절약 return cal;)

            public int add(int num1, int num2) {
                
                // 지역변수의 상수화
                // num3 = 40; -> 값을 유지하기 위해서 상수화 된다
                return num1 + num2 + num3;
            }
        };
        // System.out.println(System.identityHashCode(cal));
        // return cal; (4byte)


//        int result = cal.add(10, 20);
//        System.out.println(result);


        /* class Inner {
            void method() {
                System.out.println("지역 내부 클래스~!");
            }
        }

        Inner in = new Inner();
        in.method(); */
    }

}
