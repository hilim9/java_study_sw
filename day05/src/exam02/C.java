package exam02;

public class C extends B {

    int numC = 30;

    public C() {
        // super(); -> 생략되어 있다
        // B() 기본 생성자 호출
        System.out.println("C 생성자!");
    }
}
