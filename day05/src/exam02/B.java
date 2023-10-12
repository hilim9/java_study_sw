package exam02;

public class B extends A { // 자식 클래스

    int numB = 20;

    public B() {
        // super(); -> 생략되어 있다
        // A() 기본생성자 호출
        System.out.println("B 생성자!");
    }

}
