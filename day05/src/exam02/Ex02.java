package exam02;

public class Ex02 {
    public static void main(String[] args) {

        // super()
        C c = new C(); // C -> B, A 자동 형변환(다형성)
        A a = c; // c객체의 주소를 a라는 틀에 담음
        B b = c;

        A ac = new C();
        A bc = new C();

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(c));

    }
}
